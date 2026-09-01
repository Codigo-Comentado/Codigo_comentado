package a01_logica_de_programacao;

/**
 * A13 - Estruturas Sequenciais
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A13
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Variáveis, Operadores, Entrada de Dados, Saída de Dados
 *
 * @autor          Morcineck
 * @atualizado     31/08/2026
 * @tempoLeitura   20 min
 */
public class A13_EstruturasSequenciais {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Uma estrutura sequencial representa um fluxo de execução no qual
     * as instruções são executadas seguindo a sequência definida pelo
     * programa.
     *
     * Exemplo:
     *
     * int numero1 = 10;
     * int numero2 = 20;
     * int resultado = numero1 + numero2;
     *
     * System.out.println(resultado);
     *
     * Podemos visualizar essa sequência como:
     *
     * numero1 = 10
     *      ↓
     * numero2 = 20
     *      ↓
     * resultado = numero1 + numero2
     *      ↓
     * exibição do resultado
     *
     * Nesse exemplo, não existe uma decisão escolhendo entre caminhos
     * diferentes nem uma estrutura repetindo instruções.
     *
     * Temos apenas uma sequência de operações.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Em um fluxo sequencial simples, uma instrução é executada e,
     * depois, o programa continua para a próxima.
     *
     * Exemplo:
     *
     * String nome = "Ana";
     * int idade = 25;
     * int idadeFutura = idade + 1;
     *
     * System.out.println(nome);
     * System.out.println(idadeFutura);
     *
     * A sequência lógica é:
     *
     * 1 → Criar a variável nome.
     *
     * 2 → Criar a variável idade.
     *
     * 3 → Calcular idade + 1.
     *
     * 4 → Armazenar o resultado em idadeFutura.
     *
     * 5 → Exibir nome.
     *
     * 6 → Exibir idadeFutura.
     *
     * A ordem é importante porque algumas instruções dependem dos
     * resultados produzidos por instruções anteriores.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Todo programa precisa de uma ordem lógica para executar suas
     * tarefas. Imagine um programa responsável por calcular uma compra.
     *
     * Primeiro precisamos conhecer:
     * - o preço;
     * - a quantidade.
     *
     * Depois podemos calcular:
     * - o valor total.
     *
     * Por último podemos:
     * - apresentar o resultado.
     *
     * Portanto:
     * DADOS
     *   ↓
     * PROCESSAMENTO
     *   ↓
     * SAÍDA
     *
     * Essa sequência aparece constantemente na programação.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Estruturas sequenciais são utilizadas quando as operações devem
     * acontecer seguindo uma ordem lógica.
     *
     * Exemplos:
     *
     * - receber dados e realizar um cálculo;
     * - calcular a média de notas;
     * - calcular o valor de uma compra;
     * - converter unidades;
     * - calcular idade futura;
     * - exibir informações organizadas.
     *
     * Na prática, praticamente todo programa possui trechos
     * sequenciais.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Uma sequência simples não é suficiente quando o programa precisa
     * tomar decisões ou repetir determinadas operações.
     *
     * Por exemplo:
     * "Se a média for maior ou igual a 7, o aluno está aprovado."
     *
     * Nesse caso existe uma decisão.
     *
     * Outro exemplo:
     * "Exiba os números de 1 até 100."
     *
     * Nesse caso existe uma repetição.
     *
     * Esses problemas exigem outras estruturas de controle que serão
     * estudadas posteriormente.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Possui fluxo simples de compreender.
     * - Facilita o aprendizado de lógica de programação.
     * - Torna clara a ordem das operações.
     * - É a base para algoritmos mais complexos.
     * - Facilita a identificação das etapas de um processamento.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Sozinha, não permite escolher caminhos diferentes.
     * - Sozinha, não permite repetir automaticamente instruções.
     * - Uma ordem incorreta pode produzir resultados errados.
     * - Sequências muito grandes e mal organizadas podem dificultar
     *   a leitura do código.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Organize as instruções seguindo uma ordem lógica.
     *
     * Exemplo:
     * double preco = 100.0;
     * int quantidade = 2;
     *
     * double total = preco * quantidade;
     *
     * System.out.println(total);
     *
     *
     * - Calcule um valor somente depois de possuir os dados necessários.
     * - Utilize nomes de variáveis que indiquem o papel de cada valor.
     *
     * Evite:
     * double x = 100;
     * int y = 2;
     * double z = x * y;
     *
     * Prefira:
     * double preco = 100;
     * int quantidade = 2;
     * double total = preco * quantidade;
     *
     *
     * - Separe mentalmente o algoritmo em etapas.
     *
     * ENTRADA/DADOS
     *
     * PROCESSAMENTO
     *
     * SAÍDA
     *
     *
     * - Quando um valor mudar, verifique se algum resultado dependente
     *   dele precisa ser calculado novamente.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * 1. Utilizar uma variável local antes de ela possuir um valor.
     *
     * Exemplo incorreto:
     * int numero;
     *
     * System.out.println(numero);
     *
     * Uma variável local precisa ser inicializada antes que seu valor
     * possa ser utilizado.
     *
     *
     * 2. Tentar utilizar uma variável antes da sua declaração.
     *
     * Exemplo incorreto:
     * double media = (nota1 + nota2) / 2;
     *
     * double nota1 = 8.0;
     * double nota2 = 6.0;
     *
     * Quando a primeira instrução é analisada, nota1 e nota2 ainda não
     * estão declaradas naquele ponto do código.
     *
     *
     * 3. Acreditar que um resultado será atualizado automaticamente.
     *
     * Exemplo:
     * double preco = 100.0;
     * int quantidade = 2;
     *
     * double total = preco * quantidade;
     *
     * quantidade = 5;
     *
     * System.out.println(total);
     *
     * Resultado: 200.0
     *
     * Alterar quantidade não executa novamente a instrução responsável
     * pelo cálculo de total.
     *
     * Para atualizar o resultado:
     *
     * quantidade = 5;
     * total = preco * quantidade;
     *
     * Agora total receberá 500.0.
     *
     *
     * 4. Organizar as operações em uma ordem lógica incorreta.
     *
     * Mesmo quando o código compila, uma sequência inadequada pode
     * produzir um resultado diferente do esperado.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine uma receita de bolo.
     *
     * Podemos ter as seguintes instruções:
     *
     * 1 → Separar os ingredientes.
     *
     * 2 → Misturar os ingredientes.
     *
     * 3 → Colocar a massa na forma.
     *
     * 4 → Levar a forma ao forno.
     *
     * Existe uma sequência lógica.
     *
     * Não faria sentido tentar colocar a massa no forno antes de
     * prepará-la.
     *
     * Na programação acontece algo semelhante.
     *
     * Algumas instruções dependem do resultado das instruções
     * anteriores.
     *
     * Por isso, a ordem de execução faz parte da lógica do algoritmo.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        // -------------------------------------------------
        // EXEMPLO 1 - SEQUÊNCIA SIMPLES
        // -------------------------------------------------

