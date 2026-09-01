package a01_logica_de_programacao;

/**
 * A12 - Saída de Dados
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A12
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Variáveis, Tipos de Dados, Entrada de Dados
 * @proximos       Estruturas Condicionais
 *
 * @autor          Morcineck
 * @atualizado     31/08/2026
 * @tempoLeitura   20 min
 */
public class A12_SaidaDeDados {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Saída de dados é a forma utilizada por um programa para
     * apresentar informações ao usuário.
     *
     * Em programas executados pelo terminal, uma das formas mais
     * comuns de realizar essa saída em Java é utilizando:
     * System.out
     *
     * Exemplo:
     * System.out.println("Olá, Java!");
     *
     * Nesse caso, o programa envia o texto:
     * Olá, Java!
     *
     * Para a saída padrão, que normalmente será exibida no console.
     * Os três métodos que veremos neste conteúdo são:
     *
     * print()
     * println()
     * printf()
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Em Java, System.out representa a saída padrão do programa.
     * Podemos utilizar diferentes métodos para definir como as
     * informações serão apresentadas.
     *
     * -------------------------------------------------------------
     * print()
     * -------------------------------------------------------------
     * Exibe uma informação sem adicionar automaticamente uma nova
     * linha ao final.
     *
     * Exemplo:
     *
     * System.out.print("Olá ");
     * System.out.print("Java");
     *
     * Resultado:
     *
     * Olá Java
     *
     * Os dois textos aparecem na mesma linha.
     *
     * -------------------------------------------------------------
     * println()
     * -------------------------------------------------------------
     * Exibe uma informação e adiciona uma quebra de linha ao final.
     *
     * Exemplo:
     *
     * System.out.println("Olá");
     * System.out.println("Java");
     *
     * Resultado:
     *
     * Olá
     * Java
     *
     * -------------------------------------------------------------
     * printf()
     * -------------------------------------------------------------
     * Permite criar uma saída formatada.
     *
     * Exemplo:
     *
     * String nome = "Ana";
     * int idade = 25;
     *
     * System.out.printf(
     *         "Nome: %s | Idade: %d%n",
     *         nome,
     *         idade
     * );
     *
     * Resultado:
     *
     * Nome: Ana | Idade: 25
     *
     * Nesse exemplo:
     *
     * %s → representa uma String.
     * %d → representa um número inteiro.
     * %n → representa uma nova linha.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Um programa precisa apresentar resultados para que o usuário
     * consiga entender o que aconteceu durante sua execução.
     *
     * Imagine um programa que realiza um cálculo:
     * int resultado = 10 + 20;
     *
     * O computador conhece o resultado, mas o usuário não verá essa
     * informação se ela não for exibida.
     *
     * Podemos utilizar:
     *
     * System.out.println(resultado);
     *
     * Assim, o programa apresenta:
     *
     *  30
     *
     * A saída de dados pode ser utilizada para:
     *
     * - apresentar resultados;
     * - mostrar mensagens;
     * - solicitar informações;
     * - informar erros;
     * - apresentar relatórios;
     * - organizar dados no terminal;
     * - acompanhar a execução de um programa.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Utilize saída de dados sempre que alguma informação precisar
     * ser apresentada ao usuário.
     *
     * Exemplos:
     *
     * System.out.println("Cadastro realizado.");
     *
     * System.out.println("Resultado: " + resultado);
     *
     * System.out.printf("Preço: %.2f%n", preco);
     *
     * Em programas executados pelo terminal, System.out é uma das
     * formas mais simples de visualizar informações.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * System.out é muito útil para aprendizado, pequenos programas e
     * testes simples.
     *
     * Porém, aplicações maiores podem utilizar outras formas de saída.
     *
     * Exemplos:
     *
     * - aplicações web retornam páginas ou respostas HTTP;
     * - APIs podem retornar dados em JSON;
     * - interfaces gráficas exibem componentes visuais;
     * - sistemas profissionais normalmente utilizam ferramentas de
     *   log em vez de vários System.out.println().
     *
     * Portanto, System.out é fundamental para aprender o conceito,
     * mas não representa todas as formas de saída existentes.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - É simples de utilizar.
     * - Permite visualizar rapidamente valores e resultados.
     * - Facilita exercícios de programação.
     * - Permite combinar textos e variáveis.
     * - printf() oferece controle sobre a formatação.
     * - Ajuda a compreender o fluxo de entrada, processamento e saída.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Saídas mal organizadas podem ficar difíceis de compreender.
     * - Concatenações grandes podem prejudicar a leitura do código.
     * - printf() exige conhecer os especificadores de formato.
     * - Utilizar print() sem controlar as quebras de linha pode deixar
     *   a saída confusa.
     * - Em aplicações maiores, System.out pode não ser a ferramenta
     *   mais adequada para registro de informações.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Escreva mensagens claras para o usuário.
     *
     * Exemplo:
     *
     * System.out.println("Cadastro realizado com sucesso.");
     *
     *
     * - Identifique os valores exibidos.
     *
     * Evite: System.out.println(25);
     *
     * Prefira: System.out.println("Idade: " + idade);
     *
     * - Organize informações relacionadas.
     *
     * Exemplo:
     *
     * System.out.println("Nome: " + nome);
     * System.out.println("Idade: " + idade);
     *
     *
     * - Utilize printf() quando precisar controlar a formatação de
     *   números.
     *
     * Exemplo:
     *
     * System.out.printf("Preço: R$ %.2f%n", preco);
     *
     *
     * - Utilize parênteses quando precisar realizar uma operação
     *   antes da concatenação.
     *
     * Exemplo:
     *
     * System.out.println("Resultado: " + (10 + 20));
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * 1. Esquecer que print() não adiciona uma nova linha.
     *
     * Exemplo:
     *
     * System.out.print("Java");
     * System.out.print("Python");
     *
     * Resultado: JavaPython
     *
     * Se a intenção era separar as informações em linhas, poderíamos
     * utilizar:
     *
     * System.out.println("Java");
     * System.out.println("Python");
     *
     *
     * 2. Confundir concatenação com soma.
     *
     * Exemplo:
     *
     * System.out.println("Resultado: " + 10 + 20);
     *
     * Resultado: 1020
     *
     * A avaliação acontece da esquerda para a direita.
     *
     * Primeiro: "Resultado: " + 10
     *
     * produz uma String.
     *
     * Depois o valor 20 também é concatenado.
     *
     * Se quisermos realizar a soma primeiro:
     * System.out.println("Resultado: " + (10 + 20));
     *
     * Resultado: 30
     *
     *
     * 3. Utilizar um especificador incompatível no printf().
     *
     * Exemplo incorreto:
     *
     * String nome = "Java";
     *
     * System.out.printf("%d", nome);
     *
     * %d é utilizado para números inteiros e não para String.
     *
     * Essa situação pode causar uma exceção durante a execução.
     *
     * Para String utilizamos:
     *
     * System.out.printf("%s", nome);
     *
     *
     * 4. Esquecer de organizar as quebras de linha.
     *
     * Exemplo:
     *
     * System.out.print("Nome: Ana");
     * System.out.print("Idade: 25");
     *
     * Resultado:
     *
     * Nome: AnaIdade: 25
     *
     * Podemos utilizar println(), \n ou %n dependendo da situação.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine que o programa é uma pessoa entregando informações
     * através de um alto-falante.
     *
     * print()
     *
     * é como continuar falando sem mudar de linha.
     *
     * println()
     *
     * é como terminar uma frase e começar a próxima em uma nova linha.
     *
     * printf()
     *
     * é como utilizar um modelo previamente organizado:
     *
     * "Nome: _____ | Idade: _____"
     *
     * e preencher os espaços com os valores correspondentes.
     *
     * Cada método envia informações para o usuário, mas oferece um
     * nível diferente de controle sobre a apresentação.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        // -------------------------------------------------
        // print()
        // -------------------------------------------------

