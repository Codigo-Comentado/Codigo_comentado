"""
A01 - Utilização e Manipulação de Objetos em Python

@modulo         Programação Orientada a Objetos
@roadmap        Módulo 1 → A01
@trilha         Python → Programação Orientada a Objetos → Básico
@nivel          🟢 Básico
@prerequisitos  Lógica de programação básica e conhecimentos básicos sobre classes e construtores
@proximos       Encapsulamento, Herança, Polimorfismo

@autor          Lucas Lima (ohlm1)
@atualizado     01/08/2026
@tempoLeitura   20 min
"""


# ---------------------------------------------------------------
# O QUE É?
# ---------------------------------------------------------------
# Um objeto é uma instância de uma classe criada em tempo de execução.
# Enquanto a classe representa o molde ou modelo que define atributos e métodos,
# o objeto é a entidade concreta gerada a partir desse molde, possuindo seus
# próprios dados (atributos) e sendo capaz de executar comportamentos (métodos).


# ---------------------------------------------------------------
# CLASSE x OBJETO
# ---------------------------------------------------------------
# Classe:
# É o molde que define como os objetos serão criados.
#
# Objeto:
# É uma instância da classe, possuindo seus próprios atributos e podendo
# executar os métodos definidos pelo molde.
#
# Exemplo:
# Classe: Carro
# Objetos:
# - Fusca Azul
# - Civic Preto
# - Gol Branco
#
# Todos foram criados a partir da mesma classe, mas cada um possui seu
# próprio estado e funciona de forma independente.


# ---------------------------------------------------------------
# COMO FUNCIONA?
# ---------------------------------------------------------------
# O processo de criação de um objeto é chamado de instanciação. Quando você
# chama o nome da classe como se fosse uma função (passando os argumentos
# necessários ao método `__init__`, por exemplo: `carro_1 = Carro("Fusca", "Azul")`),
# o Python cria um novo objeto na memória e retorna uma referência para ele.
#
# Essa referência pode ser armazenada em uma variável, permitindo acessar seus
# atributos e métodos por meio do operador ponto (`.`).
#
# O operador ponto (`.`) é utilizado para acessar os atributos e métodos
# pertencentes àquele objeto.


# ---------------------------------------------------------------
# POR QUE EXISTE?
# ---------------------------------------------------------------
# Para permitir que programas de computador simulem o mundo real de maneira
# organizada e intuitiva.
#
# Sem objetos, precisaríamos gerenciar dezenas de variáveis soltas ou
# dicionários complexos para representar itens do sistema, o que torna o código
# confuso, difícil de escalar e propenso a erros.
#
# Os objetos agrupam dados e comportamentos em uma única unidade coesa e isolada.


# ---------------------------------------------------------------
# QUANDO USAR?
# ---------------------------------------------------------------
# - Sempre que precisar representar entidades do mundo real (como usuários,
# produtos, carrinhos de compras ou contas bancárias) em um sistema.
#
# - Quando o seu programa precisa gerenciar múltiplos itens que compartilham
# a mesma estrutura, mas possuem dados e estados completamente independentes.
#
# - Quando você deseja organizar o código em módulos reutilizáveis e fáceis
# de dar manutenção.


# ---------------------------------------------------------------
# QUANDO EVITAR?
# ---------------------------------------------------------------
# - Em automatizadores simples ou scripts muito pequenos, onde funções
# procedurais puras resolvem o problema com muito mais rapidez e menos burocracia.
#
# - Cuando não há necessidade de manter estado ou dados persistentes durante
# a execução da rotina.


# ---------------------------------------------------------------
# VANTAGENS
# ---------------------------------------------------------------
# - Isolamento e Independência: Cada objeto gerencia seus próprios dados na
# memória, impedindo que a alteração em um afete o outro.
#
# - Reutilização de Código: A mesma classe pode ser reutilizada para criar quantos
# objetos forem necessários.
#
# - Clareza e Organização: Facilita a leitura do código, aproximando a
# lógica de programação da nossa compreensão do mundo real.
#
# - Modularidade: Permite que diferentes partes do sistema interajam
# passando objetos estruturados entre si de forma limpa.


