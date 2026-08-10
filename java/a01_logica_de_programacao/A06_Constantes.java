package a01_logica_de_programacao;
    /**
    * A06 - Constantes
    *
    * @modulo         Lógica de Programação
    * @roadmap        Módulo 1 → A06
    * @trilha         Java → Lógica de Programação → Básico
    * @nivel          🟢 Básico
    * @prerequisitos  Nenhum
    * @proximos       Tipos de Dados
    * @autor          Lavynnemarianne13-alt
    * @atualizado     07/08/2026
    * @tempoLeitura   10 min
    */

public class A06_Constantes {

        /*
         * O QUE É?
         * -------------------------------------------------------------
         * Uma constante é um espaço na memória que guarda um valor que
         * não pode ser alterado depois de definido, em Java, ela é criada
         * usando a palavra-chave `final`.
         * Diferente de uma variável comum,
         * que pode mudar de valor várias vezes durante a execução do
         * programa, uma constante recebe um valor uma única vez e esse
         * valor fica travado para sempre.
         */

        /*
         * COMO FUNCIONA?
         * -------------------------------------------------------------
         * Quando uma variável é declarada com a palavra-chave 'final',
         * o Java permite que ela receba um valor apenas uma única vez,
         * se o programador tentar atribuir um novo valor posteriormente,
         * o compilador gera um erro, impedindo que o programa seja
         * executado com essa alteração. Quando a constante é primitiva (int, double, boolean, etc.) e
         * seu valor é conhecido em tempo de compilação, o Java pode até
         * "colar" o valor diretamente onde ela é usada (isso se chama
         * constant folding).
         */

        /*
         * POR QUE EXISTE?
         * -------------------------------------------------------------
         * Constantes existem para proteger valores que não deveriam mudar
         * durante a execução, como o número de dias da semana, uma taxa
         * fixa de imposto, ou o valor de PI. Sem elas, qualquer parte do
         * código poderia acidentalmente reatribuir esse valor, causando
         * bugs difíceis de rastrear. Elas também tornam o código mais
         * legível, em vez de números "mágicos" espalhados pelo código
         * (ex: if (altura >= 1,50)), você usa um nome que explica o
         * significado (ex: if (altura >= ALTURA_MINIMA)).
         */

        /*
         * QUANDO USAR?
         * -------------------------------------------------------------
         * Valor de PI (3.14159...)
         * Valores fixos de regras de negócio (ex: LIMITE_DESCONTO = 0.1)
         * Velocidade da luz.
         * Quantidade de dias da semana.
         * Limite máximo de usuários.
         * Taxas, porcentagens ou descontos fixos.
         * URLs que nunca mudam.
         */

        /*
         * QUANDO EVITAR?
         * -------------------------------------------------------------
         * Quando o valor realmente precisa mudar durante a execução do
         * programa (nesse caso, use uma variável comum) ou quando você criaria uma constante só para um valor usado uma
         * única vez em um único lugar (às vezes é mais simples deixar
         * o valor direto ali, com um comentário explicando).
         */

        /*
         * VANTAGENS
         * -------------------------------------------------------------
         * Evita alterações acidentais.
         * Torna o código mais legível.
         * Facilita manutenção.
         * Reduz erros de programação.
         * Deixa claro quais valores são fixos.
         */

        /*
         * DESVANTAGENS
         * -------------------------------------------------------------
         * `final` só trava a referência, não o objeto em si (cuidado com
         * listas, arrays e outros objetos mutáveis). Excesso de constantes soltas pode poluir o código; em projetos
         * maiores, é melhor agrupá-las em uma classe ou enum específico
         */

        /*
         * BOAS PRÁTICAS
         * -------------------------------------------------------------
         * Escreva constantes em LETRAS MAIÚSCULAS.
         * Separe palavras usando underscore (_).
         * Declare a constante próxima de onde será utilizada.
         * Utilize nomes que representem claramente seu significado.
         */

        /*
         * ERROS MAIS COMUNS
         * -------------------------------------------------------------
         * Tentar alterar uma constante após sua criação (isso gera erro de compilação)
         * Declarar uma constante para um valor que muda com frequência (Nesse caso deveria ser uma variável comum)
         */

        /*
         * ANALOGIA
         * -------------------------------------------------------------
         * Pense em uma constante como uma placa gravada em uma pedra: uma
         * vez esculpida, ninguém consegue apagar ou reescrever o que está
         * ali. Já uma variável comum é como um quadro-negro, que pode ser
         * apagado e reescrito quantas vezes for preciso.
         */

        // -----------------------------------------------------
        // EXEMPLO PRÁTICO
        // -----------------------------------------------------

        // ✔ Correto
        static final double TAXA_JUROS = 0.05;   // constante de classe, valor fixo
        static final int IDADE_MINIMA = 18;

        // ❌ Errado / ingênuo
        // double taxaJuros = 0.05;
        // sem "final": nada impede que outro trecho do código faça "taxaJuros = 0.10;" por engano, mudando
        // uma regra de negócio que deveria ser fixa.

        public static void main(String[] args) {
            double valorEmprestimo = 1000.0;
            double juros = valorEmprestimo * TAXA_JUROS;

            System.out.println("Juros calculados: " + juros);
            System.out.println("Idade mínima permitida: " + IDADE_MINIMA);
            // TAXA_JUROS = 0.10; // isso geraria erro de compilação,
            // porque TAXA_JUROS é "final" e já foi inicializada.
        }

        /*
         * EXERCÍCIO
         * -------------------------------------------------------------
         * Crie uma classe Produto com os campos nome, preço e estoque.
         * Adicione uma constante static final double TAXA_IMPOSTO = 0.07
         * e um método que calcule o preço final do produto com imposto
         * incluído. Depois, explique com suas próprias palavras por que
         * essa taxa foi definida como constante em vez de variável comum.
         */

        /*
         * CURIOSIDADES (opcional)
         * -------------------------------------------------------------
         * Em Java, quando uma constante é declarada como
         * public static final, ela pertence à classe e pode ser acessada sem criar um objeto.
         * Um exemplo famoso é: Math.PI que representa o valor de π fornecido pela própria linguagem.
         */

        /*
         * RESUMO
         * -------------------------------------------------------------
         * Constantes em Java são criadas com `final` (e geralmente
         * combinadas com `static`) para representar valores que não devem
         * mudar durante a execução do programa. Elas tornam o código mais
         * seguro, legível e fácil de manter, mas é importante lembrar que
         * final trava apenas a referência, não o conteúdo de objetos
         * mutáveis.
         */

        /*
         * REFERÊNCIAS (opcional)
         * -------------------------------------------------------------
         * Documentação oficial: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
         * Java Language Specification (final): https://docs.oracle.com/javase/specs/jls/se21/html/jls-4.html#jls-4.12.4
         */
}

