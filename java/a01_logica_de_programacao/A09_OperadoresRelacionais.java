package a01_logica_de_programacao;

/**
 * A09 - Operadores Relacionais
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A09
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Variáveis, Tipos de Dados, Operadores Aritméticos
 * @proximos       Operadores Lógicos
 *
 * @autor          Morcineck
 * @atualizado     25/08/2026
 * @tempoLeitura   15 min
 */
public class A09_OperadoresRelacionais {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Operadores relacionais são símbolos utilizados para comparar
     * dois valores ou expressões.
     *
     * O resultado de uma comparação em Java é sempre um valor do tipo
     * boolean, ou seja, true (verdadeiro) ou false (falso).
     *
     * Os operadores relacionais disponíveis em Java são:
     *
     * ==  igual a
     * !=  diferente de
     * >   maior que
     * <   menor que
     * >=  maior ou igual a
     * <=  menor ou igual a
     *
     * Exemplo:
     *
     * int idade = 20;
     * boolean maiorDeIdade = idade >= 18;
     *
     * Como 20 é maior ou igual a 18, a expressão resulta em true.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Um operador relacional recebe dois operandos e compara um com
     * o outro.
     *
     * Exemplo:
     *
     * 10 > 5
     *
     * Nesse caso:
     *
     * 10 e 5 → operandos
     * >      → operador relacional
     * true   → resultado da comparação
     *
     * Podemos imaginar que o Java transforma a expressão em uma
     * pergunta:
     *
     * "10 é maior que 5?"
     *
     * Como a resposta é verdadeira, o resultado será true.
     *
     * Essas comparações podem envolver valores escritos diretamente
     * no código, variáveis ou resultados de outras expressões.
     *
     * Exemplo:
     *
     * int idade = 18;
     * boolean podeEntrar = idade >= 18;
     *
     * A expressão idade >= 18 é avaliada primeiro e seu resultado
     * booleano é armazenado na variável podeEntrar.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Programas precisam constantemente comparar informações para
     * conseguir tomar decisões.
     *
     * Imagine um sistema que precisa descobrir:
     *
     * - se uma pessoa possui idade suficiente para acessar algo;
     * - se uma senha informada está correta;
     * - se um produto possui estoque disponível;
     * - se uma nota atingiu o valor mínimo;
     * - se dois números são iguais;
     * - se um limite foi ultrapassado.
     *
     * Os operadores relacionais permitem transformar essas comparações
     * em valores true ou false.
     *
     * Esses resultados serão fundamentais para estruturas de decisão,
     * como if e else, e também para estruturas de repetição.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Utilize operadores relacionais quando precisar comparar valores
     * ou expressões.
     *
     * Exemplos:
     *
     * - verificar se uma idade é maior ou igual a 18;
     * - descobrir se dois números são iguais;
     * - verificar se um valor é diferente de outro;
     * - comparar preços;
     * - verificar limites;
     * - comparar notas;
     * - definir condições para estruturas de decisão;
     * - definir condições para estruturas de repetição.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Evite comparações desnecessariamente complexas quando uma
     * expressão mais simples comunica a mesma intenção.
     *
     * Exemplo:
     *
     * boolean ativo = true;
     *
     * Em vez de:
     *
     * if (ativo == true)
     *
     * normalmente podemos escrever:
     *
     * if (ativo)
     *
     * Também devemos tomar cuidado ao utilizar == e != com objetos.
     *
     * Para tipos primitivos, esses operadores comparam seus valores.
     * Com referências a objetos, == e != verificam se as referências
     * apontam ou não para o mesmo objeto.
     *
     * Por isso, comparar o conteúdo de objetos, como String, pode
     * exigir métodos específicos, como equals().
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Permitem comparar valores de forma simples.
     * - Produzem resultados booleanos fáceis de utilizar.
     * - São essenciais para tomadas de decisão.
     * - Permitem criar condições para estruturas de repetição.
     * - Tornam regras e condições do programa mais expressivas.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Comparações mal formuladas podem produzir resultados incorretos.
     * - É comum iniciantes confundirem = com ==.
     * - Comparações com objetos exigem atenção especial.
     * - Condições excessivamente complexas podem prejudicar a
     *   legibilidade do código.
     * - Comparações de igualdade com números de ponto flutuante podem
     *   exigir cuidados devido à representação desses valores.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Utilize nomes de variáveis que expressem claramente a condição.
     *
     * - Mantenha comparações simples e fáceis de entender.
     *
     * - Lembre-se de que = realiza atribuição e == realiza comparação.
     *
     * - Ao comparar Strings pelo conteúdo, utilize equals() em vez
     *   de ==.
     *
     * - Evite escrever == true ou == false quando o próprio boolean
     *   já expressa a condição claramente.
     *
     * Exemplo:
     *
     * boolean usuarioAtivo = true;
     *
     * Preferível:
     *
     * if (usuarioAtivo)
     *
     * Em vez de:
     *
     * if (usuarioAtivo == true)
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * 1. Confundir = com ==.
     *
     * =  significa atribuição.
     * == significa comparação.
     *
     * Exemplo:
     *
     * int idade = 18;
     *
     * Aqui estamos atribuindo 18 à variável idade.
     *
     * Já:
     *
     * idade == 18
     *
     * verifica se idade possui o valor 18.
     *
     *
     * 2. Confundir > com >=.
     *
     * 18 > 18
     *
     * resulta em false, porque 18 não é maior que 18.
     *
     * Já:
     *
     * 18 >= 18
     *
     * resulta em true, porque 18 é igual a 18.
     *
     *
     * 3. Utilizar == para comparar o conteúdo de Strings.
     *
     * String nome1 = new String("Java");
     * String nome2 = new String("Java");
     *
     * nome1 == nome2
     *
     * resulta em false nesse exemplo.
     *
     * Isso acontece porque ==, quando utilizado com referências,
     * verifica se elas apontam para o mesmo objeto.
     *
     * Para comparar o conteúdo:
     *
     * nome1.equals(nome2)
     *
     * resulta em true.
     *
     *
     * 4. Inverter os operadores e alterar o significado da regra.
     *
     * Se a regra diz:
     *
     * "A idade mínima é 18 anos"
     *
     * podemos representar:
     *
     * idade >= 18
     *
     * Utilizar idade <= 18 representaria uma regra diferente.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine uma balança utilizada para comparar dois objetos.
     *
     * Ao colocar um objeto de cada lado, podemos perguntar:
     *
     * - eles possuem o mesmo peso?
     * - o da esquerda é mais pesado?
     * - o da direita é mais pesado?
     * - possuem pesos diferentes?
     *
     * Os operadores relacionais funcionam de maneira semelhante.
     *
     * Eles colocam dois valores em comparação e respondem à pergunta
     * com apenas duas possibilidades:
     *
     * true  → a relação é verdadeira.
     * false → a relação é falsa.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 5;

