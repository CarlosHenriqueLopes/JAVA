package telefone;

public class Main {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("(00)000000000");


        //Adicionando contatos. EX1
        // Imprimindo os contados adicionados na lista individualmente, de modo inplicito
        Contato contato = new Contato("Carlos", "(13)996245388");
        // System.out.println(contato);
        Contato contato2 = new Contato("Nome2", "22 22222 2222");
        // System.out.println(contato2);
        Contato contato3 = new Contato("Nome3", "33 33333 3333");
        // System.out.println(contato3);
        Contato contato4 = new Contato("Nome4", "44 44444 4444");
        // System.out.println(contato4);



        //Adicionando contatos. EX2
        Contatos_lista contatos_lista = new Contatos_lista();
        // contatos_lista.adicionar("nomeTeste1", "NumeroTel1");
        // contatos_lista.adicionar("nomeTeste2", "NumeroTel2");
        // contatos_lista.adicionar("nomeTeste3", "NumeroTel3");
        // contatos_lista.adicionar("nomeTeste4", "NumeroTel4");
        //System.out.println(contatos_lista);

        // contatos_lista.adicionar(contato);
        // contatos_lista.adicionar(contato2);
        // contatos_lista.adicionar(contato3);
        // contatos_lista.adicionar(contato4);
        //System.out.println(contatos_lista);



        //Adicionando contatos. EX3
        // posso usar o atributo telefone do tipo de clase Telefone, para adicionar os contatos, usando o getContatos_lista(), que retorna o tipo contato
        //então posso adicionar os valores igual no EX2
        // telefone.getContatos_lista().adicionar("Nome_teste","Numero_teste");
        // telefone.getContatos_lista().adicionar("Nome_teste2","Numero_teste2");
        // telefone.getContatos_lista().adicionar(contato);

        //System.out.println(telefone.getContatos_lista());



        //Adicionando contatos. EX4
        // para reduzir os comandos na classe principal (Main), posso colocar o getContatos_lista() em uma variável
        // a variável pegarContatos é do tipo Contatos_lista, por causa do tipo de retorno do getContatos_lista
        Contatos_lista pegarContatos = telefone.getContatos_lista();
        // pegarContatos.adicionar(contato);
        // pegarContatos.adicionar(contato2);
        // pegarContatos.adicionar("Abelha", "3213423423");
        // pegarContatos.adicionar("Avestrus", "111111");

        //.buscar() para filtrar contatos pela iniciai do nome
        System.out.println(pegarContatos.buscar("c"));



        //Parte relacionada aos prints de ligação de origem e destino. EX1
        // Ligacao ligacao = new Ligacao(contato.getNome(),contato.getNumero());
        // ligacao.ligar();
        // System.out.println(ligacao);


        //EX2
        // o telefone.ligar() -> para adicionar destino
        // telefone.ligar("(13)123456");
        // telefone.ligar(contato2.getNumero());

        // Sem o soutp, vai printar o .Ligar() mostrando apenas o destino: Ligando para o número 123456
        // telefone.getChamadas();
        // Com o soutp, vai mostrar: Origem: 00100111001     Destino: 123456 Data: 20/05/2024 19:43:10
        // System.out.println(telefone.getChamadas());


        //EX3
        telefone.ligar(contato);
        telefone.ligar(contato2);
        telefone.ligar(contato3);
        telefone.ligar("Exemplo de numero tipo str");
        System.out.println(telefone.getChamadas());

    }   
}