package com.ceep.dominio;

public class Rectangulo extends FiguraGeometrica {

    //constructor que invoca al constructor del padre
    public Rectangulo(String tipoFigura) {
        super(tipoFigura); //llama al constructor
    }

    @Override
    public void dubujar() {//implementamos método abstracto de la clase padre
        System.out.println("Se imprime un: "+ this.getClass().getSimpleName());
        //esto imprime el nombre de la clase en que me encuentro
    }

}