        System.out.print("Olá, ");
        System.out.print("Java!");

        /*
         * print() não adiciona uma nova linha automaticamente.
         *
         * Portanto, o resultado será:
         *
         * Olá, Java!
         */

        System.out.println();


        // -------------------------------------------------
        // println()
        // -------------------------------------------------

        System.out.println("Primeira linha");
        System.out.println("Segunda linha");
        System.out.println("Terceira linha");

        /*
         * Cada println() adiciona uma nova linha depois de exibir
         * seu conteúdo.
         */


        // -------------------------------------------------
        // EXIBINDO VARIÁVEIS
        // -------------------------------------------------

        String nome = "Robson";
        int idade = 33;
        double altura = 1.85;
        boolean estudante = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudante: " + estudante);


        // -------------------------------------------------
        // CONCATENAÇÃO
        // -------------------------------------------------

        String linguagem = "Java";
        int tempoEstudo = 8;

        System.out.println(
                "Estou estudando " + linguagem
                        + " durante " + tempoEstudo
                        + " horas."
        );

        /*
         * Quando utilizamos + envolvendo uma String, podemos juntar
         * texto e valores em uma única saída.
         *
         * Esse processo é chamado de concatenação.
         */


        // -------------------------------------------------
        // SOMA X CONCATENAÇÃO
        // -------------------------------------------------

