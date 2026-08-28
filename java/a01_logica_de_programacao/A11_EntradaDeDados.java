package a01_logica_de_programacao;

import java.util.Scanner;
/**
 * A11 - Entrada de Dados
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A11
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Variáveis, Tipos de Dados, Operadores Lógicos
 * @proximos       Saída de Dados
 *
 * @autor          Morcineck
 * @atualizado     28/08/2026
 * @tempoLeitura   20 min
 */
public class A11_EntradaDeDados {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * Entrada de dados é o processo pelo qual um programa recebe
     * informações durante sua execução.
     *
     * Até agora, muitos valores utilizados nos exemplos foram
     * definidos diretamente no código.
     *
     * Exemplo:
     *
     * int idade = 20;
     * String nome = "Java";
     *
     * Nesse caso, os valores já existem antes da execução.
     *
     * Com entrada de dados, podemos permitir que o próprio usuário
     * forneça essas informações enquanto o programa está rodando.
     *
     * Exemplo:
     *
     * System.out.print("Digite sua idade: ");
     * int idade = scanner.nextInt();
     *
     * O valor armazenado na variável idade dependerá do que o usuário
     * digitar.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Uma das formas mais simples de receber dados pelo teclado em
     * Java é utilizando a classe Scanner.
     *
     * Primeiro precisamos importar a classe:
     *
     * import java.util.Scanner;
     *
     * Depois criamos um objeto Scanner:
     *
     * Scanner scanner = new Scanner(System.in);
     *
     * O System.in representa a entrada padrão do programa, que
     * normalmente corresponde ao teclado.
     *
     * O Scanner lê os dados recebidos e possui diferentes métodos
     * para interpretar cada tipo de informação.
     *
     * Alguns dos métodos mais utilizados são:
     *
     * nextInt()    → lê um número inteiro
     * nextDouble() → lê um número decimal
     * next()       → lê o próximo token
     * nextLine()   → lê uma linha completa
     *
     * Exemplo:
     *
     * int idade = scanner.nextInt();
     *
     * Se o usuário digitar:
     *
     * 25
     *
     * a variável idade receberá o valor 25.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Programas reais frequentemente precisam receber informações
     * externas.
     *
     * Imagine sistemas que precisam perguntar:
     *
     * - qual é o nome do usuário;
     * - qual é sua idade;
     * - qual é o preço de um produto;
     * - qual opção deseja selecionar;
     * - qual endereço deseja cadastrar;
     * - qual quantidade deseja comprar.
     *
     * Sem entrada de dados, essas informações precisariam estar
     * definidas diretamente no código.
     *
     * A entrada de dados permite criar programas mais interativos e
     * capazes de trabalhar com informações fornecidas durante a
     * execução.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Utilize entrada de dados quando o programa precisar receber
     * informações durante sua execução.
     *
     * Exemplos:
     *
     * - formulários simples;
     * - menus no terminal;
     * - exercícios de programação;
     * - cadastro de informações;
     * - cálculos com valores informados pelo usuário;
     * - escolha de opções;
     * - pequenos programas interativos.
     *
     * A classe Scanner é muito utilizada em exemplos didáticos e
     * programas executados pelo terminal.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * A classe Scanner é muito útil para aprendizado e programas
     * simples, mas nem sempre será a forma utilizada para receber
     * dados em aplicações maiores.
     *
     * Por exemplo:
     *
     * - aplicações web recebem dados através de requisições;
     * - interfaces gráficas possuem campos de formulário;
     * - APIs recebem dados através de formatos como JSON;
     * - arquivos podem ser utilizados como fonte de entrada.
     *
     * Portanto, Scanner é uma ferramenta importante para aprender o
     * conceito de entrada de dados, mas não representa todas as formas
     * possíveis de entrada existentes em Java.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Permite receber informações durante a execução.
     * - Torna programas simples mais interativos.
     * - Possui métodos específicos para vários tipos de dados.
     * - É fácil de utilizar em exercícios e programas de terminal.
     * - Ajuda a compreender a relação entre entrada, processamento e
     *   saída de dados.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Entradas incompatíveis com o tipo esperado podem gerar
     *   exceções.
     * - A mistura de alguns métodos de leitura exige atenção.
     * - nextInt() e nextDouble() podem deixar a quebra de linha
     *   pendente antes de um nextLine().
     * - O comportamento de next() e nextLine() é diferente e pode
     *   causar confusão para iniciantes.
     * - É necessário validar dados quando não podemos confiar que o
     *   usuário fornecerá sempre o valor correto.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Informe claramente ao usuário o que ele deve digitar.
     *
     * Exemplo:
     *
     * System.out.print("Digite sua idade: ");
     *
     *
     * - Utilize o método de leitura correspondente ao tipo desejado.
     *
     * int idade = scanner.nextInt();
     *
     *
     * - Utilize nextLine() quando precisar receber textos que podem
     *   conter espaços.
     *
     * String nomeCompleto = scanner.nextLine();
     *
     *
     * - Tenha cuidado ao utilizar nextInt() ou nextDouble() antes de
     *   nextLine().
     *
     * - Feche o Scanner quando ele não for mais necessário.
     *
     * scanner.close();
     *
     * Em programas simples como este, o fechamento normalmente é feito
     * ao final do método main.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * 1. Utilizar o método de leitura errado para o tipo informado.
     *
     * Exemplo:
     *
     * int idade = scanner.nextInt();
     *
     * Se o usuário digitar:
     *
     * vinte
     *
     * o Scanner não conseguirá converter esse texto para int e uma
     * exceção poderá ser lançada.
     *
     *
     * 2. Confundir next() com nextLine().
     *
     * Imagine que o usuário digite:
     *
     * João da Silva
     *
     * Utilizando:
     *
     * String nome = scanner.next();
     *
     * normalmente será lido apenas:
     *
     * João
     *
     * Já:
     *
     * String nome = scanner.nextLine();
     *
     * pode ler:
     *
     * João da Silva
     *
     *
     * 3. Utilizar nextLine() logo após nextInt() sem tratar a quebra
     * de linha pendente.
     *
     * Exemplo:
     *
     * int idade = scanner.nextInt();
     * String nome = scanner.nextLine();
     *
     * Quando o usuário digita:
     *
     * 28 + ENTER
     *
     * podemos representar a entrada, de maneira simplificada, como:
     *
     * 28\n
     *
     * O nextInt() consome o número:
     *
     * 28
     *
     * mas a quebra de linha permanece:
     *
     * \n
     *
     * Então o nextLine() seguinte encontra essa quebra de linha e
     * termina imediatamente sua leitura.
     *
     * Por isso parece que o programa "pulou" a leitura do nome.
     *
     * Uma solução comum é:
     *
     * int idade = scanner.nextInt();
     * scanner.nextLine();
     * String nome = scanner.nextLine();
     *
     * O primeiro nextLine() consome o restante da linha anterior e o
     * segundo fica disponível para receber a nova entrada.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine o Scanner como um atendente recebendo informações em
     * uma fila.
     *
     * Se você pedir:
     *
     * nextInt()
     *
     * é como dizer:
     *
     * "Pegue o próximo número inteiro."
     *
     * Se pedir:
     *
     * next()
     *
     * é como dizer:
     *
     * "Pegue o próximo item separado."
     *
     * Já:
     *
     * nextLine()
     *
     * significa:
     *
     * "Pegue tudo o que existe até o final desta linha."
     *
     * Cada método lê os dados de uma maneira diferente, por isso é
     * importante escolher aquele que representa corretamente o tipo
     * de informação que desejamos receber.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -------------------------------------------------
        // LEITURA DE STRING COM nextLine()
        // -------------------------------------------------

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println(
                "Nome informado: " + nome
        );


