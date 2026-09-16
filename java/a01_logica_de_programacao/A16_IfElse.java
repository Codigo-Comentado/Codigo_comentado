package a01_logica_de_programacao;

/**
 * A16 - if / else
 *
 * @modulo         Lógica de Programação
 * @roadmap        Módulo 1 → A16
 * @trilha         Java → Lógica de Programação → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Operadores Relacionais, Operadores Lógicos,
 *                 Estruturas Condicionais, if
 *
 * @autor          Morcineck
 * @atualizado     15/09/2026
 * @tempoLeitura   20 min
 */
public class A16_IfElse {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * A estrutura if / else permite criar dois caminhos possíveis
     * para a execução de um programa.
     *
     * O if representa:
     *
     * "SE determinada condição for verdadeira, faça isto."
     *
     * O else complementa:
     *
     * "SENÃO, faça aquilo."
     *
     * Exemplo:
     *
     * if (idade >= 18) {
     *     System.out.println("Maior de idade");
     * } else {
     *     System.out.println("Menor de idade");
     * }
     *
     * Nesse caso existem dois caminhos possíveis:
     *
     * idade >= 18 → "Maior de idade"
     *
     * idade < 18  → "Menor de idade"
     *
     * Apenas UM desses blocos será executado.
     */


    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * A estrutura básica é:
     *
     * if (condicao) {
     *
     *     // Executado quando a condição for true.
     *
     * } else {
     *
     *     // Executado quando a condição for false.
     * }
     *
     *
     * O Java primeiro avalia a condição do if.
     *
     * Se o resultado for: true
     * o bloco do if será executado e o bloco do else será ignorado.
     *
     *
     * Se o resultado for: false
     * o bloco do if será ignorado e o bloco do else será executado.
     *
     * Podemos visualizar:
     *
     *                  condição
     *                     |
     *             +-------+-------+
     *             |               |
     *           true            false
     *             |               |
     *             v               v
     *            if              else
     *             |               |
     *             +-------+-------+
     *                     |
     *                     v
     *             programa continua
     *
     *
     * Dentro de uma mesma estrutura if / else:
     *
     * - ou o if será executado;
     * - ou o else será executado.
     *
     * Os dois não serão executados na mesma avaliação.
     */


    /*
     * O ELSE NÃO POSSUI CONDIÇÃO
     * -------------------------------------------------------------
     * Observe:
     *
     * if (saldo >= valorCompra) {
     *     System.out.println("Compra autorizada");
     * } else {
     *     System.out.println("Saldo insuficiente");
     * }
     *
     * A condição pertence ao if: saldo >= valorCompra
     *
     * O else não precisa de uma nova condição.
     * Ele representa automaticamente o caminho que será seguido
     * quando a condição do if for false.
     *
     * Portanto, não escrevemos: else (condicao)
     *
     * O else é utilizado simplesmente como:
     *
     * else {
     *     instruções;
     * }
     */


    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * No conteúdo anterior vimos que o if sozinho é útil quando uma
     * ação precisa acontecer somente se uma condição for verdadeira.
     *
     * Exemplo:
     *
     * if (temperatura > 30) {
     *     System.out.println("Temperatura elevada");
     * }
     *
     * Se a condição for false, nenhuma ação específica precisa
     * acontecer.
     *
     *
     * Porém, existem situações em que precisamos definir também o
     * que acontecerá quando a condição for falsa.
     *
     * Exemplo:
     *
     * if (saldo >= valorCompra) {
     *     System.out.println("Compra autorizada");
     * } else {
     *     System.out.println("Saldo insuficiente");
     * }
     *
     * Agora temos uma resposta para cada possibilidade.
     */


