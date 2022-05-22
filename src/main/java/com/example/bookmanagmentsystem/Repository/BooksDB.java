package com.example.bookmanagmentsystem.Repository;
/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 22-05-2022
 */

import com.example.bookmanagmentsystem.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BooksDB {

    ArrayList<Book> BookList = new ArrayList<>();

    public String saveBook(Book book){
        for(Book books : BookList){
            if(books.getID()==book.getID()){
                return "Book can't be saved ";
            }
        }
        BookList.add(book);
        return "Book saved";
    }

}
