package a01_logica_de_programacao;
/**
 * A10 - Operadores Lógicos
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A10
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Variáveis, Tipos de Dados, Operadores Relacionais
 * @proximos       Entrada de Dados
 *
 * @autor          Morcineck
 * @atualizado     27/08/2026
 * @tempoLeitura   15 min
 */
public class A10_OperadoresLogicos {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Operadores lógicos são utilizados para combinar ou inverter
     * expressões booleanas.
     *
     * Uma expressão booleana possui apenas dois resultados possíveis:
     * true  → verdadeiro
     * false → falso
     *
     * Na aula anterior, aprendemos que operadores relacionais podem
     * produzir esses resultados.
     *
     * Exemplo:
     * int idade = 20;
     * idade >= 18
     * Resultado: true
     *
     * Os operadores lógicos permitem combinar essa comparação com
     * outras condições.
     *
     * Os principais operadores lógicos utilizados em Java são:
     *
     * &&  → E   (AND)
     * ||  → OU  (OR)
     * !   → NÃO (NOT)
     *
     * Exemplo:
     * int idade = 20;
     * boolean possuiIngresso = true;
     *
     * boolean podeEntrar = idade >= 18 && possuiIngresso;
     *
     * Nesse caso, as duas condições precisam ser verdadeiras para que
     * podeEntrar receba true.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Os operadores lógicos trabalham com valores ou expressões
     * booleanas. Eles permitem responder perguntas que dependem
     * de mais de uma condição.
     *
     * -------------------------------------------------------------
     * && → OPERADOR E
     * -------------------------------------------------------------
     *
     * O operador && retorna true somente quando as duas condições
     * são verdadeiras.
     *
     * Tabela:
     *
     * true  && true   → true
     * true  && false  → false
     * false && true   → false
     * false && false  → false
     *
     * Exemplo:
     *
     * idade >= 18 && possuiIngresso
     *
     * Podemos ler: "A pessoa possui pelo menos 18 anos E possui ingresso?"
     *
     * -------------------------------------------------------------
     * || → OPERADOR OU
     * -------------------------------------------------------------
     *
     * O operador || retorna true quando pelo menos uma das condições
     * é verdadeira.
     *
     * Tabela:
     *
     * true  || true   → true
     * true  || false  → true
     * false || true   → true
     * false || false  → false
     *
     * Exemplo:
     *
     * administrador || moderador
     *
     * Podemos ler: "O usuário é administrador OU moderador?"
     *
     *
     * -------------------------------------------------------------
     * ! → OPERADOR NÃO
     * -------------------------------------------------------------
     *
     * O operador ! inverte um valor booleano.
     *
     * !true  → false
     * !false → true
     *
     * Exemplo:
     *
     * boolean bloqueado = false;
     *
     * !bloqueado
     *
     * Resultado: true
     *
     * Podemos ler a expressão como: "O usuário NÃO está bloqueado?"
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Em programas reais, muitas decisões dependem de várias
     * condições ao mesmo tempo.
     *
     * Imagine algumas regras:
     *
     * - uma pessoa precisa ter idade mínima E possuir ingresso;
     * - um usuário pode ser administrador OU moderador;
     * - uma conta precisa estar ativa E não estar bloqueada;
     * - uma compra pode ser paga com cartão OU PIX;
     * - um aluno precisa possuir nota mínima E frequência suficiente.
     *
     * Sem operadores lógicos, seria mais difícil representar essas
     * regras de forma clara.
     *
     * Eles permitem combinar resultados booleanos e construir
     * condições mais completas.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Utilize operadores lógicos quando precisar:
     *
     * - combinar duas ou mais condições;
     * - exigir que várias condições sejam verdadeiras;
     * - aceitar diferentes alternativas;
     * - inverter uma condição;
     * - representar regras de negócio;
     * - criar validações;
     * - controlar decisões do programa.
     *
     * Exemplos:
     *
     * idade >= 18 && possuiIngresso
     *
     * administrador || moderador
     *
     * !usuarioBloqueado
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Evite criar expressões lógicas muito grandes ou difíceis de
     * compreender.
     *
     * Exemplo:
     *
     * idade >= 18 && possuiIngresso && usuarioAtivo
     *         && !bloqueado && documentoValido && pagamentoConfirmado
     *
     * Embora uma expressão como essa possa ser válida, ela pode se
     * tornar difícil de ler e manter.
     *
     * Quando uma regra começa a ficar complexa, podemos dividir suas
     * partes em variáveis booleanas com nomes claros.
     *
     * Exemplo:
     *
     * boolean possuiIdadeMinima = idade >= 18;
     * boolean acessoValido = usuarioAtivo && !bloqueado;
     *
     * Isso ajuda a comunicar melhor a intenção do código.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Permitem combinar múltiplas condições.
     * - Facilitam a criação de regras e validações.
     * - Trabalham diretamente com valores booleanos.
     * - Permitem representar alternativas utilizando ||.
     * - Permitem exigir várias condições utilizando &&.
     * - Permitem inverter condições utilizando !.
     * - São fundamentais para estruturas condicionais e de repetição.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Expressões muito grandes podem dificultar a leitura.
     * - Utilizar o operador errado pode alterar completamente a regra.
     * - Muitas negações podem tornar uma condição confusa.
     * - A precedência dos operadores pode causar resultados
     *   inesperados quando não é compreendida corretamente.
     * - Condições mal estruturadas podem gerar erros de lógica sem
     *   causar erros de compilação.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Utilize nomes claros para variáveis booleanas.
     *
     * Exemplo:
     *
     * boolean possuiIdadeMinima = idade >= 18;
     *
     *
     * - Utilize parênteses quando eles ajudarem a deixar a intenção
     *   da expressão mais clara.
     *
     * Exemplo:
     *
     * boolean acesso =
     *         (administrador || moderador) && usuarioAtivo;
     *
     *
     * - Evite condições excessivamente grandes.
     *
     * - Prefira expressões que possam ser lidas como perguntas.
     *
     * Exemplo:
     *
     * boolean podeEntrar =
     *         possuiIdadeMinima && possuiIngresso;
     *
     *
     * - Utilize ! com cuidado para não tornar a leitura confusa.
     *
     * Exemplo:
     *
     * boolean bloqueado = false;
     *
     * if (!bloqueado)
     *
     * pode ser lido como:
     *
     * "Se NÃO estiver bloqueado..."
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * 1. Utilizar && quando a regra deveria aceitar alternativas.
     *
     * Imagine que um usuário possa acessar uma área se for
     * administrador OU moderador.
     *
     * Incorreto:
     *
     * administrador && moderador
     *
     * Essa expressão exige que o usuário seja administrador E
     * moderador ao mesmo tempo.
     *
     * Correto:
     *
     * administrador || moderador
     *
     *
     * 2. Utilizar || quando todas as condições são obrigatórias.
     *
     * Imagine que uma pessoa precise possuir idade mínima E ingresso.
     *
     * Incorreto:
     *
     * possuiIdadeMinima || possuiIngresso
     *
     * Isso permitiria que apenas uma das condições fosse suficiente.
     *
     * Correto:
     *
     * possuiIdadeMinima && possuiIngresso
     *
     *
     * 3. Esquecer que ! inverte o valor booleano.
     *
     * boolean bloqueado = true;
     *
     * !bloqueado
     *
     * resulta em false.
     *
     *
     * 4. Criar expressões complexas sem deixar clara a precedência.
     *
     * Exemplo:
     *
     * administrador || moderador && usuarioAtivo
     *
     * Em Java, && possui precedência maior que ||.
     *
     * Portanto, a expressão será interpretada como:
     *
     * administrador || (moderador && usuarioAtivo)
     *
     * Se a intenção for exigir que qualquer usuário esteja ativo,
     * podemos escrever:
     *
     * (administrador || moderador) && usuarioAtivo
     *
     * Os parênteses deixam a regra explícita e facilitam a leitura.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine a entrada de um evento. Para entrar, a pessoa precisa:
     *
     * Possuir ingresso E ter idade mínima.
     *
     * Isso representa:
     *
     * ingresso && idadeMinima
     *
     * Agora imagine que o pagamento possa ser realizado utilizando:
     *
     * cartão OU PIX.
     *
     * Isso representa:
     *
     * cartao || pix
     *
     * Por último, imagine que pessoas bloqueadas não possam entrar.
     *
     * Podemos verificar:
     *
     * !bloqueado
     *
     * Dessa forma:
     *
     * && → exige todas as condições.
     * || → aceita pelo menos uma alternativa.
     * !  → inverte uma condição.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        // -------------------------------------------------
        // OPERADOR E (&&)
        // -------------------------------------------------

