package animais.terrestres;

import animais.interfaces.interfaceTerrestre;
import animais.superClassAbstt.Animais;

public class Cachorro extends Animais implements interfaceTerrestre{

    // Contrutor obrigatório
    public Cachorro(String especie, int sexo, int voador) {
        super(especie, sexo, voador);
    }
    public Cachorro(String especie, int sexo) {
        super(especie, sexo);
    }

    
    // Métodos obrigatórios da interface interfaceTerrestre
    @Override
    public void caminhar() {
        System.out.printf("O cachorro da especie %s está caminhando\n", getEspecie());
    }
    @Override
    public void subirEmArvores(){
        System.out.println("Não pode subir em árvores");
    }


    // Overrides do método abstrato da super clase
    @Override
    public String comer(){
        return "Comendo ração de cachorro";
    }
    @Override
    public String som(){
        return "wof wof wof...";
    }    
}