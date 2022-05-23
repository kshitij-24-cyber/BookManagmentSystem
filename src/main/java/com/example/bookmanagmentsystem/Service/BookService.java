package com.example.bookmanagmentsystem.Service;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 22-05-2022
 */

import com.example.bookmanagmentsystem.Model.Book;
import com.example.bookmanagmentsystem.Repository.BooksDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    BooksDB booksDB;

    public String insertBook(Book book) {
         return booksDB.saveBook(book);
    }

    public List<Book> getAllBooks() {
        return booksDB.getBooks();
    }


    public Book getBookById(int id) {
        return booksDB.getBookById(id);
    }

    public String deleteBookById(int id) {
        return booksDB.deleteBookById(id);
    }
}
