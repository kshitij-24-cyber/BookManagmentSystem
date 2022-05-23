package com.example.bookmanagmentsystem.Controller;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 22-05-2022
 */

import com.example.bookmanagmentsystem.Model.Book;
import com.example.bookmanagmentsystem.Service.BookService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @ApiOperation("This endpoint is for inserting the books")
    @PostMapping("/insertBook")
    public String insertBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable long id){
        return bookService.getBookById(id);
    }
}