        int idade = 20;
        boolean possuiIngresso = true;

        boolean podeEntrar =
                idade >= 18 && possuiIngresso;

        System.out.println(
                "Pode entrar no evento? " + podeEntrar
        );

        /*
         * idade >= 18
         *
         * 20 >= 18 → true
         *
         * possuiIngresso → true
         *
         * Portanto:
         *
         * true && true
         *
         * Resultado: true
         */


        // -------------------------------------------------
        // OPERADOR OU (||)
        // -------------------------------------------------

        boolean administrador = false;
        boolean moderador = true;

        boolean possuiPermissao =
                administrador || moderador;

        System.out.println(
                "Possui permissão? " + possuiPermissao
        );

        /*
         * administrador → false
         * moderador     → true
         *
         * Portanto:
         *
         * false || true
         *
         * Resultado: true
         */


        // -------------------------------------------------
        // OPERADOR NÃO (!)
        // -------------------------------------------------

        boolean bloqueado = false;

        boolean acessoLiberado = !bloqueado;

        System.out.println(
                "Acesso liberado? " + acessoLiberado
        );

        /*
         * bloqueado → false
         *
         * !false
         *
         * Resultado: true
         */


        // -------------------------------------------------
        // COMBINANDO OPERADORES
        // -------------------------------------------------

