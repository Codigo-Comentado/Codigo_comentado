package c03_programacao_orientada_a_objetos;
/**
 * L08 — O que são constructors?
 *
 * @modulo         magic de Programmable
 * @roadmap        Módulo 1 → L08
 * @trilha         Java → magic de Programmable → basic
 * @nivel          🟢 basic
 * @prerequisitos
 * @proximos
 * @autor          1colossos(Afonso Gabriel)
 * @atualizado     08/08/2026
 * @tempoLeitura   12 min
 */
public class C14_Construtores {
    /*
     * O QUE SÃO?
     * -------------------------------------------------------------
     * Em termos simples, o construtor em java é a "linha de montagem"
     * ou a "certidão de nascimento" de um objeto. Quando você decide
     * criar algo novo no seu código, o construtor será o responsável
     * por preparar o respectivo objeto, definindo as configurações
     * iniciais antes de entrega-lo pronto para uso.
     *
     * Tecnincamente, ele é muito semelhante aos métodos, mas com um
     * propósito único: inicializar um objeto que acabou de ser criado.
     */

    /*
     * COMO FUNCIONA?
     * -------------------------------------------------------------
     * O construtor irá entrar em ação toda vez que você usa a
     * palavra mágica new. Por exemplo: *new ContaBancaria()*. Quando
     * o java lê o termo "new", ele vai até a classe, procura o construtor
     * e executa código que está lá dentro.
     *
     * Portanto, para o java reconhecer que aquele bloco é um construtor,
     * ele impõe duas regras rígidas:
     *
     * - Tem que ter o nome exato da classe: se a classe tem nome "Usuario"
     * o construtor obrigatoriamente se chama Usuario.
     *
     * - Não tem tipo de retorno: Embora parecidos, os métodos normais retornam
     * String, int ou void, o construtor não tem nada escrito antes do seu nome.
     */

    /*
     * POR QUE EXISTE?
     * -------------------------------------------------------------
     * Ele existe para garantir a segurança e a conscistência do seu
     * sistema. É para evitar que um objeto "nasça" num estado inválido
     * ou faltando informações essenciais.
     *
     * Imagine um sistema de e-commerce: não faz sentido existir
     * um objeto do tipo *Pedido* sem estar vinculado a um *Cliente*.
     * O construtor resolve isso!Você pode configurar o construtor do pedido
     * para obrigar quem está programando a informar quem é o cliente no
     * exato momento da criação (*new Pedido(clienteDaSilva).
     *
     * Logo, isso evita erros futuros, garantindo que o objeto já
     * comece a sua vida útil com tudo que precisa para funcionar corretamente
     */

    /*
     * QUANDO USAR?
     * -------------------------------------------------------------
     * Para garantir o estado válido inicial: Quando o seu objeto
     * simplesmente não faz sentido sem certas informações. Por exemplo,
     * uma classe Arquivo precisa obrigatoriamente do caminhoDoArquivo
     * para existir e funcionar.
     *
     * Para forçar dependências obrigatórias: Se uma classe precisa
     * de dados essenciais para trabalhar, coloque-os no construtor. Isso
     * obriga quem está usando a sua classe a fornecer esses dados
     * no momento do new.
     *
     * Para inicializar valores padrão: Quando atributos precisam de
     * um valor de partida específico (exemplo: em uma classe ContaCorrente,
     * o atributo saldo sempre deve nascer com 0.0, em vez de deixar nulo).
     *
     * Para criar objetos imutáveis: Se você quer que os dados do seu
     * objeto nunca sejam alterados depois da criação
     * (usando a palavra-chave final nos atributos), a única forma de
     * preencher esses dados é através do construtor.
     */

    /*
     * QUANDO NÃO USAR?
     * -------------------------------------------------------------
     * Para lógicas de negócio complexas: O construtor deve ser rápido
     * e burro. Não faça consultas a banco de dados, chamadas de rede
     * ou cálculos matemáticos complexos dentro dele. O objetivo dele é
     * apenas atribuir estado (valores às variáveis).
     *
     * Quando há muitos parâmetros opcionais: Se sua classe tem 15 atributos
     * e só 2 são obrigatórios, não crie um construtor gigante exigindo tudo.
     * O código de quem chama ficará ilegível. Nesses casos, prefira
     * criar um construtor apenas com os atributos obrigatórios e use
     * os métodos setters para preencher o resto depois
     * (ou estude Padrões de Projeto como o Builder).
     */

