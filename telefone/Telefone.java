package telefone;

public class Telefone {
    private String numChip;
    private Contatos_lista contatos;//-> atributo do tipo da classe Contatos
    private Chamadas_lista chamadas;//-> atributo do tipo da classe Chamadas

    // contrutor
    public Telefone(String numChip){
        this.numChip = numChip;
        this.contatos = new Contatos_lista();//-> instanciando a classe Contatos
        this.chamadas = new Chamadas_lista();//-> instanciando a classe Chamadas
    }

    // OBS: quando rever esse método, prestar atenção de onde vem cada método
    public void ligar(String numDestino){
        Ligacao ligacao = new Ligacao(this.numChip, numDestino);
        ligacao.ligar();
        chamadas.adicionar(ligacao);
    }

    // Polimorfismo de sobrecarda do método ligar()
    public void ligar(Contato numDestino){
        ligar(numDestino.getNumero());
    }


    
    public String getnumChip(){
        return numChip;
    }

    // get do tipo Contatos_lista
    public Contatos_lista getContatos_lista(){
        return contatos;
    }

    // get do tipo Chamdas
    public Chamadas_lista getChamadas(){
        return chamadas;
    }
}
