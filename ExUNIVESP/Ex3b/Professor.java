package ExUNIVESP.Ex3b;

public class Professor {
    private String nome;
    private int matricula;

    // Contrutores
    public Professor(){}
    public Professor(String nome, int martricula){
        this.nome = nome;
        this.matricula = martricula;
    }


    public float getSalario(){
        return 0;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }    
}