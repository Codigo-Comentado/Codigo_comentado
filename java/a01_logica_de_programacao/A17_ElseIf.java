package a01_logica_de_programacao;
/**
 * A17 - else if
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A17
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Operadores Relacionais, Operadores Lógicos,
 *                 Estruturas Condicionais, if, if / else
 *
 * @autor          Morcineck
 * @atualizado     16/09/2026
 * @tempoLeitura   20 min
 */
public class A17_ElseIf {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * O else if permite criar uma sequência de condições dentro
     * de uma mesma estrutura condicional.
     *
     * Enquanto:
     *
     * if
     *
     * permite testar uma condição,
     *
     * e:
     *
     * if / else
     *
     * permite escolher entre dois caminhos,
     *
     * o else if permite trabalhar com vários caminhos possíveis.
     *
     * Exemplo:
     *
     * if (nota >= 9) {
     *     System.out.println("Conceito A");
     * } else if (nota >= 7) {
     *     System.out.println("Conceito B");
     * } else if (nota >= 5) {
     *     System.out.println("Conceito C");
     * } else {
     *     System.out.println("Conceito D");
     * }
     *
     * Nesse exemplo existem quatro resultados possíveis.
     */


    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * A estrutura básica é:
     *
     * if (condicao1) {
     *
     *     // Executado se condicao1 for true.
     *
     * } else if (condicao2) {
     *
     *     // Executado se condicao1 for false
     *     // e condicao2 for true.
     *
     * } else if (condicao3) {
     *
     *     // Executado se as anteriores forem false
     *     // e condicao3 for true.
     *
     * } else {
     *
     *     // Executado se nenhuma condição anterior for true.
     * }
     *
     *
     * O Java avalia as condições de cima para baixo.
     *
     * Quando encontra a PRIMEIRA condição verdadeira:
     *
     * 1. executa aquele bloco;
     *
     * 2. ignora os demais else if;
     *
     * 3. ignora o else final;
     *
     * 4. continua a execução após a estrutura condicional.
     */


    /*
     * A PRIMEIRA CONDIÇÃO VERDADEIRA
     * -------------------------------------------------------------
     * Esta é uma das regras mais importantes do else if:
     *
     * A primeira condição verdadeira determina qual bloco será
     * executado.
     *
     * Exemplo:
     *
     * int pontos = 750;
     *
     * if (pontos >= 1000) {
     *     System.out.println("Diamante");
     * } else if (pontos >= 500) {
     *     System.out.println("Ouro");
     * } else if (pontos >= 100) {
     *     System.out.println("Prata");
     * } else {
     *     System.out.println("Bronze");
     * }
     *
     * Avaliação:
     *
     * 750 >= 1000
     *
     * false
     *
     * Depois:
     *
     * 750 >= 500
     *
     * true
     *
     * Portanto:
     *
     * "Ouro"
     *
     * O Java não precisa avaliar:
     *
     * pontos >= 100
     *
     * porque já encontrou o primeiro caminho verdadeiro.
     */


    /*
     * FLUXO DE EXECUÇÃO
     * -------------------------------------------------------------
     *
     * Imagine:
     *
     *                  condição 1?
     *                  /        \
     *               true       false
     *                |            |
     *                v            v
     *             bloco 1     condição 2?
     *                         /        \
     *                      true       false
     *                       |            |
     *                       v            v
     *                    bloco 2     condição 3?
     *                                /        \
     *                             true       false
     *                              |            |
     *                              v            v
     *                           bloco 3        else
     *                                            |
     *                                            v
     *                                         bloco 4
     *
     * Apenas um desses caminhos será executado.
     */


    /*
     * O ELSE FINAL
     * -------------------------------------------------------------
     * O else final representa o caminho utilizado quando nenhuma
     * das condições anteriores for verdadeira.
     *
     * Exemplo:
     *
     * if (nota >= 9) {
     *     System.out.println("A");
     * } else if (nota >= 7) {
     *     System.out.println("B");
     * } else if (nota >= 5) {
     *     System.out.println("C");
     * } else {
     *     System.out.println("D");
     * }
     *
     * Se a nota for 3:
     *
     * 3 >= 9 → false
     *
     * 3 >= 7 → false
     *
     * 3 >= 5 → false
     *
     * Nenhuma condição foi verdadeira.
     *
     * Portanto:
     *
     * else → "D"
     *
     *
     * O else final não possui condição.
     */


