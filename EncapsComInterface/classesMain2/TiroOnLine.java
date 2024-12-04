package EncapsComInterface.classesMain2;

public class TiroOnLine implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Letras do menu escrito com balas");
    }

    @Override
    public void fechar() {
        System.out.println("Buracos de bala na tela");
    }

    @Override
    public String getName() {
        return "Tiro Online";
    }
    
}
