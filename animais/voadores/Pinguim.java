package animais.voadores;

import animais.interfaces.*;
import animais.superClassAbstt.Animais;

public class Pinguim extends Animais implements interfaceNadador, interfaceBotarOvos{

    // Contrutor obrigatório
    public Pinguim(String especie, int sexo, int voador) {
        super(especie, sexo, voador);
        
    }
    public Pinguim(String especie, int sexo) {
        super(especie, sexo);
        
    }
    

    // Método obrigatório da interface interfaceNadador
    @Override
    public void nadar() {
        System.out.printf("O pinguim da especie %s está nadando\n", getEspecie());
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
        return "Comendo peixes";
    }
    @Override
    public String som(){
        return "piu piu piu...";
    }
}