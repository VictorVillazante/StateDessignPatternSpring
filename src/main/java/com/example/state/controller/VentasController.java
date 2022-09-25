package com.example.state.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.state.bl.BLPrueba;
import com.example.state.contexts.Context;
import com.example.state.dto.PostDTO;
import com.example.state.dto.PruebaEntity;
import com.example.state.repository.PruebaEntityRepository;
import com.example.state.service.PostManagementService;
import com.example.state.states.StateFirebase;
import com.example.state.states.StateMYSQL;

@RestController
@RequestMapping("ventas")
public class VentasController {
    //@Autowired
    // private PostManagementService service;
    private Context context=new Context();    

    // private BLPrueba pbl;

    // @Autowired
    // public VentasController(BLPrueba pbl){
    //     //StateFirebase sf=new StateFirebase();
    //     this.pbl=pbl;
    //     StateMYSQL sMysql=new StateMYSQL();
    //     sMysql.doAction(this.context);
    // }

    private StateMYSQL sMysql;
    private StateFirebase sf;
    @Autowired
    public VentasController(StateMYSQL s){
        sMysql=s;
        sf=new StateFirebase();
    } 
    

    @GetMapping
    public Object getVentas(){
        try{
            sMysql.doAction(this.context);
            return context.getState().getVentas();
        }catch(Exception e){
            try {
                sf.doAction(this.context);
                if(context.getState().getVentas()==null){
                    throw new Exception("");
                }else{
                    return context.getState().getVentas();
                }
            } catch (Exception e2) {
                return "No me puedo conectar a la base de datos del servidor propio ni al de la nube";
            }
        }        
    }
    @GetMapping(path = "/{id}")
    public String getVentasByID(@PathVariable("id") int id){
        return context.getState().buscarVentaPorID();
    }





   











    @PostMapping(value="add")
    public String add(@RequestBody PostDTO post){
        // String result=(service.add(post))?"OK":"No se hizo";
        // return result;
        return null;
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
