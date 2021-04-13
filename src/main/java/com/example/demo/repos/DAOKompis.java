package com.example.demo.repos;

import com.example.demo.models.Book;
import com.example.demo.models.Kompis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAOKompis {
    public List<Kompis> getAllKompis(){
        List<Kompis> mykompisList=new ArrayList<>();
        Kompis Y=new Kompis(1,"Abel","a1","0456");
        Kompis A=new Kompis(2,"John","Huddinge","1235");
        Kompis M=new Kompis(3,"meron","stockholm","1789");
        mykompisList.add(Y);
        mykompisList.add(A);
        mykompisList.add(M);
        //return Arrays.asList(Y,A,M);
       return mykompisList;
    }
}
