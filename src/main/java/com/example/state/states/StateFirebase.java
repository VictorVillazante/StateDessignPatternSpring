package com.example.state.states;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.state.contexts.Context;
import com.example.state.interfaces.State;
import com.example.state.service.PostManagementService;
import com.example.state.service.impl.PostManagementServiceImpl;

public class StateFirebase implements State {
   // @Autowired
   // private PostManagementService service;
   private PostManagementServiceImpl pms=new PostManagementServiceImpl();
   
    public void doAction(Context context) {
       System.out.println("Player is in start state");
       context.setState(this);	
    }
 
    public String toString(){
       return "State firebase";
    }

   @Override
   public String buscarVentaPorID() {
      // TODO Auto-generated method stub
      return "buscarVentaPorID Firebase";
   }

   // @Override
   // public Object getVentas() {
   //    // TODO Auto-generated method stub
   //    return new ResponseEntity(pms.list(),HttpStatus.OK);
   //    //return null;
   // }
   public Object getVentas() {
      // TODO Auto-generated method stub
      return new ResponseEntity(pms.list(),HttpStatus.OK);
      //return null;
   }
   @Override
   public ResponseEntity add() {
      // TODO Auto-generated method stub
      return null;
   }
 }
