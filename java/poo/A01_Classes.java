package poo;

public class A01_Classes {

/*
=============================================================
TEMA: Classes e Objetos

Nível:
🟢 Básico

Autor: Morcineck
Última atualização: 13/07/2026 H01:23
Pré-requisitos: Lógica de programação básica (variáveis, tipos, métodos)
Tempo estimado de leitura: 10 min
=============================================================

O QUE É?
-------------------------------------------------------------
Uma classe é um molde, um projeto que descreve como algo deve
ser: quais características (atributos) e quais comportamentos
(métodos) esse "algo" vai ter.

Um objeto é uma instância concreta desse molde, a coisa real,
criada a partir da classe, ocupando memória e com valores
próprios.

Classe descreve. Objeto existe.

-------------------------------------------------------------
COMO FUNCIONA?
-------------------------------------------------------------
Você define a classe uma única vez, com a palavra-chave class.
A partir dela, pode criar quantos objetos quiser usando new.

Cada objeto criado tem os seus próprios valores de atributos, mesmo
compartilhando a mesma estrutura (a mesma classe). Ou seja, dois
objetos da mesma classe são "parentes" na forma, mas independentes
no conteúdo.

-------------------------------------------------------------
POR QUE EXISTE?
-------------------------------------------------------------
Sem classes, precisaríamos representar cada "coisa" do nosso
programa com variáveis soltas e sem relação organizada entre si,
por exemplo, várias variáveis separadas para nome, preço e
estoque de um produto, sem nada que amarre essas informações
como pertencentes ao mesmo produto.

Classes resolvem isso agrupando dado (atributos) e comportamento
(métodos) relacionados numa única estrutura, refletindo como
pensamos sobre o mundo real: "um Produto tem nome, preço e
estoque, e sabe calcular o seu próprio desconto."

-------------------------------------------------------------
QUANDO USAR?
-------------------------------------------------------------
Sempre que você identificar um "substantivo" importante no seu
problema, algo que tem características e comportamentos
próprios: Usuário, Pedido, Produto, Conta, Veículo.

-------------------------------------------------------------
QUANDO NÃO USAR?
-------------------------------------------------------------
Para dados soltos, temporários, sem comportamento associado (ex:
uma variável para contar um loop), criar uma classe é exagero.
Nem tudo no código precisa virar uma classe, só o que representa
um conceito com identidade própria.

-------------------------------------------------------------
VANTAGENS
-------------------------------------------------------------
- Organiza dado e comportamento relacionados num único lugar.
- Permite criar múltiplos objetos reaproveitando a mesma estrutura.
- Aproxima o código da forma como pensamos sobre o problema real.

-------------------------------------------------------------
DESVANTAGENS
-------------------------------------------------------------
- Criar classes para tudo, mesmo coisas simples, pode deixar o
  código mais verboso do que precisa ser.
- Iniciantes às vezes confundem classe com objeto, tratando os
  dois como sinônimos, o que gera confusão em conceitos futuros
  (como herança e polimorfismo).

-------------------------------------------------------------
ERROS MAIS COMUNS
-------------------------------------------------------------
- Achar que a classe "é" o objeto. A classe é só a planta; o
  objeto é a casa construída a partir dela.
- Esquecer que cada objeto tem a sua própria cópia dos atributos,
  alterar o atributo de um objeto não afeta outro objeto da
  mesma classe.
- Colocar numa única classe responsabilidades que não têm
  relação entre si (ex: uma classe "Produto" que também cuida de
  enviar e-mail).

-------------------------------------------------------------
BOAS PRÁTICAS
-------------------------------------------------------------
- Nomeie classes com substantivos, começando com letra maiúscula
  (Produto, não produto ou CriarProduto).
- Uma classe deve ter uma única responsabilidade clara.
- Prefira atributos privados (tema em Encapsulamento) em vez
  de deixá-los acessíveis livremente.

-------------------------------------------------------------
ANALOGIA
-------------------------------------------------------------
Pense numa fôrma de bolo.

A fôrma (classe) define o formato: redondo, com furo no meio.
Mas a fôrma sozinha não é um bolo, é apenas o molde.

Cada vez que você usa a fôrma, sai um bolo (objeto) diferente:
um de chocolate, outro de baunilha, cada um com o seu próprio
sabor e cobertura, mesmo tendo vindo da mesma fôrma.

A fôrma é a classe. Cada bolo assado é um objeto.

-------------------------------------------------------------
RESUMO
-------------------------------------------------------------
Classe é a definição, o molde, a estrutura, o que algo pode ter
e fazer. Objeto é a existência concreta dessa definição, criada
com new, com valores próprios. Toda a Orientação a Objetos
parte dessa distinção.
=============================================================
*/