        boolean usuarioAtivo = true;

        boolean podeAcessarSistema =
                (administrador || moderador)
                        && usuarioAtivo
                        && !bloqueado;

        System.out.println(
                "Pode acessar o sistema? "
                        + podeAcessarSistema
        );

        /*
         * administrador || moderador
         *
         * false || true → true
         *
         * usuarioAtivo → true
         *
         * !bloqueado
         *
         * !false → true
         *
         * Portanto:
         *
         * true && true && true
         *
         * Resultado: true
         */


        // -------------------------------------------------
        // ✔ EXEMPLO CORRETO
        // -------------------------------------------------

        double nota = 8.0;
        double frequencia = 80.0;

        boolean possuiNotaMinima = nota >= 7.0;
        boolean possuiFrequenciaMinima = frequencia >= 75.0;

        boolean aprovado =
                possuiNotaMinima && possuiFrequenciaMinima;

        System.out.println(
                "Aluno aprovado? " + aprovado
        );

        /*
         * Para ser aprovado, o aluno precisa cumprir as DUAS regras:
         *
         * nota >= 7.0
         *
         * E
         *
         * frequencia >= 75.0
         *
         * Como:
         *
         * 8.0 >= 7.0  → true
         * 80.0 >= 75.0 → true
         *
         * temos:
         *
         * true && true
         *
         * Resultado: true
         */


        // -------------------------------------------------
        // ❌ EXEMPLO INCORRETO
        // -------------------------------------------------

        boolean aprovadoIncorretamente =
                possuiNotaMinima || possuiFrequenciaMinima;

        System.out.println(
                "Resultado da regra incorreta: "
                        + aprovadoIncorretamente
        );

        /*
         * O código compila e executa normalmente.
         *
         * Porém, o operador || não representa a regra desejada.
         *
         * Com ||, bastaria possuir nota mínima OU frequência mínima.
         *
         * Isso significa que um aluno poderia não atingir uma das
         * exigências e ainda assim ser considerado aprovado.
         *
         * Como nossa regra exige as duas condições, devemos utilizar:
         *
         * possuiNotaMinima && possuiFrequenciaMinima
         *
         * Esse é um exemplo de erro lógico: o programa funciona,
         * mas aplica uma regra diferente daquela que desejamos.
         */


        // -------------------------------------------------
        // PRECEDÊNCIA DOS OPERADORES
        // -------------------------------------------------

        boolean gerente = true;
        boolean supervisor = false;
        boolean contaAtiva = false;

        boolean resultadoSemParenteses =
                gerente || supervisor && contaAtiva;

        boolean resultadoComParenteses =
                (gerente || supervisor) && contaAtiva;

        System.out.println(
                "Sem parênteses: " + resultadoSemParenteses
        );

        System.out.println(
                "Com parênteses: " + resultadoComParenteses
        );

        /*
         * O operador && possui precedência maior que ||.
         *
         * Portanto:
         *
         * gerente || supervisor && contaAtiva
         *
         * é interpretado como:
         *
         * gerente || (supervisor && contaAtiva)
         *
         * Substituindo os valores:
         *
         * true || (false && false)
         *
         * true || false
         *
         * Resultado: true
         *
         *
         * Já:
         *
         * (gerente || supervisor) && contaAtiva
         *
         * primeiro resolve:
         *
         * true || false
         *
         * Resultado parcial: true
         *
         * Depois:
         *
         * true && false
         *
         * Resultado: false
         *
         * Os parênteses podem alterar a ordem da avaliação e também
         * ajudam a deixar explícita a intenção da expressão.
         */


