package a01_logica_de_programacao;

/**
 * A14 - Estruturas Condicionais
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A14
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Operadores Relacionais, Operadores Lógicos,
 *                 Estruturas Sequenciais
 *
 * @autor          Morcineck
 * @atualizado     01/09/2026
 * @tempoLeitura   20 min
 */
public class A14_EstruturasCondicionais {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Estruturas condicionais permitem que um programa tome decisões
     * durante a execução. Em vez de executar sempre exatamente o mesmo
     * caminho, o programa pode avaliar uma condição e decidir
     * quais instruções deverão ser executadas.
     *
     * Exemplo conceitual:
     * idade >= 18?
     *
     * Se for verdadeiro:
     *
     *     permitir acesso
     *
     * Se for falso:
     *
     *     negar acesso
     *
     * Podemos imaginar:
     *
     *                  idade >= 18?
     *                       |
     *               +-------+-------+
     *               |               |
     *             true            false
     *               |               |
     *               v               v
     *     "Acesso permitido"    "Acesso negado"
     *
     * Portanto, estruturas condicionais introduzem decisões no fluxo
     * de execução de um programa.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Uma estrutura condicional avalia uma expressão cujo resultado
     * precisa ser booleano: true ou false
     *
     * Exemplo:
     * int idade = 20;
     *
     * idade >= 18
     *
     * A expressão:
     * 20 >= 18
     *
     * resulta em: true
     *
     * Esse resultado pode ser utilizado por uma estrutura condicional
     * para determinar qual caminho será executado.
     *
     * Em Java, uma das formas de fazer isso é utilizando if:
     *
     * if (idade >= 18) {
     *     System.out.println("Maior de idade");
     * }
     *
     * O conteúdo entre as chaves será executado somente se a condição
     * resultar em true.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Programas reais frequentemente precisam tomar decisões.
     *
     * Por exemplo:
     *
     * - verificar se uma pessoa possui idade suficiente;
     * - verificar se uma senha está correta;
     * - verificar se um aluno atingiu determinada média;
     * - verificar se existe saldo suficiente;
     * - verificar se um produto está disponível;
     * - verificar qual opção foi escolhida em um menu.
     *
     * Sem estruturas condicionais, o programa executaria sempre o
     * mesmo conjunto de instruções.
     *
     * Com elas, podemos alterar o fluxo de acordo com os dados e as
     * condições encontradas durante a execução.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Utilize estruturas condicionais quando o comportamento do
     * programa depender de uma condição.
     *
     * Exemplos:
     *
     * Se idade >= 18:
     *     permitir cadastro.
     *
     * Se saldo >= valorCompra:
     *     realizar pagamento.
     *
     * Se nota >= 7:
     *     informar aprovação.
     *
     * Se usuarioAutenticado for true:
     *     permitir acesso.
     *
     * Observe que todos esses exemplos possuem algo em comum:
     *
     * existe uma pergunta que pode ser respondida com:
     * true ou false
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Nem toda instrução precisa de uma estrutura condicional.
     *
     * Se uma operação deve acontecer sempre, não existe necessidade
     * de criar uma condição artificial.
     *
     * Exemplo:
     *
     * System.out.println("Programa iniciado");
     *
     * Se essa mensagem deve aparecer em todas as execuções, não há
     * motivo para colocá-la dentro de uma condição.
     *
     * Também devemos evitar condições desnecessariamente complexas.
     *
     * Quanto mais difícil for entender a condição, maior será a chance
     * de erros na lógica do programa.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Permitem que o programa tome decisões.
     * - Criam caminhos diferentes durante a execução.
     * - Permitem adaptar o comportamento conforme os dados.
     * - São fundamentais para regras de negócio.
     * - Podem utilizar operadores relacionais e lógicos.
     * - São a base para estruturas como if, if/else e switch.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Muitas condições podem tornar o código difícil de compreender.
     * - Condições mal formuladas podem gerar comportamentos inesperados.
     * - Estruturas muito aninhadas dificultam a leitura.
     * - Operadores lógicos utilizados incorretamente podem alterar
     *   completamente o resultado esperado.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Crie condições fáceis de compreender.
     *
     * Exemplo:
     *
     * idade >= 18
     *
     * É mais claro do que criar uma lógica desnecessariamente
     * complicada para representar a mesma regra.
     *
     *
     * - Utilize nomes de variáveis que expressem o significado.
     *
     * Prefira:
     *
     * boolean possuiAutorizacao = true;
     *
     * em vez de:
     *
     * boolean x = true;
     *
     *
     * - Utilize parênteses quando eles ajudarem na leitura de
     *  condições maiores.
     *
     * Exemplo:
     *
     * if ((idade >= 18) && possuiIngresso) {
     *     ...
     * }
     *
     *
     * - Evite repetir condições complexas quando elas podem ser
     *  armazenadas em uma variável com nome significativo.
     *
     * Exemplo:
     *
     * boolean podeEntrar =
     *         idade >= 18 && possuiIngresso;
     *
     * if (podeEntrar) {
     *     ...
     * }
     *
     *
     * - Antes de escrever uma condição, tente descrevê-la em português.
     *
     * Exemplo:
     *
     * "A pessoa pode entrar se for maior de idade OU estiver
     * acompanhada."
     *
     * Depois podemos transformar essa regra em código:
     *
     * idade >= 18 || acompanhado
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * 1. Confundir = com ==.
     *
     * Em Java:
     *
     * =  → atribuição
     *
     * == → comparação
     *
     * Exemplo:
     *
     * int idade = 18;
     *
     * Aqui estamos atribuindo 18 à variável idade.
     *
     * Para comparar:
     *
     * idade == 18
     *
     *
     * Com valores numéricos, algo como:
     *
     * if (idade = 18) {
     * }
     *
     * Não funciona porque a atribuição produz um int, enquanto o if
     * exige uma expressão booleana.
     *
     *
     * Existe ainda um caso especialmente perigoso com boolean:
     *
     * boolean autorizado = false;
     *
     * if (autorizado = true) {
     *     System.out.println("Acesso permitido");
     * }
     *
     * Esse código compila.
     *
     * Porém:
     *
     * autorizado = true
     *
     * realiza uma atribuição.
     *
     * Portanto, autorizado passa a valer true e o bloco será executado.
     *
     * O correto seria:
     *
     * if (autorizado) {
     *     System.out.println("Acesso permitido");
     * }
     *
     *
     * 2. Utilizar o operador lógico errado.
     *
     * Imagine a regra:
     *
     * "Pode entrar se for maior de idade OU estiver acompanhado."
     *
     * Correto:
     *
     * idade >= 18 || acompanhado
     *
     * Se utilizarmos:
     *
     * idade >= 18 && acompanhado
     *
     * mudamos a regra.
     *
     * Agora a pessoa precisaria ser maior de idade E estar acompanhada.
     *
     *
     * 3. Criar uma condição diferente da regra desejada.
     *
     * Se a regra for:
     *
     * "Aprovado com nota maior ou igual a 7"
     *
     * devemos utilizar:
     *
     * nota >= 7
     *
     * e não:
     *
     * nota > 7
     *
     * Nesse segundo caso, exatamente 7 seria considerado falso.
     *
     *
     * 4. Acreditar que todos os caminhos são executados.
     *
     * Em uma estrutura if/else, apenas um dos dois caminhos será
     * escolhido para aquela avaliação.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine uma catraca na entrada de um evento. Antes de liberar
     * a passagem, existe uma regra:
     *
     * "A pessoa possui ingresso?"
     *
     * Se: true
     *
     * a catraca libera a entrada.
     *
     * Se: false
     *
     * a entrada permanece bloqueada.
     *
     * Podemos visualizar:
     *
     *                 POSSUI INGRESSO?
     *                        |
     *                +-------+-------+
     *                |               |
     *              true            false
     *                |               |
     *                v               v
     *       LIBERA ENTRADA       NEGA ENTRADA
     *
     * Uma estrutura condicional funciona de maneira semelhante:
     * ela avalia uma condição e escolhe qual caminho deverá seguir.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        // -------------------------------------------------
        // EXEMPLO 1 - CONDIÇÃO SIMPLES
        // -------------------------------------------------

