import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/*    --- Fazendo CPF com a classe Random ---     */

public class fazerCPF{
    
    public static void main(String[] args){
    Random random = new Random();

    List <Integer> arrayCPFs = new ArrayList<Integer>();
    int cont = 0;
    while (cont < 9){
        int numero = random.nextInt(9 + 1);
        arrayCPFs.add(numero);
        cont++;
    }
    System.out.println(arrayCPFs);
    System.out.println(arrayCPFs.get(8));

    int verificador = 0;
    for (int c = 0 ; c < arrayCPFs.size() ; c++){
        verificador += arrayCPFs.get(c) * (10 - c);
        //System.out.println("índice " + c + ": " + verificador); // verificar o indice
        }
    //System.out.println(verificador);

    if ((verificador % 11) < 2)
        verificador = 0;
    else
        verificador = 11 - (verificador % 11);


    int verificador2 = 0;
    for (int c = 0 ; c < arrayCPFs.size() ; c++){
        verificador2 += arrayCPFs.get(c) * (11 - c);
        //System.out.println("índice " + c + ": " + verificador); // verificar o indice
    }
    verificador2 += verificador * 2;
    //System.out.println(verificador2);

    if ((verificador2 % 11) < 2)
        verificador2 = 0;
    else
        verificador2 = 11 - (verificador2 % 11);

    System.out.printf("V1 -> %d\n", verificador);
    System.out.printf("v2 -> %d\n", verificador2);


    String ponto = "."; String traco = "-";
    String format = Integer.toString(verificador);
    String format2 = Integer.toString(verificador2);

    StringBuffer sb = new StringBuffer();
    for (int c = 0 ; c < arrayCPFs.size() ; c++){
        sb.append(arrayCPFs.get(c));// Usando o metodo append() da classe StringBuffer, p/ concatenar minha lista
        if (c == 2 || c == 5)
            sb.append(ponto);
        else if (c == 8)
            sb.append(traco + format + format2);
    }   // Se c for igual a 2 ou 5 coloca pont, e se for igual a 8 colocar traço
        // Para colocar pontuação entre os números adicionados na concatenação
        
    System.out.println(sb.toString());

    
    // --- Para comprovação do calculo no loop for ---
    int verifc =
    arrayCPFs.get(0) * 10 + arrayCPFs.get(1) * 9 + arrayCPFs.get(2) * 8 + arrayCPFs.get(3) * 7 + arrayCPFs.get(4) * 6 + arrayCPFs.get(5) * 5 + arrayCPFs.get(6) * 4 + arrayCPFs.get(7) * 3 + arrayCPFs.get(8) * 2;
    //System.out.println(verifc);
    
    int verifc2 = arrayCPFs.get(0) * 11 + arrayCPFs.get(1) * 10 + arrayCPFs.get(2) * 9 + arrayCPFs.get(3) * 8 + arrayCPFs.get(4) * 7 + arrayCPFs.get(5) * 6 + arrayCPFs.get(6) * 5 + arrayCPFs.get(7) * 4 + arrayCPFs.get(8) * 3 + verificador * 2;
    //System.out.println(verifc2);
    }
}
