package EncapsComInterface;

import EncapsComInterface.classesMain2.PingPong;
import EncapsComInterface.classesMain2.TiroOnLine;
import EncapsComInterface.classesMain2.VideoGame;
import EncapsComInterface.classesMain2.Xadrez;

/*
    Explicação sobre instanciar os jogos dentro do médoto jogar()    
    
    No método jogar() da classe VideoGame tem que ser colocado atributos do tipo Jogo como valor, mais consigo colocar a classe Xadrez dentro (e as outras classes de jogos tb),
    inclusive consigo instanciar uma nova classe dentro do médoto, isso acontece pq as classes de jogos implementam a interface Jogo

    Implementação da Interface:
    Quando uma classe implementa uma interface, ela concorda em fornecer uma implementação para todos os métodos definidos na interface.
    Exemplo, a classe Xadrez implementa a interface Jogo.
    
    O método jogar() na classe Main2 espera um parâmetro do tipo Jogo.
    Como a classe Xadrez implementa a interface Jogo, ela pode ser usada como um valor para esse parâmetro.

    Polimorfismo:
    O polimorfismo permite que você use objetos de diferentes classes que compartilham uma interface comum.
    Quando você passa uma instância da classe Xadrez como argumento para o método jogar(), o Java reconhece que ela implementa a interface Jogo.
    Isso permite que você use polimorfismo e trate a instância de Xadrez como um objeto do tipo Jogo
 */

public class Main2 {
    public static void main(String[] args) {
        // //Primeiro instanciar um game
        // Xadrez xadrez = new Xadrez();
        // PingPong pingPong = new PingPong();
        // TiroOnLine tiroOnLine = new TiroOnLine();


        //Agr o video game
        VideoGame videoGame = new VideoGame();

        // videoGame.ligar();
        // videoGame.jogar(new Xadrez());
        // videoGame.fechar();

        //videoGame.ligarVideoGame();
        videoGame.jogar(new PingPong());
        videoGame.fechar();

        // videoGame.ligarVideoGame();
        // videoGame.jogar(new TiroOnLine());
        // videoGame.fechar();
    }
    
}
