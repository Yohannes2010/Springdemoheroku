package com.example.demo.controller;

import com.example.demo.models.Kompis;
import com.example.demo.repos.DAOKompis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class KompisController {
    DAOKompis dbk=new DAOKompis();
    List<Kompis> mykompis=dbk.getAllKompis();
    @RequestMapping("/mykompis")
    public List<Kompis> mykompis(){
        return mykompis;
    }
}
