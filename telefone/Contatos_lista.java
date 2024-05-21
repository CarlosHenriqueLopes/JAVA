package telefone;

import java.util.ArrayList;

public class Contatos_lista {

    // colocando uma lista como atributo
    private ArrayList<Contato> listaContatos;


    // método contrutor, instanciando a lista
    public Contatos_lista(){
        this.listaContatos = new ArrayList<Contato>();
    }

    // método que instancia a classe Contato
    public void adicionar(String nome, String numero){
        // instanciando a classe Contato
        Contato novContato = new Contato(nome, numero);
        // adicionando um atributo do tipo Contato. Na minha lista que só aceita tipos Contato
        listaContatos.add(novContato);
    }

    // polimorfismo do tipo sobrecarga
    // fazendo polimorfismo do médoto adicionar()
    public void adicionar(Contato nome){
        listaContatos.add(nome);
    }

    // método para buscar contatos
    public Contatos_lista buscar(String buscarContatos){
       
        Contatos_lista contatos_lista = new Contatos_lista();// Instanciando a classe Contatos_lista dentro dela msma
        
        for (Contato variavel : listaContatos) {
       
            String nomeContato = variavel.getNome().toLowerCase();
            
            // .startsWith = começa com       
            if (nomeContato.startsWith(buscarContatos)){
                contatos_lista.adicionar(variavel);
            }
        }
        return contatos_lista;
    }

    @Override
    public String toString(){
        String informacoes = "Contatos:\n";
        for (Contato var : listaContatos) {
            //informacoes = informacoes + var + "\n";
            informacoes += var + "\n";// linha de cima resumida
        }
        return informacoes;
    }

    // get do tipo ArrayList<Contato>(). Retornará o atributo listaContatos, que é o ArrayList<Contato>
    public ArrayList<Contato> getContatos(){
        return listaContatos;
    }


}