package com.example.state.interfaces;

import com.example.state.contexts.Context;

public interface State {
    public void doAction(Context context);

    public String buscarVentaPorID();

    public String getVentas();
 }