package Jogos2;
import java.util.Random;

public class Personagem {
    private String nome;
    private int nivelDefesa;
    private int nivelAtaque;
    private int nivelVida;

    public Personagem(String nome, int nivelDefesa, int nivelAtaque, int nivelVida) {
        this.nome = nome;
        this.nivelDefesa = nivelDefesa;
        this.nivelAtaque = nivelAtaque;
        this.nivelVida = nivelVida;
    }

    public void status(Personagem personagem){
        System.out.println("==== Status do " + personagem.nome + " ====");
        System.out.printf("Nome: %s\n" +
                        "Pontos de Def: %d\n" +
                        "Pode de Ataque: %d\n" +
                        "Pontos de Vida: %d\n", nome, nivelDefesa, nivelAtaque, nivelVida);
        System.out.println("========================");
    }

    public void atacar(Personagem alvo) {
        Random rand = new Random();

        // Gerando números aleatórios entre 0 e nivelAtaque. E + 1 para garantir que o menor número seja 1
        int dano = rand.nextInt(nivelAtaque) + 1;

        // Math.max(x,y) -> para mostrar um vlrs de x a y
        // Esse método está sendo usado para a variável danoFinal não receber vlrs negativos
        int danoFinal = Math.max(0, dano - alvo.nivelDefesa);

        alvo.nivelVida -= danoFinal;
        System.out.println(nome + " atacou " + alvo.nome + " causando " + danoFinal + " de dano.");
    }

    public void atacar(Personagem p1, Personagem p2){
        Random rand = new Random();
        int dano = rand.nextInt(nivelAtaque) + 1;
        int danoFinal = Math.max(0, dano - p2.nivelDefesa);

        if (danoFinal < p2.nivelDefesa){
            int contraAcate = p2.nivelAtaque - danoFinal;
            System.out.println(p2.nome + " Contra atacou causando " + p1.nome + " causando " + contraAcate + " de dano");
            p1.nivelVida -= contraAcate;
        } else if (danoFinal == p2.nivelDefesa) {
            System.out.println("Sem dano causado");
        } else {
            p2.nivelVida -= danoFinal;
            System.out.println(nome + " atacou " + p2.nome + " causando " + danoFinal + " de dano.");
        }

        p1.status(p1);
        p2.status(p2);
    }

    public boolean estaVivo() {
        return nivelVida > 0;
    }
}
