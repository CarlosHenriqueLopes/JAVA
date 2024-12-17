package ExConstantes.CPF;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Verificador1{
    
    Random random = new Random();
    List <Integer> arrayCPFs = new ArrayList<Integer>();
    int verificador;
    
    public int verificacao(){

    int cont = 0;
    while (cont < 9){
        int numero = random.nextInt(9 + 1);
        arrayCPFs.add(numero);
        cont++;
    }
    //System.out.println(arrayCPFs);
    //System.out.println(arrayCPFs.get(8));

    //  --- Calculo do verificador1 do CPF ---
    //int verificador = 0;
    for (int c = 0 ; c < arrayCPFs.size() ; c++){
        verificador += arrayCPFs.get(c) * (10 - c);
        //System.out.println("índice " + c + ": " + verificador); // verificar o indice
        }
    //System.out.println(verificador);

    if ((verificador % 11) < 2)
        verificador = 0;
    else
        verificador = 11 - (verificador % 11);


    if (verificador > 9 || verificador <= 0)
        verificacao();

    return verificador;
    
    }

    public int sizeArr(){
        return arrayCPFs.size();
    }

    public List<Integer> getArr(){
        return arrayCPFs;
    }

}