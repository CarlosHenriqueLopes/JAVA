package ExUNIVESP.Ex3a;
public class Caneta {
    private String marca, cor, tamanho;

    // Contrutor
    public Caneta(){}
    public Caneta(String marca, String cor, String tamanho){
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    
    
    @Override
    public String toString() {
        return String.format("Marca: %s\nCor: %s\nTamanho: %s", getMarca(),getCor(),getTamanho());
    }


    // Atributos
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
    