    /*
     * CAMINHOS MUTUAMENTE EXCLUSIVOS
     * -------------------------------------------------------------
     * Uma das principais características do if / else é representar
     * dois caminhos mutuamente exclusivos.
     *
     * Isso significa que escolher um caminho exclui o outro.
     *
     * Exemplos:
     *
     * - par ou ímpar;
     * - aprovado ou reprovado;
     * - acesso permitido ou negado;
     * - saldo suficiente ou insuficiente;
     * - estoque disponível ou indisponível.
     *
     * Um número inteiro não pode ser par e ímpar ao mesmo tempo.
     *
     * Por isso, podemos representar:
     *
     * if (numero % 2 == 0) {
     *     System.out.println("Número par");
     * } else {
     *     System.out.println("Número ímpar");
     * }
     */


    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Utilize if / else quando houver dois caminhos possíveis e
     * apenas um deles deve ser executado.
     *
     * Exemplo:
     *
     * boolean possuiIngresso = true;
     *
     * if (possuiIngresso) {
     *     System.out.println("Entrada autorizada");
     * } else {
     *     System.out.println("Entrada negada");
     * }
     *
     * Se possuiIngresso for true: "Entrada autorizada"
     *
     * Se for false: "Entrada negada"
     */


    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Não precisamos utilizar else quando não existe uma ação
     * alternativa.
     *
     * Exemplo:
     *
     * if (temperatura > 30) {
     *     System.out.println("Alerta de temperatura");
     * }
     *
     * Se nenhuma ação precisa acontecer quando a temperatura for
     * menor ou igual a 30, adicionar um else seria desnecessário.
     *
     * Também devemos evitar criar blocos if / else excessivamente
     * grandes, pois isso pode dificultar a leitura e a manutenção.
     */


    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Representa claramente duas possibilidades.
     * - Garante que apenas um dos dois caminhos seja executado.
     * - Evita verificações redundantes em determinados cenários.
     * - Facilita a representação de regras mutuamente exclusivas.
     * - Torna a intenção do código mais clara.
     */


    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Condições mal formuladas podem escolher o caminho errado.
     * - Blocos muito grandes podem dificultar a leitura.
     * - Muitos if / else aninhados podem tornar o fluxo complexo.
     * - Nem todo problema possui apenas duas possibilidades.
     */


    /*
     * IF / ELSE COM CONDIÇÃO SIMPLES
     * -------------------------------------------------------------
     * Podemos utilizar operadores relacionais normalmente.
     *
     * Exemplo:
     *
     * double saldo = 500.0;
     * double compra = 700.0;
     *
     * if (saldo >= compra) {
     *     System.out.println("Compra autorizada");
     * } else {
     *     System.out.println("Saldo insuficiente");
     * }
     *
     * Avaliação: 500 >= 700
     *
     * false
     *
     * Portanto, o else será executado.
     */


    /*
     * IF / ELSE COM CONDIÇÃO COMPOSTA
     * -------------------------------------------------------------
     * Também podemos utilizar operadores lógicos.
     *
     * Exemplo:
     *
     * int idade = 17;
     * boolean acompanhado = true;
     *
     * if (idade >= 18 && acompanhado) {
     *     System.out.println("Entrada autorizada");
     * } else {
     *     System.out.println("Entrada não autorizada");
     * }
     *
     * Temos:
     *
     * idade >= 18: false
     *
     * acompanhado: true
     *
     * Portanto:
     *
     * false && true
     *
     * false
     *
     * Como o resultado é false, o else será executado.
     */


