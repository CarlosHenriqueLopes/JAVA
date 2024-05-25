package animais.terrestres;

import animais.interfaces.interfaceTerrestre;
import animais.superClassAbstt.Animais;

public class Gato extends Animais implements interfaceTerrestre{

    // Contrutor obrigatório
    public Gato(String especie, int sexo, int voador) {
        super(especie, sexo, voador);
    }

    // Métodos obrigatórios da interface interfaceTerrestre
    @Override
    public void caminhar() {
        System.out.printf("O gato da especie %s está caminhando\n", getEspecie());
    }
    @Override
    public void subirEmArvores() {
        System.out.printf("O gato da especie %s subiu em uma árvore\n", getEspecie());
    }
    

    // Override do método abstrato da super clase
    @Override
    public String comer(){
        return "Comendo ração de gato";
    }
    @Override
    public String som(){
        return "miau miau miau...";
    } 
}