    /*
     * O ELSE FINAL É OBRIGATÓRIO?
     * -------------------------------------------------------------
     * Não.
     *
     * Podemos escrever:
     *
     * if (temperatura >= 40) {
     *     System.out.println("Temperatura crítica");
     * } else if (temperatura >= 30) {
     *     System.out.println("Temperatura elevada");
     * }
     *
     * Se nenhuma condição for verdadeira, nenhum desses blocos será
     * executado e o programa continuará normalmente.
     *
     * Utilize o else quando realmente existir um comportamento
     * padrão para todos os casos restantes.
     */


    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Existem problemas que não possuem apenas duas possibilidades.
     *
     * Por exemplo, uma nota pode ser classificada em:
     *
     * A
     * B
     * C
     * D
     *
     * Um cliente pode pertencer às categorias:
     *
     * Diamante
     * Ouro
     * Prata
     * Bronze
     *
     * Uma temperatura pode ser:
     *
     * crítica
     * elevada
     * normal
     * baixa
     *
     * O else if permite representar essas diferentes possibilidades
     * dentro de uma única cadeia de decisão.
     */


    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Utilize else if quando:
     *
     * - houver três ou mais caminhos possíveis;
     *
     * - as condições fizerem parte da mesma decisão;
     *
     * - apenas um dos caminhos deva ser executado;
     *
     * - houver necessidade de testar condições em sequência.
     *
     * É muito comum utilizar else if para trabalhar com:
     *
     * - faixas de valores;
     * - classificações;
     * - níveis;
     * - categorias;
     * - prioridades;
     * - intervalos.
     */


    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Nem toda sequência de decisões deve utilizar else if.
     *
     * Se as condições forem independentes e mais de uma puder
     * executar, utilizar vários ifs independentes pode ser mais
     * adequado.
     *
     * Exemplo:
     *
     * if (usuarioPremium) {
     *     System.out.println("Benefício Premium");
     * }
     *
     * if (aniversariante) {
     *     System.out.println("Benefício de aniversário");
     * }
     *
     * Um usuário pode ser Premium E aniversariante.
     *
     * Portanto, os dois blocos podem precisar ser executados.
     *
     * Transformar essas verificações em uma cadeia de else if
     * poderia impedir a execução de uma das regras.
     */


    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Permite representar vários caminhos possíveis.
     * - Organiza condições relacionadas em uma única cadeia.
     * - Apenas um dos caminhos é executado.
     * - Evita avaliações posteriores após encontrar um caminho.
     * - É útil para classificações e faixas de valores.
     */


    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - A ordem incorreta pode produzir resultados errados.
     * - Muitas condições podem dificultar a leitura.
     * - Condições complexas podem tornar a cadeia difícil de manter.
     * - Não é adequada quando várias condições independentes
     *   precisam executar ao mesmo tempo.
     */


    /*
     * A ORDEM DAS CONDIÇÕES IMPORTA
     * -------------------------------------------------------------
     * Quando trabalhamos com faixas que se sobrepõem, a ordem pode
     * alterar completamente o resultado.
     *
     * Considere:
     *
     * int idade = 70;
     *
     * if (idade >= 18) {
     *     System.out.println("Adulto");
     * } else if (idade >= 60) {
     *     System.out.println("Idoso");
     * } else {
     *     System.out.println("Menor de idade");
     * }
     *
     * Poderíamos esperar:
     *
     * "Idoso"
     *
     * Porém, o Java começa pela primeira condição:
     *
     * 70 >= 18
     *
     * true
     *
     * Portanto, executa:
     *
     * "Adulto"
     *
     * e encerra a cadeia.
     *
     * A condição:
     *
     * idade >= 60
     *
     * nunca será alcançada para uma pessoa com 60 anos ou mais,
     * porque qualquer valor >= 60 também é >= 18.
     */


