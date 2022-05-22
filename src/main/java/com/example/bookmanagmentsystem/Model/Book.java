package com.example.bookmanagmentsystem.Model;
/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 22-05-2022
 */


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String Author;
    private int ID;
    private int cost;

    public Book(String author, int ID, int cost) {
        Author = author;
        this.ID = ID;
        this.cost = cost;
    }

}
