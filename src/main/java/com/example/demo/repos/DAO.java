package com.example.demo.repos;

import com.example.demo.models.Book;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    public List<Book> getAllBooks(){
        List<Book> mybookList=new ArrayList<>();
        Book b1=new Book(1,"t1","a1");
        Book b2=new Book(2,"t2","a2");
        Book b3=new Book(3,"t3","a3");
        Book b4=new Book(4,"t4","a4");
        mybookList.add(b1);
        mybookList.add(b2);
        mybookList.add(b3);
        mybookList.add(b4);
        return mybookList;
    }
}
