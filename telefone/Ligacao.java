package telefone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
    String numOrigem, numDestino, horarioLigacao;

    // Contrutor
    public Ligacao(String numOrigem, String numDestino){
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
    }

    // Polimorfismo de sobrecarga do Contrutor Ligacao()
    public Ligacao(Contato contatoOrigem, Contato contatoDestino){
        this.numOrigem = contatoOrigem.getNumero();
        this.numDestino = contatoDestino.getNumero();
    }


    public void ligar(){
        System.out.println("Ligando para o número " + this.numDestino);

        // Serve para formatar datas e horas
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        // Pegar data e hora atual do sistema
        LocalDateTime hrDataLocal = LocalDateTime.now();

        horarioLigacao = formatador.format(hrDataLocal);
    }


    @Override
    public String toString() {
        String infors = String.format("Origem: %s\tDestino: %s\tData: %s",this.numOrigem, this.numDestino, this.horarioLigacao);
        return infors;
    }




    public String getNumOrigem() {
        return numOrigem;
    }
    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }


    public String getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }  
}