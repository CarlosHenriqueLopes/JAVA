package dragonboll;

public class Condicoes {
    Atributos atributos = new Atributos();
    
    public void switchCase(String valor){
        
        // DUvida!
        // Por que não funciona o toLowercase() nos métodos setters?
        
        atributos.setNomeIMG(valor);
        atributos.setOrigem(valor);

        switch (valor.toLowerCase()){
            case "goku":
                atributos.getInformacoes();
                break;
            case "piccolo":
            atributos.getInformacoes();
                break;
            case "vegeta":
            atributos.getInformacoes();
                break;
            case "bulma":
            atributos.getInformacoes();
                break;
            case "kuririn":
            atributos.getInformacoes();
                break;
            default:
                atributos.getInformacoes();
                break;
        }
    }

    // Resumido, nesse caso é só chamar o método switchCase2()
    // public void switchCase2(String valor){
    //     atributos.setNomeIMG(valor);
    //     atributos.getNomeIMG();

    //     atributos.setOrigem(valor);
    //     atributos.getOrigem();
    // }

}