    /*
     * IF / ELSE E DOIS IFS INDEPENDENTES
     * -------------------------------------------------------------
     * Observe:
     *
     * int idade = 20;
     *
     * if (idade >= 18) {
     *     System.out.println("Maior de idade");
     * }
     *
     * if (idade < 18) {
     *     System.out.println("Menor de idade");
     * }
     *
     * Temos aqui DOIS ifs independentes.
     *
     * O Java precisa avaliar:
     *
     * idade >= 18
     *
     * e depois:
     *
     * idade < 18
     *
     *
     * Quando estamos representando duas alternativas diretamente
     * relacionadas, podemos expressar melhor essa intenção com:
     *
     * if (idade >= 18) {
     *     System.out.println("Maior de idade");
     * } else {
     *     System.out.println("Menor de idade");
     * }
     *
     * Agora existe uma única decisão:
     *
     * idade >= 18?
     *
     * true  → primeiro caminho.
     *
     * false → segundo caminho.
     *
     * Além de evitar uma segunda condição desnecessária, a relação
     * entre os dois caminhos fica explícita.
     */


    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * 1. Utilize chaves nos dois blocos.
     *
     * Prefira:
     *
     * if (condicao) {
     *     instrucao;
     * } else {
     *     outraInstrucao;
     * }
     *
     *
     * 2. Mantenha a condição clara.
     *
     * Prefira expressões que representem diretamente a regra.
     *
     *
     * 3. Utilize nomes de variáveis significativos.
     *
     * boolean possuiSaldo;
     *
     * é mais claro que:
     *
     * boolean x;
     *
     *
     * 4. Utilize if / else quando os caminhos forem realmente
     * relacionados e mutuamente exclusivos.
     *
     *
     * 5. Evite repetir a condição contrária quando o else já
     * representa esse caminho.
     *
     * Se temos:
     *
     * if (idade >= 18) {
     * }
     *
     * não precisamos escrever outra condição apenas para representar
     * o contrário.
     *
     * Podemos utilizar:
     *
     * else {
     * }
     */


    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     *
     * 1. TENTAR COLOCAR UMA CONDIÇÃO NO ELSE
     *
     * Incorreto:
     *
     * if (idade >= 18) {
     *     System.out.println("Maior de idade");
     * }
     * else (idade < 18) {
     *     System.out.println("Menor de idade");
     * }
     *
     * Essa não é a sintaxe do else.
     *
     * O else já representa o caminho executado quando a condição do
     * if for false.
     *
     * Correto:
     *
     * if (idade >= 18) {
     *     System.out.println("Maior de idade");
     * } else {
     *     System.out.println("Menor de idade");
     * }
     */


    /*
     * 2. UTILIZAR DOIS IFS QUANDO AS ALTERNATIVAS SÃO EXCLUSIVAS
     * -------------------------------------------------------------
     * Considere:
     *
     * if (numero % 2 == 0) {
     *     System.out.println("Par");
     * }
     *
     * if (numero % 2 != 0) {
     *     System.out.println("Ímpar");
     * }
     *
     * Esse código pode produzir o resultado esperado.
     *
     * Porém, temos duas verificações independentes para representar
     * duas possibilidades que pertencem à mesma decisão.
     *
     * Para esse cenário, é mais claro escrever:
     *
     * if (numero % 2 == 0) {
     *     System.out.println("Par");
     * } else {
     *     System.out.println("Ímpar");
     * }
     *
     * Se a primeira condição for false, já sabemos que o caminho
     * alternativo deve ser seguido.
     */


    /*
     * 3. CONFUNDIR = COM ==
     * -------------------------------------------------------------
     * Assim como vimos no conteúdo sobre if:
     *
     * =  → atribuição.
     *
     * == → comparação.
     *
     * Exemplo:
     *
     * int numero = 10;
     *
     * numero == 10
     *
     * verifica se os valores são iguais.
     *
     * Já:
     *
     * numero = 10
     *
     * atribui o valor 10 à variável.
     */


    /*
     * 4. CRIAR CONDIÇÕES QUE NÃO REPRESENTAM A REGRA
     * -------------------------------------------------------------
     * Suponha:
     *
     * "Uma pessoa com 18 anos ou mais é maior de idade."
     *
     * Correto:
     *
     * idade >= 18
     *
     * Se utilizarmos:
     *
     * idade > 18
     *
     * uma pessoa com exatamente 18 anos cairia no else.
     *
     * O código compilaria normalmente, mas a regra estaria
     * representada incorretamente.
     */


    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine uma porta controlada por um cartão de acesso.
     *
     * Existe uma pergunta: "O cartão é válido?"
     *
     * Temos somente dois caminhos:
     *
     *                    cartão válido?
     *                         |
     *                 +-------+-------+
     *                 |               |
     *               true            false
     *                 |               |
     *                 v               v
     *             abrir porta      negar acesso
     *
     * O sistema não precisa fazer duas perguntas:
     *
     * "O cartão é válido?"
     *
     * e depois:
     *
     * "O cartão é inválido?"
     *
     * Uma única condição já permite determinar os dois caminhos.
     *
     * Essa é a ideia do if / else.
     */


    // -----------------------------------------------------
    // EXEMPLO PRÁTICO
    // -----------------------------------------------------

