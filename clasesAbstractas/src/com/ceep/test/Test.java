
package com.ceep.test;

//import com.ceep.dominio.FiguraGeometrica;
//import com.ceep.dominio.Rectangulo;
import com.ceep.dominio.*;


public class Test {
    
    public static void main(String[] args) {
        FiguraGeometrica figura1 = new Rectangulo("Rectángulo");
        FiguraGeometrica figura2 = new Circulo("Cículo");
        FiguraGeometrica figura3 = new Triangulo("Cículo");
        figura1.dubujar();
        figura2.dubujar();
        figura3.dubujar();
    }
}