    /*
     * CONDIÇÕES MAIS ESPECÍFICAS PRIMEIRO
     * -------------------------------------------------------------
     * No exemplo anterior, podemos organizar:
     *
     * if (idade >= 60) {
     *     System.out.println("Idoso");
     * } else if (idade >= 18) {
     *     System.out.println("Adulto");
     * } else {
     *     System.out.println("Menor de idade");
     * }
     *
     * Agora:
     *
     * idade = 70
     *
     * 70 >= 60 → true
     *
     * Resultado:
     *
     * "Idoso"
     *
     *
     * idade = 30
     *
     * 30 >= 60 → false
     *
     * 30 >= 18 → true
     *
     * Resultado:
     *
     * "Adulto"
     *
     *
     * idade = 15
     *
     * 15 >= 60 → false
     *
     * 15 >= 18 → false
     *
     * Resultado:
     *
     * "Menor de idade"
     */


    /*
     * FAIXAS DE VALORES
     * -------------------------------------------------------------
     * Um uso muito comum do else if é classificar valores.
     *
     * Exemplo:
     *
     * double nota = 8.0;
     *
     * if (nota >= 9) {
     *     System.out.println("Conceito A");
     * } else if (nota >= 7) {
     *     System.out.println("Conceito B");
     * } else if (nota >= 5) {
     *     System.out.println("Conceito C");
     * } else {
     *     System.out.println("Conceito D");
     * }
     *
     * Observe que não precisamos escrever:
     *
     * nota >= 7 && nota < 9
     *
     * nesse caso.
     *
     * Se o Java chegou ao:
     *
     * else if (nota >= 7)
     *
     * significa que:
     *
     * nota >= 9
     *
     * já foi avaliado como false.
     *
     * Portanto, a própria cadeia já excluiu a faixa anterior.
     */


    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     *
     * 1. ORGANIZE AS CONDIÇÕES COM CUIDADO
     *
     * Em classificações por limite mínimo, normalmente começamos
     * pelo maior limite.
     *
     * Exemplo:
     *
     * >= 9
     * >= 7
     * >= 5
     *
     *
     * 2. MANTENHA AS CONDIÇÕES CLARAS
     *
     * Evite colocar regras excessivamente complexas diretamente
     * dentro do else if.
     *
     *
     * 3. UTILIZE CHAVES
     *
     * Prefira:
     *
     * if (condicao) {
     *     instrucao;
     * } else if (outraCondicao) {
     *     outraInstrucao;
     * } else {
     *     instrucaoFinal;
     * }
     *
     *
     * 4. EVITE REPETIR VERIFICAÇÕES DESNECESSÁRIAS
     *
     * Aproveite o fato de que as condições anteriores já foram
     * descartadas.
     *
     *
     * 5. PENSE NA REGRA ANTES DE ESCREVER A ORDEM
     *
     * Pergunte:
     *
     * "Se esta condição for verdadeira, alguma condição mais
     * específica abaixo dela deixará de ser alcançada?"
     *
     * Essa pergunta ajuda a identificar problemas de ordenação.
     */


    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     *
     * 1. ORDENAR AS CONDIÇÕES INCORRETAMENTE
     *
     * Exemplo:
     *
     * double nota = 9.5;
     *
     * if (nota >= 5) {
     *     System.out.println("Conceito C");
     * } else if (nota >= 7) {
     *     System.out.println("Conceito B");
     * } else if (nota >= 9) {
     *     System.out.println("Conceito A");
     * } else {
     *     System.out.println("Conceito D");
     * }
     *
     * Para nota = 9.5:
     *
     * 9.5 >= 5
     *
     * true
     *
     * Resultado:
     *
     * "Conceito C"
     *
     * O programa nunca chega à condição:
     *
     * nota >= 9
     *
     * apesar de ela também ser verdadeira.
     *
     * O código compila.
     *
     * O problema é de LÓGICA.
     */


    /*
     * 2. ACREDITAR QUE TODAS AS CONDIÇÕES SERÃO AVALIADAS
     * -------------------------------------------------------------
     * Em uma cadeia de if / else if / else, o Java não precisa
     * continuar avaliando depois de encontrar uma condição true.
     *
     * Exemplo:
     *
     * int pontos = 750;
     *
     * if (pontos >= 1000) {
     *     System.out.println("Diamante");
     * } else if (pontos >= 500) {
     *     System.out.println("Ouro");
     * } else if (pontos >= 100) {
     *     System.out.println("Prata");
     * }
     *
     * Temos:
     *
     * 750 >= 1000 → false
     *
     * 750 >= 500 → true
     *
     * O Java executa "Ouro".
     *
     * A condição:
     *
     * 750 >= 100
     *
     * não precisa ser avaliada nessa cadeia.
     */


