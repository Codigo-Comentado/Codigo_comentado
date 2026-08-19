package a01_logica_de_programacao;

/**
 * A08 - Operadores Aritméticos
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A08
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Variáveis, Constantes, Tipos de Dados
 * @proximos       Operadores Relacionais
 *
 * @autor
 * @atualizado     19/08/2026
 * @tempoLeitura   12 min
 */
public class A08_OperadoresAritmeticos {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Operadores aritméticos são símbolos utilizados para realizar
     * operações matemáticas com valores numéricos.
     *
     * Em Java, eles permitem realizar cálculos como soma, subtração,
     * multiplicação, divisão e obtenção do resto de uma divisão.
     *
     * Os principais operadores aritméticos são:
     *
     * Adição '+'
     * Subtração '-'
     * Multiplicação '*'
     * Divisão '/'
     * Resto da divisão (módulo) '%'
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Os operadores aritméticos trabalham com operandos, que são os
     * valores envolvidos em uma operação.
     *
     * Exemplo:
     *
     * int resultado = 10 + 5;
     *
     * Nesse caso:
     *
     *     10 e 5 → operandos
     *     +      → operador
     *     15     → resultado da operação
     *
     * Os operandos podem ser valores escritos diretamente no código,
     * variáveis ou até resultados de outras expressões.
     *
     * Exemplo:
     *
     * int numero1 = 10;
     * int numero2 = 5;
     * int resultado = numero1 + numero2;
     *
     * O Java avalia a expressão do lado direito e armazena o resultado
     * na variável localizada do lado esquerdo da atribuição.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Programas frequentemente precisam realizar cálculos.
     *
     * Imagine um sistema de vendas. Ele pode precisar:
     *
     * - somar os valores dos produtos;
     * - calcular descontos;
     * - calcular parcelas;
     * - descobrir quantos itens restaram no estoque;
     * - calcular médias;
     * - verificar o resto de uma divisão.
     *
     * Sem operadores aritméticos, seria muito mais difícil representar
     * essas operações matemáticas diretamente no código.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Use operadores aritméticos sempre que o programa precisar realizar
     * algum cálculo numérico.
     *
     * Exemplos:
     *
     * - calcular o total de uma compra;
     * - calcular idade;
     * - calcular médias;
     * - atualizar quantidade de produtos;
     * - calcular descontos;
     * - dividir valores em parcelas;
     * - converter unidades;
     * - descobrir se um número é par ou ímpar utilizando %.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Evite espalhar cálculos complexos diretamente pelo código quando
     * eles representam alguma regra importante do sistema.
     *
     * Por exemplo:
     *
     * double valorFinal = valor * 0.9 + valor * 0.05;
     *
     * Apesar de funcionar, não fica imediatamente claro o significado
     * de 0.9 e 0.05.
     *
     * Nesses casos, prefira utilizar variáveis, constantes ou métodos
     * com nomes que expliquem o significado dos valores e cálculos.
     *
     * Também é importante evitar operações sem considerar o tipo dos
     * valores envolvidos, principalmente em divisões.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Permitem realizar cálculos de forma simples.
     * - Tornam expressões matemáticas fáceis de representar.
     * - Podem ser utilizados com variáveis e valores literais.
     * - São fundamentais para praticamente qualquer sistema.
     * - Permitem construir cálculos mais complexos combinando operações.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Expressões muito grandes podem ficar difíceis de entender.
     * - A divisão entre números inteiros pode gerar resultados
     *   inesperados para iniciantes.
     * - A ordem das operações pode alterar completamente o resultado.
     * - Escolher um tipo numérico inadequado pode causar perda de
     *   precisão ou estouro de valores.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Utilize nomes de variáveis que expliquem o cálculo.
     * - Use parênteses quando quiser deixar a ordem das operações clara.
     * - Escolha tipos numéricos adequados para o resultado esperado.
     * - Evite números "mágicos" em regras importantes.
     * - Divida cálculos complexos em etapas menores quando isso melhorar
     *   a leitura do código.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * 1. Esperar casas decimais em uma divisão entre inteiros.
     *
     * int resultado = 5 / 2;
     *
     * O resultado será 2, e não 2.5.
     *
     * Isso acontece porque os dois operandos são inteiros.
     *
     *
     * 2. Ignorar a precedência dos operadores.
     *
     * int resultado = 10 + 5 * 2;
     *
     * O resultado será 20, e não 30, porque a multiplicação é
     * executada antes da soma.
     *
     *
     * 3. Dividir um número inteiro por zero.
     *
     * int resultado = 10 / 0;
     *
     * Isso provoca uma ArithmeticException durante a execução.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine uma calculadora.
     *
     * Quando você digita:
     *
     * 10 + 5
     *
     * o número 10 e o número 5 são os valores utilizados no cálculo,
     * enquanto o símbolo + informa qual operação deve ser realizada.
     *
     * Os operadores aritméticos funcionam da mesma maneira em Java:
     * eles dizem ao programa qual cálculo deve ser feito com os valores
     * fornecidos.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 3;

