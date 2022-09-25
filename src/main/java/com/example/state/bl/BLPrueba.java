package com.example.state.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.state.dto.PruebaEntity;
import com.example.state.repository.PruebaEntityRepository;

@Service
public class BLPrueba {
    private PruebaEntityRepository per;

    @Autowired
    public BLPrueba(PruebaEntityRepository per) {
        this.per = per;
    }
    public List<PruebaEntity> getTodos() {
        List<PruebaEntity> todoList = this.per.findAll();
        return todoList;
    }
}