        // -------------------------------------------------
        // CURTO-CIRCUITO
        // -------------------------------------------------

        boolean primeiraCondicao = false;

        boolean resultadoE =
                primeiraCondicao && verificarCondicao();

        System.out.println(
                "Resultado com &&: " + resultadoE
        );

        /*
         * Como primeiraCondicao é false, o Java já sabe que:
         *
         * false && qualquerValor
         *
         * sempre será false.
         *
         * Por isso, verificarCondicao() não será executado.
         *
         * Esse comportamento é chamado de curto-circuito.
         */


        boolean segundaCondicao = true;

        boolean resultadoOu =
                segundaCondicao || verificarCondicao();

        System.out.println(
                "Resultado com ||: " + resultadoOu
        );

        /*
         * Como segundaCondicao é true, o Java já sabe que:
         *
         * true || qualquerValor
         *
         * sempre será true.
         *
         * Portanto, verificarCondicao() também não será executado.
         */
    }


    /*
     * O método abaixo existe apenas para demonstrar o funcionamento
     * do curto-circuito nos exemplos anteriores.
     */
    public static boolean verificarCondicao() {

        System.out.println(
                "A segunda condição foi avaliada."
        );

        return true;
    }


    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie um programa que represente o acesso de uma pessoa a uma
     * área exclusiva de um evento.
     *
     * Crie as seguintes variáveis:
     *
     * int idade = 20;
     * boolean possuiIngresso = true;
     * boolean ingressoValido = true;
     * boolean bloqueado = false;
     *
     * Depois crie expressões booleanas para descobrir:
     *
     * 1. Se a pessoa possui pelo menos 18 anos.
     *
     * 2. Se possui ingresso E o ingresso é válido.
     *
     * 3. Se a pessoa NÃO está bloqueada.
     *
     * 4. Se todas as condições necessárias para permitir a entrada
     *    são verdadeiras.
     *
     * Armazene os resultados em variáveis booleanas e exiba cada
     * resultado utilizando System.out.println().
     *
     * DESAFIO:
     *
     * Adicione duas novas variáveis:
     *
     * boolean administrador = false;
     * boolean convidadoEspecial = true;
     *
     * Crie uma regra em que a pessoa possa acessar uma área VIP caso
     * seja administrador OU convidado especial, mas somente se NÃO
     * estiver bloqueada.
     *
     * Tente prever o resultado antes de executar o programa.
     *
     * Depois altere os valores das variáveis e observe como cada
     * operador modifica o resultado final.
     */

    /*
     * CURIOSIDADES (opcional)
     * -------------------------------------------------------------
     * Os operadores && e || utilizam uma técnica chamada avaliação
     * de curto-circuito.
     *
     * Com &&, se a primeira condição for false, o Java não precisa
     * avaliar a segunda, pois o resultado obrigatoriamente será false.
     *
     * Exemplo:
     *
     * false && segundaCondicao
     *
     * Já com ||, se a primeira condição for true, o Java também não
     * precisa avaliar a segunda, pois o resultado obrigatoriamente
     * será true.
     *
     * Exemplo:
     *
     * true || segundaCondicao
     *
     * Esse comportamento pode evitar avaliações desnecessárias e
     * também é utilizado em situações nas quais a segunda expressão
     * só deve ser avaliada caso a primeira permita.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Operadores lógicos permitem combinar ou inverter expressões
     * booleanas.
     *
     * Os principais operadores apresentados nesta aula foram:
     *
     * && → E
     *      Retorna true somente quando as duas condições são
     *      verdadeiras.
     *
     * || → OU
     *      Retorna true quando pelo menos uma condição é verdadeira.
     *
     * !  → NÃO
     *      Inverte o valor booleano de uma expressão.
     *
     * Operadores relacionais podem criar condições booleanas e
     * operadores lógicos podem combinar essas condições para formar
     * regras mais complexas.
     *
     * Também vimos que && possui precedência maior que || e que
     * parênteses podem ser utilizados para deixar a intenção da
     * expressão mais clara.
     *
     * Por fim, && e || utilizam avaliação de curto-circuito, podendo
     * evitar a avaliação desnecessária de outras expressões.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Java Language Specification - Conditional-And Operator &&:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html#jls-15.23
     *
     * - Java Language Specification - Conditional-Or Operator ||:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html#jls-15.24
     *
     * - Java Language Specification - Logical Complement Operator !:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html#jls-15.15.6
     */
}