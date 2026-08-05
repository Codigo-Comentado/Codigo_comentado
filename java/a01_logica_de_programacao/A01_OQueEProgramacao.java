package a01_logica_de_programacao;
/**
 * L01 — O que é Programação
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → L01
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Nenhum
 * @proximos       Algoritmos
 * @autor          Morcineck
 * @atualizado     04/08/2026
 * @tempoLeitura   8 min
 */
public class A01_OQueEProgramacao {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Programar é dar instruções, passo a passo, para que um
     * computador execute uma tarefa. Essas instruções precisam ser
     * claras, ordenadas e escritas numa linguaguem que a máquina
     * consiga entender, ou pelo menos traduzir.
     *
     * Um programa nada mais é do que uma sequência de instruções
     * que resolve um problema específico: calcular um valor, exibir
     * uma mensagem, validar um dado, organizar uma lista.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * O computador não "pensa" nem interpreta intenções. Ele só executa
     * exatamente o que foi escrito, na ordem que foi escrito.
     *
     * Quando você escreve um programa, está descrevendo, com
     * extrema precisão, uma sequência de passos. O computador lê
     * essa sequência (depois de traduzida para uma linguaguem que
     * ele entenda) e executa cada passo, um de cada vez, sem pular
     * etapas e sem "adivinha" o que você quis dizer.
     *
     * Por isso, se uma instrução estiver incompleta, ambígua ou fora
     * de ordem, o resultado sai errado, mesmo que para um humano
     * pareça óbvio o que deveria acontecer.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Programação existe porque certas tarefas são repetitivas,
     * demoradas ou complexas demais para serem feitas manualmente
     * por uma pessoa, mas são simples de descrever como uma
     * sequência de passos lógicos.
     *
     * Em vez de fazer um cálculo, uma validação ou uma organização
     *  de dados à mão, milhares de vezes, escrevemos um programa uma
     * única vez, e o computador executa essa lógica quantas vezes
     * for necessário, rápido e sem cansar.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Sempre que existir um problema que possa ser resolvido através
     * de uma sequência clara de passos: automatizar uma tarefa,
     * processar uma tarefa, calcular um resultado, ou construir um
     * sistema que várias pessoas vão usar.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Programa não é a resposta para tudo. Se um problema é
     * resolvido de forma mais rápida e confiável sem código (uma
     * palinha simples, uma decisão manual pontual,
     * uma ferramenta já pronta), programar do zero poder ser esforço
     * desnecessário.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Automatiza tarefas repetitivas, economizando tempo.
     * - Executa cálculos e processos com precisão e consistência.
     * - Permite resolver o mesmo problema várias vezes, para
     * diferentes dados, sem reescrever a lógica.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Exige tempo de aprendizado até dominar a lógica e a
     *   linguagem usada.
     * - Um erro pequeno na lógica pode gerar um resultado
     *   completamente errado, e nem sempre é óbvio identificar onde
     *   está o problema.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Antes de escrever código, pense no problema em português
     *   (ou pseudocódigo): quais passos, em qual ordem, resolvem
     *   isso?
     * - Comece pelo caminho mais simples que funcione, depois
     *   melhore.
     * - Teste cada pequena parte antes de seguir para a próxima.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * - Tentar escrever código direto, sem primeiro entender o
     *   problema e planejar os passos.
     * - Achar que o computador vai "entender a intenção" por trás de
     *   uma instrução incompleta ou ambígua.
     * - Pular etapas simples achando que são óbvias demais para
     *   escrever, e o programa quebra justamente nelas.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Pense numa receita de bolo.
     *
     * A receita não diz apenas "faça um bolo". Ela lista, passo a
     * passo, exatamente o que fazer: misture os ovos com o açúcar,
     * depois adicione a farinha, depois leve ao forno por 40 minutos
     * a 180°C.
     *
     * Quem segue a receita não precisa saber cozinhar, só precisa
     * seguir os passos na ordem certa. Se pular um passo, ou
     * inverter a ordem, o bolo não fica como deveria.
     *
     * Programar é escrever a receita. O computador é quem segue,
     * exatamente como está escrito, sem interpretar nem "dar um
     * jeitinho".
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------
    // Um problema simples resolvido através de uma sequência de
    // instruções: calcular a média de duas notas e informar se o
    // aluno foi aprovado (média maior ou igual a 6).

    public static void main(String[] args) {

        // Passo 1: os dados de entrada do problema.
        double nota1 = 7.5;
        double nota2 = 5.0;

        // Passo 2: o cálculo, a lógica que resolve o problema.
        double media = (nota1 + nota2) / 2;

        // Passo 3: a decisão, com base no resultado calculado.
        boolean aprovado = media >= 6;

        // Passo 4: a saída, o resultado apresentado para quem usa o programa.
        System.out.println("Média: " + media);
        System.out.println(("Situação: " + (aprovado ? "Aprovado" : "Reprovado")));
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Antes de programar, escreva em português, passo a passo, como
     * você resolveria o seguinte problema:
     *
     * "Calcular o valor total de uma compra, sabendo o preço de um
     * produto e a quantidade comprada, e informar se a compra dá
     * direito a frete grátis (valor total maior que R$200)."
     *
     * Depois de, escrever os passos em português, traduza cada passo
     * para código Java, seguindo a mesma estrutura do exemplo acima
     * (dados de entrada, cálculo, decisão, saída).
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Programar é descrever, passo a passo, como resolver um
     * problema, numa sequência de instruções que o computador
     * consiga executar. O computador não interpreta intenções, ele
     * só executa exatamente o que foi escrito. Por isso, pensar na
     * lógica antes de escrever código é o primeiro e mais importante
     * passo de qualquer programador.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Documentação oficial: https://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html
     */
}