    /*
     * 3. UTILIZAR ELSE IF PARA CONDIÇÕES INDEPENDENTES
     * -------------------------------------------------------------
     * Considere duas características:
     *
     * boolean clientePremium = true;
     * boolean aniversariante = true;
     *
     * Se ambas concedem benefícios independentes, queremos que os
     * dois blocos possam executar.
     *
     * Neste caso:
     *
     * if (clientePremium) {
     *     System.out.println("Desconto Premium");
     * }
     *
     * if (aniversariante) {
     *     System.out.println("Brinde de aniversário");
     * }
     *
     * pode ser mais adequado que:
     *
     * if (clientePremium) {
     *     System.out.println("Desconto Premium");
     * } else if (aniversariante) {
     *     System.out.println("Brinde de aniversário");
     * }
     *
     * Na segunda versão, se clientePremium for true, a condição
     * aniversariante não será avaliada naquela cadeia.
     */


    /*
     * 4. CRIAR INTERVALOS COM BURACOS OU SOBREPOSIÇÕES
     * -------------------------------------------------------------
     * Ao trabalhar com faixas, verifique cuidadosamente os limites.
     *
     * Por exemplo:
     *
     * >= 9
     * >= 7
     * >= 5
     *
     * deve representar corretamente a regra desejada.
     *
     * Operadores como:
     *
     * >
     * >=
     * <
     * <=
     *
     * podem mudar o resultado exatamente nos valores de limite.
     */


    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine uma fila de verificação para acessar setores de um
     * evento.
     *
     * Primeiro:
     *
     * "Possui acesso VIP?"
     *
     * Se sim:
     *
     * → setor VIP.
     *
     * Se não, verificamos:
     *
     * "Possui acesso Premium?"
     *
     * Se sim:
     *
     * → setor Premium.
     *
     * Se não, verificamos:
     *
     * "Possui ingresso comum?"
     *
     * Se sim:
     *
     * → setor comum.
     *
     * Caso nenhuma opção seja atendida:
     *
     * → acesso negado.
     *
     * Assim que uma categoria válida é encontrada, não é necessário
     * continuar procurando outro caminho dentro daquela cadeia.
     *
     * Esse comportamento é semelhante ao else if.
     */


    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        // -------------------------------------------------
        // EXEMPLO 1 - CLASSIFICAÇÃO DE NOTA
        // -------------------------------------------------

        double nota = 8.0;

