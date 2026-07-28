package poo.basico;

public class A02_Objetos {

/*
=============================================================
TEMA: Objetos

Nível:
🟢 Básico

Autor: Morcineck
Última atualização: 22/07/2026
Pré-requisitos: Lógica de programação básica (Objetos)
Tempo estimado de leitura: 10 min
=============================================================

O QUE É?
-------------------------------------------------------------
Objeto é uma instância de uma classe. Imagine a classe como uma forma de bolo, ela dita o formato.
Já o bolo é o objeto criado a partir dessa forma (Classe). Cada bolo (objeto) possui estados (atributos/dados)
e comportamentos (métodos/ações) definidos pela forma (classe).

Ex: Classe: FormaDeBolo / Objeto: meuBoloDeChocolate
  Atributos(Características): formato: "Redondo" / sabor: "Chocolate" / estaSolado: Verdadeiro
  Comportamento(Método/Ações): assar() / fatiar() / comer()

-------------------------------------------------------------
COMO FUNCIONA?
-------------------------------------------------------------
A Classe guarda as instruções e o molde de como o objeto deve ser construído (ficando salva no código/disco).
Quando o Objeto é criado (instanciado), o programa reserva um espaço dinâmico na memória RAM exclusivamente para
guardar os dados e o estado daquele objeto. Cada objeto criado ganha seu próprio espaço na RAM,
permitindo que seus dados e comportamentos sejam acessados e
modificados enquanto o programa estiver rodando.

-------------------------------------------------------------
POR QUE EXISTE?
-------------------------------------------------------------
Sem o objeto, teríamos milhares de variáveis e funções soltas no código, gerando bagunça e
alto risco de erros. O objeto resolve esse problema agrupando dados (atributos) e
comportamentos (métodos) em uma única estrutura organizada. Ele simplifica o código,
evita repetições desnecessárias e permite modelar sistemas complexos de forma muito mais intuitiva e
próxima do mundo real.

-------------------------------------------------------------
QUANDO USAR?
-------------------------------------------------------------
Quase sempre que você precisar representar algo que tenha características (atributos/dados) e
ações (métodos/comportamento) no seu sistema. Ou seja, quando for necessário gerar
vários itens parecidos, mas com informações diferentes.

Ex: Objeto meuBoloDeChocolate : possui os atributos sabor e formato, e os métodos assar() ,
fatiar() e comer()

-------------------------------------------------------------
QUANDO NÃO USAR?
-------------------------------------------------------------
Se você não tem dados para guardar junto com ações, não precisar de um objeto.

EX: Se você precisa apenas converter gramas de açúcar em xícaras, você não precisa criar um ObjetoBolo
na memória RAM. Uma simples função converterGramaParaXicara() resolve diretamente.

-------------------------------------------------------------
VANTAGENS
-------------------------------------------------------------
- Reutilização de Código: Com a classe (a forma) pronta, você pode criar centenas de objetos (bolos)
diferentes com apenas uma linha de código, sem precisar reescrever a estrutura todas as vezes.

- Organização e Proteção de Dados (Encapsulamento): Os dados (sabor, formato) e as ações (assar, fatiar, comer)
ficam protegidos e agrupados dentro do próprio objeto. Isso evita que uma alteração em um bolo altere
acidentalmente as informações do outro.

-------------------------------------------------------------
DESVANTAGENS
-------------------------------------------------------------
- Consumo maior de Memória e Processamento: Cada objeto criado ocupa espaço real na memória RAM e exige
processamento extra para gerenciar suas referências. Para tarefas muito simples ou programas de altíssimo
desempenho, isso pode deixar o sistema mais pesado.

- Complexidade Desnecessária (Burocracia no Código): Para problemas pequenos, criar classes, atributos e
métodos pode transformar uma solução simples em um código longo e difícil de entender (o famoso over-engineering)

Over- engineering: Acontece quando você constrói uma solução muito mais complexa e
sofisticada para resolver problemas simples.

-------------------------------------------------------------
ERROS MAIS COMUNS
-------------------------------------------------------------
- Tentar acessar atributos/métodos diretamente da Classe em vez do Objeto.
(NullPointerException / Erro de Instância): Acontece ao tentar mandar a forma de bolo assar ou
tentar comer a forma, em vez de criar o bolo primeiro (FormaDeBolo.assar() em vez de meuBolo.assar() ).

Por que acontece: Quando esquece de instanciar o objeto (usar new) antes de tentar usar seus dados. Como a
classe é apenas um molde e não ocupa espaço dinâmico na memória RAM com dados reais, tentar acessar algo que
não foi criado gera um erro de ponteiro nulo (o sistema procura o bolo na memória e não encontra)

- Criar Objetos "Deus" (god Objects / Violação de responsabilidade única):
O erro: Colocar atributos e métodos demais dentro de um único objeto, fazendo com que ele cuide de tudo no sistema.

Por que acontece: por preguiça ou falta de planejamento ao estruturar o sistema. O dev começa a adicionar
coisas no mesmo objeto até que o ObjetoBolo passa a cuidar da receita, de assar, de cobrir o cliente, de enviar email
de confirmação e de emitir nota fiscal. Isso destrói a organização da Orientação a Objetos.

-------------------------------------------------------------
BOAS PRÁTICAS
-------------------------------------------------------------
- Princípio de Responsabilidade Única (Cada Objeto no seu quadrado):
O que fazer: Um objeto deve ter apenas uma única responsabilidade no sistema.

- Encapsulamento (Proteja os dados do seu objeto):
O que fazer: Não deixe os atributos do objeto expostos para qualquer um alterar
diretamente de fora. Torne os atributos privados e use métodos para controlar o acesso.

-------------------------------------------------------------
ANALOGIA
-------------------------------------------------------------
Imagine a Classe como a receita e a forma de bolo. Você não consegue comer a forma nem a
folha de papel da receita. Objeto é o bolo de verdade, assado e fofo, pronto na bancada.
Você pode usar a mesma forma (Classe) para fazer dez bolos (Objetos) diferentes, um de chocolate,
um de fubá e um de cenoura.

-------------------------------------------------------------
RESUMO
-------------------------------------------------------------
A Classe é o molde estático (salvo no disco), enquanto o Objeto é a instância viva e dinâmica criada
a partir desse molde (classe) na memória RAM. Ele existe para organizar código, agrupando dados (atributos)
e ações (comportamentos) em uma única estrutura que facilita a reutilização e modela o mundo real. Use quando
precisar representar entidades com características e ações, mas evite em tarefas simples ou cálculos isolados
para não gerar over-engineering.
=============================================================
*/


