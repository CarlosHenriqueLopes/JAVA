package EncapsComInterface.classesMain2;

public class PingPong implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Menu com letras brancas e fundo preto");
    }

    @Override
    public void fechar() {
        System.out.println("Letras subindo indo de um lado para o outro");
    }

    @Override
    public String getName() {
        return "Ping Pong";
    }
    
}
