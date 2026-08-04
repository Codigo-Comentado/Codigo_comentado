package poo;

/**
 * A11 — Encapsulamento
 *
 * @modulo         Programação Orientada a Objetos
 * @roadmap        Módulo 3 → A11
 * @trilha         Java → POO → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Classes (A01), Objetos (A02), Atributos (A04), Modificadores de Acesso (A06)
 * @proximos       Getters, Setters
 *
 * @autor          Morcineck
 * @atualizado     01/08/2026
 * @tempoLeitura   15 min
 */

public class A11_Encapsulamento {

    /*
     * O QUE É?
     * -------------------------------------------------------------
     * O encapsulamento é um dos pilares fundamentais da programação
     * orientada a objetos (POO) e consiste em proteger os dados de
     * uma classe, permitindo que sejam acessados ou modificados
     * apenas por métodos específicos, promovendo a ocultação de
     * informação, garantindo maior segurança, flexibilidade e
     * organização do código.
     *
     * Não é uma palavra-chave do Java, como "private" ou "public".
     * É a prática, uma forma de organizar a classe. Encapsulamento é
     * o resultado de usar bem os modificadores de acesso: atributos
     * private + métodos public que controlam o que pode entrar e
     * sair.
     *
     * Por exemplo, numa classe "Produto", o atributo
     * "quantidadeEmEstoque" deve ficar private, e a única maneira de
     * alterá-lo deve ser através de métodos como
     * "adicionarEstoque()" e "removerEstoque()", que garantem que o
     * estoque nunca fique negativo.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * Encapsular uma classe geralmente envolve dois passos:
     *
     * 1. Esconder o estado: deixar os atributos private, para que
     *    nenhuma outra classe consiga acessá-los ou alterá-los
     *    diretamente.
     *
     * 2. Expor um comportamento: criar métodos public (getters e
     *    setters) que servem como "porta de entrada" para ler ou
     *    modificar esses atributos, aplicando regras de validação
     *    sempre que necessário.
     *
     * Pense assim: o objeto vira uma "caixa fechada". Quem está fora
     * não sabe (e não precisa saber) como o estoque é armazenado,
     * como o cálculo é feito por dentro, ou que outras variáveis
     * auxiliares existem. Só precisa saber quais métodos existem e
     * o que eles fazem.
     *
     * Isso é chamado, em outras leituras, de "esconder os detalhes
     * de implementação". O objeto decide sozinho o que pode ser
     * feito com o seu próprio estado.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Encapsulamento existe porque, sem ele, qualquer parte do
     * código poderia colocar um objeto em um estado inválido, sem
     * nenhuma verificação. Um estoque negativo, um salário abaixo
     * de zero, uma idade de -10 anos: tudo isso são exemplos de
     * estados que não fazem sentido no mundo real, mas que o Java,
     * sozinho, não sabe impedir.
     *
     * Ao encapsular, é a própria classe quem garante suas regras.
     * Toda vez que alguém tentar alterar o objeto, vai precisar
     * passar pelos métodos que a classe oferece, e esses métodos são
     * quem decide se a alteração é válida ou não.
     *
     * Isso também reduz o acoplamento entre as partes do sistema:
     * quem usa a classe "Produto" não precisa saber como o estoque
     * é validado por dentro, só precisa chamar o método certo.
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Use encapsulamento (praticamente) sempre que criar uma classe
     * que representa um objeto do mundo real ou uma entidade do seu
     * sistema.
     *
     * Como regra geral:
     *
     * - Sempre que um atributo tiver alguma regra de validade (não
     *   pode ser negativo, não pode passar de um limite, precisa
     *   seguir um formato), ele deve ser private, e a alteração deve
     *   passar por um método.
     *
     * - Sempre que quiser controlar "quem pode ler" um dado, um
     *   getter public pode ser criado, mesmo que não exista um
     *   setter equivalente (exemplo: um "id" que é gerado uma vez e
     *   nunca muda).
     *
     * - Sempre que um cálculo ou processo interno da classe não
     *   precisar ser conhecido por fora, ele deve ficar escondido
     *   (private), e sempre o resultado final deve ser exposto.
     *
     * Ex:  public class Produto {                      // Classe que representa um produto.
     *        private String nome;
     *        private double preco;
     *        private int quantidadeEmEstoque;         // Estado interno, protegido.
     *
     *        public void adicionarEstoque(int quantidade) {       // Adiciona produtos ao estoque.
     *          if (quantidade > 0) {                              // Só adiciona valores maiores que zero.
     *             quantidadeEmEstoque += quantidade;              // Soma a quantidade recebida ao estoque atual.
     *           }
     *         }
     *
     *       public void removerEstoque(int quantidade) {                     // Remove produtos do estoque.
     *          if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {    // Verifica se a quantidade é válida
     *                                                                       // e se existe estoque suficiente.
     *             quantidadeEmEstoque -= quantidade;       // Remove a quantidade informada do estoque.
     *          }
     *        }
     *
     *       public int consultarEstoque() {          // Forma pública de ler o estoque.
     *          return quantidadeEmEstoque;           // Retorna a quantidade em estoque
     *         }
     *      }
     *
     * Aqui, ninguém de fora consegue fazer
     * "produto.quantidadeEmEstoque = -50", mas todo mundo consegue
     * adicionar, remover e consultar o estoque através dos métodos
     * públicos, que aplicam as regras necessárias.
     */

