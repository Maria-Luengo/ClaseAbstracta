package com.ceep.dominio;


public abstract class FiguraGeometrica {

    private String tipoFigura;
    
    //constructor PROTECTED
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //Método abstracto (no lleva cuerpo "llaves{}")
    public abstract void dubujar();

    //G&S
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    
}