        // -------------------------------------------------
        // IGUAL A (==)
        // -------------------------------------------------

        boolean saoIguais = numero1 == numero2;

        System.out.println("10 é igual a 5? " + saoIguais);

        // Resultado: false


        // -------------------------------------------------
        // DIFERENTE DE (!=)
        // -------------------------------------------------

        boolean saoDiferentes = numero1 != numero2;

        System.out.println("10 é diferente de 5? " + saoDiferentes);

        // Resultado: true


        // -------------------------------------------------
        // MAIOR QUE (>)
        // -------------------------------------------------

        boolean maiorQue = numero1 > numero2;

        System.out.println("10 é maior que 5? " + maiorQue);

        // Resultado: true


        // -------------------------------------------------
        // MENOR QUE (<)
        // -------------------------------------------------

        boolean menorQue = numero1 < numero2;

        System.out.println("10 é menor que 5? " + menorQue);

        // Resultado: false


        // -------------------------------------------------
        // MAIOR OU IGUAL A (>=)
        // -------------------------------------------------

        int idade = 18;

        boolean possuiIdadeMinima = idade >= 18;

        System.out.println(
                "Possui idade mínima? " + possuiIdadeMinima
        );

        // Resultado: true


        // -------------------------------------------------
        // MENOR OU IGUAL A (<=)
        // -------------------------------------------------

        int quantidadeProdutos = 5;
        int limiteProdutos = 10;

        boolean dentroDoLimite =
                quantidadeProdutos <= limiteProdutos;

        System.out.println(
                "Quantidade dentro do limite? " + dentroDoLimite
        );

        // Resultado: true


        // -------------------------------------------------
        // ✔ EXEMPLO CORRETO
        // -------------------------------------------------

        double notaAluno = 7.5;
        double notaMinima = 7.0;

        boolean aprovado = notaAluno >= notaMinima;

        System.out.println("Aluno aprovado? " + aprovado);

        /*
         * A expressão representa claramente a regra:
         *
         * "A nota do aluno é maior ou igual à nota mínima?"
         *
         * 7.5 >= 7.0
         *
         * Resultado:
         *
         * true
         */


