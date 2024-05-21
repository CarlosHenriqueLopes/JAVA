package telefone;

public class Contato {
    private String nome, numero;


    // contrutor
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }


    @Override
    public String toString() {
        String info = String.format("Nome: %s\tNúmero: %s",nome, numero);
        return info;
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
