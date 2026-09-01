package a01_logica_de_programacao;

/**
 * A15 - if
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A15
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Operadores Relacionais, Operadores Lógicos,
 *                 Estruturas Condicionais
 *
 * @autor          Morcineck
 * @atualizado     01/09/2026
 * @tempoLeitura   20 min
 */
public class A15_If {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * O if é uma estrutura condicional utilizada para executar um
     * bloco de código somente quando determinada condição for
     * verdadeira.
     *
     * A palavra "if" significa "se".
     *
     * Podemos pensar da seguinte maneira:
     *
     * SE uma condição for verdadeira:
     *
     *     execute determinada instrução.
     *
     * Exemplo:
     *
     * if (idade >= 18) {
     *     System.out.println("Maior de idade");
     * }
     *
     * Podemos ler:
     *
     * "SE idade for maior ou igual a 18,
     * exiba 'Maior de idade'."
     *
     * Se a condição for false, o bloco do if é simplesmente ignorado
     * e a execução continua normalmente depois dele.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * A estrutura básica do if é:
     *
     * if (condicao) {
     *     instruções;
     * }
     *
     * Temos três partes importantes:
     *
     * 1 → A palavra-chave if.
     *
     * 2 → Uma condição entre parênteses.
     *
     * 3 → Um bloco de código entre chaves.
     *
     *
     * Exemplo:
     *
     * int idade = 20;
     *
     * if (idade >= 18) {
     *     System.out.println("Acesso permitido");
     * }
     *
     *
     * Primeiro o Java avalia: idade >= 18
     * Substituindo: 20 >= 18
     *
     * Resultado: true
     *
     * Como a condição é verdadeira, o bloco é executado.
     *
     * Se tivéssemos:
     *
     * int idade = 16;
     *
     * teríamos: 16 >= 18
     *
     * false
     *
     * Nesse caso, o bloco do if seria ignorado.
     */

    /*
     * A CONDIÇÃO PRECISA SER BOOLEAN
     * -------------------------------------------------------------
     * A condição utilizada pelo if precisa resultar em:
     *
     * true ou false
     *
     * Por exemplo:
     *
     * idade >= 18
     *
     * é uma expressão válida porque o operador >= produz um resultado
     * booleano.
     *
     * Também podemos utilizar diretamente uma variável boolean:
     *
     * boolean possuiIngresso = true;
     *
     * if (possuiIngresso) {
     *     System.out.println("Ingresso válido");
     * }
     *
     * Como possuiIngresso já contém true ou false, não precisamos
     * compará-la com outro valor.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Nem todas as instruções de um programa devem ser executadas em
     * todas as situações.
     *
     * Algumas operações dependem de uma condição.
     *
     * Exemplos:
     *
     * - mostrar um aviso se a temperatura estiver alta;
     * - permitir uma ação se o usuário estiver autenticado;
     * - aplicar um desconto se determinado valor for atingido;
     * - exibir uma mensagem se uma nota alcançar a média;
     * - liberar acesso se uma pessoa possuir autorização.
     *
     * O if permite representar essas regras no código.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Utilize if quando uma ação precisar acontecer SOMENTE se uma
     * condição for verdadeira.
     *
     * Exemplo:
     *
     * double valorCompra = 500.0;
     *
     * if (valorCompra >= 300.0) {
     *     System.out.println("Cliente ganhou frete grátis");
     * }
     *
     * Se o valor atingir a condição, a mensagem será exibida.
     *
     * Caso contrário, nenhuma ação é necessária.
     *
     * Esse é um cenário apropriado para utilizar apenas if.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Não utilize if quando uma instrução deve acontecer sempre.
     *
     * Exemplo:
     *
     * System.out.println("Sistema iniciado");
     *
     * Se essa mensagem precisa ser exibida em todas as execuções, não
     * existe necessidade de uma condição.
     *
     * Também devemos evitar criar condições desnecessariamente
     * complicadas quando uma expressão mais simples representa a mesma
     * regra.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Permite executar código somente quando necessário.
     * - Representa regras e decisões do programa.
     * - Pode trabalhar com condições simples ou compostas.
     * - Integra operadores relacionais e operadores lógicos.
     * - Torna o comportamento do programa dependente dos dados.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Muitos ifs podem dificultar a leitura do código.
     * - Condições complexas podem gerar erros de lógica.
     * - Falta de chaves pode causar comportamentos inesperados.
     * - Uma condição mal formulada pode produzir um resultado errado
     *   mesmo que o código compile normalmente.
     */

