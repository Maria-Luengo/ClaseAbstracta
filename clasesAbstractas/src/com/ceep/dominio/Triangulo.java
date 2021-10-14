
package com.ceep.dominio;


public class Triangulo extends FiguraGeometrica{

    public Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dubujar() {
        System.out.println("Se imprime un: "+ this.getClass().getSimpleName());
    }
    
}