    /*
     * VANTAGENS
     * -------------------------------------------------------------
     * Segurança e Previsibilidade: Reduz drasticamente a chance do
     * sistema quebrar por causa de objetos com dados incompletos ou
     * nulos (o famoso NullPointerException).
     *
     * Código enxuto na criação: Você cria e configura o objeto em uma
     * única linha (ex: new Pessoa("Ana", 25)), em vez de gastar
     * várias linhas chamando setNome(), setIdade(), etc.
     *
     * Contrato claro: Só de olhar para a assinatura do construtor,
     * qualquer programador entende imediatamente do que aquela classe
     * precisa para funcionar.
     */

    /*
     * DESVANTAGENS
     * -------------------------------------------------------------
     * Construtores Gigantes (Anti-pattern): É muito fácil acabar com
     * construtores que recebem muitos argumentos
     * (ex: new Pedido(1, cliente, data, true, false, 0.15)).
     * Quem lê a chamada não faz ideia do que são aqueles valores true e false.
     *
     * Efeito cascata em manutenções: Se você adicionar um novo parâmetro
     * em um construtor que já é muito utilizado no seu sistema, o
     * código vai "quebrar" em todos os lugares onde o objeto era
     * instanciado, forçando você a refatorar o sistema inteiro
     * para passar o novo dado.
     */

    /*
     * BOAS PRÁTICAS
     * -------------------------------------------------------------
     * 1. Use a palavra-chave this para clareza:
     * -Sempre use o this para diferenciar os atributos da classe dos
     * parâmetros recebidos. Fica muito mais profissional e
     * legível: this.nome = nome;
     *
     * 2. Reaproveitamento com Encadeamento de Construtores (Constructor Chaining):
     * - Se você tem múltiplos construtores (um que recebe só o nome,
     * outro que recebe nome e idade), não repita código.
     * Faça um construtor chamar o outro usando this(...).
     * Isso centraliza a regra de inicialização num único lugar.
     *
     * 3. Exija apenas o essencial:
     * - Solicite no construtor apenas os dados que definem a "identidade"
     * ou que são cruciais para o funcionamento do objeto. Atributos
     * opcionais devem ser preenchidos depois usando métodos setters.
     */

    /*
     * ANALOGIA
     * -------------------------------------------------------------
     * Para ajudar a fixar a ideia, pense na criação de um objeto como
     * o protocolo de um processo judicial ou um documento oficial.
     *
     * Você não pode simplesmente abrir uma pasta vazia no tribunal e
     * chamá-la de "processo". Para que o sistema aceite registrar essa
     * nova ação (o equivalente a usar o new na programação), o protocolo
     * exige certas informações fundamentais desde o primeiro segundo:
     * quem é o autor, quem é o réu e qual é a causa.
     *
     * O construtor é exatamente esse balcão de protocolo. Ele é a regra
     * que diz: "Eu até crio esse processo para você, mas você é obrigado
     * a me passar o Autor e o Réu agora mesmo".
     *
     * Se você tentar criar o processo sem essas informações, o sistema
     * rejeita (erro de compilação). Uma vez que o processo é protocolado
     * com sucesso (objeto instanciado), você pode adicionar outras petições
     * e documentos opcionais à pasta ao longo do tempo
     * (usando métodos e setters), mas os elementos vitais foram garantidos
     * no exato momento da sua criação.
     */


    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO INCORRETO (com observações)
    // -----------------------------------------------------

    // ❌ Errado / ingênuo: declarar o construtor com um tipo de
    // retorno (como 'void') e achar que o objeto será inicializado.

    // public class ProcessoJudicial {
    //     private String numero;
    //
    //     // O erro está aqui: a palavra 'void'
    //     public void ProcessoJudicial(String numeroProcesso) {
    //         this.numero = numeroProcesso;
    //     }
    // }

    // Na hora de tentar criar o objeto em outra classe:
    // ProcessoJudicial processo = new ProcessoJudicial("12345-67");

    // Porque falha: a regra fundamental dos construtores é que eles
    // não possuem tipo de retorno. Ao adicionar 'void', o Java passa a
    // enxergar esse bloco como um método comum que, por coincidência,
    // tem o mesmo nome da classe. Quando o programador tenta usar o 'new'
    // passando o argumento, o código não compila: "cannot be applied to
    // given types", pois o verdadeiro construtor não foi reconhecido.

    // -----------------------------------------------------
    // EXEMPLO PRÁTICO - CÓDIGO CORRETO
    // -----------------------------------------------------
    // Neste exemplo, vamos criar uma classe ProcessoJudicial.
    // Observe como o construtor garante que nenhum processo
    // seja criado sem um número, um autor e um réu, além de
    // já definir um status padrão automaticamente.

