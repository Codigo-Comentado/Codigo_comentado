package poo.basico;

public class A05_ModificadoresDeAcesso {

/*
=============================================================

TEMA: Modificadores de Acesso


Nível:
🟢 Básico

Autor: Morcineck
Última atualização: 29/07/2026
Pré-requisitos: Lógica de programação básica (Classes, Objetos e Atributos)
Tempo estimado de leitura: 10 min
=============================================================

O QUE É?
-------------------------------------------------------------
Modificadores de acesso é a palavra que definimos antes de uma classe, atributos ou métodos para dizer
quem pode "enxergar" e utilizar aquilo. Em outras palavras, é o controle de visibilidade do nosso código.

Em Java, existem quatro níveis de acesso:

public > qualquer classe, de qualquer pacote, pode acessar.
protected > pode ser acessado pela própria classe, pelas classes do mesmo pacote e pelas subclasses.
(default) > quando não escrevemos nenhum modificador. Só classes do mesmo pacote acessam.
private > só a própria classe pode acessar. Ninguém de fora enxerga.

Por exemplo, numa classe "ContaBancaria", o atributo "saldo" normalmente é private, pois não queremos que qualquer
outra parte do programa altere esse valor livremente, sem controle.

-------------------------------------------------------------
COMO FUNCIONA?
-------------------------------------------------------------
Quando o compilador Java encontra um modificador de acesso, ele passa a fiscalizar quem pode acessar aquele membro (atributo,
método ou classe). Isso é verificado em tempo de compilação, ou seja, antes mesmo do programa rodar, o java já barra
qualquer tentativa de acesso indevido.

Pense assim: cada modificador desenha um "raio de alcance" ao redor do membro.

private > o raio de alcance é só dentro da própria classe.
(default) > o raio de alcance é o pacote inteiro.
protected > o raio de alcance é o pacote + quem herda da classe (mesmo estando em outro pacote).
public > não existe raio de alcance, todo o projeto (e até outros projetos) pode acessar.

Se uma classe tentar acessar algo fora do seu alcance permitido, o código não compila. O erro geralmente aparece assim:

"saldo has private access in ContaBancaria"

Isso acontece porque o Java verifica o modificador de acesso antes de gerar o .class, protegendo a informação mesmo antes
do programa ser executado.

-------------------------------------------------------------
POR QUE EXISTE?
-------------------------------------------------------------
Modificadores de acesso existem para controlar quem pode ver e alterar os atributos e métodos de uma classe, e como essa
alteração pode acontecer. Sem ele, qualquer parte do código poderia modificar qualquer atributo, sem nenhuma regra ou
validação, o que poderia deixar o objeto em um estado inválido ou inconsistente (como um produto com estoque negativo).

Ao restringir o acesso direto e obrigar que a alteração passe por métodos controlados, o modificador de acesso protege
a integridade dos dados do objeto. Essa pratica se chama encapsulamento (veremos como funciona alguns conteúdos a frente).

-------------------------------------------------------------
QUANDO USAR?
-------------------------------------------------------------
Use modificadores de acesso sempre que precisar definir o quanto uma informação ou comportamento deve ficar exposto
para o resto do programa.

Como regra geral (geralmente é assim que a maioria dos programadores experientes trabalha):

- Atributos: normalmente private. Eles representam o estado interno do objeto e não devem ser alterados livremente
por fora da classe.

- Métodos que expõem uma funcionalidade da classe: geralmente public. É o "caminho oficial" para o resto do programa
interagir com o objeto

- Métodos ou atributos usados apenas internamente, como auxiliares de cálculo: geralmente private, pois são "detalhes de
implementação" que ninguém de fora precisa (nem deve) conhecer.

-protected e (default): usados com menos frequência no começo. Costumam aparecer quando o projeto já trabalha com herança
ou está organizado em vários pacotes, e existe a necessidade de compartilhar algo apenas entre classes relacionadas
 ou do mesmo pacote.


Ex:  public class ContaBancaria {
       private double saldo;       // Estado interno, protegido.

       public void depositar(double valor){        // Porta de entrada pública e segura.
       if (valor > 0) {
          saldo += valor;
        }
      }

    public double consultarSaldo() {     // Forma pública de consultar o saldo.
      return saldo;
     }
}

aqui, ninguém de fora consegue fazer "conta.saldo = 99999", mas todo mundo consegue depositar e consultar o saldo através
dos métodos públicos, que aplicam as regras necessárias.

-------------------------------------------------------------
QUANDO NÃO USAR?
-------------------------------------------------------------
Não existe exatamente uma situação em que "não se deve usar" modificador de acesso, já que todo atributo, método ou classe
sempre possui um (mesmo quando você não escreve nada, o Java aplica o (default) automaticamente).

O cuidado real deve ser em não escolher o modificador errado para uma situação. Evite usar public em atributos que representam
o estado interno do objeto, apenas por "comodidade" ou para não precisar criar métodos. Isso quebra o encapsulamento e
abre brechas para que qualquer parte do código altere o objeto de forma incorreta.

Ex:

      public class ContaBancaria {
         public double saldo;      // Ruim: qualquer código pode alterar sem controle.
}

Da mesma forma, evite usar private "por padrão" sem pensar, a ponto da classe não oferecer nenhuma forma pública de ser
utilizada.


-------------------------------------------------------------
VANTAGENS
-------------------------------------------------------------
- Encapsulamento: protege o estado interno do objeto, permitindo alterações apenas através de métodos controlados
pela própria classe.

- Segurança dos Dados: evita que partes externas do código coloquem o objeto em um estado inválido ou inconsistente.

- Organização e Manutenção: fica claro o que é "porta de entrada" (public) e o que é "detalhe" (private), facilitando
a leitura e futuras alterações no código.

-------------------------------------------------------------
DESVANTAGENS
-------------------------------------------------------------
- Mais código: usar private exige criar métodos (como getters/setters) para acessar ou alterar os atributos, o que
aumenta um pouco o volume de código.

- Curva de aprendizagem inicial: para quem está começando, pode não ficar óbvio de imediato porque "esconder" um atributo
é útil, já que public parece mais simples à primeira vista.

-------------------------------------------------------------
ERROS MAIS COMUNS
-------------------------------------------------------------
- Tentar acessar um membro private de fora da classe:

   public class minhaConta {
       private double saldo;

}
     ContaBancaria minhaConta = new ContaBancaria();
       minhaConta.saldo = 500;  // Erro: saldo é private.

Por que acontece: O Java bloqueia o acesso de fora do "raio de alcance" definido pelo modificador. O código não compila.


- Deixar tudo public por comodidade:

  public class contaBancaria {
    public double saldo;       // Ruim: qualquer código pode alterar sem controle
}
     ContaBancaria minhaConta = new ContaBancaria();
     minhaConta.saldo = -5000;   // Nada impede esse valor inválido


Por que acontece: parece mais rápido no início, mas quebra o encapsulamento e permite que qualquer parte do programa
altere o objeto sem nenhum controle.

- Confundir private com protected:

    public class ContaBancaria {
        private double saldo;
}

    public class ContaPoupanca extends ContaBancaria {
        void exibir() {
          System.out.println(saldo);    // Erro: saldo é privado na classe pai.
    }
}

Por que acontece: private só libera acesso dentro da própria classe, nem mesmo quem herda consegue enxergar. Para isso,
o correto seria usar protected.

-------------------------------------------------------------
BOAS PRÁTICAS
-------------------------------------------------------------
- Atributos private por padrão: comece protegendo o estado do objeto e só abra acesso (através de métodos) quando
realmente for necessário.

- Public apenas para o que for "porta de entrada" da classe: métodos que o restante do programa realmente precisa chamar.

- Evite protected sem necessidade real de herança: usar protected sem um motivo claro abre brechas de acesso que não
são preciso.

- Prefira métodos a atributos abertos: se algo precisa ser lido ou alterado de fora, crie métodos públicos em vez de
tornar o atributo público.

-------------------------------------------------------------
ANALOGIA
-------------------------------------------------------------
Imagine uma casa. Cada cômodo tem nível de acesso diferente para visitas.

public > a sala de estar. Qualquer visita pode entrar sem pedir permissão.

protected > o quarto reservado a família. Só quem é "da família" (subclasses) ou mora na mesma casa (mesmo pacote) pode
entrar.

(default) > os cômodos comuns da casa, como a cozinha. Só quem mora ali (mesmo pacote) tem acesso livre.

private > o cofre do quarto. Só o dono (a própria classe) pode abrir e mexer no conteúdo. Nem visita,
nem família tem a chave.


-------------------------------------------------------------
RESUMO
-------------------------------------------------------------
Modificadores de acesso (public, private, protected e default) controlam quem pode enxergar e utilizar uma classe, atributos
ou métodos. Eles existem para proteger o estado interno dos objetos (Encapsulamento), permitindo que cada classe controle
como seus dados podem ser acessados ou alterados.

A regra geral é: atributos private, métodos públicos como "porta de entrada", e protected/ default usados com mais
critérios, geralmente ligados a herança ou organização em pacote.
=============================================================
*/

