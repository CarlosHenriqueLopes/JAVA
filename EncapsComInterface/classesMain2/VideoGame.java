package EncapsComInterface.classesMain2;

public class VideoGame {

    private Jogo jogo; // caso não seja adicionado um vlr para a variável jogo, ela vai valer null
    private boolean estaLigado; // caso não seja adicionado um vlr para a variável estaLigado, ela vai valer false

    public void ligarVideoGame(){
        System.out.println("Iniciando o video game...");
        this.estaLigado = true;

    }
    
    public void jogar(Jogo var){
        if (this.estaLigado == true){
            System.out.printf("Iniciando game... %s\n", var.getName());
            this.jogo = var;
            var.jogar(); // valor adicionando o médoto da interface especifico do exemplo

        } else {
            System.out.println("Ligue o video game antes de começar a jogar");
        }
    }    
 
    public void fechar(){
        // estaLigado == true quer dizer que o método ligarVideoGame() foi usado
        if (this.estaLigado == true && this.jogo == null){
            System.out.println("Desligando o video game, sem nenhum jogo iniciado");

        // essa condição significa que o video game está ligado e tem um jogo iniciado
        } else if (this.estaLigado == true){
            System.out.printf("Fechando o jogo %f\n", jogo.getName());

            // se cair na condição else if, vai para este if ou else

            // se a variavel do tipo Jogo não receber nada = null (estiver vazia).
            // a variavel do tipo jogo recebe o método fechar() referente ao game adicionado
            if (this.jogo != null){
                this.jogo.fechar();// -> cada tipo de game, vai mostrar uma coisa
                this.jogo = null;// -> remover o game que foi adicionado em jogar()

            } else {
                System.out.println("Nenhum jogo iniciado");
            }
            
        } else {
            //Condição no caso do método ligar() não for ativado
            System.out.println("Não há nada iniciado para ser fechado");
        }
    }
}
    /*
        -- Sobre o método jogar() --
    Se eu colocar um tipo de atributo de apenas uma classe, exemplo, colocar do tipo do atributo TiroOnLine,
    vou poder usar apenas os métodos da classe TiroOnLine.
    Ou seja, colocando um tipo de atriburo TiroOnLine, quando eu chamar o método Jogar(), vou pode passar apenas valores do tipo TiroOnLine,
    e só vou poder chamar os métodos que tem dentro da classe TiroOnLine
         
         public void Jogar(TiroOnLine exemplo){
            exemplo.soTiro();  ->  soTiro() só existe dentro da classe TiroOnline
         }


        Mais se eu colocar o tipo de atributo como Jogo, que é minha interface, vou pode usar todos os métodos obrigatórios.
        Ou seja, quando eu chamar o método Jogar() com valores do tipo Jogo (que é minha interface),
    vou poder usar os métodos obrigatórios de todas as classes que tenham a implementação da interface Jogo
    */
