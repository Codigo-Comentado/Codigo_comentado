package c03_programacao_orientada_a_objetos;

/**
 * A05 — Métodos
 *
 * @modulo         Programação Orientada a Objetos
 * @roadmap        Módulo 3 → A05
 * @trilha         Java → POO → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Objetos (A02), Atributos (A04)
 * @proximos       Modificadores de Acesso, Encapsulamento
 *
 * @autor          Morcineck
 * @atualizado     29/07/2026
 * @tempoLeitura   10 min
 */
public class C05_Metodos {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Método é um bloco de código declarado dentro de uma classe,
     * responsável por definir um comportamento ou uma ação que um
     * objeto pode executar. Enquanto os atributos dizem "o que o
     * objeto é", os métodos dizem "o que o objeto faz".
     *
     * Por exemplo, numa classe "Torta", os métodos poderiam ser:
     * Métodos (ações da Torta): assar() / fatiar(int pedacos) /
     * calcularPrecoPorFatia(double precoTotal, int pedacos)
     *
     * A declaração de um método inclui um modificador de acesso, o
     * tipo de retorno (ou void, quando não retorna nada), o nome do
     * método e, entre parênteses, os parâmetros que ele recebe (se
     * houver).
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Um método é chamado através do objeto, usando o operador ponto
     * (.), seguido do nome do método e dos parênteses com os valores
     * necessários (os "argumentos"). Quando o método é chamado, o
     * Java executa o bloco de código definido dentro dele, na ordem
     * em que as instruções aparecem.
     *
     * Se o método tiver um tipo de retorno diferente de 'void', ele
     * deve terminar com a palavra-chave 'return', devolvendo um
     * valor daquele tipo para quem o chamou. Se o método for 'void',
     * ele apenas executa a ação e não devolve nenhum valor.
     *
     * Os parâmetros funcionam como variáveis locais: eles só existem
     * durante a execução do método e recebem os valores passados no
     * momento da chamada.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Sem métodos, cada comportamento do objeto precisaria ser
     * escrito manualmente, repetidas vezes, toda vez que fosse
     * necessário. Os métodos existem para agrupar um conjunto de
     * instruções sob um nome único, permitindo que esse
     * comportamento seja reutilizado quantas vezes for preciso,
     * apenas chamando o método.
     *
     * Além disso, os métodos escondem a complexidade de como uma
     * ação é realizada. Quem chama o método não precisa saber os
     * detalhes internos, apenas o que ele faz e o que ele espera
     * receber (parâmetros) e devolver (retorno).
     *
     * Em outras palavras, os atributos dizem como o objeto é,
     * enquanto os métodos dizem o que o objeto pode fazer.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Use um método sempre que um objeto precisar realizar uma ação,
     * calcular algo a partir de seus atributos, ou alterar seu
     * próprio estado de forma controlada.
     *
     * Ex:  Torta minhaTorta = new Torta();
     *
     *      minhaTorta.sabor = "Chocolate";
     *      minhaTorta.tamanho = "Grande";
     *
     *      minhaTorta.assar();
     *      minhaTorta.fatiar(8);
     *
     *      double precoFatia = minhaTorta.calcularPrecoPorFatia(80.0, 8);
     *      System.out.println(precoFatia);
     *
     *      () são usados para passar (ou não) argumentos ao método.
     *      O método assar() não recebe parâmetros e não retorna valor (void).
     *      O método calcularPrecoPorFatia() recebe dois parâmetros e retorna um valor do tipo double.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Não crie um método para uma única linha de código que só é
     * usada uma vez em um único lugar do programa, sem nenhuma
     * perspectiva de reutilização. Nesses casos, o método pode
     * adicionar complexidade sem trazer benefício real.
     *
     * Ex: se um cálculo simples, como somar dois números, é usado
     * apenas uma vez dentro do main(), não é necessário criar um
     * método separado só para isso.
     *
     * Da mesma forma, evite criar métodos que fazem coisas demais ao
     * mesmo tempo (validar dados, salvar no banco, enviar e-mail,
     * tudo dentro do mesmo método). Prefira dividir essas
     * responsabilidades em métodos menores e mais específicos.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Reutilização de código: um método escrito uma vez pode ser
     *   chamado quantas vezes for necessário, evitando repetição de
     *   código.
     *
     * - Organização e clareza: métodos com nomes bem escolhidos
     *   tornam o código mais legível, já que expressam a intenção
     *   da ação (ex: calcularPrecoPorFatia() é mais claro do que um
     *   bloco de contas soltas).
     *
     * - Manutenção facilitada: se a lógica de um comportamento
     *   precisar mudar, basta alterar o método em um único lugar,
     *   em vez de precisar corrigir o mesmo trecho de código
     *   espalhado pelo programa.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Overhead de chamada: cada chamada de método tem um custo,
     *   ainda que pequeno, de processamento. Em sistemas de
     *   altíssimo desempenho, isso pode ser levado em conta, embora
     *   raramente seja um problema real em aplicações comuns.
     *
     * - Excesso de fragmentação: dividir a lógica em métodos demais,
     *   pequenos e pouco coesos, pode dificultar o entendimento do
     *   fluxo geral do programa, obrigando quem lê o código a
     *   "pular" entre vários métodos para entender uma única ação.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Use verbos nos nomes dos métodos: como o método representa
     *   uma ação, prefira nomes como calcular(), exibir(),
     *   adicionar(), em vez de nomes que parecem substantivos (que
     *   são mais adequados para atributos).
     *
     * - Cada método deve fazer uma única coisa: um método deve ter
     *   uma responsabilidade clara e bem definida. Se o nome do
     *   método precisa de "e" no meio (ex: 'validarECalcularEEnviar()'),
     *   é sinal de que ele está fazendo coisas demais e deveria ser
     *   dividido.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * - Esquecer o 'return' em um método que não é void.
     *   O erro: declarar um método com um tipo de retorno (ex:
     *   double) e não devolver nenhum valor com 'return'.
     *
     *   double calcularPrecoPorFatia(double precoTotal, int pedacos) {
     *       double resultado = precoTotal / pedacos; // Falta o 'return resultado;'
     *   }
     *
     *   Por que acontece: o Java exige que todo caminho possível
     *   dentro de um método não-void termine em um 'return' com um
     *   valor do tipo declarado. Sem isso, o código não compila.
     *
     * - Confundir parâmetro com argumento:
     *   O erro: achar que 'parâmetro' e 'argumento' são a mesma
     *   coisa.
     *
     *   Por que acontece: parâmetro é o nome da variável definida na
     *   assinatura do método (ex: 'int pedacos' na declaração).
     *   Argumento é o valor real passado na hora da chamada (ex: o
     *   número '8' em 'minhaTorta.fatiar(8)'). São conceitos
     *   relacionados, mas não são sinônimos.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Se a Classe é a receita e o Objeto é a torta pronta, os
     * Métodos são as instruções de preparo dessa receita: assar,
     * fatiar, decorar. Cada instrução é um passo específico que a
     * torta (o objeto) sabe executar, usando as informações que ela
     * já possui (seus atributos, como sabor e tamanho).
     *
     * Assim como uma receita pode ter instruções que pedem
     * informações (quantos graus assar, em quantos pedaços cortar),
     * os métodos podem receber parâmetros para saber exatamente como
     * executar a ação.
     *
     * Classe → a receita (o molde).
     * Objeto → a torta pronta.
     * Atributos → as características da torta.
     * Métodos → as ações que a torta pode realizar, como assar() ou
     * fatiar().
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO INCORRETO (com observações)
    // -----------------------------------------------------

