// poo: Classes e Objetos

/*
=============================================================
TEMA: Classes e Objetos

Nível:
🟢 Básico

Autor: [Morcineck]
Última atualização: [16/07/2026]
Pré-requisitos: Lógica de programação básica (variáveis, tipos, funções)
Tempo estimado de leitura: 10 min
=============================================================

O QUE É?
-------------------------------------------------------------
Uma classe é um molde, um projeto que descreve como algo deve
ser: quais características (atributos) e quais comportamentos
(métodos) esse "algo" vai ter.

Um objeto é uma instância concreta desse molde, a coisa real,
criada a partir da classe, com valores próprios.

Classe descreve. Objeto existe.

-------------------------------------------------------------
COMO FUNCIONA?
-------------------------------------------------------------
Em JavaScript, você define a classe uma única vez, com a
palavra-chave `class`. A partir dela, pode criar quantos
objetos quiser usando `new`.

Cada objeto criado tem os seus próprios valores de atributos,
mesmo compartilhando a mesma estrutura (a mesma classe). Ou
seja, dois objetos da mesma classe são "parentes" na forma, mas
independentes no conteúdo.

(Curiosidade técnica: por trás dos panos, classes em JavaScript
são só uma forma mais legível de escrever o que a linguagem já
fazia antes com "funções construtoras" e "prototypes". Você não
precisa entender isso agora, só saber que `class` existe desde
2015 e é a forma moderna e recomendada de fazer isso.)

-------------------------------------------------------------
POR QUE EXISTE?
-------------------------------------------------------------
Sem classes, precisaríamos representar cada "coisa" do nosso
programa com variáveis soltas e sem relação organizada entre
si, por exemplo, várias variáveis separadas para nome, preço e
estoque de um produto, sem nada que amarre essas informações
como pertencentes ao mesmo produto.

Classes resolvem isso agrupando dado (atributos) e comportamento
(métodos) relacionados numa única estrutura, refletindo como
pensamos sobre o mundo real: "um Produto tem nome, preço e
estoque, e sabe exibir os seus próprios detalhes."

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
Em JavaScript isso é ainda mais comum: para dados simples, um
objeto literal (`{ nome: "Teclado", preco: 150 }`) já resolve,
sem precisar de uma classe.

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
  código mais verboso do que precisa ser (em JS, muitas vezes um
  objeto literal já resolve).
- Iniciantes às vezes confundem classe com objeto, tratando os
  dois como sinônimos, o que gera confusão em conceitos futuros
  (como herança e polimorfismo).

-------------------------------------------------------------
ERROS MAIS COMUNS
-------------------------------------------------------------
- Achar que a classe "é" o objeto. A classe é só a planta; o
  objeto é a casa construída a partir dela.
- Esquecer o `new` na hora de criar um objeto, em JavaScript,
  chamar a classe sem `new` gera um erro (diferente de uma função
  comum, que pode ser chamada livremente).
- Esquecer que cada objeto tem a sua própria cópia dos atributos,
  alterar o atributo de um objeto não afeta outro objeto da
  mesma classe.

-------------------------------------------------------------
BOAS PRÁTICAS
-------------------------------------------------------------
- Nomeie classes com substantivos, começando com letra maiúscula
  (`Produto`, não `produto` ou `criarProduto`) é a convenção
  universal em JavaScript (e na maioria das linguagens).
- Uma classe deve ter uma única responsabilidade clara.
- Use `const` para guardar objetos criados com `new`, já que a
  referência ao objeto não muda (mesmo que os atributos dele mudem).

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
com `new`, com valores próprios. Toda a Orientação a Objetos
parte dessa distinção.
=============================================================
*/

// Declaração da classe: aqui você define o "molde", quais
// atributos e comportamentos todo objeto Produto vai ter.
class Produto {

  // O constructor é um método especial, chamado automaticamente
  // toda vez que criamos um objeto com "new Produto(...)".
  // É aqui que os valores recebidos são guardados nos atributos
  // do objeto que está sendo criado (usando "this").
  constructor(nome, preco, estoque) {
    this.nome = nome;
    this.preco = preco;
    this.estoque = estoque;
  }

  // Método: um comportamento que todo objeto Produto possui.
  // Aqui ele imprime as informações do produto no console.
  exibirDetalhes() {
    console.log(`${this.nome} - R$${this.preco} (${this.estoque} unidades)`);
  }
}

// ❌ Errado / ingênuo: representar o mesmo conceito com
// variáveis soltas, sem nenhuma estrutura que as agrupe.
// Isso funciona para UM produto, mas não escala: e se você
// precisar de 10 produtos? 100? Viraria 300 variáveis soltas,
// sem forma de relacionar cada trio (nome/preço/estoque) entre si.
//
// const nomeProdutoA = "Teclado";
// const precoProdutoA = 150.0;
// const estoqueProdutoA = 20;

// Criando dois objetos a partir da mesma classe.
// Cada um tem os seus próprios valores, eles são independentes.
const produto1 = new Produto("Teclado", 150.0, 20);
const produto2 = new Produto("Mouse", 80.0, 35);

produto1.exibirDetalhes();
produto2.exibirDetalhes();

// Alterar o estoque de um objeto não afeta o outro.
produto1.estoque = 10;
console.log("Estoque atualizado do produto1:", produto1.estoque);
console.log("Estoque do produto2 (não alterado):", produto2.estoque);

/*
=============================================================
DESAFIO
=============================================================
Crie uma classe `Pessoa` com os atributos `nome`, `idade` e
`cidade`.

1. Crie um constructor que receba esses três valores.
2. Crie um método `exibirDados()` que imprima as informações da
   pessoa (nome, idade e cidade), assim como foi feito com
   `exibirDetalhes()` na classe Produto.
3. Crie pelo menos dois objetos `Pessoa` diferentes, com valores
   distintos, e chame o método `exibirDados()` de cada um.

Depois, explique com suas próprias palavras: por que faz sentido
essas informações estarem todas dentro da mesma classe, em vez
de serem variáveis soltas?

=============================================================
VOCÊ SABIA?
=============================================================
Diferente do Java, em JavaScript você também pode criar objetos
sem usar classe nenhuma, direto com um "objeto literal":

const produto = { nome: "Teclado", preco: 150, estoque: 20 };

Isso funciona bem para dados simples e avulsos. Classes passam a
valer a pena quando você precisa criar VÁRIOS objetos parecidos
(reaproveitando o mesmo "molde") ou quando o objeto precisa de
comportamento (métodos) além de só guardar dados.

=============================================================
REFERÊNCIAS
=============================================================
- MDN Web Docs - Classes: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Classes
- MDN Web Docs - Working with objects: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Guide/Working_with_objects
=============================================================
*/

module.exports = { Produto };