    // Classe Bolo: o "molde" que define o que é um Bolo.
    // Todo objeto criado a partir dela terá esses atributos.
    static class Bolo {
        String sabor;
        String formato;

        // Método: um comportamento que todo objeto Bolo possui.
        void assar() {
            System.out.println("O bolo " + formato + " de " + sabor + " está assado!");

        }
    }

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO INCORRETO (com observações)
    // -----------------------------------------------------

    // ❌ Errado / ingênuo: tentar usar a classe diretamente, sem
    // criar um objeto com "new".

    // Bolo.sabor = "Chocolate"; // Erro: sabor não é static
    // Bolo.assar();             // Erro: assar() precisa de um objeto
    //
    // Porque falha: a classe Bolo é só a receita/molde. Sem usar
    // "new", o Java não aloca espaço na memória RAM para guardar
    // os dados do bolo, não existe "sabor" nem "assar()" fora de
    // um objeto real.


    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO CORRETO (com observações)
    // -----------------------------------------------------


    public static void main(String[] args) {
        // Criando o objeto real na memória RAM com o "new".
        Bolo meuBolo = new Bolo();

        // Definindo os atributos desse objeto específico.
        meuBolo.sabor = "Chocolate";
        meuBolo.formato = "redondo";

        // Usando o comportamento (método) do objeto;
        meuBolo.assar();

        // Criando um segundo objeto, independente do primeiro.
        Bolo outroBolo = new Bolo();
        outroBolo.sabor = "Cenoura";
        outroBolo.formato = "quadrado";
        outroBolo.assar();

    }
}


/*
=============================================================
DESAFIO
=============================================================
Crie uma classe `Aluno` com os atributos `nome` e `curso`.

1. Crie pelo menos dois objetos `Aluno` diferentes.
2. Crie um método `apresentar()` que imprima algo como
   "Olá, meu nome é [nome] e eu estudo [curso]."
3. Chame o método `apresentar()` de cada objeto criado.

Depois, explique com suas próprias palavras: por que os dois
objetos `Aluno` não interferem um no outro, mesmo vindo da
mesma classe?

=============================================================
VOCÊ SABIA? (opcional)
=============================================================
Quando você cria um objeto com "new" e não guarda essa
referência em nenhuma variável, o objeto continua existindo na
memória por um tempo, mas fica "inacessível", ninguém mais
consegue chamar seus métodos ou ler seus atributos. Mais cedo ou
mais tarde, o Garbage Collector do Java identifica que aquele
espaço não está mais sendo usado por ninguém e libera essa
memória automaticamente.

=============================================================
REFERÊNCIAS
=============================================================
- Documentação oficial: https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html
- Baeldung - Java Classes and Objects: https://www.baeldung.com/java-classes-objects
=============================================================
*/
