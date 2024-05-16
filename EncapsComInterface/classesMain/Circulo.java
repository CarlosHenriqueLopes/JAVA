package EncapsComInterface.classesMain;


// implements -> usar para implementar a interface, para o uso obrigatório de objetos
public class Circulo implements FiguraGeometrica{
    
    private int raio;


    // método Contrutor
    public Circulo (int raio){
        this.raio = raio;
    }


    // médoto da interface, uso obrigatório!
    public double calcularArea(){
        // area = PI * raios ^ 2
        return  Math.PI * Math.pow(this.raio, 2);
    }


    public double getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }

    
}
