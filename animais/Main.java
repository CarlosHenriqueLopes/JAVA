package animais;

import java.util.List;
import java.util.ArrayList;

import animais.superClassAbstt.Animais;
import animais.terrestres.*;
import animais.voadores.*;

public class Main {
    public static void main(String[] args) {
        
        List<Animais> animais = new ArrayList<Animais>();

        animais.add(new Cachorro("Virata Caramelo", Animais.MACHO, Animais.voadorNAO));
        animais.add(new Gato("Gato Malhado", Animais.FEMEA, Animais.voadorSIM));
        animais.add(new Dragao("Dragão ancião", Animais.MACHO, Animais.voadorSIM, Dragao.fogoSIM));
        animais.add(new Pinguim("Pinguem rei", Animais.FEMEA));
        animais.add(new Pato("Pato de topete", Animais.FEMEA, Animais.voadorSIM));
        animais.add(new Pombo("Pombo de listas", Animais.MACHO, Animais.voadorSIM));

        for (Animais variavel : animais) {
            System.out.println("Especie: " + variavel.getEspecie());
            System.out.println("Comer: " + variavel.comer());

            if (variavel instanceof Cachorro){
                ((Cachorro) variavel) .caminhar();
                ((Cachorro) variavel) .subirEmArvores();
                System.out.println(((Cachorro) variavel).som());
                System.out.println("\n=============================\n");

            } else if (variavel instanceof Gato){
                ((Gato) variavel) .caminhar();
                ((Gato) variavel) .subirEmArvores();
                System.out.println(((Gato) variavel).som());
                System.out.println("\n=============================\n");

            } else if (variavel instanceof Dragao){
                ((Dragao) variavel) .cospirFogo();
                ((Dragao) variavel) .nadar();
                ((Dragao) variavel) .voar();
                ((Dragao) variavel) .botarOvos();
                System.out.println(((Dragao) variavel).som());
                System.out.println("\n=============================\n");

            } else if (variavel instanceof Pinguim){
                ((Pinguim) variavel) .nadar();
                ((Pinguim) variavel) .botarOvos();
                System.out.println(((Pinguim) variavel).som());
                System.out.println("\n=============================\n");

            } else if (variavel instanceof Pato){
                ((Pato) variavel) .nadar();
                ((Pato) variavel) .voar();
                ((Pato) variavel) .botarOvos();
                System.out.println(((Pato) variavel).som());
                System.out.println("\n=============================\n");

            } else if (variavel instanceof Pombo){
                ((Pombo) variavel) .voar();
                ((Pombo) variavel) .botarOvos();
                System.out.println(((Pombo) variavel).som());
                System.out.println("\n=============================\n");

            } else {
                System.out.println("ERRO");
            }
        }
    }
}