package com.example.bookmanagmentsystem.Controller;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 22-05-2022
 */

import com.example.bookmanagmentsystem.Model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BookController {
    @PostMapping("/api/v1/insertBook")

    public String insertBook(@RequestBody Book book) {
        return "hey";
    }
}
