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
public class  Book {
    private long id;
    private String authorName;
    private int cost;

    public Book(long id, String authorName, int cost) {
        this.id = id;
        this.authorName = authorName;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", cost=" + cost +
                '}';
    }

}