    // ❌ Errado / ingênuo: declarar um método com retorno e
    // esquecer o 'return'.

    // double calcularPrecoPorFatia(double precoTotal, int pedacos) {
    //     double resultado = precoTotal / pedacos;
    //     // Falta o 'return resultado;' aqui.
    // }
    //
    // Porque falha: o método foi declarado com tipo de retorno
    // 'double', então o Java exige que ele termine devolvendo
    // um valor desse tipo com 'return'. Sem isso, o código
    // não compila: "missing return statement".

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO CORRETO (com observações)
    // -----------------------------------------------------

    static class Torta {

        // Atributos, eles representam as características que um objeto Torta possui.
        String sabor;   // Atributo de instância.
        String tamanho; // Atributo de instância.
        String formato; // Atributo de instância.

        // Método void: executa uma ação, mas não devolve nenhum valor.
        void assar() {
            System.out.println("A torta de " + sabor + " está assada!");
        }

        // Método void com parâmetro: recebe um valor para executar a ação.
        void fatiar(int pedacos) {
            System.out.println("A torta foi cortada em " + pedacos + " pedaços.");
        }

        // Método com retorno: recebe parâmetros e devolve um valor calculado.
        double calcularPrecoPorFatia(double precoTotal, int pedacos) {
            double resultado = precoTotal / pedacos;
            return resultado;
        }
    }

