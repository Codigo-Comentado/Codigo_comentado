package c03_programacao_orientada_a_objetos;

/**
 * A04 — Atributos
 *
 * @modulo         Programação Orientada a Objetos
 * @roadmap        Módulo 3 → A04
 * @trilha         Java → POO → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Classes (A01), Objetos (A02)
 * @proximos       Métodos, Modificadores de Acesso
 *
 * @autor          Morcineck
 * @atualizado     27/07/2026
 * @tempoLeitura   10 min
 */
public class C04_Atributos {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Atributo é uma variável declarada dentro de uma classe,
     * responsável por definir o estado ou as características de um
     * objeto. Eles armazenam os dados que representam a entidade no
     * mundo real.
     *
     * Por exemplo, numa classe "Carro", os atributos poderiam ser:
     * Atributos (características do Carro): modelo: "Corolla" /
     * cor: "Preto" / ano: 2026
     *
     * A declaração de atributo inclui um modificador de acesso (que
     * define quem pode vê-lo), o tipo de dado e nome.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Quando um objeto é criado com 'new', o Java reserva um espaço
     * na memória RAM para esse objeto. Dentro desse espaço ficam
     * armazenados os atributos pertencentes a ele. Cada objeto possui
     * seu próprio conjunto de atributos, independente dos demais
     * objetos criados a partir da mesma classe.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Os atributos (características/estado) existem para armazenar
     * as informações que descrevem um objeto. Sem eles, todos os
     * objetos criados seriam estruturas vazias, sem características
     * próprias e sem nenhuma forma de representar dados do mundo
     * real.
     *
     * Por ex: imagine uma classe Torta. Sem atributos, todas as
     * Tortas seriam exatamente iguais, pois não haveria como
     * informar o sabor, o formato ou o tamanho de cada uma.
     *
     * Ao adicionar atributos, cada objeto passa a possuir suas
     * próprias informações, permitindo que vários objetos da mesma
     * classe representem elementos diferentes.
     *
     * Em outras palavras, os métodos dizem o que o objeto pode fazer,
     * enquanto os atributos dizem como ele é ou qual é o seu estado
     * naquele momento.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Use atributos sempre que precisar armazenar características ou
     * o estado de um objeto. Depois de criar um objeto com a
     * palavra-chave 'new', você pode acessar seus atributos
     * utilizando o operador ponto (.) para atribuir ou consultar
     * valores.
     *
     * Ex:  Torta minhaTorta = new Torta();
     *
     *      minhaTorta.sabor = "Chocolate";
     *      minhaTorta.formato = "Redonda";
     *      minhaTorta.tamanho = "Grande";
     *
     *      System.out.println(minhaTorta.sabor);
     *      System.out.println(minhaTorta.formato);
     *      System.out.println(minhaTorta.tamanho);
     *
     *      = é usado para atribuir um valor ao atributo.
     *      . (operador ponto) é usado para acessar os atributos do objeto.
     *      System.out.println() exibe o valor armazenado no atributo.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Não use atributos quando a informação não representar uma
     * característica ou estado do objeto.
     *
     * Ex: int resultado = 10 + 5;
     * Não faz sentido criar uma classe Calculadora apenas para
     * armazenar os números como atributos se eles serão usados
     * apenas naquele cálculo.
     *
     * Da mesma forma, se uma informação existe apenas temporariamente
     * durante a execução de um método, ela deve ser armazenada em
     * uma variável local, e não como um atributo.
     *
     * Em resumo, use atributos apenas para representar informações
     * que pertencem ao objeto. Se a informação é temporária ou não
     * faz parte das características do objeto, um atributo
     * provavelmente não é a melhor escolha.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Organização dos dados: os atributos mantêm todas as
     *   informações relacionadas ao objeto, reunidas em um único
     *   lugar, tornando o código mais organizado, legível e fácil
     *   de manter.
     *
     * - Representação do mundo real: os atributos permitem descrever
     *   as características de objetos do mundo real. Assim, objetos
     *   criados a partir da mesma classe podem representar entidades
     *   diferentes apenas armazenando valores diferentes em seus
     *   atributos.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Maior consumo de memória: cada objeto criado armazena os seus
     *   próprios atributos na memória RAM. Em aplicações que criam
     *   muitos objetos, isso pode aumentar o consumo de memória do
     *   programa.
     *
     * - Complexidade desnecessária: criar atributos para informações
     *   que não pertencem ao objeto ou que são usadas apenas
     *   temporariamente pode deixar a classe mais confusa, difícil
     *   de entender e de manter.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Use nomes claros e descritivos: escolha nomes que representem
     *   exatamente a informação armazenada no atributo. Por ex,
     *   prefira nome, idade e salário em vez de n, i, ou valor1.
     *
     * - Declare apenas os atributos necessários: crie apenas
     *   atributos que realmente representam características do
     *   objeto. Evite adicionar informações que não fazem parte
     *   dele, pois isso torna a classe mais complexa e difícil de
     *   manter.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * - Tentar acessar um atributo que não existe.
     *   O erro: escrever o nome de um atributo que não foi declarado
     *   na classe.
     *   minhaTorta.recheio = "Morango"; // Erro: o atributo recheio não existe.
     *
     *   Porque acontece: o Java só permite acessar atributos que
     *   foram declarados na classe. Se o nome estiver errado ou o
     *   atributo não existir, o código não será compilado.
     *
     * - Achar que todos os objetos compartilham os mesmos atributos:
     *   O erro: pensar que alterar um atributo num objeto também
     *   altera os demais objetos criados pela mesma classe.
     *
     *      Torta tortaChocolate = new Torta();
     *      Torta tortaCenoura = new Torta();
     *
     *      tortaChocolate.sabor = "Chocolate";
     *
     *      tortaCenoura.sabor -> continua vazio.
     *      Alterar um objeto não modifica o outro.
     *
     *   Porque acontece: cada objeto criado com 'new' possui seu
     *   próprio conjunto de atributos armazenado na memória RAM.
     *   Embora tenham sido criados a partir da mesma classe, eles
     *   são independentes.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine a Classe como a receita e o objeto a Torta pronta. Os
     * atributos são as características dessa Torta, como sabor, o
     * formato, e o tamanho.
     *
     * Ex: duas tortas podem ter sido feitas usando a mesma receita
     * (classe), mas cada uma possui os seus próprios atributos.
     * Torta 1: sabor "Chocolate", formato "Redonda", peso 1,5 kg.
     * Torta 2: sabor "Cenoura", formato "Quadrada", peso 2,0 kg.
     *
     * Mesmo que ambas sejam da mesma classe, cada uma armazena seus
     * próprios atributos (características). Você pode alterar uma
     * sem modificar a outra.
     *
     * Classe → a receita (o molde).
     * Objeto → a torta pronta.
     * Atributos → as características da torta.
     * Métodos (próximo módulo) → as ações que a torta pode realizar,
     * como assar() ou fatiar().
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO INCORRETO (com observações)
    // -----------------------------------------------------