    /*
     * CONDIÇÕES SIMPLES
     * -------------------------------------------------------------
     * Uma condição simples possui apenas uma verificação.
     *
     * Exemplo:
     *
     * idade >= 18
     *
     * Em um if:
     *
     * if (idade >= 18) {
     *     System.out.println("Maior de idade");
     * }
     *
     * Outros exemplos:
     *
     * saldo > 0
     *
     * nota >= 7
     *
     * temperatura > 30
     *
     * quantidade == 0
     */

    /*
     * CONDIÇÕES COMPOSTAS
     * -------------------------------------------------------------
     * Também podemos combinar duas ou mais condições utilizando
     * operadores lógicos.
     *
     *
     * OPERADOR &&
     *
     * Exige que todas as condições sejam verdadeiras.
     *
     * Exemplo:
     *
     * if (idade >= 18 && possuiIngresso) {
     *     System.out.println("Entrada autorizada");
     * }
     *
     *
     * OPERADOR ||
     *
     * Exige que pelo menos uma condição seja verdadeira.
     *
     * Exemplo:
     *
     * if (idade >= 18 || acompanhado) {
     *     System.out.println("Entrada permitida");
     * }
     *
     *
     * OPERADOR !
     *
     * Inverte um valor booleano.
     *
     * Exemplo:
     *
     * if (!bloqueado) {
     *     System.out.println("Usuário pode continuar");
     * }
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * 1. Utilize chaves mesmo quando houver apenas uma instrução.
     *
     * Prefira:
     *
     * if (idade >= 18) {
     *     System.out.println("Maior de idade");
     * }
     *
     * em vez de:
     *
     * if (idade >= 18)
     *     System.out.println("Maior de idade");
     *
     *
     * 2. Utilize nomes de variáveis claros.
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
     * 3. Evite comparar boolean com true quando não for necessário.
     *
     * Prefira:
     *
     * if (possuiAutorizacao) {
     * }
     *
     * em vez de:
     *
     * if (possuiAutorizacao == true) {
     * }
     *
     *
     * 4. Escreva condições que expressem claramente a regra.
     *
     * Exemplo:
     *
     * boolean podeEntrar =
     *         idade >= 18 && possuiIngresso;
     *
     * if (podeEntrar) {
     *     System.out.println("Entrada autorizada");
     * }
     *
     * Um nome significativo pode facilitar a compreensão de condições
     * maiores.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     *
     * 1. CONFUNDIR = COM ==
     *
     * Em Java:
     *
     * =  significa atribuição.
     *
     * == significa comparação.
     *
     * Exemplo:
     *
     * int idade = 18;
     *
     * Aqui estamos ATRIBUINDO o valor 18.
     *
     * Já:
     *
     * idade == 18
     *
     * pergunta se idade possui o valor 18.
     *
     *
     * Algo como:
     *
     * if (idade = 18) {
     * }
     *
     * não compila.
     *
     * Isso acontece porque:
     *
     * idade = 18
     *
     * produz um valor inteiro, enquanto o if exige uma expressão
     * boolean.
     *
     *
     * Existe um caso ainda mais perigoso envolvendo boolean:
     *
     * boolean autorizado = false;
     *
     * if (autorizado = true) {
     *     System.out.println("Acesso autorizado");
     * }
     *
     * Esse código compila.
     *
     * Porém:
     *
     * autorizado = true
     *
     * altera o valor da variável para true.
     *
     * Consequentemente, o if será executado.
     *
     * O correto seria:
     *
     * if (autorizado) {
     *     System.out.println("Acesso autorizado");
     * }
     */


