package ExUNIVESP.Ex3a;

import javax.print.attribute.standard.PrinterLocation;

public class CanetaTeste {
    public static void main(String[] args) {
        
        // usando o constructor sem preenchimento
        Caneta bic = new Caneta();
        bic.setCor("Azul");
        bic.setMarca("BIC");
        bic.setTamanho("13.5cm");
        System.out.println(bic);

        System.out.println();

        //usando o constructor preenchido
        Caneta piloto = new Caneta("Piloto", "Preta", "13.5");
        System.out.println(piloto);

    }
}
