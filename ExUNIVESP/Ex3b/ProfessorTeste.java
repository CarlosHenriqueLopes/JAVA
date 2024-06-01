package ExUNIVESP.Ex3b;

public class ProfessorTeste {
    public static void main(String[] args) {

        ProfessorConcursado profCursando = new ProfessorConcursado();
        ProfessorConcursado profCursando2 = new ProfessorConcursado("ProfJava", 2024, 10000);

        // profCursando
        profCursando.setMatricula(2020);
        profCursando.setNome("NomeProf2");
        profCursando.setSalario(10000);

        System.out.printf("Nome: %s\nSalário: %g\nMartriculado no ano de: %s\n",
            profCursando.getNome(),profCursando.getSalario(),profCursando.getMatricula()
        );
        System.out.println();

        // profCursando2
        profCursando2.setMatricula(2022);
        profCursando2.setNome("NomeProf1");
        profCursando2.setSalario(10000);

        System.out.printf("Nome: %s\nSalário: %g\nMartriculado no ano de: %s\n",
        profCursando2.getNome(),profCursando2.getSalario(),profCursando2.getMatricula()
        );

       System.out.println();
    //-----------------------------------------------------------------------------------------------------------

        ProfessorHorista profHoras = new ProfessorHorista("Prof que trampa p/hr", 2024, 30.24, 6);

        System.out.printf("Nome: %s\nAno de matricula: %d\nValor hrs trabalhadas: %2f\nNum de hrs trabalhadas: %2f\nSalário: %g",
            profHoras.getNome(), profHoras.getMatricula(), profHoras.getValorHora(), profHoras.getNumHoras(), profHoras.getcalcSalario()
        );
        // System.out.println(profHoras.getcalcSalario());
        // System.out.println(profHoras.getNumHoras());
        // System.out.println(profHoras.getValorHora());
        // System.out.println(profHoras.getNome());
        // System.out.println(profHoras.getMatricula());
        // System.out.println(profHoras.getMatricula());

    }
    
    
}
