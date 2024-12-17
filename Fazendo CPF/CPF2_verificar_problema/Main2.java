package ExConstantes.CPF2_verificar_problema;
import java.util.Scanner;

import javax.swing.JOptionPane;

//                                ---   Adivinhar os 2 ultimos númros do CPF ---
//                                --- Caso estiver certo, o CPF estara corredo ---

/*   Parou de funcionar
     Antes estava funcioando, agora depois de digitaro o imput, o prompt fica parado
 */

public class Main2 {
    public static void main(String[] agrs){
        Scanner imp = new Scanner(System.in);

        System.out.println("Digite seu CPF:");
        String imput = imp.nextLine();

        Cpf verificaCpf = new Cpf();
        JOptionPane.showMessageDialog(null, verificaCpf.conferirCPF(imput), "Verificador de CPF", verificaCpf.ICON);

        imp.close();// Fecha o Scanner para liberar recursos, boa prática de limpeza de código.
    }   
}










