package a01_logica_de_programacao;
/**
 * A05 — Variáveis
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A05
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Pseudocódigo
 * @proximos       Constantes
 *
 * @autor          Morcineck
 * @atualizado     07/08/2026
 * @tempoLeitura   8 min
 */
public class A05_Variaveis {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Variável é um espaço nomeado na memória do computador,
     * reservado para guardar um valor que pode mudar ao longo da
     * execução do programa.
     *
     * Ela tem um nome (que você escolhe), um tipo (que define que
     * tipo de valor ela pode guardar, como número ou texto) e um
     * valor, que pode ser alterado quantas vezes for necessário
     * enquanto o programa executa.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Quando você declara uma variável, está pedindo ao computador
     * para reservar um espaço na memória, com um nome que você vai
     * usar para acessar esse espaço depois.
     *
     * Sempre que o nome da variável aparece no código, o computador
     * substitui por (ou consulta) o valor que está guardado
     * naquele espeço de memória naquele momento. Se o valor for
     * alterado, as próximas vezes que a variável for usada, o novo
     * valor é o que conta.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Sem variáveis, todo valor usado no programa teria que ser
     * escrito diretamente no código (um número fixo, um texto fixo),
     * sem nenhuma forma de guardar um resultado, reutilizar um
     * valor, ou trabalhar com dados que mudam durante a
     * execução (como um entrada digitada pelo usuário).
     *
     * Variáveis dão nome e permanência temporária a esses valores,
     * permitindo que o programa "lembre" de algo enquanto está
     * rodando, e que esse algo possa mudar conforme a lógica exige.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Sempre que um valor precisar ser guardado para uso posterior,
     * seja porque ele muda durante a execução, seja porque será
     * usado em mais de um lugar do código.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Quando o valor nunca muda e representa uma regra fixa do
     * programa (por exemplo, o valor de um imposto fixo, ou o
     * número de dias da semana), o mais indicado é usar uma
     * constante, e não uma variável comum (tema do próximo tópico).
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Permite guardar e reutilizar valores ao longo do programa.
     * - Torna o código mais legível, usando nomes com significados em
     * vez de valores "soltos" no meio da lógica.
     * - Permite que o programa reaja a dados que mudam, como
     * entradas do usuário ou resultados de cálculos.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Usar nomes ruins ou genéricos (como x, temp, valor1) torna o
     * código difícil de entender depois.
     * - Variáveis usadas de forma descontrolada, sem organização,
     * podem deixar difícil rastrear onde e quanto um valor foi
     * alterado.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Escolha nomes que descrevam claramente o que a variável
     * representa (idade, precoTotal, nomeCliente).
     * - Em Jva, use o padrão camelCase para nomear variáveis
     * (precoTotal, não preco_total nem PrecoTotal).
     * - Declare a variável o mais próximo possível de onde ela
     * começa a ser usada, em vez de todas juntas no topo do
     * código.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * - Usar uma variável antes de atribuir um valor a ela, o que
     * gera erro de compilação em Java.
     * - Dar nomes que não têm relação nenhuma com o que a variável
     * representa, dificultando a leitura do código por outras
     * pessoas (ou por você mesmo, no futuro).
     * - Confundir o nome da variável com o valor guardado nela, achando
     * que o nome "é" o dado, quando, na verdade, é só um rótulo para
     * o espaço de memória.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Pense numa caixa com etiqueta.
     *
     * A caixa (a variável) tem um nome escrito na etiqueta ("idade",
     * por exemplo). Dentro dela, você guarda algo (o valor, como o
     * número 25). Você pode trocar o conteúdo da caixa quando
     * quiser, tirar o que está lá dentro e colocar outra coisa, mas
     * a etiqueta (o nome da caixa) continua a mesma.
     *
     * Sempre que alguém pedir "me dá o que está na caixa idade",
     * você entrega o que estiver guardado lá naquele momento, não
     * importa se já foi trocado várias vezes antes.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------
    // Uso de variáveis para guardar a atualizar valores ao longo da
    // execução do programa.


    public static void main(String[] args) {

        // Declarando variáveis com os seus tipos e valores iniciais.
        String nomeCliente = "Ana";
        int idade = 28;
        double saldoConta = 150.0;

        System.out.println(nomeCliente + " tem " + idade + " anos e saldo de R$" + saldoConta);


        // O valor de uma variável pode ser alterado depois de
        // declarado, isso é o que a diferencia de uma constante.
        saldoConta = saldoConta + 50.0;  // depósito de R$50
        idade = idade + 1; // aniversário

        System.out.println("Após atualização: " + nomeCliente + " tem " + idade + " anos e saldo de R$" + saldoConta);
    }


    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie variáveis para representar um produto de uma loja:
     * nome (texto), preco (número decimal) e quantidadeEstoque
     * (número inteiro).
     *
     * 1. Exiba as informações do produto.
     * 2. Simule uma venda de 3 unidades, atualizando a variável
     *    quantidadeEstoque.
     * 3. Simule um reajuste de preço de 10%, atualizando a variável
     *    preco.
     * 4. Exiba novamente as informações do produto, agora
     *    atualizadas.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Variável é um espaço nomeado na memória, usado para guardar um
     * valor que pode ser alterado ao longo da execução do programa.
     * Ela é a base para armazenar dados, seja entrada de usuário,
     * resultado de cálculos, ou qualquer informação que o programa
     * precise "lembrar" enquanto está rodando.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Documentação oficial: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
     */
}
