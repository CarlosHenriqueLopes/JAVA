package animais.voadores;

import animais.interfaces.*;
import animais.superClassAbstt.Animais;

public class Dragao extends Animais implements interfaceNadador,interfaceVoador, interfaceBotarOvos{
    
    // Contrutor obrigatório
    public Dragao(String especie, int sexo, int voador, int fogo) {
        super(especie, sexo, voador);
        this.fogo = fogo;
    }

    
    // Defini a variável como int, pq fiz duas constantes (MACHO,FEMEA) para faciliar na condicional do médodo cospirFogo()
    private int fogo;

    // Atributos staticos/contante
    public static final int fogoSIM = 0, fogoNao = 1;
    
    public void cospirFogo(){
        if (fogo == fogoSIM){
            System.out.printf("%s pode cospit fogo\n", getEspecie());
        } else {
            System.out.printf("%s não pode cospir fogo\n", getEspecie());
        }
    }


    // Método obrigatório da interfaceNadador
    @Override
    public void nadar() {
        System.out.printf("O dragao da especide %s está nadando\n", getEspecie());
    }
    // Método obrigatório da interfaceVoador
    @Override
    public void voar() {
        System.out.printf("O dragao da especie %s está voando\n", getEspecie());
    }
    // Método obrigatório da interface interfaceBotarOvos
    @Override
    public void botarOvos(){
        if (getSexo() == Animais.FEMEA){
            System.out.println("Pode colocar ovos");
        } else {
            System.out.println("NÃO pode colocar ovos");
        }
    }
    

    // Override do método abstrato da super clase
    @Override
    public String comer(){
        return "Comendo vacas";
    }
    @Override
    public String som(){
        return "grrrr...";
    }
}