    // Declaração de classe, aqui você define o "molde": quais atributos
    public static class Produto {
        String nome;    // <- Atributos
        double preco;  // <- Atributos
        int estoque;  // <- Atributos

    // Aqui é o construtor, onde se define como o objeto nasce, recebendo os valores dos atributos
        public Produto(String nome, double preco, int estoque) {
            this.nome = nome;
            this.preco = preco;
            this.estoque = estoque;
        }

    //  Aqui é método, o comportamento que todo objeto "sabe" fazer
    //  "void" indica que ele não devolve nenhum valor, apenas executa uma ação (imprimir os dados na tela)
        void exibirDetalhes(){
            System.out.println(nome + " - R$" + preco + " (" + estoque +" unidades)");
        }
    }

    // ❌ Errado / ingênuo: representar o mesmo conceito com
    // variáveis soltas, sem nenhuma estrutura que as agrupe.
    // Isso funciona para UM produto, mas não escala: e se você
    // precisar de 10 produtos? 100? Viraria 300 variáveis soltas,
    // sem forma de relacionar cada trio (nome/preço/estoque) entre si.
    //
    // String nomeProdutoA = "Teclado";
    // double precoProdutoA = 150.0;
    // int estoqueProdutoA = 20;


    public static void main(String[] args) {

        // Criando dois objetos a partir da mesma classe.
        // Cada um tem os seus próprios valores, eles são independentes.
        Produto produto01 = new Produto("Teclado", 150.0, 20);
        Produto produto2 = new Produto("Mouse", 80.0, 35);

        produto01.exibirDetalhes();
        produto2.exibirDetalhes();

        // Se alterar o estoque de um objeto não vai afetar o outro.
        produto01.estoque = 10;
        System.out.println("Estoque atualizado do produto01: " + produto01.estoque);
        System.out.println("Estoque do produto02 (Não alterado): " + produto2.estoque);

    }
}

/*
=============================================================
DESAFIO
=============================================================
Crie uma classe Pessoa com os atributos nome, idade e
cidade.

1. Crie um construtor que receba esses três valores.
2. Crie um método exibirDados que imprima as informações da
   pessoa (nome, idade e cidade), assim como mostrado no código a cima
   em exibirDetalhes na classe Produto.
3. No main, crie pelo menos dois objetos Pessoa diferentes, com valore
   distintos, e chame o método exibirDados de cada um.

Depois, explique com suas próprias palavras: por que faz sentido
essas informações estarem todas dentro da mesma classe, em vez
de serem variáveis soltas?


============================================================
VOCÊ SABIA?
=============================================================
Em Java, todo objeto que você cria com new vive na memória
heap, e a variável que você usa para "guardá-lo" (como
produto01) na verdade não guarda o objeto em si, ela guarda
uma referência (um "endereço") para onde o objeto está na
memória. É por isso que, se você copiar uma referência para
outra variável, as duas passam a apontar para o mesmo objeto.

=============================================================
REFERÊNCIAS
=============================================================
- Documentação oficial: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
- Baeldung - Java Classes and Objects: https://www.baeldung.com/java-classes-objects
=============================================================
 */