        // -------------------------------------------------
        // LEITURA DE int COM nextInt()
        // -------------------------------------------------

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println(
                "Idade informada: " + idade
        );


        // -------------------------------------------------
        // LEITURA DE double COM nextDouble()
        // -------------------------------------------------

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println(
                "Altura informada: " + altura
        );


        // -------------------------------------------------
        // TRATANDO A QUEBRA DE LINHA PENDENTE
        // -------------------------------------------------

        /*
         * nextInt() e nextDouble() não consomem a quebra de linha
         * deixada quando pressionamos Enter.
         *
         * Como acabamos de utilizar nextDouble(), consumimos agora o
         * restante da linha antes de utilizar nextLine().
         */

        scanner.nextLine();


        // -------------------------------------------------
        // LEITURA DE UMA LINHA COMPLETA
        // -------------------------------------------------

        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println(
                "Cidade informada: " + cidade
        );


        // -------------------------------------------------
        // LEITURA COM next()
        // -------------------------------------------------

        System.out.print("Digite sua linguagem favorita: ");
        String linguagem = scanner.next();

        System.out.println(
                "Linguagem informada: " + linguagem
        );

        /*
         * next() lê apenas o próximo token.
         *
         * Se o usuário digitar:
         *
         * Java Spring
         *
         * a variável linguagem receberá apenas:
         *
         * Java
         */


        // -------------------------------------------------
        // ✔ EXEMPLO CORRETO
        // -------------------------------------------------

        /*
         * Vamos receber novamente uma idade e depois um endereço.
         *
         * Como utilizaremos nextInt() antes de nextLine(), precisamos
         * consumir a quebra de linha pendente.
         */

        System.out.print("Digite outra idade: ");
        int outraIdade = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite seu endereço completo: ");
        String endereco = scanner.nextLine();

        System.out.println(
                "Outra idade informada: " + outraIdade
        );

        System.out.println(
                "Endereço informado: " + endereco
        );


        // -------------------------------------------------
        // ❌ EXEMPLO INCORRETO
        // -------------------------------------------------

