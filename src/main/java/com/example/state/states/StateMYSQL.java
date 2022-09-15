package com.example.state.states;

import com.example.state.contexts.Context;
import com.example.state.interfaces.State;

public class StateMYSQL implements State {

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
   public String getVentas() {
      // TODO Auto-generated method stub
      return "buscar todas ventas MYSQL";
   }
 }