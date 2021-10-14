
package com.ceep.dominio;


public class Circulo extends FiguraGeometrica{

    public Circulo(String tipoFigura){
        super(tipoFigura);
    }

    @Override
    public void dubujar() {
        System.out.println("Se imprime un: "+ this.getClass().getSimpleName());
    }
}
