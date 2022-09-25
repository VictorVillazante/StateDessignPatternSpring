package com.example.state.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.state.contexts.Context;
import com.example.state.dto.PruebaEntity;

public interface State {
    public void doAction(Context context);

    public String buscarVentaPorID();

    public Object getVentas();

    public Object add();
 }