    /*
     * 2. ESQUECER AS CHAVES
     * -------------------------------------------------------------
     * Java permite utilizar um if sem chaves quando existe apenas uma
     * instrução controlada por ele.
     *
     * Exemplo:
     *
     * if (temperatura > 30)
     *     System.out.println("Temperatura elevada");
     *
     * Embora seja permitido, isso pode causar confusão.
     *
     * Observe:
     *
     * if (temperatura > 30)
     *     System.out.println("Temperatura elevada");
     *     System.out.println("Ligar refrigeração");
     *
     * Pela indentação, pode parecer que as duas mensagens pertencem ao
     * if.
     *
     * Porém, apenas a primeira instrução pertence.
     *
     * Para o Java, isso equivale a:
     *
     * if (temperatura > 30) {
     *     System.out.println("Temperatura elevada");
     * }
     *
     * System.out.println("Ligar refrigeração");
     *
     * Portanto, "Ligar refrigeração" será exibido independentemente
     * do resultado da condição.
     */

    /*
     * 3. USAR O OPERADOR LÓGICO ERRADO
     * -------------------------------------------------------------
     * Considere a regra:
     *
     * "A pessoa precisa ser maior de idade E possuir ingresso."
     *
     * Correto:
     *
     * idade >= 18 && possuiIngresso
     *
     * Se escrevermos:
     *
     * idade >= 18 || possuiIngresso
     *
     * estaremos permitindo que apenas uma das duas condições seja
     * suficiente.
     *
     * O código pode compilar normalmente, mas não representa a regra
     * desejada.
     */

    /*
     * 4. ERRAR O LIMITE DA CONDIÇÃO
     * -------------------------------------------------------------
     * Considere:
     *
     * "A promoção vale para compras maiores ou iguais a R$ 100."
     *
     * Correto:
     *
     * valorCompra >= 100
     *
     * Incorreto para essa regra:
     *
     * valorCompra > 100
     *
     * Nesse segundo caso, exatamente R$ 100 não atenderia à condição.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine uma luz automática que possui um sensor.
     *
     * A regra é:
     *
     * "SE estiver escuro, acenda a luz."
     *
     * Podemos representar:
     *
     *                  está escuro?
     *                       |
     *                 +-----+-----+
     *                 |           |
     *               true        false
     *                 |           |
     *                 v           |
     *            ACENDER LUZ      |
     *                 |           |
     *                 +-----+-----+
     *                       |
     *                       v
     *                   continuar
     *
     * Perceba que não precisamos obrigatoriamente dizer o que fazer
     * quando a condição for false.
     *
     * O if pode simplesmente não executar nenhuma ação.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        // -------------------------------------------------
        // EXEMPLO 1 - IF COM CONDIÇÃO SIMPLES
        // -------------------------------------------------

        int idade = 20;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        }

        /*
         * Avaliação:
         *
         * 20 >= 18
         *
         * true
         *
         * Portanto, o bloco é executado.
         */


        // -------------------------------------------------
        // EXEMPLO 2 - CONDIÇÃO FALSE
        // -------------------------------------------------

        int temperatura = 25;

        if (temperatura > 30) {
            System.out.println("Temperatura elevada");
        }

        System.out.println("Sistema funcionando");

        /*
         * Avaliação:
         *
         * 25 > 30
         *
         * false
         *
         * "Temperatura elevada" não será exibido.
         *
         * Porém:
         *
         * "Sistema funcionando"
         *
         * está fora do if.
         *
         * Portanto, será executado normalmente.
         */


        // -------------------------------------------------
        // EXEMPLO 3 - VARIÁVEL BOOLEAN
        // -------------------------------------------------

        boolean possuiIngresso = true;

        if (possuiIngresso) {
            System.out.println("Ingresso válido");
        }

        /*
         * Não precisamos escrever:
         *
         * possuiIngresso == true
         *
         * porque a própria variável já possui um valor boolean.
         */


