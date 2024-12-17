package ExConstantes.CPF;

public class Verificador2 {

    Verificador1 v1 = new Verificador1();
    
    public int verificacao(){
        
    // for (int c = 0 ; c < v1.arrayCPFs.size() ; c++){
    //     v1.verificador += v1.arrayCPFs.get(c) * (10 - c);
    //     //System.out.println("índice " + c + ": " + verificador); // verificar o indice
    //     }
    // //System.out.println(verificador);

    // if ((v1.verificador % 11) < 2)
    //     v1.verificador = 0;
    // else
    //     v1.verificador = 11 - (verificador % 11);


    int verificador2 = 0;
    for (int c = 0 ; c < v1.sizeArr() ; c++){
        verificador2 += v1.getArr().get(c) * (11 - c);
        //System.out.println("índice " + c + ": " + verificador); // verificar o indice
    }
    verificador2 += v1.verificacao() * 2;
    //System.out.println(verificador2);


    if ((verificador2 % 11) < 2)
        verificador2 = 0;
    else
        verificador2 = 11 - (verificador2 % 11);
        

    if (verificador2 > 9 || verificador2 <= 0)
        verificacao();
    
    return verificador2;
    
    }
}