        int numero1 = 10;
        int numero2 = 20;

        int resultado = numero1 + numero2;

        System.out.println(
                "Resultado: " + resultado
        );

        /*
         * Sequência:
         *
         * 1 → numero1 recebe 10.
         * 2 → numero2 recebe 20.
         * 3 → os valores são somados.
         * 4 → resultado recebe 30.
         * 5 → o resultado é exibido.
         */


        // -------------------------------------------------
        // EXEMPLO 2 - MÉDIA DE DUAS NOTAS
        // -------------------------------------------------

        double nota1 = 8.0;
        double nota2 = 6.0;

        double media =
                (nota1 + nota2) / 2;

        System.out.printf(
                "Média: %.2f%n",
                media
        );

        /*
         * Podemos separar o algoritmo em três partes:
         *
         * DADOS:
         * nota1 = 8.0
         * nota2 = 6.0
         *
         * PROCESSAMENTO:
         * (nota1 + nota2) / 2
         *
         * SAÍDA:
         * Média: 7,00
         *
         * O separador decimal exibido pode variar conforme a
         * configuração regional do ambiente.
         */


        // -------------------------------------------------
        // EXEMPLO 3 - A ORDEM ALTERA O RESULTADO
        // -------------------------------------------------

        double preco = 100.0;
        int quantidade = 2;

        double total =
                preco * quantidade;

        quantidade = 5;

        System.out.printf(
                "Total antes do novo cálculo: R$ %.2f%n",
                total
        );

        /*
         * Mesmo depois de quantidade receber 5, total continua
         * armazenando 200.
         *
         * Isso acontece porque:
         *
         * total = preco * quantidade;
         *
         * foi executado quando quantidade ainda valia 2.
         */


        // -------------------------------------------------
        // RECALCULANDO
        // -------------------------------------------------

        total =
                preco * quantidade;

        System.out.printf(
                "Total depois do novo cálculo: R$ %.2f%n",
                total
        );

        /*
         * Agora a instrução de cálculo foi executada novamente.
         *
         * preco = 100
         * quantidade = 5
         *
         * total = 100 * 5
         *
         * total = 500
         */


        // -------------------------------------------------
        // ✔ EXEMPLO CORRETO
        // -------------------------------------------------

        String produto = "Teclado";
        double precoUnitario = 150.0;
        int unidades = 3;

        double valorCompra =
                precoUnitario * unidades;

        System.out.println();
        System.out.println("===== COMPRA =====");

        System.out.println(
                "Produto: " + produto
        );

        System.out.println(
                "Quantidade: " + unidades
        );

        System.out.printf(
                "Preço unitário: R$ %.2f%n",
                precoUnitario
        );

        System.out.printf(
                "Total: R$ %.2f%n",
                valorCompra
        );

        System.out.println("==================");

        /*
         * A sequência lógica foi:
         *
         * 1 → Definir os dados.
         *
         * 2 → Realizar o processamento.
         *
         * 3 → Exibir os resultados.
         *
         * DADOS → PROCESSAMENTO → SAÍDA
         */