    // ❌ Errado / ingênuo: tentar acessar um atributo que não
    // existe na classe.

    // Torta minhaTorta = new Torta()     <- Criando um novo objeto do tipo Torta na memória RAM.
    // minhaTorta.recheio = "Morango";    <- Erro: o atributo recheio não existe.
    //
    // Porque falha: o Java só permite acessar atributos que
    // foram declarados na classe. Como "recheio" não faz parte
    // da classe Torta, o compilador informa que esse atributo
    // não pode ser acessado.

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO CORRETO (com observações)
    // -----------------------------------------------------

    static class Torta {

        // Atributos, eles representam as características que um objeto Torta possui.
        String sabor;   // Atributo de instância.
        String tamanho; // Atributo de instância.
        String formato; // Atributo de instância.

        // Método da classe.
        // Define um comportamento que o objeto Torta pode executar.
        void exibirInformacoes() {
            // Exibindo o valor armazenado no atributo sabor.
            System.out.println("Torta sabor: " + sabor);
            // Exibindo o valor armazenado no atributo tamanho.
            System.out.println("Tamanho da torta: " + tamanho);
            // Exibindo o valor armazenado no atributo formato.
            System.out.println("Formato da torta: " + formato);
        }
    }

    public static void main(String[] args) {

        // Criamos um objeto da classe Torta utilizando o operador 'new'.
        // O 'new' é responsável por reservar um espaço na memória
        // e criar uma instância da classe Torta.
        Torta minhaTorta = new Torta();

        // Agora podemos acessar os atributos do objeto criado.
        // Atribuindo o valor "Chocolate" ao atributo sabor
        minhaTorta.sabor = "Chocolate";
        // Atribuindo o valor "Grande" ao atributo tamanho.
        minhaTorta.tamanho = "Grande";
        // Atribuindo o valor "Redondo" ao atributo formato.
        minhaTorta.formato = "Redonda";

        // Chamamos um método do objeto para executar uma ação
        minhaTorta.exibirInformacoes();
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie uma classe Produto. Ela deve possuir os seguintes
     * atributos:
     * - nome
     * - preco
     * - quantidadeEmEstoque
     *
     * 1. Crie pelo menos dois objetos da classe Produto.
     *
     * Produto produto1 = new Produto();
     *
     * 2. Atribua valores diferentes para cada objeto.
     *
     * Exemplo:
     * produto1.nome = "Notebook";
     * produto1.preco = 3500.00;
     * produto1.quantidadeEmEstoque = 5;
     *
     * 3. Crie um método chamado exibirProduto() dentro da classe
     * Produto. Esse método deve imprimir todas as informações do
     * produto.
     *
     * Exemplo de saída:
     * Produto: Notebook
     * Preço: R$ 3500.00
     * Estoque: 5 unidades
     *
     * 4. Crie também um método chamado adicionarEstoque(int
     * quantidade). Esse método deve receber uma quantidade e
     * aumentar o valor do atributo quantidadeEmEstoque.
     *
     * Exemplo:
     * produto1.adicionarEstoque(3);
     *
     * Resultado:
     * Estoque atualizado: 8 unidades
     *
     * 5. Execute o método exibirProduto() antes e depois de
     * adicionar produtos ao estoque para observar a mudança no
     * objeto.
     *
     * Explique com suas próprias palavras: se eu alterar a
     * quantidadeEmEstoque do produto1, por que o produto2 continua
     * com seu próprio estoque?
     *
     * - Criação de objetos usando new.
     * - Instâncias independentes.
     * - Atributos pertencentes ao objeto e não à classe.
     */

    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * Uma curiosidade legal sobre Java é que os atributos não
     * precisam ter valores definidos por você: se você criar um
     * atributo numérico (como int), o Java coloca o valor 0
     * sozinho. Se for um texto ou objeto (String), ele deixa como
     * null.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Atributos são variáveis declaradas dentro de uma classe que
     * armazenam as características e o estado de um objeto. Cada
     * objeto possui os seus próprios atributos e valores, permitindo
     * representar diferentes elementos a partir da mesma classe de
     * forma organizada e independente.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Documentação oficial: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
     */
}