package com.example.bookmanagmentsystem.Service;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 22-05-2022
 */

import com.example.bookmanagmentsystem.Model.Book;
import com.example.bookmanagmentsystem.Repository.BooksDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    @Autowired
    BooksDB booksDB;

    public String insertBook(Book book) {
         return booksDB.saveBook(book);
    }

}
