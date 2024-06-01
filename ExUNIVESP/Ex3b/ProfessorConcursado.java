package ExUNIVESP.Ex3b;

public class ProfessorConcursado extends Professor{
    private float salario;

    // Contrutores
    public ProfessorConcursado(){}
    public ProfessorConcursado(String nome, int matricula){
        super(nome,matricula);
    }
    public ProfessorConcursado(String nome, int matricula, float salario){
        super(nome,matricula);
        this.salario = salario;
    }

    
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
