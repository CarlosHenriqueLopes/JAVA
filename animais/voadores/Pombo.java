package animais.voadores;

import animais.interfaces.*;
import animais.superClassAbstt.Animais;

public class Pombo extends Animais implements interfaceVoador, interfaceBotarOvos{

    public Pombo(String especie, int sexo, int voador) {
        super(especie, sexo, voador);
    }


    // Método obrigatório da interfaceVoador
    @Override
    public void voar() {
       System.out.printf("O pombo da especie %s está voando\n", getEspecie());
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
        return "Comendo minhocas";
    }
    @Override
    public String som(){
        return "pruu pruu pruu...";
    }   
}