        // -------------------------------------------------
        // ❌ EXEMPLO INCORRETO
        // -------------------------------------------------

        boolean resultadoIncorreto = notaAluno <= notaMinima;

        System.out.println(
                "Resultado da comparação equivocada: "
                        + resultadoIncorreto
        );

        /*
         * O código compila e executa normalmente.
         *
         * Porém, a comparação não representa a regra desejada.
         *
         * Se queremos descobrir se o aluno atingiu a nota mínima,
         * precisamos perguntar:
         *
         * notaAluno >= notaMinima
         *
         * e não:
         *
         * notaAluno <= notaMinima
         *
         * Esse tipo de erro é perigoso porque não necessariamente gera
         * um erro de compilação. O programa funciona, mas aplica uma
         * regra incorreta.
         */


        // -------------------------------------------------
        // DIFERENÇA ENTRE = E ==
        // -------------------------------------------------

        int valor = 20; // = realiza uma atribuição

        boolean valorIgualA20 = valor == 20; // == compara

        System.out.println(
                "Valor é igual a 20? " + valorIgualA20
        );


        // -------------------------------------------------
        // CUIDADO AO COMPARAR STRINGS
        // -------------------------------------------------

        String linguagem1 = new String("Java");
        String linguagem2 = new String("Java");

        boolean mesmaReferencia = linguagem1 == linguagem2;
        boolean mesmoConteudo = linguagem1.equals(linguagem2);

        System.out.println(
                "Mesma referência? " + mesmaReferencia
        );

        System.out.println(
                "Mesmo conteúdo? " + mesmoConteudo
        );

        /*
         * Resultado esperado:
         *
         * Mesma referência? false
         * Mesmo conteúdo? true
         *
         * As duas Strings possuem o mesmo conteúdo, mas são objetos
         * diferentes.
         *
         * == verifica a identidade das referências.
         * equals() compara o conteúdo das Strings.
         *
         * O objetivo aqui é apenas alertar sobre essa diferença.
         * O funcionamento de objetos e referências será aprofundado
         * posteriormente na trilha.
         */
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie um programa que represente a entrada de uma pessoa em um
     * evento.
     *
     * Crie as seguintes variáveis:
     *
     * int idade = 20;
     * int idadeMinima = 18;
     * int ingressosDisponiveis = 5;
     *
     * Depois utilize operadores relacionais para descobrir:
     *
     * 1. Se a pessoa possui a idade mínima necessária.
     *
     * 2. Se existem ingressos disponíveis, comparando a quantidade
     *    com zero.
     *
     * 3. Se a idade da pessoa é exatamente igual à idade mínima.
     *
     * 4. Se a idade da pessoa é diferente de 18.
     *
     * Armazene cada resultado em uma variável boolean e exiba os
     * resultados utilizando System.out.println().
     *
     * DESAFIO:
     *
     * Altere os valores das variáveis e tente prever o resultado de
     * cada comparação ANTES de executar o programa.
     *
     * Depois execute o código e confira se suas respostas estavam
     * corretas.
     */

    /*
     * CURIOSIDADES (opcional)
     * -------------------------------------------------------------
     * Os operadores relacionais normalmente aparecem dentro de
     * estruturas como if, while e for.
     *
     * Exemplo:
     *
     * if (idade >= 18) {
     *     System.out.println("Entrada permitida.");
     * }
     *
     * O if não está recebendo diretamente "idade >= 18" como algo
     * especial.
     *
     * Primeiro, a expressão é avaliada:
     *
     * idade >= 18
     *
     * e produz:
     *
     * true ou false
     *
     * Esse valor booleano é o que determina se o bloco do if será
     * executado.
     *
     * Essa relação ficará ainda mais clara nas próximas aulas sobre
     * operadores lógicos e estruturas condicionais.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Operadores relacionais são utilizados para comparar valores e
     * produzem sempre um resultado booleano: true ou false.
     *
     * Java possui os operadores ==, !=, >, <, >= e <=. Eles são
     * fundamentais para criar condições que posteriormente serão
     * utilizadas em estruturas de decisão e repetição.
     *
     * Também é importante lembrar que = realiza atribuição, enquanto
     * == realiza comparação, e que a comparação de objetos exige
     * cuidados diferentes da comparação de tipos primitivos.
     */

    /*
     * REFERÊNCIAS (opcional)
     * -------------------------------------------------------------
     * - Java Language Specification - Equality Operators:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html#jls-15.21
     *
     * - Java Language Specification - Relational Operators:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html#jls-15.20
     *
     * - Documentação da classe String:
     *   https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html
     */
}