        // -----------------------------------------------------
        // EXEMPLO PRÁTICO - CÓDIGO INCORRETO (com observações)
        // -----------------------------------------------------

        // ❌ Errado / ingênuo: declarar o atributo como private e
        // tentar alterá-lo diretamente de fora da classe.
        //
        //  static class ContaBancaria {
        //     private double saldo;
        // }
        //
        // ContaBancaria minhaConta = new ContaBancaria();
        // minhaConta.saldo = 500;
        //
        // Porque falha: saldo é private, ou seja, só a própria classe ContaBancaria pode acessá-lo.
        //Qualquer tentativa de acesso vindo de fora não compila: "saldo has private access in ContaBancaria"


        // -----------------------------------------------------
        // EXEMPLO PRÁTICO - CÓDIGO CORRETO (com observações)
        // -----------------------------------------------------


    static class ContaBancaria {

        // O saldo da conta.
        // Atributo private, somente a própria classe pode acessá-lo diretamente.
        private double saldo;


        // Método public: porta de entrada segura para depositar valores.
        public void depositar(double valor) {

            // Só realiza o depósito se o valor for maior que zero.
            if (valor > 0) {

                // Soma o valor informado ao saldo atual.
                // Exemplo: saldo = 1000 e valor = 200
                // Resultado: saldo passa a ser 1200.
                saldo += valor;
            }
        }

