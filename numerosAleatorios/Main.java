package numerosAleatorios;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        //      --- 1ª forma ---
        // Usando a classe Math
        // Todas os métodos da classe Math são estaticos, então posso chama-los sem instanciar

        // O método random() gera números aleatórios, desta forma 0.281... etc...
        // Para gerar números aleatórios entre 1 a 10, devo fazer a multiplicação por 10
        // Para arredondar-los vou usar outro método da classe Math, floor()
        System.out.println(Math.floor(Math.random() * 10));

        
        //      --- 2ª forma ---
        // Usando o classe Random
        // Nela existem vários métodos para ajudar a criar numeros aleatórios
        // .nextInt() gerar o máximo de valor que um int pode armazenar
        // .nextLong() parar gerar núemros maiores que um int pode armazenar
        // .nextDouble() gerar números com virgula
        // etc...
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));// de 0 a 9
        System.out.println(random.nextInt(10 + 1));// de 0 a 10

    }
}