        if (nota >= 9.0) {
            System.out.println("Conceito A");
        } else if (nota >= 7.0) {
            System.out.println("Conceito B");
        } else if (nota >= 5.0) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Conceito D");
        }

        /*
         * Avaliação:
         *
         * 8 >= 9 → false
         *
         * 8 >= 7 → true
         *
         * Resultado:
         *
         * "Conceito B"
         *
         * A condição:
         *
         * nota >= 5
         *
         * não precisa ser avaliada.
         */


        // -------------------------------------------------
        // EXEMPLO 2 - CLASSIFICAÇÃO POR PONTOS
        // -------------------------------------------------

        int pontos = 750;

        if (pontos >= 1000) {
            System.out.println("Categoria Diamante");
        } else if (pontos >= 500) {
            System.out.println("Categoria Ouro");
        } else if (pontos >= 100) {
            System.out.println("Categoria Prata");
        } else {
            System.out.println("Categoria Bronze");
        }


        // -------------------------------------------------
        // EXEMPLO 3 - CLASSIFICAÇÃO POR IDADE
        // -------------------------------------------------

        int idade = 70;

        if (idade >= 60) {
            System.out.println("Idoso");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Menor de idade");
        }

        /*
         * A condição mais específica para essa classificação foi
         * colocada antes:
         *
         * idade >= 60
         *
         * Isso impede que uma pessoa com 70 anos seja classificada
         * simplesmente como "Adulto".
         */


        // -------------------------------------------------
        // EXEMPLO 4 - TEMPERATURA
        // -------------------------------------------------

        double temperatura = 32.0;

        if (temperatura >= 40.0) {
            System.out.println("Temperatura crítica");
        } else if (temperatura >= 30.0) {
            System.out.println("Temperatura elevada");
        } else if (temperatura >= 15.0) {
            System.out.println("Temperatura normal");
        } else {
            System.out.println("Temperatura baixa");
        }


        // -------------------------------------------------
        // EXEMPLO 5 - DESCONTO
        // -------------------------------------------------

        double valorCompra = 650.0;

        if (valorCompra >= 1000.0) {
            System.out.println("Desconto de 20%");
        } else if (valorCompra >= 500.0) {
            System.out.println("Desconto de 10%");
        } else if (valorCompra >= 200.0) {
            System.out.println("Desconto de 5%");
        } else {
            System.out.println("Sem desconto");
        }


        // -------------------------------------------------
        // ✔ EXEMPLO CORRETO - ORDEM DAS CONDIÇÕES
        // -------------------------------------------------

        double mediaFinal = 9.5;

        if (mediaFinal >= 9.0) {
            System.out.println("Classificação A");
        } else if (mediaFinal >= 7.0) {
            System.out.println("Classificação B");
        } else if (mediaFinal >= 5.0) {
            System.out.println("Classificação C");
        } else {
            System.out.println("Classificação D");
        }

        /*
         * Temos:
         *
         * 9.5 >= 9
         *
         * true
         *
         * Resultado correto:
         *
         * "Classificação A"
         */


        // -------------------------------------------------
        // ❌ EXEMPLO INCORRETO - ORDEM DAS CONDIÇÕES
        // -------------------------------------------------

        double notaComOrdemIncorreta = 9.5;

        if (notaComOrdemIncorreta >= 5.0) {
            System.out.println("Exemplo incorreto: Conceito C");
        } else if (notaComOrdemIncorreta >= 7.0) {
            System.out.println("Exemplo incorreto: Conceito B");
        } else if (notaComOrdemIncorreta >= 9.0) {
            System.out.println("Exemplo incorreto: Conceito A");
        } else {
            System.out.println("Exemplo incorreto: Conceito D");
        }

        /*
         * O resultado será:
         *
         * "Exemplo incorreto: Conceito C"
         *
         * mesmo com nota 9.5.
         *
         * Por quê?
         *
         * A primeira condição pergunta:
         *
         * 9.5 >= 5
         *
         * true
         *
         * O Java executa esse bloco e encerra a cadeia.
         *
         * As condições:
         *
         * >= 7
         *
         * e:
         *
         * >= 9
         *
         * não serão alcançadas para esse valor.
         *
         * IMPORTANTE:
         *
         * O código é válido para o compilador.
         *
         * O erro está na lógica utilizada para representar a regra.
         */


        // -------------------------------------------------
        // EXEMPLO 8 - CONDIÇÕES INDEPENDENTES
        // -------------------------------------------------

        boolean clientePremium = true;
        boolean aniversariante = true;

        if (clientePremium) {
            System.out.println("Benefício Premium aplicado");
        }

        if (aniversariante) {
            System.out.println("Benefício de aniversário aplicado");
        }

        /*
         * Aqui utilizamos dois ifs independentes de propósito.
         *
         * Como as duas condições são true, os dois benefícios podem
         * ser aplicados.
         *
         * Se utilizássemos else if, apenas o primeiro caminho
         * verdadeiro seria executado.
         */


        // -------------------------------------------------
        // EXEMPLO 9 - ELSE FINAL
        // -------------------------------------------------

        int nivel = 20;

        if (nivel >= 100) {
            System.out.println("Nível avançado");
        } else if (nivel >= 50) {
            System.out.println("Nível intermediário");
        } else if (nivel >= 25) {
            System.out.println("Nível básico");
        } else {
            System.out.println("Nível iniciante");
        }

        /*
         * Temos:
         *
         * 20 >= 100 → false
         *
         * 20 >= 50 → false
         *
         * 20 >= 25 → false
         *
         * Nenhuma condição foi verdadeira.
         *
         * Portanto, o else final será executado.
         */


        // -------------------------------------------------
        // EXEMPLO 10 - CONTINUIDADE DO PROGRAMA
        // -------------------------------------------------

        int velocidade = 80;

        if (velocidade >= 120) {
            System.out.println("Velocidade muito alta");
        } else if (velocidade >= 100) {
            System.out.println("Velocidade alta");
        } else if (velocidade >= 60) {
            System.out.println("Velocidade moderada");
        } else {
            System.out.println("Velocidade baixa");
        }

        System.out.println("Verificação de velocidade concluída");

        /*
         * 80 >= 120 → false
         *
         * 80 >= 100 → false
         *
         * 80 >= 60 → true
         *
         * Resultado:
         *
         * "Velocidade moderada"
         *
         * Depois que o bloco é executado, o programa continua:
         *
         * "Verificação de velocidade concluída"
         */
    }


    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie um programa que classifique a pontuação de um jogador.
     *
     * Utilize:
     *
     * int pontuacao = 680;
     *
     * Regras:
     *
     * 1000 pontos ou mais:
     *
     * "Rank Diamante"
     *
     * 500 pontos ou mais:
     *
     * "Rank Ouro"
     *
     * 200 pontos ou mais:
     *
     * "Rank Prata"
     *
     * abaixo de 200:
     *
     * "Rank Bronze"
     *
     *
     * Utilize:
     *
     * if
     * else if
     * else
     *
     *
     * Antes de executar, responda:
     *
     * 1 → Qual será a primeira condição avaliada?
     *
     * 2 → Com 680 pontos, qual será a primeira condição verdadeira?
     *
     * 3 → Depois que essa condição for encontrada, as condições
     *     seguintes precisarão ser avaliadas?
     *
     * 4 → Qual rank será exibido?
     *
     *
     * DESAFIO:
     *
     * Altere:
     *
     * pontuacao = 1200;
     *
     * pontuacao = 350;
     *
     * pontuacao = 50;
     *
     * Antes de executar cada valor, tente prever qual caminho será
     * escolhido.
     */


    /*
     * CURIOSIDADES (opcional)
     * -------------------------------------------------------------
     * Podemos utilizar quantos else if forem necessários:
     *
     * if (...) {
     *
     * } else if (...) {
     *
     * } else if (...) {
     *
     * } else if (...) {
     *
     * } else {
     *
     * }
     *
     * Porém, isso não significa que uma cadeia muito grande seja
     * sempre a melhor solução.
     *
     * Conforme os programas crescem, existem outras estruturas e
     * técnicas que podem representar determinadas regras de forma
     * mais organizada.
     *
     * Uma delas é o switch, apropriado para determinados cenários e
     * que pode ser estudado separadamente.
     */


    /*
     * RESUMO
     * -------------------------------------------------------------
     * O else if permite testar várias condições relacionadas em
     * sequência.
     *
     * Estrutura:
     *
     * if (condicao1) {
     *
     * } else if (condicao2) {
     *
     * } else if (condicao3) {
     *
     * } else {
     *
     * }
     *
     *
     * O Java avalia as condições de cima para baixo.
     *
     * Quando encontra a primeira condição verdadeira:
     *
     * - executa aquele bloco;
     *
     * - ignora os demais else if;
     *
     * - ignora o else final;
     *
     * - continua o programa após a estrutura.
     *
     *
     * Por isso:
     *
     * A ORDEM DAS CONDIÇÕES IMPORTA.
     *
     *
     * Em classificações por limites mínimos, condições mais
     * específicas ou maiores normalmente precisam aparecer antes
     * das condições mais abrangentes.
     *
     * Exemplo:
     *
     * >= 9
     * >= 7
     * >= 5
     *
     *
     * O else final é executado quando nenhuma condição anterior for
     * verdadeira.
     *
     * Ele não é obrigatório.
     *
     *
     * Também devemos diferenciar:
     *
     * VÁRIOS IFS INDEPENDENTES
     *
     * → mais de um bloco pode ser executado.
     *
     * IF / ELSE IF / ELSE
     *
     * → apenas o primeiro caminho verdadeiro da cadeia é executado.
     *
     *
     * Portanto, a estrutura deve ser escolhida de acordo com a regra
     * que o programa precisa representar.
     */


    /*
     * REFERÊNCIAS (opcional)
     * -------------------------------------------------------------
     * - Java Language Specification - Statements:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-14.html
     *
     * - Java Language Specification - if-then e if-then-else:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-14.html#jls-14.9
     *
     * - Java Language Specification - Boolean Type:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-4.html#jls-4.2.5
     */
}

