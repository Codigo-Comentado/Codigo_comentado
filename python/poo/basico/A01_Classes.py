"""
=============================================================
TEMA: Classes em Python

Nível:
🟢 Básico

Autor: Lucas Lima (ohlm1)
Última atualização: 17/07/2026
Pré-requisitos: Lógica de programação básica
Tempo estimado de leitura: 10 min
=============================================================

O QUE É?
-------------------------------------------------------------
Uma classe é o molde para criar objetos em Python. Ela define 
o conjunto de atributos (dados) e métodos (comportamentos) 
que os objetos criados a partir dela devem possuir.

-------------------------------------------------------------
COMO FUNCIONA?
-------------------------------------------------------------
Ao definir uma classe, você cria uma nova estrutura de dados. 
Quando você a chama como uma função, o Python executa o método 
`__init__` (construtor) para inicializar um novo objeto na 
memória com os estados definidos.

-------------------------------------------------------------
POR QUE EXISTE?
-------------------------------------------------------------
Sem classes, teríamos dados dispersos em variáveis simples 
ou dicionários difíceis de controlar. Classes permitem 
agrupar tudo relacionado a uma entidade em um único lugar, 
facilitando a manutenção e a reutilização.

-------------------------------------------------------------
QUANDO USAR?
-------------------------------------------------------------
Sempre que você precisar representar entidades do mundo real 
(ex: Usuário, Produto) ou gerenciar estados complexos que 
mudam ao longo da execução do programa.

-------------------------------------------------------------
QUANDO NÃO USAR?
-------------------------------------------------------------
Em scripts muito pequenos, puramente procedurais, onde o uso 
de funções simples ou dicionários resolvem o problema de 
forma mais rápida e menos complexa.

-------------------------------------------------------------
VANTAGENS
-------------------------------------------------------------
- Organização do código em blocos modulares.
- Facilita a reutilização e extensão de funcionalidades.
- Permite o uso de herança e polimorfismo.

-------------------------------------------------------------
DESVANTAGENS
-------------------------------------------------------------
- Pode adicionar complexidade (over-engineering) em scripts simples.
- Curva de aprendizado inicial para entender o uso do `self`.

-------------------------------------------------------------
ERROS MAIS COMUNS
-------------------------------------------------------------
- Esquecer de passar o `self` como primeiro argumento nos métodos.
- Tentar acessar atributos da classe sem ter criado uma instância.

-------------------------------------------------------------
BOAS PRÁTICAS
-------------------------------------------------------------
- Use nomes de classes em PascalCase.
- Mantenha métodos focados em uma única responsabilidade.

-------------------------------------------------------------
ANALOGIA
-------------------------------------------------------------
Imagine uma classe como um "molde de biscoito". O molde não 
é o biscoito, mas ele garante que todo biscoito feito com ele 
tenha o mesmo formato. Criar um objeto é o ato de pressionar 
o molde na massa.

-------------------------------------------------------------
RESUMO
-------------------------------------------------------------
Classes são moldes para objetos que unem dados e ações. Elas 
tornam o código mais organizado, reaproveitável e facilitam a 
modelagem de sistemas complexos.
-------------------------------------------------------------
"""

"""
-------------------------------------------------------------
EXEMPLO PRÁTICO
-------------------------------------------------------------
"""

"""
-------------------------------------------------------------
CÓDIGO CORRETO
-------------------------------------------------------------
"""

# Código completo (com observações)
class ContaBancaria:
    def __init__(self, titular, saldo_inicial): # self = referência ao objeto
        self.titular = titular                  # Armazena no objeto
        self.saldo = saldo_inicial              # Armazena no objeto

    def depositar(self, valor):                 # Método de instância
        self.saldo += valor                     # Atualiza atributo do objeto
        return self.saldo

    def consultar(self):                        # Acessa os dados do objeto
        return f"Titular: {self.titular} | Saldo: R$ {self.saldo:.2f}"


"""
Explicação escrita

O código correto utiliza o parâmetro 'self' como o primeiro argumento em 
todos os métodos. Isso é crucial porque o 'self' atua como uma ponte 
que conecta as variáveis (como titular e saldo) à instância específica 
da classe que foi criada. Sem o 'self', o Python não saberia diferenciar 
os dados da "Conta A" dos dados da "Conta B".
"""

"""
-------------------------------------------------------------
CÓDIGO INCORRETO
-------------------------------------------------------------
"""

# Código completo (com observações)
class ContaBancariaErrada:
    def __init__(titular, saldo_inicial): # ERRO: Faltou o 'self'
        titular = titular                 # ERRO: Apenas variável local
        saldo = saldo_inicial             # ERRO: Apenas variável local

    def depositar(valor):                 # ERRO: Faltou o 'self'
        saldo += valor                    # ERRO: 'saldo' não foi encontrado

    def consultar():                      # ERRO: Faltou o 'self'
        return f"Saldo: R$ {saldo:.2f}"   # ERRO: 'saldo' não existe no escopo


"""
Explicação escrita

Este código falha por três motivos principais: 
1. Omissão do 'self': Ao não incluir 'self' como primeiro parâmetro, o 
   Python não reconhece a relação entre a função e a instância. 
2. Escopo local: As atribuições 'titular = titular' criam variáveis 
   temporárias que são descartadas assim que o método termina; o objeto 
   continua vazio. 
3. NameError: Quando você tenta acessar 'saldo' nos métodos posteriores, 
   o interpretador não encontra essa variável, pois ela nunca foi 
   vinculada ao objeto (não foi usada com 'self.').
"""
"""
=============================================================
DESAFIO
=============================================================
Crie uma classe `Livro` com atributos `titulo` e `autor`. 
Crie um método que exibe essas informações. Explique por que 
usar uma classe é melhor do que manter o título e autor em 
variáveis soltas.

=============================================================
VOCÊ SABIA? (opcional)
=============================================================
Em Python, tudo é um objeto! Isso inclui inteiros, strings 
e até funções. Quando você define `x = 10`, você está criando 
uma instância da classe `int`.

=============================================================
REFERÊNCIAS
=============================================================
- Documentação oficial: https://docs.python.org/3/tutorial/classes.html
=============================================================
"""