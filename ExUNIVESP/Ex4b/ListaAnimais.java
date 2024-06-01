import java.util.ArrayList;
import java.util.List;

public class ListaAnimais {
    public static void main(String[] args) {
        
        // Lista do tipo Animais
        List<Animais> animaisLista = new ArrayList<Animais>();

        // variáveis do tipo Animais
        Animais leao = new Animais("NewKing", "Leão", "Alaranjado");
        Animais sapo = new Animais("Soneto", "Sapo", "Esverdeado");
        Animais cobra = new Animais("SrBZ", "Cobra", "Coral");
        Animais gato = new Animais("Ticomico", "Gato", "Malhado");
        Animais cachorro = new Animais("Snoop", "Cachorro", "Caramelo");

        animaisLista.add(leao);
        animaisLista.add(sapo);
        animaisLista.add(cobra);
        animaisLista.add(gato);
        animaisLista.add(cachorro);

        for (Animais var : animaisLista) {
            System.out.println(var);            
        }
    }
}