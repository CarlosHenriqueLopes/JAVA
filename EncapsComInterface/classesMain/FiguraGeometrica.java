package EncapsComInterface.classesMain;


/*
    método interface é como um contrato
    Uma interface estabelece um contrato que as classes devem seguir quando a implementam.
    Ela contém apenas métodos abstratos (sem implementação) e constantes (variáveis finais).
    Não possui implementação própria; oferece apenas a assinatura dos métodos.

    Implementação:
    Uma classe pode implementar várias interfaces.
    A classe deve implementar todos os métodos da interface com a mesma assinatura (nome, parâmetros e exceções).
    Os campos da interface não da precisam ser declarados na classe, apenas os métodos.
    
    Instâncias de uma Interface:
    Ao criar uma classe que implementa uma interface, a instância do objeto pode ser referenciada como uma instância da interface.
    Isso permite polimorfismo.

    Ou seja, a interface OBRIGA o usuário usar determinado objeto para para uma função especifica
*/

public interface FiguraGeometrica{

    // Não se coloca as chaves {}
    // ou seja, não se implementar o código, apenas coloca o cabeçalho
    public double calcularArea();
    
}