        // -------------------------------------------------
        // EXEMPLO 4 - OPERADOR &&
        // -------------------------------------------------

        int idadeVisitante = 25;
        boolean documentoValido = true;

        if (idadeVisitante >= 18 && documentoValido) {
            System.out.println("Acesso autorizado");
        }

        /*
         * Temos:
         *
         * idadeVisitante >= 18
         *
         * true
         *
         * documentoValido
         *
         * true
         *
         * Portanto:
         *
         * true && true
         *
         * true
         *
         * O bloco será executado.
         */


        // -------------------------------------------------
        // EXEMPLO 5 - OPERADOR ||
        // -------------------------------------------------

        int idadeParticipante = 16;
        boolean acompanhado = true;

        if (idadeParticipante >= 18 || acompanhado) {
            System.out.println("Entrada permitida");
        }

        /*
         * Temos:
         *
         * 16 >= 18
         *
         * false
         *
         * acompanhado
         *
         * true
         *
         * Portanto:
         *
         * false || true
         *
         * true
         *
         * O bloco será executado.
         */


        // -------------------------------------------------
        // EXEMPLO 6 - OPERADOR !
        // -------------------------------------------------

        boolean bloqueado = false;

        if (!bloqueado) {
            System.out.println("Usuário pode continuar");
        }

        /*
         * bloqueado contém:
         *
         * false
         *
         * Ao utilizar:
         *
         * !bloqueado
         *
         * temos:
         *
         * !false
         *
         * true
         *
         * Portanto, o if será executado.
         */


        // -------------------------------------------------
        // EXEMPLO 7 - CONDIÇÃO ARMAZENADA
        // -------------------------------------------------

        int idadeCliente = 30;
        boolean cadastroAtivo = true;

        boolean podeComprar =
                idadeCliente >= 18 && cadastroAtivo;

        if (podeComprar) {
            System.out.println("Compra liberada");
        }

        /*
         * A expressão:
         *
         * idadeCliente >= 18 && cadastroAtivo
         *
         * é avaliada primeiro.
         *
         * Seu resultado é armazenado em:
         *
         * podeComprar
         *
         * Depois o if utiliza esse valor.
         */


        // -------------------------------------------------
        // ✔ EXEMPLO CORRETO
        // -------------------------------------------------

        double valorCompra = 150.0;

        if (valorCompra >= 100.0) {
            System.out.println("Promoção aplicada");
        }

        /*
         * A regra é:
         *
         * "Compras maiores OU IGUAIS a R$ 100 participam da
         * promoção."
         *
         * Portanto:
         *
         * valorCompra >= 100.0
         *
         * representa corretamente a regra.
         */


        // -------------------------------------------------
        // ❌ EXEMPLO DE LÓGICA INCORRETA
        // -------------------------------------------------

        double valorLimite = 100.0;

        if (valorLimite > 100.0) {
            System.out.println(
                    "Exemplo incorreto: promoção aplicada"
            );
        }

        /*
         * Suponha novamente que a regra seja:
         *
         * "Compras maiores OU IGUAIS a R$ 100 participam."
         *
         * Porém, foi utilizado:
         *
         * valorLimite > 100.0
         *
         * Como:
         *
         * 100 > 100
         *
         * false
         *
         * nenhuma mensagem será exibida.
         *
         * O programa compila normalmente.
         *
         * O erro está na lógica.
         */


        // -------------------------------------------------
        // ❌ EXEMPLO - AUSÊNCIA DE CHAVES
        // -------------------------------------------------

        int temperaturaAmbiente = 25;

        if (temperaturaAmbiente > 30)
            System.out.println(
                    "Temperatura ambiente elevada"
            );

        System.out.println(
                "Sistema de refrigeração verificado"
        );

        /*
         * Sem chaves, somente a PRIMEIRA instrução após o if pertence
         * à estrutura condicional.
         *
         * Como:
         *
         * 25 > 30
         *
         * false
         *
         * a primeira mensagem não aparece.
         *
         * Porém:
         *
         * "Sistema de refrigeração verificado"
         *
         * será exibida porque está fora do if.
         *
         * É por isso que recomendamos utilizar chaves.
         */


