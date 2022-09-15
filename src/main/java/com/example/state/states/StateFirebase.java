package com.example.state.states;

import com.example.state.contexts.Context;
import com.example.state.interfaces.State;

public class StateFirebase implements State {

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

   @Override
   public String getVentas() {
      // TODO Auto-generated method stub
      return "buscar todas ventas firebases";
   }
 }
