package telefone;

import java.util.ArrayList;

public class Chamadas_lista {

    private ArrayList<Ligacao> listaChamadas;

    // Contrutor, vai instanciar o ArrayList<Ligacao>
    public Chamadas_lista(){
        this.listaChamadas = new ArrayList<Ligacao>();
    }

    
    public void adicionar(Ligacao ligacao){
        this.listaChamadas.add(ligacao);
    }


    @Override
    public String toString(){
        
        String infos = "Chamadas:\n";

        for (Ligacao variavel : listaChamadas) {
            infos += variavel + "\n";
        }
        return infos;
    }   
}