        System.out.println(
                "Resultado sem parênteses: " + 10 + 20
        );

        System.out.println(
                "Resultado com parênteses: " + (10 + 20)
        );

        /*
         * Primeiro exemplo:
         *
         * "Resultado sem parênteses: " + 10 + 20
         *
         * Resultado:
         *
         * Resultado sem parênteses: 1020
         *
         *
         * Segundo exemplo:
         *
         * "Resultado com parênteses: " + (10 + 20)
         *
         * Primeiro ocorre:
         *
         * 10 + 20
         *
         * Resultado:
         *
         * 30
         *
         * Depois esse resultado é concatenado ao texto.
         */


        // -------------------------------------------------
        // QUEBRA DE LINHA COM \n
        // -------------------------------------------------

        System.out.print(
                "Linha A\nLinha B\nLinha C\n"
        );

        /*
         * \n representa uma quebra de linha dentro de uma String.
         *
         * Resultado:
         *
         * Linha A
         * Linha B
         * Linha C
         */


        // -------------------------------------------------
        // printf()
        // -------------------------------------------------

        String produto = "Teclado";
        int quantidade = 2;
        double preco = 199.90;

        System.out.printf(
                "Produto: %s%n",
                produto
        );

        System.out.printf(
                "Quantidade: %d%n",
                quantidade
        );

        System.out.printf(
                "Preço: R$ %.2f%n",
                preco
        );

        /*
         * Alguns especificadores utilizados:
         *
         * %s  → texto/String
         * %d  → número inteiro
         * %f  → número decimal
         * %b  → valor booleano
         * %c  → caractere
         * %n  → nova linha
         *
         * Em:
         *
         * %.2f
         *
         * o número 2 indica que queremos exibir duas casas decimais.
         */


        // -------------------------------------------------
        // printf() COM VÁRIOS VALORES
        // -------------------------------------------------

        System.out.printf(
                "Produto: %s | Quantidade: %d | Preço: R$ %.2f%n",
                produto,
                quantidade,
                preco
        );

        /*
         * Os valores são associados aos especificadores na mesma
         * ordem em que aparecem.
         *
         * %s → produto
         * %d → quantidade
         * %.2f → preco
         */


        // -------------------------------------------------
        // OUTROS TIPOS COM printf()
        // -------------------------------------------------

        char categoria = 'A';
        boolean disponivel = true;

        System.out.printf(
                "Categoria: %c | Disponível: %b%n",
                categoria,
                disponivel
        );


        // -------------------------------------------------
        // ✔ EXEMPLO CORRETO
        // -------------------------------------------------

        String cliente = "Maria";
        int pedidos = 3;
        double valorTotal = 249.987;

        System.out.println();
        System.out.println("===== RESUMO DO PEDIDO =====");

        System.out.println(
                "Cliente: " + cliente
        );

        System.out.println(
                "Quantidade de pedidos: " + pedidos
        );

        System.out.printf(
                "Valor total: R$ %.2f%n",
                valorTotal
        );

        System.out.println("============================");

        /*
         * A saída está organizada, os valores possuem identificação e
         * o número decimal foi formatado com duas casas.
         */


        // -------------------------------------------------
        // ❌ EXEMPLO DE SAÍDA MAL FORMATADA
        // -------------------------------------------------

        System.out.println();

        System.out.print("Cliente:" + cliente);
        System.out.print("Pedidos:" + pedidos);
        System.out.print("Valor:" + valorTotal);

