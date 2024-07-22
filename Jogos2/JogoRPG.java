package Jogos2;

public class JogoRPG {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Herói", 5, 10, 100);
        Personagem vilao = new Personagem("Vilão", 3, 8, 80);

//        while (heroi.estaVivo() && vilao.estaVivo()) {
//            heroi.atacar(vilao);
//            if (vilao.estaVivo()) {
//                vilao.atacar(heroi);
//            }
//        }

//        if (heroi.estaVivo()) {
//            System.out.println("Herói venceu!");
//        } else {
//            System.out.println("Vilão venceu!");
//        }

        heroi.status(heroi);
        vilao.status(vilao);
        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+\n");

        heroi.atacar(heroi, vilao);
        //vilao.status(vilao);
    }
}