        // -------------------------------------------------
        // ✔ FORMA RECOMENDADA
        // -------------------------------------------------

        int temperaturaServidor = 35;

        if (temperaturaServidor > 30) {

            System.out.println(
                    "Temperatura do servidor elevada"
            );

            System.out.println(
                    "Verificar sistema de refrigeração"
            );
        }

        /*
         * Agora fica explícito que as duas instruções pertencem ao
         * mesmo bloco.
         */


        // -------------------------------------------------
        // EXEMPLO 10 - O PROGRAMA CONTINUA
        // -------------------------------------------------

        int pontos = 50;

        if (pontos >= 100) {
            System.out.println("Nova recompensa liberada");
        }

        System.out.println("Pontuação verificada");

        /*
         * Como:
         *
         * 50 >= 100
         *
         * false
         *
         * "Nova recompensa liberada" não aparece.
         *
         * Mas a execução continua e:
         *
         * "Pontuação verificada"
         *
         * será exibida.
         */
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie um programa com:
     *
     * double saldo = 500.0;
     * double valorCompra = 300.0;
     *
     * Utilizando APENAS if, verifique se o saldo é suficiente para
     * realizar a compra.
     *
     * Se:
     *
     * saldo >= valorCompra
     *
     * exiba:
     *
     * "Saldo suficiente para realizar a compra"
     *
     *
     * Antes de executar, responda:
     *
     * 1 → Qual será o resultado de:
     *
     *     500 >= 300
     *
     * 2 → O bloco do if será executado?
     *
     * 3 → O que acontecerá se saldo for alterado para 200?
     *
     *
     * DESAFIO:
     *
     * Adicione:
     *
     * boolean contaAtiva = true;
     *
     * Agora a compra somente poderá ser liberada quando:
     *
     * - houver saldo suficiente;
     *
     * E:
     *
     * - a conta estiver ativa.
     *
     * Utilize:
     *
     * &&
     *
     * para combinar as duas condições.
     */

    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * Em Java, o corpo de um if pode tecnicamente possuir apenas uma
     * instrução sem utilizar chaves:
     *
     * if (condicao)
     *     instrucao;
     *
     * Entretanto, utilizar chaves mesmo nesses casos é uma prática
     * comum porque deixa os limites do bloco explícitos e reduz a
     * possibilidade de erros ao modificar o código futuramente.
     *
     * O if também pode fazer parte de estruturas maiores envolvendo:
     *
     * else
     *
     * e:
     *
     * else if
     *
     * Esses recursos permitem representar outros caminhos e serão
     * estudados separadamente.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * O if é uma estrutura condicional que executa um bloco de código
     * somente quando uma condição é verdadeira.
     *
     * Sintaxe:
     *
     * if (condicao) {
     *     instruções;
     * }
     *
     * A condição precisa resultar em:
     *
     * true
     *
     * ou:
     *
     * false
     *
     * Se for true:
     *
     * o bloco é executado.
     *
     * Se for false:
     *
     * o bloco é ignorado e o programa continua.
     *
     * Podemos utilizar condições simples:
     *
     * idade >= 18
     *
     * ou condições compostas:
     *
     * idade >= 18 && possuiIngresso
     *
     * idade >= 18 || acompanhado
     *
     * !bloqueado
     *
     * Também vimos que:
     *
     * = representa atribuição.
     *
     * == representa comparação.
     *
     * E que, embora Java permita utilizar if sem chaves em alguns
     * casos, o uso de:
     *
     * {
     * }
     *
     * torna o bloco mais claro e evita comportamentos inesperados.
     *
     * O if é uma das estruturas fundamentais para controlar o fluxo
     * de execução de programas Java.
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
     * - Java Language Specification - Boolean Type:
     *   https://docs.oracle.com/javase/specs/jls/se25/html/jls-4.html#jls-4.2.5
     */
}