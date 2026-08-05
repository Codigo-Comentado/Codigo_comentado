package a01_logica_de_programacao;
/**
 * A04 — Pseudocódigo
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A04
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Fluxograma
 * @proximos       Variáveis
 *
 * @autor          Morcineck
 * @atualizado     04/08/2026
 * @tempoLeitura   8 min
 */
public class A04_Pseudocodigo {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * pseudocódigo é uma forma de escrever um algoritmo usando uma
     * estrutura parecida com código de programação, mas em
     * linguaguem natural (geralmente português), sem se preocupar
     * com a sintaxe exata de nenhuma linguaguem específica.
     *
     * É um meio-termo entre escrever o algoritmo em texto corrido e
     * escrever código de verdade: Já tem uma estrutura organizada
     * (inicio, passos numerados, decisões, repetições), mas ainda é
     * legível por qualquer pessoa, mesmo sem conhecer Java, Python
     * ou qualquer outra linguaguem.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Você escreve o algoritmo usando palavras-chave em português
     * que representam as mesmas ideias que existem em qualquer
     * linguaguem de programação: início e fim, leia (entrada de
     * dados), escreva (saída de dados), se/senão (decisão),
     * enquanto/para (repetição).
     *
     * Não existe uma sintaxe rígida e universal para pseudocódigo,
     * diferentes livros e cursos usam palavras em um pouco diferentes,
     * o importante é manter a estrutura clara e consistente dentro
     * do que você está escrevendo.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Fluxogramas são visuais, mas ficam difíceis de manter conforme
     * o algoritmo cresce (muitas formas, muitas setas). Código
     * direto numa linguaguem específica exige já saber a sintaxe
     * exata daquela linguagem, o que pode atrapalhar quem está
     * focado em resolver a lógica, não em decorar sintaxe.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Para planejar algoritmos com várias decisões, repetições ou
     * passos, principalmente quando você ainda está estudando lógica
     * de programação e quer separar "pensar na lógica" de "aprender
     * a sintaxe de uma linguaguem".
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Para problemas triviais, ou quando você já domina bem a
     * linguaguem que vai usar, escrever pseudocódigo pode ser um
     * passo redundante, indo direto para o código já resolve.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Não depende de sintaxe de nenhuma linguagem específica.
     * - Mais estruturado que texto corrido, mais rápido de escrever
     *   que um fluxograma.
     * - Fácil de traduzir depois para qualquer linguagem de
     *   programação real.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Por não ter uma sintaxe rígida e universal, pode variar
     * bastante de estilo entre pessoas diferentes.
     * - Não é executável, então erros de lógicas só aparecem quando o
     * pseudocódigo for de fato traduzido para código real e
     * testado.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Mantenha uma estrutura consistente: sempre use as mesmas
     *   palavras-chave para as mesmas ideias (leia, escreva, se,
     *   senão, enquanto).
     * - Numere ou indente os passos, principalmente dentro de
     *   decisões e repetições, para deixar clara a hierarquia.
     * - Escreva pensando em "isso resolveria o problema mesmo sem
     *   nenhuma linguagem de programação existir?".
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * - Misturar sintaxe real de uma linguagem (como usando `;` ou
     *   `{}`) dentro do pseudocódigo, o que tira o propósito dele
     *   de ser independente de linguagem.
     * - Escrever passos vagos demais ("processa os dados"), sem
     *   detalhar o que de fato deveria acontecer.
     * - Esquecer de indentar decisões e repetições, deixando difícil
     *   saber onde cada bloco começa e termina.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Pense numa lista de tarefas escrita à mão antes de organizar
     * tudo num aplicativo de gerenciamento de projetos.
     *
     * Você já escreve de forma organizada, com prioridades e ordem
     * definida, mas ainda em linguagem livre, sem se preocupar com
     * o formato exato que o aplicativo vai exigir depois.
     *
     * Pseudocódigo é essa lista organizada. O código de verdade, na
     * linguagem escolhida, é a versão formatada dentro do
     * aplicativo.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------
    // Pseudocódigo para calcular a média de três notas e informar a
    // situação do aluno:
    //
    // início
    //     leia nota1
    //     leia nota2
    //     leia nota3
    //
    //     media <- (nota1 + nota2 + nota3) / 3
    //
    //     se media >= 7 então
    //         escreva "Aprovado"
    //     senão se media >= 5 então
    //         escreva "Recuperação"
    //     senão
    //         escreva "Reprovado"
    //     fim se
    // fim
    //
    // Abaixo, a tradução desse pseudocódigo para código Java.

    public static void main(String[] args) {

        double nota1 = 8.0;
        double nota2 = 6.5;
        double nota3 = 7.0;

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Escreva o pseudocódigo (seguindo o estilo do exemplo acima,
     * com início, leia, escreva, se/senão) para o seguinte problema:
     *
     * "Ler a idade de uma pessoa e informar em qual faixa etária ela
     * se encaixa: 'Criança' (até 12 anos), 'Adolescente' (13 a 17
     * anos), ou 'Adulto' (18 anos ou mais)."
     *
     * Depois de escrever o pseudocódigo, traduza-o para código Java.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Pseudocódigo é uma forma estruturada, mas independente de
     * linguagem, de escrever a lógica de um algoritmo, usando
     * palavras-chave como leia, escreva, se/senão e enquanto. É um
     * passo intermediário entre pensar no problema e escrever o
     * código de verdade, útil principalmente para quem ainda está
     * aprendendo a programar.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Documentação oficial (estruturas de controle equivalentes
     *   em Java): https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html
     * - Wikipédia - Pseudocódigo: https://pt.wikipedia.org/wiki/Pseudoc%C3%B3digo
     */
}