# ---------------------------------------------------------------
# DESVANTAGENS
# ---------------------------------------------------------------
# - Maior Consumo de Recursos: Objetos consomem não apenas memória, mas também
# possuem um pequeno custo de criação e gerenciamento.
#
# - Curva de Aprendizado Inicial: Exige que o desenvolvedor compreenda conceitos
# como classes, objetos, referências e encapsulamento.
#
# - Custo de Abstração: Em projetos minúsculos, a criação de classes e objetos
# pode gerar uma complexidade desnecessária (o chamado *over-engineering*).

# ---------------------------------------------------------------
# BOAS PRÁTICAS
# ---------------------------------------------------------------
# - Dê nomes significativos e intuitivos às instâncias (evite nomes genéricos
# como `obj1` ou `x`, prefira nomes como `cliente_ativo` ou `carro_esporte`).
#
# - Sempre que fizer sentido, utilize métodos ou propriedades (`@property`)
# para controlar alterações importantes nos dados do objeto, preservando
# sua consistência.
#
# - Mantenha os objetos focados em representar uma única responsabilidade
# ou conceito lógico bem definido dentro do sistema.


# ---------------------------------------------------------------
# ERROS MAIS COMUNS
# ---------------------------------------------------------------
# - Tentar chamar um método de instância diretamente pela classe:
# Chamar uma função diretamente na classe (ex: `Computador.ligar()`)
# sem passar um objeto real, gerando erro de tipo.
#
# - Criar uma instância sem armazenar sua referência:
# Instanciar um objeto (por exemplo, `Computador("Dell", "16GB")`)
# sem atribuí-lo a uma variável.
# Embora o objeto seja criado, ele não poderá ser reutilizado posteriormente.
#
# - Acessar um atributo que não existe:
# Tentar ler ou manipular um dado que nunca foi inicializado na instância,
# gerando um `AttributeError`.
#
# - Confundir instâncias:
# Achar que alterar um atributo em um objeto vai mudar automaticamente
# o valor em outro objeto criado pela mesma classe.
#
# - Esquecer o uso do operador ponto (`.`):
# Tentar acessar um atributo digitando seu nome solto dentro dos métodos
# ou fora deles, sem vinculá-lo à referência correta.


# ---------------------------------------------------------------
# ANALOGIA
# ---------------------------------------------------------------
# Pense em uma planta arquitetônica de uma casa projetada por um engenheiro
# (a Classe).
#
# Essa planta define onde ficam as paredes, as portas e os quartos, mas você
# não pode morar dentro de um pedaço de papel.
#
# Quando a construtora ergue a casa física em um terreno específico, ela cria
# uma instância desse projeto (o Objeto).
#
# Você pode construir dez casas idênticas usando a mesma planta original,
# mas cada casa física estará em um endereço diferente, poderá ter uma cor
# de parede diferente e a mobília de uma não interfere na da outra.


# ---------------------------------------------------------------
# EXEMPLO PRÁTICO
# ---------------------------------------------------------------
# Sempre que possível, mostre o jeito CORRETO e, em seguida,
# um jeito ERRADO ou ingênuo, comparando os dois.


# ✔ Correto


class Carro:
    def __init__(self, modelo, cor):
        # Atributos de instância que tornam cada objeto único
        self.modelo = modelo
        self.cor = cor

    def apresentar(self):
        # Método que utiliza os dados específicos deste objeto
        return f"Carro modelo: {self.modelo}, Cor: {self.cor}"

    def pintar(self, nova_cor):
        # Método para alterar o estado do objeto de forma segura
        self.cor = nova_cor
        return f"O {self.modelo} foi repintado para {self.cor}"


# 1. Instanciação correta: criamos objetos independentes na memória
carro_1 = Carro("Fusca", "Azul")
carro_2 = Carro("Civic", "Preto")


# 2. Utilizando o operador ponto (.) para acessar métodos e atributos
print(carro_1.apresentar())
# Saída: Carro modelo: Fusca, Cor: Azul

print(carro_2.apresentar())
# Saída: Carro modelo: Civic, Cor: Preto


# 3. Alterando o estado de apenas um objeto sem afetar o outro
print(carro_1.pintar("Vermelho"))

print(carro_1.apresentar())
# Saída: Carro modelo: Fusca, Cor: Vermelho

print(carro_2.apresentar())
# Saída: Carro modelo: Civic, Cor: Preto (intacto!)


