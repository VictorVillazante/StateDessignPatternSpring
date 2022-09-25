package com.example.state.states;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.state.bl.BLPrueba;
import com.example.state.contexts.Context;
import com.example.state.dto.PruebaEntity;
import com.example.state.interfaces.State;
import com.example.state.repository.Aux;
import com.example.state.repository.PruebaEntityRepository;

public class StateMYSQL implements State {
   @Autowired
   private PruebaEntityRepository per;
   Aux a=new Aux();

   // @Autowired
   // private BLPrueba pbl=new BLPrueba(per);

   //  @Autowired
   //  public StateMYSQL(BLPrueba pbl){
   //      //StateFirebase sf=new StateFirebase();
   //      this.pbl=pbl;
   //  }

   
   public void doAction(Context context) {
       System.out.println("Player is in stop state");
       context.setState(this);	
    }
 
    public String toString(){
       return "State MYSQL";
    }

   @Override
   public String buscarVentaPorID() {
      // TODO Auto-generated method stub
      return "buscarVentaPorID MYSQL";
   }
   
  

   @Override
   public Object getVentas() {
      // TODO Auto-generated method stub
      // per.findAll();
      //return new ResponseEntity(per.findAll(),HttpStatus.OK);
      // List<PruebaEntity> result = per.findAll();

      return per.findAll();

      //return a.list();
   }
   @Override
   public ResponseEntity add() {
      // TODO Auto-generated method stub
      return null;
   }
 }