        /*
         * O código abaixo demonstra um problema comum.
         *
         * Ele está comentado para não interferir na execução normal
         * desta aula.
         *
         *
         * System.out.print("Digite sua idade: ");
         * int idadeExemplo = scanner.nextInt();
         *
         * System.out.print("Digite seu nome: ");
         * String nomeExemplo = scanner.nextLine();
         *
         *
         * Se digitarmos:
         *
         * 28 + ENTER
         *
         * nextInt() lê:
         *
         * 28
         *
         * mas a quebra de linha permanece.
         *
         * O nextLine() seguinte encontra essa quebra de linha e pode
         * retornar imediatamente uma String vazia.
         *
         * O programa compila normalmente, mas o comportamento não é
         * aquele que esperávamos.
         */


        // -------------------------------------------------
        // ❌ ENTRADA COM TIPO INCOMPATÍVEL
        // -------------------------------------------------

        /*
         * Outro problema acontece quando o Scanner espera um tipo de
         * dado e o usuário fornece outro.
         *
         * Exemplo:
         *
         * int numero = scanner.nextInt();
         *
         * Se o usuário digitar:
         *
         * Java
         *
         * o Scanner não poderá converter "Java" para um número inteiro.
         *
         * Nesse caso, uma InputMismatchException pode ser lançada.
         *
         * O tratamento de exceções será estudado em outro momento.
         * Por enquanto, o objetivo é entender que o tipo informado
         * precisa ser compatível com o método de leitura utilizado.
         */


        // -------------------------------------------------
        // UTILIZANDO OS DADOS RECEBIDOS
        // -------------------------------------------------

        boolean maiorDeIdade = idade >= 18;

        System.out.println(
                "É maior de idade? " + maiorDeIdade
        );

        /*
         * Entrada de dados não serve apenas para armazenar valores.
         *
         * Depois de receber uma informação, podemos utilizá-la em
         * cálculos, comparações, decisões e outras operações.
         *
         * Nesse exemplo, o valor digitado na variável idade foi
         * utilizado em uma comparação:
         *
         * idade >= 18
         *
         * Dessa forma, conectamos entrada de dados aos conceitos
         * estudados nas aulas anteriores.
         */


        scanner.close();
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie um programa que faça um pequeno cadastro pelo terminal.
     *
     * O programa deverá solicitar:
     *
     * 1. Nome completo.
     *
     * 2. Idade.
     *
     * 3. Altura.
     *
     * 4. Cidade.
     *
     * Armazene cada valor em uma variável correspondente.
     *
     * Depois exiba todas as informações recebidas.
     *
     * Exemplo:
     *
     * Nome: João da Silva
     * Idade: 25
     * Altura: 1.80
     * Cidade: Rio de Janeiro
     *
     * Atenção:
     *
     * Ao utilizar nextInt() ou nextDouble() antes de nextLine(),
     * lembre-se da quebra de linha pendente.
     *
     *
     * DESAFIO:
     *
     * Depois de receber a idade, utilize um operador relacional para
     * descobrir se a pessoa possui pelo menos 18 anos.
     *
     * Armazene o resultado em uma variável boolean:
     *
     * boolean maiorDeIdade = idade >= 18;
     *
     * Depois exiba o resultado.
     *
     * Dessa forma, você estará combinando entrada de dados com
     * operadores relacionais estudados anteriormente.
     */

    /*
     * CURIOSIDADES (opcional)
     * -------------------------------------------------------------
     * A classe Scanner não serve apenas para ler dados do teclado.
     *
     * Ela também pode trabalhar com outras fontes de dados, como
     * Strings e arquivos.
     *
     * Nesta aula estamos utilizando:
     *
     * new Scanner(System.in)
     *
     * porque queremos ler a entrada padrão do programa.
     *
     * Outro detalhe importante é que Scanner interpreta diferentes
     * tipos de dados, enquanto System.in, sozinho, trabalha com uma
     * entrada de nível mais baixo.
     *
     * O Scanner facilita esse processo oferecendo métodos como:
     *
     * nextInt()
     * nextDouble()
     * next()
     * nextLine()
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Entrada de dados permite que um programa receba informações
     * durante sua execução.
     *
     * Nesta aula utilizamos a classe Scanner com System.in para ler
     * informações fornecidas pelo usuário através do teclado.
     *
     * Vimos alguns dos principais métodos:
     *
     * nextInt()    → leitura de números inteiros.
     *
     * nextDouble() → leitura de números decimais.
     *
     * next()       → leitura do próximo token.
     *
     * nextLine()   → leitura de uma linha completa.
     *
     * Também aprendemos que nextInt() e nextDouble() podem deixar a
     * quebra de linha pendente antes de um nextLine(), fazendo parecer
     * que a leitura seguinte foi pulada.
     *
     * Por fim, vimos que os dados recebidos podem ser armazenados em
     * variáveis e utilizados posteriormente em cálculos, comparações
     * e outras operações.
     */

    /*
     * REFERÊNCIAS (opcional)
     * -------------------------------------------------------------
     * - Documentação oficial da classe Scanner:
     *   https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Scanner.html
     *
     * - Java API - System:
     *   https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/System.html
     */
}