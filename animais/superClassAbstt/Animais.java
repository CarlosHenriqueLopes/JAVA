package animais.superClassAbstt;

public abstract class Animais {
    
    private String especie;
    private int sexo,voador;


    // Contrutor
    public Animais(String especie, int sexo, int voador){
        this.especie = especie;
        this.sexo = sexo;
        this.voador = voador;
    }
    public Animais(String especie, int sexo){
        this.especie = especie;
        this.sexo = sexo;
    }


    // Atributo statico/constantes para usar no contrutor, quando chamar as classes
    public static final int MACHO = 0, FEMEA = 1;
    public static final int voadorSIM = 0, voadorNAO = 1;

    public void sexo(){
        if (this.sexo == MACHO){
            System.out.println("Sexo: MACHO");
        } else if (this.sexo == FEMEA){
            System.out.println("Sexo: FêMEA");
        } else {
            System.out.println("Atributo invalido\n");
        }
    }
    public void evoador(){
        if (this.voador == voadorSIM){
            System.out.println("Pode voar");
        } else if (this.voador == voadorNAO){
            System.out.println("Não pode voar");
        } else {
            System.out.println("Atributo invalido\n");
        }
    }
    

    // Médotos abstract, para ter saidas diferentes em cada classe
    public abstract String comer();
    public abstract String som();
    
    
    // Atributos
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public int getSexo() {
        return sexo;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    public int getVoador() {
        return voador;
    }
    public void setVoador(int voador) {
        this.voador = voador;
    }
}