        // -------------------------------------------------
        // ADIÇÃO (+)
        // -------------------------------------------------

        int soma = numero1 + numero2;

        System.out.println("Soma: " + soma);


        // -------------------------------------------------
        // SUBTRAÇÃO (-)
        // -------------------------------------------------

        int subtracao = numero1 - numero2;

        System.out.println("Subtração: " + subtracao);


        // -------------------------------------------------
        // MULTIPLICAÇÃO (*)
        // -------------------------------------------------

        int multiplicacao = numero1 * numero2;

        System.out.println("Multiplicação: " + multiplicacao);


        // -------------------------------------------------
        // DIVISÃO (/)
        // -------------------------------------------------

        int divisaoInteira = numero1 / numero2;

        System.out.println("Divisão inteira: " + divisaoInteira);

        /*
         * Como numero1 e numero2 são int, o resultado também será
         * inteiro.
         *
         * 10 / 3 = 3
         *
         * A parte decimal é descartada.
         */


        // ✔ Correto quando queremos um resultado decimal

        double divisaoDecimal = (double) numero1 / numero2;

        System.out.println("Divisão decimal: " + divisaoDecimal);

        /*
         * O casting (double) transforma numero1 em double antes da
         * divisão.
         *
         * Dessa forma:
         *
         * 10.0 / 3 = aproximadamente 3.3333...
         */


        // -------------------------------------------------
        // RESTO DA DIVISÃO (%)
        // -------------------------------------------------

        int resto = numero1 % numero2;

        System.out.println("Resto da divisão: " + resto);

        /*
         * 10 dividido por 3:
         *
         * 3 * 3 = 9
         *
         * sobra 1.
         *
         * Portanto:
         *
         * 10 % 3 = 1
         */


        // -------------------------------------------------
        // EXEMPLO: DESCOBRINDO SE UM NÚMERO É PAR
        // -------------------------------------------------

        int numero = 8;

        boolean numeroPar = numero % 2 == 0;

        System.out.println("O número é par? " + numeroPar);


        // -------------------------------------------------
        // PRECEDÊNCIA DOS OPERADORES
        // -------------------------------------------------

        int semParenteses = 10 + 5 * 2;

        /*
         * Primeiro:
         *
         * 5 * 2 = 10
         *
         * Depois:
         *
         * 10 + 10 = 20
         */

        int comParenteses = (10 + 5) * 2;

        /*
         * Primeiro:
         *
         * 10 + 5 = 15
         *
         * Depois:
         *
         * 15 * 2 = 30
         */

        System.out.println("Sem parênteses: " + semParenteses);
        System.out.println("Com parênteses: " + comParenteses);


        // -------------------------------------------------
        // EXEMPLO MAIS PRÓXIMO DE UMA SITUAÇÃO REAL
        // -------------------------------------------------

        double precoProduto = 100.00;
        int quantidade = 3;
        double desconto = 20.00;

        // ✔ Mais legível
        double subtotal = precoProduto * quantidade;
        double valorFinal = subtotal - desconto;

        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);


        // ❌ Possível abordagem ingênua

        double total = 100.00 * 3 - 20.00;

        /*
         * O cálculo funciona, mas os valores não possuem significado
         * claro para quem estiver lendo o código.
         *
         * Utilizar variáveis com nomes adequados ajuda a explicar o que
         * cada valor representa.
         */
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie um programa que represente uma compra.
     *
     * Crie as seguintes variáveis:
     *
     * - precoProduto
     * - quantidade
     * - desconto
     *
     * Depois calcule:
     *
     * 1. O valor total dos produtos antes do desconto.
     * 2. O valor final após aplicar o desconto.
     * 3. O valor da compra dividido em 3 parcelas.
     *
     * DESAFIO:
     *
     * Crie também uma variável inteira chamada quantidadeItens e utilize
     * o operador % para descobrir se essa quantidade é par ou ímpar.
     */

    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * O operador + possui uma característica especial em Java.
     *
     * Além de realizar adição entre números, ele também pode ser usado
     * para concatenar String.
     *
     * Exemplo:
     *
     * System.out.println("Resultado: " + 10);
     *
     * Nesse caso, o + não está somando os valores. Ele está juntando
     * uma String com o número 10.
     *
     * Isso também significa que a ordem pode produzir resultados que
     * confundem iniciantes:
     *
     * System.out.println(10 + 20 + " Java");
     *
     * Resultado:
     *
     * 30 Java
     *
     * Já:
     *
     * System.out.println("Java " + 10 + 20);
     *
     * Resultado:
     *
     * Java 1020
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Operadores aritméticos permitem realizar operações matemáticas
     * utilizando +, -, *, / e %. É importante observar os tipos dos
     * operandos, principalmente em divisões, e entender a precedência
     * dos operadores para evitar resultados inesperados.
     */

    /*
     * REFERÊNCIAS (opcional)
     * -------------------------------------------------------------
     * Documentação oficial:
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
     *
     * Java Language Specification - Operators:
     * https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html
     */
}