    /*
     * QUANDO EVITAR?
     * -------------------------------------------------------------
     * Assim como nos modificadores de acesso, não existe uma
     * situação em que "não se deve encapsular". Toda classe bem
     * projetada tem, em algum grau, encapsulamento.
     *
     * O cuidado real está em não exagerar criando getters e setters
     * públicos para todos os atributos sem nenhuma validação, apenas
     * por costume. Isso "abre a caixa" de volta: se o setter
     * simplesmente faz "this.atributo = valor" sem nenhuma regra, na
     * prática é quase como deixar o atributo public, só que com mais
     * código.
     *
     * Ex:
     *      public class Produto {
     *         private int quantidadeEmEstoque;
     *
     *         public void setQuantidadeEmEstoque(int valor) {
     *             quantidadeEmEstoque = valor;   // Ruim: nenhuma validação, aceita até valor negativo
     *          }
     *      }
     *
     * Encapsular de verdade significa que o método existe para
     * proteger uma regra, não só para "dar a volta" no private.
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * - Integridade dos dados: o objeto nunca fica em um estado
     *   inválido, porque toda alteração passa por uma validação.
     *
     * - Flexibilidade para mudar por dentro: é possível alterar como
     *   o atributo é calculado ou armazenado internamente, sem
     *   afetar quem usa a classe, desde que os métodos públicos
     *   continuem funcionando do mesmo jeito.
     *
     * - Reuso e manutenção: como as regras ficam concentradas dentro
     *   da própria classe, qualquer correção ou ajuste é feito em
     *   um único lugar, e não espalhado pelo código.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * - Mais código: exige criar métodos (getters, setters e
     *   outros) mesmo para operações simples.
     *
     * - Pode parecer burocrático no começo: para quem está
     *   aprendendo, escrever um método só para alterar um valor pode
     *   parecer desnecessário, até perceber os problemas que isso
     *   evita.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * - Toda regra de validade dentro da classe: se um valor não
     *   pode ser negativo, quem confere isso deve ser o próprio
     *   método da classe, nunca quem está chamando o método.
     *
     * - Getters e setters com propósito: só crie um setter se
     *   realmente for necessário alterar aquele atributo de fora, e
     *   só crie um getter se realmente for necessário lê-lo. Nem
     *   todo atributo precisa dos dois.
     *
     * - Use nomes de métodos que representem uma ação: prefira
     *   métodos como adicionarEstoque() e removerEstoque(), pois
     *   eles mostram o que está acontecendo no objeto. Evite métodos
     *   genéricos como setQuantidadeEmEstoque(), quando a alteração
     *   precisa seguir uma regra de negócio.
     *
     * - Pense no objeto como uma caixa protegida: pergunte sempre "o
     *   que o mundo de fora realmente precisa fazer com esse
     *   objeto?" e exponha só isso.
     */

