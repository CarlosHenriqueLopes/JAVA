/*
    Seguindo os animais do Exa Adicionar o nome, tipo e sua cor.
    Defina então uma classe denominada Animais e modifique a classe ListaAnimais,
    de maneira que a lista possa adicionar objetosAnimais ao invés de String. Ao final, exiba a lista de animais. 
 */


public class Animais {
    private String nome, tipo, cor;

    public Animais(String nome, String tipo, String cor){
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + " Tipo: " + tipo + " Cor: " + cor;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }   
}