    public static void main(String[] args) {

        // -------------------------------------------------
        // EXEMPLO 1 - MAIOR OU MENOR DE IDADE
        // -------------------------------------------------

        int idade = 17;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        /*
         * Avaliação:
         *
         * 17 >= 18
         *
         * false
         *
         * Portanto:
         *
         * if   → ignorado.
         *
         * else → executado.
         */


        // -------------------------------------------------
        // EXEMPLO 2 - PAR OU ÍMPAR
        // -------------------------------------------------

        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        /*
         * O operador % retorna o resto da divisão.
         *
         * 7 % 2
         *
         * resulta em: 1
         *
         * Portanto: 1 == 0
         *
         * false
         *
         * O número é classificado como ímpar.
         */


        // -------------------------------------------------
        // EXEMPLO 3 - SALDO
        // -------------------------------------------------

        double saldo = 500.0;
        double valorCompra = 700.0;

        if (saldo >= valorCompra) {
            System.out.println("Compra autorizada");
        } else {
            System.out.println("Saldo insuficiente");
        }

        /*
         * Avaliação:
         *
         * 500 >= 700
         *
         * false
         *
         * Portanto:
         *
         * "Saldo insuficiente"
         */


        // -------------------------------------------------
        // EXEMPLO 4 - CONDIÇÃO BOOLEAN
        // -------------------------------------------------

        boolean possuiIngresso = true;

        if (possuiIngresso) {
            System.out.println("Entrada autorizada");
        } else {
            System.out.println("Entrada negada");
        }

        /*
         * possuiIngresso contém:
         *
         * true
         *
         * Portanto, o if será executado e o else será ignorado.
         */


        // -------------------------------------------------
        // EXEMPLO 5 - CONDIÇÃO COM &&
        // -------------------------------------------------

        int idadeVisitante = 17;
        boolean acompanhado = true;

        if (idadeVisitante >= 18 && acompanhado) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso não liberado");
        }

        /*
         * idadeVisitante >= 18
         *
         * false
         *
         * acompanhado
         *
         * true
         *
         * false && true
         *
         * false
         *
         * Portanto, o else será executado.
         */


        // -------------------------------------------------
        // EXEMPLO 6 - CONDIÇÃO COM ||
        // -------------------------------------------------

        boolean pagamentoPix = false;
        boolean pagamentoCartao = true;

        if (pagamentoPix || pagamentoCartao) {
            System.out.println("Forma de pagamento aceita");
        } else {
            System.out.println("Forma de pagamento não aceita");
        }

        /*
         * false || true
         *
         * true
         *
         * Como pelo menos uma condição é verdadeira, o if é
         * executado.
         */


        // -------------------------------------------------
        // ✔ EXEMPLO CORRETO - DOIS CAMINHOS
        // -------------------------------------------------

        double media = 7.0;

