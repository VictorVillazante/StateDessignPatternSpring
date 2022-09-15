package com.example.state.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.state.contexts.Context;
import com.example.state.states.StateFirebase;
import com.example.state.states.StateMYSQL;

@RestController
@RequestMapping("ventas")
public class VentasController {
    private Context context=new Context();    private VentasController(){
        StateFirebase sf=new StateFirebase();
        //StateMYSQL sMysql=new StateMYSQL();
        sf.doAction(this.context);
    }
    @GetMapping(path = "/{id}")
    public String getVentasByID(@PathVariable("id") int id){
        return context.getState().buscarVentaPorID();
    }
    @GetMapping
    public String getVentas(){
        return context.getState().getVentas();
    }
    // @GetMapping
    // public String getVentas(){
    //     return context.getState().getVentas();
    // }
    // @GetMapping
    // public String getVentas(){
    //     return context.getState().getVentas();
    // }
    // @GetMapping
    // public String getVentas(){
    //     return context.getState().getVentas();
    // }
}