    public static void main(String[] args) {

        // Criamos um objeto da classe Torta.
        Torta minhaTorta = new Torta();
        minhaTorta.sabor = "Chocolate";
        minhaTorta.tamanho = "Grande";
        minhaTorta.formato = "Redonda";

        // Chamando métodos void, que apenas executam ações.
        minhaTorta.assar();
        minhaTorta.fatiar(8);

        // Chamando um método com retorno, guardando o valor devolvido em uma variável.
        double precoPorFatia = minhaTorta.calcularPrecoPorFatia(80.0, 8);
        System.out.println("Preço por fatia: R$ " + precoPorFatia);
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Retome a classe Produto que você criou no desafio de
     * Atributos (com os atributos nome, preco e
     * quantidadeEmEstoque). Agora adicione os seguintes métodos:
     *
     * 1. Crie um método chamado calcularValorTotalEstoque(), sem
     * parâmetros, que retorne um valor do tipo double, calculado a
     * partir da multiplicação de preco por quantidadeEmEstoque.
     *
     * Exemplo:
     * double valorTotal = produto1.calcularValorTotalEstoque();
     * System.out.println(valorTotal);
     *
     * 2. Crie um método chamado aplicarDesconto(double percentual),
     * do tipo void, que reduza o valor do atributo preco de acordo
     * com o percentual informado.
     *
     * Exemplo:
     * produto1.aplicarDesconto(10); // reduz 10% do preço atual
     * Resultado:
     * Preço atualizado: R$ 3150.00 (considerando preço inicial de R$ 3500.00)
     *
     * 3. Chame o método exibirProduto() (criado no desafio anterior)
     * antes e depois de aplicar o desconto, para observar a mudança
     * no atributo preco.
     *
     * Explique com suas próprias palavras: por que
     * calcularValorTotalEstoque() precisa de um 'return', enquanto
     * aplicarDesconto() não precisa?
     *
     * - Diferença entre métodos void e métodos com retorno.
     * - Parâmetros como forma de "configurar" o comportamento de um
     *   método.
     * - Métodos que consultam dados (calcular) x métodos que
     *   alteram dados (aplicar/adicionar).
     */

    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * Uma curiosidade legal sobre Java é que é possível ter mais de
     * um método com o mesmo nome na mesma classe, desde que os
     * parâmetros sejam diferentes (em quantidade ou tipo). Isso se
     * chama sobrecarga de métodos (method overloading).
     *
     * Exemplo:
     * void fatiar(int pedacos) { ... }
     * void fatiar(int pedacos, String direcao) { ... }
     *
     * O Java identifica qual método chamar de acordo com os
     * argumentos passados na chamada.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Métodos são blocos de código declarados dentro de uma classe
     * que definem os comportamentos de um objeto. Eles podem receber
     * parâmetros, executar instruções e, opcionalmente, devolver um
     * valor através do 'return'. Métodos existem para organizar,
     * reutilizar e encapsular a lógica de comportamento dos objetos,
     * tornando o código mais claro e fácil de manter.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Documentação oficial: https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
     */
}