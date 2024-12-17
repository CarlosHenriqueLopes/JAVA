package ExConstantes.CPF;

import javax.swing.JOptionPane;

public class Finalizador {
    
    public static void main(String[] args){

    Verificador1 v1 = new Verificador1();
    Verificador2 v2 = new Verificador2();

    String ponto = "."; String traco = "-";
    String format = Integer.toString(v1.verificacao());
    String format2 = Integer.toString(v2.verificacao());

    System.out.println(format);
    System.out.println(format2);

    StringBuffer sb = new StringBuffer();
    for (int c = 0 ; c < v1.sizeArr() ; c++){
        sb.append(v1.getArr().get(c));// Usando o metodo append() da classe StringBuffer, p/ concatenar minha lista
        if (c == 2 || c == 5)
            sb.append(ponto);
        else if (c == 8)
            sb.append(traco + format + format2);
    }   // Se c for igual a 2 ou 5 coloca pont, e se for igual a 8 colocar traço
        // Para colocar pontuação entre os números adicionados na concatenação    
    
    System.out.println(sb.toString());// para verificar no prompt
    JOptionPane.showMessageDialog(null, sb.toString(), "Verificador de CPF", 1);

    
    // --- Para comprovação do calculo no loop for ---
    int verifc =
    v1.getArr().get(0) * 10 + v1.getArr().get(1) * 9 +
    v1.getArr().get(2) * 8 + v1.getArr().get(3) * 7 +
    v1.getArr().get(4) * 6 + v1.getArr().get(5) * 5 +
    v1.getArr().get(6) * 4 + v1.getArr().get(7) * 3 + v1.getArr().get(8) * 2;
    //System.out.println(verifc);
    
    int verifc2 =
    v1.getArr().get(0) * 11 + v1.getArr().get(1) * 10 +
    v1.getArr().get(2) * 9 + v1.getArr().get(3) * 8 +
    v1.getArr().get(4) * 7 + v1.getArr().get(5) * 6 +
    v1.getArr().get(6) * 5 + v1.getArr().get(7) * 4 +v1.getArr().get(8) * 3 + v1.verificacao() * 2;
    //System.out.println(verifc2);
    }
}
