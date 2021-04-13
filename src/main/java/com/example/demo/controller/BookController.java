package com.example.demo.controller;

import com.example.demo.models.Book;
import com.example.demo.repos.DAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    DAO db=new DAO();
    List<Book> mybooks=db.getAllBooks();
    @RequestMapping("/books")
    public List<Book>books(){
        return mybooks;
    }
    @RequestMapping("/book/{id}")
    public Book getBookById(@PathVariable int id){
        System.out.println("hej");
       for(Book b:mybooks){
          if (b.getId()==id) {
              return b;
          }
       }
return null;
    }
    @PostMapping("/book/add")
    public String addBook(@RequestBody Book b){
        System.out.println("addin book");
        mybooks.add(b);
        return "book added";
    }

}