    /*
     * ERROS MAIS COMUNS
     * -------------------------------------------------------------
     * - Criar getters e setters para tudo, sem nenhuma validação:
     *
     *      public class Produto {
     *          private double preco;
     *
     *          public void setPreco(double preco) {
     *             this.preco = preco;   // Nenhuma validação, aceita preço negativo.
     *          }
     *      }
     *
     *   Por que acontece: parece "boa prática" ter getter/setter
     *   para tudo, mas sem regra dentro, o encapsulamento vira apenas
     *   decoração, o problema de estado inválido continua existindo.
     *
     * - Confundir encapsulamento com "esconder por esconder":
     *
     *      public class Produto {
     *          public int quantidadeEmEstoque;
     *          // Nenhum método público para ler ou alterar o estoque.
     *      }
     *
     *      Produto produto1 = new Produto();
     *      produto1.consultarEstoque();   // Erro: método não existe, a classe não oferece nenhuma forma de uso.
     *
     *   Por que acontece: encapsular não é deixar tudo private e não
     *   oferecer nenhuma porta de entrada. A classe precisa continuar
     *   sendo utilizável, só que de forma controlada.
     *
     * - Validar a regra fora da classe, em vez de dentro:
     *
     *      Produto produto1 = new Produto();
     *      if (quantidade > 0) {
     *          produto1.adicionarEstoque(quantidade);   // A validação deveria estar dentro do método, não aqui fora.
     *      }
     *
     *   Por que acontece: a validação depende de quem está usando a
     *   classe; se lembrar de checar antes, a regra pode ser
     *   esquecida em algum lugar do código. O certo é a própria
     *   classe garantir isso sempre.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Imagine um caixa eletrônico. Você não abre a máquina e mexe
     * direto nas notas de dinheiro guardadas lá dentro (o estado
     * interno). Você usa os botões da tela, o teclado (os métodos
     * públicos), e é o próprio caixa eletrônico quem decide se o
     * saque é permitido, se há dinheiro suficiente e como as notas
     * serão organizadas por dentro.
     *
     * Você nem sabe (e nem precisa saber) como as notas estão
     * guardadas fisicamente na máquina. Só precisa saber que existe
     * um botão "sacar" e que ele funciona seguindo regras que a
     * própria máquina garante.
     */

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO INCORRETO (com observações)
    // -----------------------------------------------------

    // ❌ Errado / ingênuo: deixar o atributo private, mas criar um
    // setter sem nenhuma validação, o que, na prática, anula a
    // proteção.
    //
    // static class Produto {
    //     private int quantidadeEmEstoque;
    //
    //     public void setQuantidadeEmEstoque(int valor) {
    //         quantidadeEmEstoque = valor;
    //     }
    // }
    //
    // Produto produto1 = new Produto();
    // produto1.setQuantidadeEmEstoque(-100);
    //
    // Porque falha: o método existe, mas não protege nada. Ele
    // aceita qualquer valor, inclusive um estoque negativo, que não
    // faz sentido no mundo real.

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO CORRETO (com observações)
    // -----------------------------------------------------

    static class Produto {

        // Atributos private: representam o estado interno do objeto, protegido de acessos externos.
        private String nome;
        private double preco;
        private int quantidadeEmEstoque;

        // Construtor: já garante que o produto nasça num estado válido.
        public Produto(String nome, double preco) {

            // Usamos "this.nome" para nos referir ao atributo da classe, e "nome" (sem this)
            // para o parâmetro que chegou no construtor. Sem o "this.", o Java entenderia
            // "nome = nome" como o parâmetro recebendo ele mesmo, e o atributo da classe
            // continuaria vazio (null).
            this.nome = nome;

            // Só aceita preço maior que zero, caso contrário, o preço começa em 0.
            // (preco > 0) ? preco : 0  é um operador ternário: funciona como um "if/else" resumido
            // numa linha só. Lê-se assim: "SE preco for maior que 0, use preco; SENÃO, use 0".
            this.preco = (preco > 0) ? preco : 0;

            // Repare que o construtor não recebe "quantidadeEmEstoque" como parâmetro.
            // Isso é proposital: a regra de negócio é que todo produto nasce sem estoque,
            // e a única forma de ter itens é chamando o método adicionarEstoque() depois.
            // Todo produto novo começa com estoque zerado.
            this.quantidadeEmEstoque = 0;
        }

        // Método public: porta de entrada segura para adicionar itens ao estoque.
        public void adicionarEstoque(int quantidade) {

            // Só adiciona se a quantidade for positiva.
            if (quantidade > 0) {

                // Soma a quantidade informada ao estoque atual.
                // Exemplo: quantidadeEmEstoque = 10 e quantidade = 5
                // Resultado: quantidadeEmEstoque passa a ser 15.
                quantidadeEmEstoque += quantidade;
            }
        }

        // Método public: porta de entrada segura para remover itens do estoque.
        public void removerEstoque(int quantidade) {

            // A remoção só acontece se:
            // 1. A quantidade for maior que zero.
            // 2. Houver itens suficientes em estoque.
            if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {

                // Subtrai a quantidade do estoque atual.
                quantidadeEmEstoque -= quantidade;
            }
        }

        // Método public: permite alterar o preço, com validação, sem expor o atributo.
        public void atualizarPreco(double novoPreco) {

            // Só atualiza se o novo preço for válido.
            if (novoPreco > 0) {
                preco = novoPreco;
            }
        }

