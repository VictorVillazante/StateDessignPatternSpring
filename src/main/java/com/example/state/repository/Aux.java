package com.example.state.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class Aux {

    @Autowired
    private PruebaEntityRepository per;


    public Object list(){
        
        //return null;    
        return per.findAll();
    }
}
