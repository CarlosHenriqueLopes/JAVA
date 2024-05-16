package EncapsComInterface.classesMain;


// implements -> usar para implementar a interface, para o uso obrigatório de objetos
public class Quadrado  implements FiguraGeometrica{

    private int lado;


    //método Contrutor
    public Quadrado(int lado){
        this.lado = lado;
    }


    // método da interface, uso obrigatório!
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }


    public double getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    
}