        // Método public: porta de entrada segura para sacar valores.
        public void sacar(double valor) {

            // O saque só acontece se:
            // 1. O valor for maior que zero.
            // 2. Houver saldo suficiente na conta.
           if (valor > 0 && valor <= saldo) {

               // Subtrai o valor do saldo atual.
               saldo -= valor;
           }
        }

        // Método public: permite consultar o saldo sem expor o atributo.
        public double consultarSaldo() {

            // retorne o valor armazenado na variável saldo
            return saldo;
        }


    }


    public static void main(String[] args) {

        // Criamos um objeto da classe ContaBancaria.
        ContaBancaria minhaConta = new ContaBancaria();


        // Não conseguimos fazer minhaConta.saldo = 500 (saldo é private).
        // Precisamos usar os métodos da classe.

        // Deposita R$ 1.000 na conta.
        // Saldo: 0 -> 1000
        minhaConta.depositar(1000);

        // Saca R$ 300 da conta.
        minhaConta.sacar(300);

        // Consultando o saldo através do método público e imprime o resultado na tela
        System.out.println("Saldo atual: R$ " + minhaConta.consultarSaldo());

    }
}

/*
=============================================================
DESAFIO
=============================================================
Crie uma classe Funcionario. Ela deve possuir os seguintes atributos, todos private:
- nome
- cargo
- salario

1. Crie métodos public para acessar e alterar cada atributo de forma controlada:

- exibirDados(): imprime nome, cargo e salário do funcionário.

- aumentarSalario(double percentual): aumenta o salário com base em um percentual
recebido como parâmetro.

Exemplo:
funcionario1.aumentarSalario(10);

Resultado:
Salário atualizado: R$ 3300.00

2. Crie pelo menos dois objetos da classe Funcionario, com valores diferentes.

Funcionario funcionario1 = new Funcionario();

3. Tente, de propósito, acessar um atributo private diretamente de fora da classe
(dentro do main), como:

funcionario1.salario = 5000;

Observe o erro que o Java apresenta e entenda por que ele acontece.

4. Depois, comente essa linha (ou apague) e utilize apenas os métodos public
para alterar os dados corretamente.

Explique com suas próprias palavras:
Por que é melhor alterar o salário através do método aumentarSalario() do que
diretamente pelo atributo, mesmo que os dois "cheguem" ao mesmo resultado final?

- Atributos private como estado protegido do objeto.
- Métodos public como porta de entrada controlada.
- Encapsulamento evitando alterações indevidas.

=============================================================
VOCÊ SABIA?
=============================================================
Uma curiosidade sobre Java é que os modificadores de acesso também podem ser aplicados às
próprias classes, não só a atributos e métodos.

Uma classe top-level (aquela que fica direto no arquivo, fora de outra classe) só pode ser
public ou (default), nunca private ou protected. Já uma classe interna (dentro de outra
classe) pode usar qualquer um dos quatro modificadores, inclusive private.

Isso significa que é possível criar uma classe que só existe e só pode ser usada "por dentro"
de outra, ficando completamente invisível para o restante do programa.

=============================================================
REFERÊNCIAS
=============================================================
- Documentação oficial: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
=============================================================
*/