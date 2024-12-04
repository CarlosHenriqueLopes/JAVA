/*
    Criar uma lista, adicioar Leão, Sapo e Cachorro e printar, depois adicionar cado na posição 1 da lista e printar
    depois adicionar Cobra e printar, depois ordenar em ordem alfabetica e printar
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAnimais {
    public static void main(String[] args) {

    List<String> animais = new ArrayList<>();
    
    animais.add("Leão");
    animais.add("Sapo");
    animais.add("Cachorro");

    System.out.println("Printando a primeira lista:");
    for (String var : animais) {
        System.out.println(var);
    }
    System.out.println();


    animais.add(1,"Gato");  // Adicionando elemento na 1ª posição

    System.out.println("Lista com Gato adicionado na 1ª posição:");
    for (String var : animais) {
        System.out.println(var);
    }
    System.out.println();


    animais.add("Cobra");

    System.out.println("Lista com Cobra adicionada:");
    for (String var : animais) {
        System.out.println(var);
    }
    System.out.println();


    Collections.sort(animais);

    // Usando o método .sorted() para deixar em ordem crescente
    System.out.println("Lista em ordem alfabetifca:");
    for (String var : animais) {
        System.out.println(var);
    }
   }
}



// import java.util.*; 
// public class ListaAnimais { 
//   public static void main(String[] args) { 

//     List<String> lista = new LinkedList<String>(); 

//     lista.add("Leão"); 
//     lista.add("Sapo"); 
//     lista.add("Cachoro"); 

//     System.out.println(lista); 

//     lista.add(1,"Gato"); 

//     System.out.println(lista); 

//     lista.add(3,"Cobra"); 

//     System.out.println(lista); 

//     Collections.sort(lista); 

//     System.out.println(lista); 

//   } 

// } 
