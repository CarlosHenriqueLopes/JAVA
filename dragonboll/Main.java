package dragonboll;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

    //Atributos atributos = new Atributos();
    Condicoes condicoes = new Condicoes();

    String init = JOptionPane.showInputDialog(null, "Digite um nome de personagem de DragonBoll");

    condicoes.switchCase(init);


    // Duvida!
    // Porque o valor atribuido nos stters por aqui, não funcionam. Eles só funcionam atribuindo os valores no método switchCase()
    //atributos.setOrigem(init);
    //atributos.setNomeIMG(init);
}    
}