"""
Explicação escrita do Código Correto:

Neste exemplo, a classe `Carro` serve como molde. Ao executarmos
`carro_1 = Carro("Fusca", "Azul")`, o Python cria uma nova instância da
classe `Carro` e retorna uma referência para esse objeto.

O mesmo acontece para `carro_2`. O uso do operador ponto nos permite acionar
os métodos `apresentar` e `pintar` direcionados à instância correspondente.

Como resultado, podemos mudar a cor do Fusca para vermelho sem que o Civic
sofra qualquer alteração, demonstrando que cada objeto mantém seu próprio estado.
"""


# ❌ Errado / ingênuo


class Computador:
    def __init__(self, marca, memoria):
        self.marca = marca
        self.memoria = memoria

    def ligar(self):
        return f"O computador da marca {self.marca} está ligando..."


# ERRO 1:
# Tentar chamar um método de instância diretamente pela classe

try:
    print(Computador.ligar())

except TypeError as erro_tipo:
    print(f"Erro capturado com sucesso: {erro_tipo}")


# ERRO 2:
# Criar uma instância sem armazenar sua referência

Computador("Dell", "16GB")


# ERRO 3:
# Acessar um atributo que não existe


class Pessoa:
    def __init__(self, nome):
        self.nome = nome


pessoa = Pessoa("Lucas")


try:
    print(pessoa.idade)

except AttributeError as erro:
    print(f"Erro capturado com sucesso: {erro}")


"""
Explicação escrita do Código Incorreto:

O primeiro erro demonstra o cenário em que o desenvolvedor tenta executar
um método de instância diretamente pela classe (`Computador.ligar()`).

Como esse método depende do parâmetro `self`, que representa uma instância
específica, o Python gera um `TypeError`.

O segundo erro mostra que, embora o objeto seja criado normalmente,
nenhuma variável mantém uma referência para ele.

Dessa forma, o objeto torna-se inacessível após sua criação e poderá ser
removido futuramente pelo coletor de lixo (Garbage Collector),
impossibilitando sua reutilização.

O terceiro erro ilustra a tentativa de ler um atributo que não foi
definido no construtor (`pessoa.idade`), fazendo com que o Python lance
um `AttributeError`.
"""


# ---------------------------------------------------------------
# MAIN
# ---------------------------------------------------------------

def main():
    """
    Código de demonstração executável.

    Neste arquivo, os exemplos principais já são executados diretamente
    durante a explicação do conceito, portanto a função main permanece
    apenas como ponto de entrada padrão do arquivo.
    """
    pass


if __name__ == "__main__":
    main()


# ---------------------------------------------------------------
# EXERCÍCIO
# ---------------------------------------------------------------
# Crie uma classe chamada `Livro` que receba no construtor (`__init__`)
# os atributos `titulo` e `autor`.
#
# Em seguida, crie um método chamado `detalhes` que retorne uma frase
# apresentando o livro.
#
# Por fim, instancie dois livros diferentes em variáveis distintas,
# chame o método de detalhes para ambos e exiba os resultados na tela
# provando que os objetos são totalmente independentes.


# ---------------------------------------------------------------
# CURIOSIDADES
# ---------------------------------------------------------------
# Em Python, praticamente tudo é um objeto — incluindo números inteiros,
# textos, listas e até mesmo as funções que você cria!
#
# Quando você escreve o número `10` no seu código, por trás dos panos
# o Python está criando uma instância da classe `int`, o que nos dá acesso
# a vários métodos embutidos que podemos usar diretamente neles
# (ex: `(10).bit_length()`).
#
# Isso acontece porque, em Python, tipos como `int`, `str`, `list`
# e `dict` também são classes.


# ---------------------------------------------------------------
# RESUMO
# ---------------------------------------------------------------
# Objetos são instâncias de uma classe.
#
# Cada objeto possui seus próprios atributos e pode executar métodos
# definidos pela classe, permitindo representar entidades de forma
# organizada, reutilizável e independente dentro de uma aplicação.


# ---------------------------------------------------------------
# REFERÊNCIAS
# ---------------------------------------------------------------
# - Documentação oficial do Python sobre Classes e Instâncias:
# https://docs.python.org/3/tutorial/classes.html