        // Método public: permite consultar o estoque sem expor o atributo.
        public int consultarEstoque() {
            return quantidadeEmEstoque;
        }

        // Método public: permite consultar o preço sem expor o atributo.
        public double consultarPreco() {
            return preco;
        }

        // Método public: imprime os dados do produto de forma organizada.
        public void exibirDados() {
            System.out.println("Produto: " + nome + " | Preço: " + preco + " | Estoque: " + quantidadeEmEstoque);
        }
    }

    public static void main(String[] args) {

        // Criamos um objeto da classe Produto, já nascendo num estado válido.
        Produto produto1 = new Produto("Teclado Mecânico", 250.0);

        // Não conseguimos fazer produto1.quantidadeEmEstoque = 50 (o atributo é private).
        // Precisamos usar os métodos da classe.

        // Adiciona 50 unidades ao estoque.
        produto1.adicionarEstoque(50);

        // Remove 10 unidades do estoque.
        produto1.removerEstoque(10);

        // Tenta remover mais unidades do que existe em estoque: a regra dentro da classe impede.
        produto1.removerEstoque(1000);

        // Atualiza o preço do produto.
        produto1.atualizarPreco(275.0);

        // Exibe os dados finais do produto.
        produto1.exibirDados();
    }

    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie uma classe Funcionario. Ela deve possuir os seguintes
     * atributos, todos private:
     * - nome
     * - cargo
     * - salario
     *
     * 1. Crie um construtor que já garanta que o funcionário nasça
     * num estado válido (por exemplo, não aceitar um salário menor
     * ou igual a zero).
     *
     * 2. Crie métodos public para acessar e alterar cada atributo de
     * forma controlada:
     *
     * - exibirDados(): imprime nome, cargo e salário do funcionário.
     *
     * - aumentarSalario(double percentual): aumenta o salário com
     *   base num percentual recebido como parâmetro, mas só aplica
     *   o aumento se o percentual for maior que zero.
     *
     * Exemplo:
     * funcionario1.aumentarSalario(10);
     *
     * Resultado:
     * Salário atualizado: R$ 3300.00
     *
     * 3. Crie pelo menos dois objetos da classe Funcionario, com
     * valores diferentes.
     *
     * 4. Tente, de propósito, criar um setter "ingênuo" para o
     * salário, sem nenhuma validação, e depois tente usá-lo para
     * colocar um salário negativo. Observe que o código compila
     * (diferente do erro de acesso do arquivo anterior), mas o
     * objeto fica num estado inválido.
     *
     * 5. Corrija o setter para que ele só aplique a alteração quando
     * o valor for válido.
     *
     * Explique com suas próprias palavras: qual a diferença entre
     * "esconder o atributo com private" e "encapsular de verdade"?
     * Por que só usar private, sem nenhuma validação nos métodos,
     * ainda pode deixar o objeto num estado inválido?
     *
     * - Atributos private como estado protegido do objeto.
     * - Métodos public com validação como verdadeira porta de
     *   entrada controlada.
     * - Encapsulamento evitando estados inválidos, e não apenas
     *   escondendo atributos.
     */

    /*
     * CURIOSIDADES
     * -------------------------------------------------------------
     * Um erro comum de quem está aprendendo é achar que "gerar
     * getters e setters automaticamente" (como a própria IDE faz,
     * com um clique) já é sinônimo de um bom encapsulamento.
     *
     * Na prática, isso só resolve a parte de "esconder o atributo".
     * A parte que realmente importa, que é garantir que o objeto
     * nunca fique num estado inválido, depende de você adicionar as
     * validações manualmente dentro desses métodos. Um setter gerado
     * automaticamente, sem nenhuma regra, protege tão pouco quanto
     * deixar o atributo public.
     */

    /*
     * RESUMO
     * -------------------------------------------------------------
     * Encapsulamento é o princípio de proteger o estado interno de
     * um objeto (atributos private) e expor apenas um conjunto
     * controlado de comportamentos (métodos public) para ler ou
     * alterar esse estado. Ele é construído usando os modificadores
     * de acesso, mas vai além: exige que os métodos públicos
     * realmente apliquem regras de validação, e não apenas
     * repassem o valor recebido direto para o atributo.
     *
     * A regra geral é: atributo private + método public com
     * validação = encapsulamento de verdade.
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Documentação oficial (conceitos de OOP em Java): https://docs.oracle.com/javase/tutorial/java/concepts/index.html
     */
}