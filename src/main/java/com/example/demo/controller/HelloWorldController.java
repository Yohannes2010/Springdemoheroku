package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public  String index(){
        return "fortsa springdemo";
    }
    @RequestMapping("/h")
    public String index3(){
        return "hello ";
    }
    @RequestMapping("/hej")
    public String index2(@RequestParam String name){
        return "Hello "+name;
    }
    @RequestMapping("/he2")
    public String index3(@RequestParam(defaultValue="Yohannes") String firstname,@RequestParam(defaultValue = "Abebe")
            String lastname){
        return "Hello "+firstname+" "+lastname;

    }
    @RequestMapping("/hejPathParam/{name}")
public String hejPathParam(@PathVariable String name){
 if (name==null) return "Hello World";
 return "Hello" +name;
}
}
