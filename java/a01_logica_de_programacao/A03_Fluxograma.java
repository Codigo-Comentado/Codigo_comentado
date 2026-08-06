package a01_logica_de_programacao;

/**
 * A03 — Fluxograma
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A03
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Algoritmos
 * @proximos       Pseudocódigo
 *
 * @autor          Morcineck
 * @atualizado     04/08/2026
 * @tempoLeitura   8 min
 */
public class A03_Fluxograma {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Fluxograma é a representação visual de um algoritmo, feita
     * com formas geométricas padronizadas e setas que indicam a
     * ordem de execução dos passos.
     *
     * Cada forma tem um significado específico:
     * - Óvalo/Elipse: início ou fim do fluxo.
     * - Paralelogramo: entrada ou saída de dados.
     * - Retângulo: um processo, uma ação, um cálculo.
     * - Losango: uma decisão, um ponto onde o fluxo se divide
     *   conforme uma condição (verdadeiro/falso).
     *
     * As setas conectam essas formas, mostrando o caminho que o
     * fluxo de execução percorre, de cima a baixo, ou seguindo a
     * direção indicada.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Você desenha o fluxograma seguindo a ordem lógica do
     * algoritmo: começa num "início", passa por processos e
     * decisões, e termina num "fim".
     *
     * Quando o fluxo chega num losango (decisão), ele se divide em
     * dois caminhos possíveis, um para quando a condição é
     * verdadeira, outro para quando é falsa. Cada caminho pode levar
     * a processos diferentes, e eventualmente os caminhos se
     * reencontram, ou seguem para saídas diferentes.
     *
     * A leitura de um fluxograma é sempre sequencial, seguindo as
     * setas, exatamente como o computador executaria as instruções
     * de um programa.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Nem todo mundo tem facilidade em visualizar a lógica de um
     * algoritmo só lendo texto ou pseudocódigo. Fluxogramas
     * transformam essa lógica em algo visual, o que ajuda a
     * enxergar de forma mais clara o caminho que o programa
     * percorre, principalmente quando existem várias decisões e
     * caminhos possíveis.
     *
     * Também facilita a comunicação entre pessoas (inclusive não
     * programadoras) sobre como um processo deveria funcionar, antes
     * mesmo de qualquer linha de código existir.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Para planejar algoritmos com múltiplas decisões e caminhos
     * possíveis, ou para explicar visualmente uma lógica para outras
     * pessoas (colegas, clientes, stakeholders) que talvez não
     * consigam interpretar pseudocódigo ou código diretamente.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Para algoritmos muito simples, com um ou dois passos lineares
     * e sem decisões, desenhar um fluxograma é um passo extra
     * desnecessário. Nesses casos, ir direto para pseudocódigo ou
     * até para o código já resolve.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Facilita visualizar o caminho lógico de um algoritmo,
     *   principalmente com decisões e ramificações.
     * - Serve como ferramenta de comunicação, mesmo com pessoas que
     *   não programam.
     * - Ajuda a identificar falhas de lógica antes de escrever
     *   qualquer código (como um caminho que nunca leva a um "fim").
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Pode se tornar difícil de ler quando o algoritmo cresce
     *   muito, com muitas decisões e caminhos cruzados.
     * - Exige uma ferramenta (papel, quadro, software) para
     *   desenhar, o que pode ser mais lento do que só escrever
     *   pseudocódigo direto.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Sempre tenha um único "início" e, idealmente, poucos pontos
     *   de "fim" bem definidos.
     * - Use os símbolos corretos para cada tipo de passo (não
     *   misture processo com decisão, por exemplo).
     * - Mantenha o fluxo o mais organizado possível, evitando setas
     *   cruzando por todo o desenho.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * - Esquecer de tratar os dois caminhos possíveis de uma
     *   decisão (o que acontece quando a condição é falsa?).
     * - Criar um fluxo sem um "fim" claro, deixando a leitura do
     *   diagrama confusa.
     * - Misturar níveis de detalhe: um passo genérico demais ("faz o
     *   processamento") ao lado de um passo específico demais.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Pense num mapa de metrô.
     *
     * Ele não te mostra prédios, ruas ou detalhes da cidade, ele
     * mostra as estações (os processos), os pontos de decisão
     * (baldeações, onde você escolhe qual linha seguir), e o
     * caminho entre o ponto de partida e o destino.
     *
     * Um fluxograma funciona do mesmo jeito para um algoritmo: ele
     * não mostra a sintaxe do código, mostra o caminho lógico, de
     * forma simplificada e visual, para chegar do início ao fim.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------
    // Fluxograma (representado em texto/ASCII) para verificar se um
    // número é positivo, negativo ou zero:
    //
    //        ┌────────┐
    //        │ Início │
    //        └───┬────┘
    //            │
    //   ┌────────▼─────────┐
    //   │ Ler número (num) │
    //   └────────┬─────────┘
    //            │
    //     ┌──────▼───────┐
    //     │ num > 0 ?     │
    //     └──┬────────┬──┘
    //     Sim│        │Não
    // ┌───────▼──┐  ┌──▼──────────┐
    // │"Positivo"│  │  num < 0 ?  │
    // └────┬─────┘  └──┬───────┬──┘
    //      │        Sim│       │Não
    //      │   ┌────────▼──┐ ┌──▼─────┐
    //      │   │"Negativo" │ │"Zero"  │
    //      │   └────┬──────┘ └───┬────┘
    //      │        │            │
    //      └────────┴─────┬──────┘
    //                      │
    //                 ┌────▼───┐
    //                 │  Fim   │
    //                 └────────┘
    //
    // Abaixo, a tradução desse fluxograma para código Java.

    public static void main(String[] args) {

        int num = -8; // Passo "Ler número"

        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Desenhe (no papel, quadro ou ferramenta de sua preferência) um
     * fluxograma para o seguinte problema:
     *
     * "Verificar se uma pessoa pode votar, sabendo a idade dela.
     * Se for menor de 16 anos, não pode votar. Se tiver entre 16 e
     * 17 anos, o voto é opcional. Se tiver 18 anos ou mais, o voto é
     * obrigatório."
     *
     * Depois de desenhar o fluxograma, traduza-o para código Java,
     * seguindo o mesmo estilo do exemplo acima.
     */

    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * A padronização das formas usadas em fluxogramas (óvalo,
     * retângulo, losango, paralelogramo) segue a norma ISO 5807,
     * criada para garantir que qualquer pessoa, em qualquer lugar,
     * consiga interpretar um fluxograma da mesma forma, independente
     * de quem o desenhou.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Fluxograma é a forma visual de representar um algoritmo,
     * usando símbolos padronizados (início/fim, processo, decisão,
     * entrada/saída) conectados por setas que indicam a ordem de
     * execução. É uma ferramenta útil para planejar e comunicar a
     * lógica de um programa antes de escrever qualquer código.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - ISO 5807 (Information processing — Documentation symbols
     *   and conventions for data, program and system flowcharts)
     */


}
