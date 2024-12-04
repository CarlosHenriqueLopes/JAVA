package EncapsComInterface.classesMain2;

public class Xadrez implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Menu na frente de um tabuleiro de xadrez");
    }

    @Override
    public void fechar() {
        System.out.println("Encerrando o jogo");
        System.out.println("Mostrando uma animação de peças de xadrez com um tabuleiro de fundo");
    }

    @Override
    public String getName() {
        return "Xadrez";
    }
    
}