    public class ProcessoJudicial {

        // Atributos da classe (Estado do objeto)
        private String numeroProcesso;
        private String autor;
        private String reu;
        private String status;

        /**
         * CONSTRUTOR PRINCIPAL
         * Força quem for instanciar a classe a fornecer os dados vitais.
         */
        public ProcessoJudicial(String numeroProcesso, String autor, String reu) {
            // O 'this' diferencia o atributo da classe do parâmetro recebido
            this.numeroProcesso = numeroProcesso;
            this.autor = autor;
            this.reu = reu;

            // Boa Prática: Inicializando um valor padrão no momento da criação
            this.status = "Aguardando Distribuição";
        }

        /**
         * CONSTRUTOR SOBRECARREGADO (Opcional - Boa Prática)
         * Demonstra o "Constructor Chaining" (um construtor chamando o outro).
         * Útil para quando não temos o nome do réu no momento inicial.
         */
        public ProcessoJudicial(String numeroProcesso, String autor) {
            // A palavra 'this()' chama o construtor principal acima
            this(numeroProcesso, autor, "Réu Desconhecido/A Apurar");
        }

        // Método simples para exibir os dados e provar que o construtor funcionou
        public void exibirResumo() {
            System.out.println("Processo: " + numeroProcesso);
            System.out.println("Autor: " + autor + " | Réu: " + reu);
            System.out.println("Status Atual: " + status);
            System.out.println("-----------------------------------");
        }
    }
    /*
     * EXERCÍCIO
     * -------------------------------------------------------------
     * Crie uma classe chamada DocumentoLegal com os atributos:
     * titulo (String), nomeDoAutor (String) e confidencial (boolean).
     * Agora, implemente as seguintes regras de criação (construtores):
     *
     * 1. Crie um construtor principal que receba parâmetros para
     * inicializar obrigatoriamente todos os três atributos (titulo,
     * nomeDoAutor e confidencial). Lembre-se de usar a palavra-chave 'this'.
     *
     * Exemplo:
     * DocumentoLegal doc1 = new DocumentoLegal("Contrato de Honorários", "Maria Oliveira", true);
     * System.out.println(doc1.titulo);
     *
     * 2. Crie um segundo construtor (sobrecarga) que receba apenas
     * o titulo e o nomeDoAutor. Este construtor deve definir
     * automaticamente o atributo confidencial como 'false', assumindo
     * que, se não foi especificado, o documento é público.
     *
     * Exemplo:
     * DocumentoLegal doc2 = new DocumentoLegal("Petição Inicial", "João da Silva");
     * // Nasce com confidencial = false automaticamente
     *
     * 3. Na sua classe principal (Main), crie objetos utilizando os
     * dois construtores e exiba os dados na tela para observar como
     * eles foram inicializados de forma diferente.
     *
     * Explique com suas próprias palavras: por que
     * não podemos colocar a palavra 'void' na declaração de
     * um construtor? O que o Java entende se fizermos isso?
     *
     * - A regra fundamental de assinatura de construtores.
     * - O objetivo de forçar a passagem de parâmetros no momento do 'new'.
     * - A utilidade da palavra-chave 'this' para evitar ambiguidades.
     */

    /*
     * VOCÊ SABIA? (CURIOSIDADES)
     * -------------------------------------------------------------
     * Assim como você viu no exemplo de métodos comuns, os
     * construtores também podem sofrer "sobrecarga" (constructor
     * overloading). Isso significa que uma mesma classe pode ter
     * vários construtores, desde que a lista de parâmetros
     * (quantidade ou tipo) seja diferente.
     *
     * Exemplo:
     * public Documento() { ... } // Construtor vazio
     * public Documento(String titulo) { ... } // Com 1 parâmetro
     * public Documento(String titulo, String autor) { ... } // Com 2 parâmetros
     *
     * O Java identifica qual construtor chamar de acordo com os
     * argumentos que você passa na hora de usar o 'new'.
     *
     * Outra curiosidade importante: se você não escrever nenhum
     * construtor, o Java cria um vazio invisível para você. Mas, se
     * você escrever QUALQUER construtor com parâmetros, o Java
     * "toma de volta" o vazio. Se quiser usar o vazio novamente,
     * terá que digitá-lo explicitamente!
     */

    /*
     * REFERÊNCIAS
     * -------------------------------------------------------------
     * - Documentação Oficial: https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
     * - Primeiros Passos: https://www.devmedia.com.br/construtores-em-java-primeiros-passos/28618
     * - W3Schools: https://www.w3schools.com/java/java_constructors.asp
     */
}