        if (media >= 7.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        /*
         * Para esta regra simplificada existem apenas dois caminhos:
         *
         * media >= 7
         *
         * ou:
         *
         * media < 7
         *
         * O if / else representa diretamente essas alternativas.
         */


        // -------------------------------------------------
        // ❌ EXEMPLO MENOS ADEQUADO - DOIS IFS
        // -------------------------------------------------

        int quantidadeEstoque = 0;

        if (quantidadeEstoque > 0) {
            System.out.println("Produto disponível");
        }

        if (quantidadeEstoque <= 0) {
            System.out.println("Produto indisponível");
        }

        /*
         * O código acima funciona.
         *
         * O problema aqui NÃO é de compilação.
         *
         * Também não significa que utilizar dois ifs seja sempre
         * errado.
         *
         * O problema é que, neste cenário específico, estamos
         * representando duas alternativas mutuamente exclusivas
         * através de duas decisões independentes.
         *
         * Isso exige duas condições e deixa menos explícita a relação
         * entre os caminhos.
         *
         * Para esta regra, podemos representar melhor com if / else.
         */


        // -------------------------------------------------
        // ✔ FORMA MAIS ADEQUADA PARA O CASO ANTERIOR
        // -------------------------------------------------

        int estoque = 0;

        if (estoque > 0) {
            System.out.println("Estoque disponível");
        } else {
            System.out.println("Estoque indisponível");
        }


        // -------------------------------------------------
        // EXEMPLO 9 - LIMITE DA CONDIÇÃO
        // -------------------------------------------------

        int idadeCliente = 18;

        if (idadeCliente >= 18) {
            System.out.println("Cadastro permitido");
        } else {
            System.out.println("Cadastro não permitido");
        }

        /*
         * Observe a utilização de:
         *
         * >=
         *
         * Uma pessoa com exatamente 18 anos deve atender à condição.
         *
         * Se utilizássemos:
         *
         * idadeCliente > 18
         *
         * o valor 18 cairia incorretamente no else.
         */


        // -------------------------------------------------
        // EXEMPLO 10 - CONTINUIDADE DO PROGRAMA
        // -------------------------------------------------

        int pontos = 80;

        if (pontos >= 100) {
            System.out.println("Meta atingida");
        } else {
            System.out.println("Meta ainda não atingida");
        }

        System.out.println("Verificação de pontos concluída");

        /*
         * Como:
         *
         * 80 >= 100
         *
         * false
         *
         * o else será executado.
         *
         * Depois que um dos dois caminhos terminar, o programa
         * continua normalmente:
         *
         * "Verificação de pontos concluída"
         */
    }


    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie um programa que determine se um número é positivo ou
     * negativo.
     *
     * Utilize inicialmente:
     *
     * int numero = -10;
     *
     * Regra deste exercício:
     *
     * numero >= 0 → "Número positivo ou zero"
     *
     * numero < 0  → "Número negativo"
     *
     * Utilize apenas uma estrutura:
     *
     * if / else
     *
     *
     * Antes de executar, responda:
     *
     * 1 → Qual será o resultado de:
     *
     *     -10 >= 0
     *
     * 2 → Qual bloco será executado?
     *
     * 3 → O Java precisará verificar outra condição no else?
     *
     *
     * DESAFIO:
     *
     * Crie:
     *
     * double saldo = 1000.0;
     * double valorCompra = 750.0;
     * boolean contaAtiva = true;
     *
     * A compra deverá ser autorizada somente quando:
     *
     * - o saldo for suficiente;
     *
     * E:
     *
     * - a conta estiver ativa.
     *
     * Utilize:
     *
     * &&
     *
     * Se as duas condições forem verdadeiras:
     *
     * "Compra autorizada"
     *
     * Caso contrário:
     *
     * "Compra não autorizada"
     */


    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * O else não é obrigatório.
     *
     * Podemos ter:
     *
     * if (condicao) {
     * }
     *
     * sem nenhum else.
     *
     * Porém, um else precisa estar associado a um if.
     *
     *
     * Também podemos trabalhar com mais de duas possibilidades.
     *
     * Quando precisamos testar várias condições em sequência,
     * podemos utilizar:
     *
     * else if
     *
     * Esse será o próximo passo no estudo das estruturas
     * condicionais.
     */


    /*
     * RESUMO
     * -------------------------------------------------------------
     * A estrutura if / else representa dois caminhos possíveis.
     *
     * Sintaxe:
     *
     * if (condicao) {
     *
     *     // condição true
     *
     * } else {
     *
     *     // condição false
     * }
     *
     *
     * Se a condição for true: o bloco do if será executado.
     *
     * Se a condição for false: o bloco do else será executado.
     *
     *
     * Em uma mesma estrutura if / else, apenas um dos dois blocos
     * será executado.
     *
     * O else não possui uma condição própria.
     *
     * Ele representa automaticamente o caminho alternativo quando
     * a condição do if for falsa.
     *
     *
     * if / else é especialmente útil para representar alternativas
     * mutuamente exclusivas, como:
     *
     * - par ou ímpar;
     * - aprovado ou reprovado;
     * - autorizado ou não autorizado;
     * - disponível ou indisponível.
     *
     *
     * Dois ifs independentes possuem duas avaliações independentes.
     *
     * Um if / else representa uma única decisão com dois caminhos.
     *
     * Escolher a estrutura adequada ajuda a tornar a intenção do
     * código mais clara.
     */


    /*
     * REFERÊNCIAS
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