        int idade = 20;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        }

        /*
         * O Java avalia:
         *
         * idade >= 18
         *
         * Substituindo o valor:
         *
         * 20 >= 18
         *
         * Resultado:
         *
         * true
         *
         * Como a condição é verdadeira, o bloco do if é executado.
         */


        // -------------------------------------------------
        // EXEMPLO 2 - DOIS CAMINHOS
        // -------------------------------------------------

        int idadeUsuario = 16;

        if (idadeUsuario >= 18) {

            System.out.println(
                    "Usuário maior de idade"
            );

        } else {

            System.out.println(
                    "Usuário menor de idade"
            );
        }

        /*
         * Aqui existem dois caminhos possíveis:
         *
         * idadeUsuario >= 18?
         *
         * true
         *   ↓
         * "Usuário maior de idade"
         *
         * false
         *   ↓
         * "Usuário menor de idade"
         *
         * Como:
         *
         * 16 >= 18
         *
         * resulta em:
         *
         * false
         *
         * o bloco else será executado.
         */


        // -------------------------------------------------
        // EXEMPLO 3 - OPERADORES LÓGICOS
        // -------------------------------------------------

        int idadeVisitante = 17;
        boolean acompanhado = true;

        if (idadeVisitante >= 18 || acompanhado) {

            System.out.println(
                    "Entrada permitida"
            );

        } else {

            System.out.println(
                    "Entrada negada"
            );
        }

        /*
         * Temos:
         *
         * idadeVisitante >= 18
         *
         * 17 >= 18
         *
         * false
         *
         * acompanhado:
         *
         * true
         *
         * Portanto:
         *
         * false || true
         *
         * Resultado:
         *
         * true
         *
         * Como utilizamos OU (||), basta uma das condições ser
         * verdadeira.
         */


        // -------------------------------------------------
        // EXEMPLO 4 - OPERADOR &&
        // -------------------------------------------------

        boolean possuiIngresso = true;
        boolean documentoValido = true;

        if (possuiIngresso && documentoValido) {

            System.out.println(
                    "Acesso ao evento autorizado"
            );

        } else {

            System.out.println(
                    "Acesso ao evento não autorizado"
            );
        }

        /*
         * Com &&, todas as condições precisam ser verdadeiras.
         *
         * true && true
         *
         * Resultado:
         *
         * true
         */


        // -------------------------------------------------
        // EXEMPLO 5 - CONDIÇÃO EM UMA VARIÁVEL
        // -------------------------------------------------

        int idadeCliente = 25;
        boolean possuiCadastro = true;

        boolean podeRealizarCompra =
                idadeCliente >= 18 && possuiCadastro;

        if (podeRealizarCompra) {

            System.out.println(
                    "Compra autorizada"
            );
        }

        /*
         * Uma expressão booleana também pode ser armazenada numa
         * variável.
         *
         * idadeCliente >= 18
         *
         * true
         *
         * possuiCadastro
         *
         * true
         *
         * true && true
         *
         * true
         *
         * Portanto:
         *
         * podeRealizarCompra = true
         */


        // -------------------------------------------------
        // ✔ EXEMPLO CORRETO
        // -------------------------------------------------

        double nota = 7.5;

        if (nota >= 7.0) {

            System.out.println(
                    "Aluno aprovado"
            );

        } else {

            System.out.println(
                    "Aluno não aprovado"
            );
        }

        /*
         * A regra foi definida como:
         *
         * "O aluno está aprovado se possuir nota maior ou igual a 7."
         *
         * Código:
         *
         * nota >= 7.0
         *
         * Como:
         *
         * 7.5 >= 7.0
         *
         * resulta em true:
         *
         * Aluno aprovado
         */


        // -------------------------------------------------
        // ❌ EXEMPLO DE CONDIÇÃO MAL FORMULADA
        // -------------------------------------------------

        double notaLimite = 7.0;

        if (notaLimite > 7.0) {

            System.out.println(
                    "Exemplo incorreto: aprovado"
            );

        } else {

            System.out.println(
                    "Exemplo incorreto: não aprovado"
            );
        }

        /*
         * Suponha que a regra real seja:
         *
         * "Nota maior OU IGUAL a 7 significa aprovação."
         *
         * Porém, utilizamos:
         *
         * notaLimite > 7.0
         *
         * Quando:
         *
         * notaLimite = 7.0
         *
         * temos:
         *
         * 7.0 > 7.0
         *
         * false
         *
         * O programa classificará o aluno como não aprovado.
         *
         * O código compila e executa normalmente.
         *
         * O problema está na lógica.
         *
         * O correto para essa regra seria:
         *
         * notaLimite >= 7.0
         */


        // -------------------------------------------------
        // EXEMPLO 6 - CUIDADO COM ATRIBUIÇÃO EM BOOLEAN
        // -------------------------------------------------

        boolean autorizado = false;

        /*
         * NÃO faça:
         *
         * if (autorizado = true) {
         *     System.out.println("Autorizado");
         * }
         *
         * O operador = faria uma atribuição.
         *
         * autorizado passaria a valer true.
         *
         * Para verificar diretamente uma variável boolean:
         */

        if (autorizado) {

            System.out.println(
                    "Usuário autorizado"
            );

        } else {

            System.out.println(
                    "Usuário não autorizado"
            );
        }


        // -------------------------------------------------
        // EXEMPLO 7 - O FLUXO CONTINUA
        // -------------------------------------------------

        int idadeAcesso = 17;
        boolean possuiAutorizacao = false;

        if (idadeAcesso >= 18 || possuiAutorizacao) {

            System.out.println(
                    "Acesso permitido"
            );

        } else {

            System.out.println(
                    "Acesso negado"
            );
        }

        System.out.println(
                "Verificação concluída"
        );

        /*
         * Temos:
         *
         * idadeAcesso >= 18
         *
         * false
         *
         * possuiAutorizacao
         *
         * false
         *
         * false || false
         *
         * false
         *
         * Portanto:
         *
         * "Acesso negado"
         *
         * Depois da estrutura condicional, a execução continua:
         *
         * "Verificação concluída"
         *
         * Estruturas condicionais alteram um trecho do caminho do
         * programa, mas a execução pode continuar normalmente depois
         * delas.
         */


        // -------------------------------------------------
        // VISÃO CONCEITUAL DE MÚLTIPLOS CAMINHOS
        // -------------------------------------------------

        double media = 6.0;

        /*
         * Imagine a seguinte regra:
         *
         * media >= 7
         *
         *     → Aprovado
         *
         * caso contrário:
         *
         * media >= 5
         *
         *     → Recuperação
         *
         * caso contrário:
         *
         *     → Reprovado
         *
         * Conceitualmente:
         *
         *                 media >= 7?
         *                     |
         *              +------+------+
         *              |             |
         *            true          false
         *              |             |
         *              v             v
         *          APROVADO      media >= 5?
         *                            |
         *                     +------+------+
         *                     |             |
         *                   true          false
         *                     |             |
         *                     v             v
         *               RECUPERAÇÃO      REPROVADO
         *
         * Estruturas como if, else if, else e switch permitem
         * representar diferentes tipos de decisão.
         *
         * Esses recursos serão aprofundados nos próximos conteúdos.
         */

        System.out.println(
                "Média utilizada no exemplo conceitual: " + media
        );
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Observe os valores:
     *
     * int idade = 16;
     * boolean acompanhado = false;
     *
     * E considere a condição:
     *
     * idade >= 18 || acompanhado
     *
     * Antes de executar qualquer código, responda:
     *
     * 1 → idade >= 18 é true ou false?
     *
     * 2 → acompanhado é true ou false?
     *
     * 3 → Qual será o resultado de:
     *
     *     false || false
     *
     * 4 → O programa deverá permitir ou negar a entrada?
     *
     *
     * Depois implemente:
     *
     * if (idade >= 18 || acompanhado) {
     *
     *     System.out.println("Entrada permitida");
     *
     * } else {
     *
     *     System.out.println("Entrada negada");
     * }
     *
     *
     * DESAFIO:
     *
     * Altere:
     *
     * acompanhado = true;
     *
     * Antes de executar novamente, tente prever o resultado.
     *
     * Depois modifique a regra:
     *
     * idade >= 18 && acompanhado
     *
     * Compare os resultados utilizando:
     *
     * ||
     *
     * e:
     *
     * &&
     *
     * Explique com suas próprias palavras por que o comportamento do
     * programa mudou.
     */

    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * Estruturas condicionais fazem parte das chamadas estruturas de
     * controle de fluxo.
     *
     * Elas permitem modificar o caminho que seria seguido por uma
     * execução puramente sequencial.
     *
     * Em Java, algumas estruturas utilizadas para decisões são:
     *
     * if
     *
     * if / else
     *
     * else if
     *
     * switch
     *
     * Também existe o operador condicional:
     *
     * ? :
     *
     * conhecido como operador ternário.
     *
     * Cada recurso possui características e situações apropriadas de
     * uso, que podem ser estudadas separadamente.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Estruturas condicionais permitem que um programa tome decisões
     * durante sua execução.
     *
     * Uma condição precisa produzir um valor booleano:
     *
     * true
     *
     * ou:
     *
     * false
     *
     * Exemplo:
     *
     * idade >= 18
     *
     * pode resultar em:
     *
     * true
     *
     * ou:
     *
     * false
     *
     * Esse resultado pode determinar qual caminho será executado.
     *
     * Também podemos combinar condições utilizando operadores lógicos:
     *
     * &&
     *
     * ||
     *
     * !
     *
     * Exemplo:
     *
     * idade >= 18 || acompanhado
     *
     * Se pelo menos uma condição for verdadeira, o resultado do OU
     * será verdadeiro.
     *
     * Também vimos que:
     *
     * =  representa atribuição.
     *
     * == representa comparação.
     *
     * E que uma condição tecnicamente válida ainda pode possuir um
     * erro de lógica.
     *
     * Por exemplo:
     *
     * nota > 7
     *
     * é diferente de:
     *
     * nota >= 7
     *
     * Estruturas condicionais são a base para compreender recursos
     * como:
     *
     * if
     * if/else
     * else if
     * switch
     *
     * que permitem construir programas capazes de seguir caminhos
     * diferentes de acordo com cada situação.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Java Language Specification - Statements:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-14.html
     *
     * - Java Language Specification - if Statement:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-14.html#jls-14.9
     *
     * - Java Language Specification - switch:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-14.html#jls-14.11
     */
}