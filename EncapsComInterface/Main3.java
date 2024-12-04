package EncapsComInterface;

// Exemplificando tudo em um pacote

interface Jogo {
    void jogar();
    String getNome();
}

class PingPong implements Jogo {
    @Override
    public void jogar() {
        System.out.println("Jogando Ping Pong!");
    }

    @Override
    public String getNome() {
        return "Ping Pong";
    }
}

class Futebol implements Jogo {
    @Override
    public void jogar() {
        System.out.println("Jogando Futebol!");
    }

    @Override
    public String getNome() {
        return "Futebol";
    }
}

class HaloOnline implements Jogo {
    @Override
    public void jogar() {
        System.out.println("Jogando Halo!");
    }

    @Override
    public String getNome() {
        return "Halo";
    }
}

class VideoGame {
    // O médoto jogar() recebe atributos do tipo Jogo (tipo da minha interface)
    // Como as classes dos meus jogos tem implementação da minha interface Jogo, elas são do tipo Jogo
    //logo posso coloca-las dentro do método jogar()
    public void jogar(Jogo var) {
        System.out.println("Iniciando o jogo: " + var.getNome());
        var.jogar();
    }
}

public class Main3 {
    public static void main(String[] args) {
        VideoGame videogame = new VideoGame();
        videogame.jogar(new PingPong());
        videogame.jogar(new Futebol());
        videogame.jogar(new HaloOnline());
    }
}