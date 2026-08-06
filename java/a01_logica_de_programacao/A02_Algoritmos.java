package a01_logica_de_programacao;
/**
 * A02 — Algoritmos
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A02
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  O que é Programação
 * @proximos       Fluxograma, Pseudocódigo
 *
 * @autor          Morcineck
 * @atualizado     04/08/2026
 * @tempoLeitura   9 min
 */
public class A02_Algoritmos {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Algoritmos é uma sequência finita de passos, bem definidos e
     * ordenados, que resolve um problema ou realiza uma tarefa.
     *
     * Não é código, não é linguaguem de programação. É a lógica
     * por trás da solução, o "como resolver", antes de qualquer
     * preocupação com sintaxe ou linguaguem específica.
     *
     * Um algoritmo pode ser escrito em português, desenhado num
     *  fluxograma, ou até descrito verbalmente, o importante é que
     * os passos sejam claros, finitos e sigam uma ordem lógica.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Todo algoritmo segue, de forma geral, três etapas:
     *
     * 1. Entrada: quais informações são necessárias para resolver o
     * problema.
     * 2. Processamento: os passos que transformam essa entrada num
     * resultado (cálculo, decisões, repetições).
     * 3. Saída: o resultado final, apresentado de alguma forma.
     *
     * Depois de um algoritmo estar bem definido nessas três etapas,
     * ele pode ser traduzido para qualquer linguaguem de programação,
     * a lógica continua a mesma, só muda a sintaxe usada para
     * escrevê-lo.
     *
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Porque pensar direto em código costuma gerar soluções confusas
     * ou incompletas. Separar "resolver o problema" (o algoritmo) de
     * "escrever isso numa linguaguem específica" (o código) permite
     * planejar a lógica com calma, sem se preocupar ainda com os
     * erros de sintaxe, ponto e vírgula, ou menos exatos de
     * funções.
     *
     * É também o que torna a lógica de programação universal: o
     * mesmo algoritmo que resolve um problema em Java resolve
     * o mesmo problema em Python, JavaScript ou qualquer outra
     * linguaguem, porque o raciocínio é o mesmo.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Sempre, antes de programar qualquer coisa que não seja
     * trivial. Vale a pena pensar no algoritmo (mesmo que só na
     * cabeça ou em um rascunho rápido) para problemas com mais de um
     * ou dois passos, decisões, ou repetições envolvidas.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Para tarefas extremamente simples e diretas (por exemplo,
     * "somar dois números e mostrar o resultado"), formalizar um
     * algoritmo detalhado, com fluxograma e tudo, é excesso de
     * processo para o tamanho do problema.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Separa o raciocínio lógico da sintaxe de uma linguaguem
     * específica.
     * - Facilita encontrar erros de lógica antes mesmo de escrever
     * código.
     * - É reaproveitável: o mesmo algoritmo serve de base para
     * implementações em linguaguens diferentes.
     *
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Para problemas simples, pode parecer um passo extra e
     *   redundante.
     * - Um algoritmo mal pensado, mesmo estando "correto" na lógica,
     *   pode ser ineficiente (lento ou que gasta recursos demais)
     *   quando finalmente virar código.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Escreva o algoritmo em linguagem simples (português) antes
     *   de programar, mesmo que seja rascunho mental.
     * - Divida problemas grandes em passos menores, mais fáceis de
     *   validar um a um.
     * - Teste o algoritmo "na mão" (com valores de exemplo) antes de
     *   escrever o código, para confirmar que a lógica está certa.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * - Pular direto para o código sem planejar os passos, e só
     *   descobrir a falha de lógica quando o programa já está dando
     *   erro.
     * - Escrever um algoritmo ambíguo, com passos que dependem de
     *   "interpretação", em vez de serem objetivos e claros.
     * - Esquecer casos especiais (como um valor de entrada igual a
     *   zero, ou uma lista vazia) que quebram a lógica pensada.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Pense num roteiro de viagem.
     *
     * Antes de sair de casa, você planeja: primeiro vou até o
     * aeroporto, depois faço o check-in, depois embarco, depois
     * pego o próximo voo de conexão, depois chego ao destino.
     *
     * Esse roteiro é o algoritmo. Ele não depende de qual companhia
     * aérea você vai usar, nem de qual carro te levará até o
     * aeroporto, esses são detalhes de "implementação". O roteiro em
     * si, a sequência lógica de passos até o destino, é o que
     * importa primeiro.
     *
     * Programar é, depois de ter esse roteiro pronto, escolher os
     * "meios de transporte" (a linguagem, as ferramentas) para
     * seguir cada passo dele.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------
    // Algoritmo (em português) para descobrir o maior entre três
    // números:
    //
    // 1. Receber três números: a, b e c.
    // 2. Supor que "a" é o maior.
    // 3. Se "b" for maior que o maior atual, "b" passa a ser o maior.
    // 4. Se "c" for maior que o maior atual, "c" passa a ser o maior.
    // 5. Mostrar o maior valor encontrado.
    //
    // Abaixo, a tradução desse algoritmo para código Java.

    public static void main(String[] args) {

        int a = 12;
        int b = 45;
        int c = 30;

        int maior = a;  // Passo 2: supõe que "a" é o maior

        if (b > maior) {  // Passo 3
            maior = b;
        }

        if (c > maior) {  // Passo 4
            maior = c;
        }

         System.out.println("O maior valor é: " + maior);  // Passo 5
}

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Escreva, em português, o algoritmo (passo a passo) para
     * descobrir se um número é par ou ímpar.
     *
     * Depois, traduza esse algoritmo para código Java, seguindo a
     * mesma estrutura do exemplo acima (comentários numerando cada
     * passo do algoritmo dentro do código).
     *
     * Dica: um número é par quando o resto da divisão dele por 2 é
     * igual a zero.
     */


    /*
     * RESUMO
     * -------------------------------------------------------------
     * Algoritmo é a sequência de passos que resolve um problema,
     * independente de linguagem de programação. Ele existe antes do
     * código, na forma de raciocínio lógico organizado. Pensar bem
     * no algoritmo, antes de programar, é o que evita a maior parte
     * dos erros de lógica.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Documentação oficial (conceitos de estruturas de controle):
     *   https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html
     */
}