        System.out.println();

        /*
         * O código acima funciona.
         *
         * Porém, sua saída será semelhante a:
         *
         * Cliente:MariaPedidos:3Valor:249.987
         *
         * O problema não é de compilação.
         *
         * O problema é a apresentação.
         *
         * Os dados estão juntos e pouco claros para o usuário.
         *
         * Uma saída organizada é parte importante da qualidade de um
         * programa.
         */


        // -------------------------------------------------
        // PROCESSAMENTO + SAÍDA
        // -------------------------------------------------

        double precoUnitario = 50.0;
        int unidades = 3;

        double total =
                precoUnitario * unidades;

        System.out.printf(
                "Total da compra: R$ %.2f%n",
                total
        );

        /*
         * Nesse exemplo temos:
         *
         * DADOS:
         *
         * precoUnitario
         * unidades
         *
         * PROCESSAMENTO:
         *
         * precoUnitario * unidades
         *
         * SAÍDA:
         *
         * System.out.printf(...)
         *
         * Esse fluxo será encontrado constantemente em programas:
         *
         * ENTRADA → PROCESSAMENTO → SAÍDA
         */
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie um programa que possua as seguintes variáveis:
     *
     * String nomeProduto = "Notebook";
     * double precoProduto = 3499.90;
     * int quantidade = 2;
     * boolean disponivel = true;
     *
     * Exiba essas informações de forma organizada.
     *
     * O resultado deverá seguir uma estrutura semelhante:
     *
     * ===== PRODUTO =====
     * Nome: Notebook
     * Preço: R$ 3499,90
     * Quantidade: 2
     * Disponível: true
     * ===================
     *
     * Utilize:
     *
     * println()
     *
     * e:
     *
     * printf()
     *
     * em diferentes partes da saída.
     *
     *
     * DESAFIO:
     *
     * Calcule o valor total da compra utilizando:
     *
     * double valorTotal = precoProduto * quantidade;
     *
     * Depois exiba:
     *
     * Valor total: R$ ...
     *
     * formatando o resultado com duas casas decimais.
     *
     * Tente também criar uma versão da saída utilizando concatenação
     * e outra utilizando printf().
     *
     * Compare qual delas fica mais simples de compreender.
     */

    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * O nome printf vem da ideia de:
     *
     * "print formatted"
     *
     * ou seja:
     *
     * impressão formatada.
     *
     * Esse estilo de formatação também existe em outras linguagens de
     * programação.
     *
     * Outro detalhe interessante é que:
     *
     * %n
     *
     * representa uma quebra de linha apropriada para a plataforma em
     * que o programa está sendo executado.
     *
     * Já:
     *
     * \n
     *
     * representa diretamente o caractere de nova linha dentro da
     * String.
     *
     * Em exemplos simples, ambos frequentemente produzem um resultado
     * visual semelhante no terminal.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Saída de dados é a forma utilizada pelo programa para apresentar
     * informações ao usuário.
     *
     * Nesta aula vimos três métodos principais:
     *
     * print()
     *
     * Exibe uma informação sem adicionar automaticamente uma nova
     * linha.
     *
     * println()
     *
     * Exibe uma informação e adiciona uma nova linha ao final.
     *
     * printf()
     *
     * Permite criar saídas formatadas utilizando especificadores.
     *
     * Alguns exemplos:
     *
     * %s   → String
     * %d   → inteiro
     * %f   → decimal
     * %.2f → decimal com duas casas
     * %b   → boolean
     * %c   → char
     * %n   → nova linha
     *
     * Também aprendemos a utilizar concatenação e vimos que:
     *
     * "Resultado: " + 10 + 20
     *
     * produz:
     *
     * Resultado: 1020
     *
     * enquanto:
     *
     * "Resultado: " + (10 + 20)
     *
     * produz:
     *
     * Resultado: 30
     *
     * Por fim, vimos que uma boa saída não precisa apenas estar
     * tecnicamente correta: ela também deve ser clara e organizada
     * para quem utiliza o programa.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Java API - System:
     *   https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/System.html
     *
     * - Java API - PrintStream:
     *   https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/PrintStream.html
     *
     * - Java Formatter:
     *   https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Formatter.html
     */
}