        // -------------------------------------------------
        // ❌ EXEMPLO DE ORDEM LÓGICA INCORRETA
        // -------------------------------------------------

        double salario = 2000.0;
        double aumento = 500.0;

        double salarioFinal =
                salario + aumento;

        aumento = 1000.0;

        System.out.printf(
                "Salário final sem recalcular: R$ %.2f%n",
                salarioFinal
        );

        /*
         * O código funciona, mas existe um problema lógico caso a
         * intenção fosse considerar o novo aumento de R$ 1000.
         *
         * salarioFinal foi calculado quando aumento valia 500.
         *
         * Portanto:
         *
         * 2000 + 500 = 2500
         *
         * Alterar aumento depois do cálculo não altera salarioFinal
         * automaticamente.
         *
         * A ordem correta seria alterar aumento antes do cálculo:
         *
         * double salario = 2000.0;
         * double aumento = 1000.0;
         *
         * double salarioFinal = salario + aumento;
         *
         * Resultado: 3000.0
         */


        // -------------------------------------------------
        // FLUXO SEQUENCIAL
        // -------------------------------------------------

        System.out.println();
        System.out.println("Início do programa");

        int valorA = 5;
        int valorB = 10;

        int soma =
                valorA + valorB;

        int dobro =
                soma * 2;

        System.out.println(
                "Soma: " + soma
        );

        System.out.println(
                "Dobro da soma: " + dobro
        );

        System.out.println("Fim do programa");

        /*
         * Podemos visualizar:
         *
         * INÍCIO
         *   ↓
         * valorA = 5
         *   ↓
         * valorB = 10
         *   ↓
         * soma = 15
         *   ↓
         * dobro = 30
         *   ↓
         * exibe soma
         *   ↓
         * exibe dobro
         *   ↓
         * FIM
         *
         * Esse é um exemplo de fluxo sequencial.
         */
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie um programa para calcular o valor total de uma compra.
     *
     * Utilize:
     *
     * String produto = "Monitor";
     * double preco = 899.90;
     * int quantidade = 2;
     *
     * Organize as instruções na ordem correta para:
     *
     * 1 → Definir os dados do produto.
     *
     * 2 → Calcular o valor total da compra.
     *
     * 3 → Exibir o nome do produto.
     *
     * 4 → Exibir o preço unitário.
     *
     * 5 → Exibir a quantidade.
     *
     * 6 → Exibir o valor total.
     *
     * Resultado esperado:
     *
     * ===== PEDIDO =====
     * Produto: Monitor
     * Preço: R$ 899,90
     * Quantidade: 2
     * Total: R$ 1799,80
     * ==================
     *
     *
     * DESAFIO:
     *
     * Depois de calcular o total, altere:
     *
     * quantidade = 3;
     *
     * Antes de executar o programa, tente responder:
     *
     * O valor armazenado em total será atualizado automaticamente?
     *
     * Depois execute o programa e confirme sua resposta.
     *
     * Por último, altere a sequência para que o total seja calculado
     * corretamente utilizando a nova quantidade.
     */

    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * Programas reais raramente são formados apenas por uma única
     * estrutura sequencial.
     *
     * Conforme os programas crescem, o fluxo pode possuir:
     *
     * - sequências;
     * - decisões;
     * - repetições;
     * - chamadas de métodos;
     * - tratamento de exceções;
     * - entre outras estruturas.
     *
     * Mesmo assim, dentro desses fluxos continuam existindo conjuntos
     * de instruções executados sequencialmente.
     *
     * Por isso, compreender a ordem de execução é uma das bases para
     * entender estruturas mais avançadas.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Estruturas sequenciais representam um fluxo em que as instruções
     * são executadas seguindo a sequência definida pelo programa.
     *
     * Um fluxo simples pode ser representado como:
     *
     * DADOS
     *   ↓
     * PROCESSAMENTO
     *   ↓
     * SAÍDA
     *
     * A ordem das instruções é importante.
     *
     * Algumas operações dependem de valores produzidos anteriormente.
     *
     * Também aprendemos que alterar uma variável não recalcula
     * automaticamente outras variáveis que utilizaram seu valor.
     *
     * Exemplo:
     *
     * int quantidade = 2;
     *
     * int total = quantidade * 10;
     *
     * quantidade = 5;
     *
     * total continua armazenando:
     *
     * 20
     *
     * Para obter um novo resultado, a instrução de cálculo precisa ser
     * executada novamente:
     *
     * total = quantidade * 10;
     *
     * Agora:
     *
     * total = 50
     *
     * Compreender essa sequência prepara a base para estudar estruturas
     * que podem modificar o fluxo normal do programa, como decisões e
     * repetições.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Java Language Specification:
     *   https://docs.oracle.com/javase/specs/
     *
     * - Java Language Specification - Blocks and Statements:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-14.html
     *
     * - Java API - System:
     *   https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/System.html
     */
}