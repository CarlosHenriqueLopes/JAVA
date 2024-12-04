package ExUNIVESP.Ex3b;

public class ProfessorHorista extends Professor{
    private double vlrHora, numHoras;

    // Contrutores
    public ProfessorHorista(){}
    public ProfessorHorista(String nome, int matricula){
        super(nome,matricula);
    }
    public ProfessorHorista(String nome, int matricula, double vlrHora, double numHoras){
        super(nome,matricula);
        this.vlrHora = vlrHora;
        this.numHoras = numHoras;
    }

    // Calculo do salário:
    public double getcalcSalario(){
        return this.numHoras * this.vlrHora;
    }

    public double getValorHora() {
        return vlrHora;
    }
    public void setValorHora(float vlrHora) {
        this.vlrHora = vlrHora;
    }

    public double getNumHoras() {
        return numHoras;
    }
    public void setNumHoras(float numHoras) {
        this.numHoras = numHoras;
    }    
}
