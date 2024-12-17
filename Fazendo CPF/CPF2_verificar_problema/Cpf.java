package ExConstantes.CPF2_verificar_problema;

public class Cpf {
    // 123.456.789-10,11
    // 1-8: número que a receita federal emite
    // 9: número de indentificação de onde foi emitido o CPF
    // 10 e 11: digitos identificador da pessoa

    String c1, c2, c3, c4, c5, c6, c7, c8, c9, confere = "";
    int p1, p2, p3, p4, p5, p6, p7, p8, p9, verificador, verificador2;

    // Constante para colocar na ultima opção do showMessageDialog (opção do icon)
    public static int ICON = 0;

    public String conferirCPF(String cpf){

    
    //                                 --- Usando cast ---
    // .substring(0,3) -> vai de 0 a 2 (começa no primeiro caracter e vai até o ante penultimo)
    // .substring(1,3)  ->  vai de 1 a 2
    c1 = cpf.substring(0,1); p1 = Integer.parseInt(c1);
    c2 = cpf.substring(1, 2); p2 = Integer.parseInt(c2);
    c3 = cpf.substring(2,3); p3 = Integer.parseInt(c3);
    c4 = cpf.substring(4,5); p4 = Integer.parseInt(c4);
    c5 = cpf.substring(5,6); p5 = Integer.parseInt(c5);
    c6 = cpf.substring(6,7); p6 = Integer.parseInt(c6);
    c7 = cpf.substring(8,9); p7 = Integer.parseInt(c7);
    c8 = cpf.substring(9,10); p8 = Integer.parseInt(c8);
    c9 = cpf.substring(10,11); p9 = Integer.parseInt(c9);


    //                               --- Calculo do CPF ---
    // Calculo do digito 10
    verificador = p1 * 10 + p2 * 9 + p3 * 8 + p4 * 7 + p5 * 6 + p6 * 5 + p7 * 4 + p8 * 3 + p9 * 2;
    if ((verificador % 11) < 2)
        verificador = 0;
    else
        verificador = 11 - (verificador % 11);

    // Calculo do digito 11
    verificador2 = p1 * 11 + p2 * 10 + p3 * 9 + p4 * 8 + p5 * 7 + p6 * 6 + p7 * 5 + p8 * 4 + p9 * 3 + verificador * 2;
    if ((verificador2 % 11) < 2)
        verificador2 = 0;
    else
        verificador2 = 11 - (verificador2 % 11);


    // Fazendo o cart dos valores int para string    
    String verificadorFormat = Integer.toString(verificador);
    String verificadorFormat2 = Integer.toString(verificador2);

    // Como os valores das variáveis cx são string, elas não vão somar, vão contatenar
    // conferir o cpf
    confere = c1+c2+c3+ "." +c4+c5+c6+ "." +c7+c8+c9+ "-" +verificadorFormat+verificadorFormat2;

    if (cpf.equals(confere)){
        ICON = 1;
        return "CPF correto!";
    } else {
        ICON = 0;
        return "CPF incorreto!";
    }
    
    }
}