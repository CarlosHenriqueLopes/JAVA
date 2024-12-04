package EncapsComInterface;

import EncapsComInterface.classesMain.Circulo;
import EncapsComInterface.classesMain.Quadrado;
import EncapsComInterface.classesMain.SomarAreas;

public class Main {

    public static void main(String[] args) {
    
    Circulo circulo = new Circulo(2);
    System.out.println(circulo.calcularArea());
    
    Quadrado quadrado = new Quadrado(5);
    System.out.println(quadrado.calcularArea());


    SomarAreas somarAreas = new SomarAreas();
    System.out.println(somarAreas.somandoAreas(quadrado, circulo));

    // Usando o método somandoAreas2() da classe SomarAreas, posso colocar:
    // quadrado, quadrado
    // circulo, circulo
    // quadrado, circulo
    // circulo, quadrado
    // Por causa do tipo de atributo "FiguraGeometrica" que posso colocar dentro do médoto (explicação na classe somandoAreas)
    System.out.println(somarAreas.somandoAreas2(quadrado, circulo));
    System.out.println(somarAreas.somandoAreas2(circulo, quadrado));
    System.out.println(somarAreas.somandoAreas2(quadrado, quadrado));
    System.out.println(somarAreas.somandoAreas2(circulo, circulo));

    }
}