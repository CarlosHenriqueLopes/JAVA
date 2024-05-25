package animais.voadores;

import animais.interfaces.*;
import animais.superClassAbstt.Animais;

public class Pato extends Animais implements interfaceNadador, interfaceVoador, interfaceBotarOvos{

    // Contrutor obrigatório
    public Pato(String especie, int sexo, int voador) {
        super(especie, sexo, voador);
    }


    // Método ogrigatório da interface animalNadador
    @Override
    public void nadar() {
        System.out.printf("O %s está nadando\n", getEspecie());
    }
    // Método ogrigatório da interface animalVoador
    @Override
    public void voar() {
        System.out.printf("O %s está voando\n", getEspecie());
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
        return "Comendo sementes de frutas e algas";
    }
    @Override
    public String som(){
        return "quac quac quac...";
    }
}