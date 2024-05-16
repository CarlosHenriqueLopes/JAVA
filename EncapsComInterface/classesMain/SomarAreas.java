package EncapsComInterface.classesMain;

public class SomarAreas {

    public double somandoAreas(Quadrado quadrado, Circulo circulo){
        
        double totalArea = quadrado.calcularArea() + circulo.calcularArea();
        return totalArea;
    }

    public double somandoAreas2(FiguraGeometrica figura1, FiguraGeometrica figura2){
    
        double totalArea = figura1.calcularArea() + figura2.calcularArea();
        return totalArea;
    }

    /*
        Os métodos somandoAreas() e somandoAreas2() se equivalem.
        Pq somandoAreas() usa os tipos de atributos Quadrado e Circulo, qua pertemcem as classes Quadrado e Circulo
        e ambas as classes tem o método OBRIGATÒRIO calcularArea() criado pela interface FiguraGeometrica()

        O msm vale para o somandoAreas2(), que usa os tipos de atributos FiguraGeometrica, que é da interface FiguraGeometrica
        que tem o método calcularArea()
     */
}
