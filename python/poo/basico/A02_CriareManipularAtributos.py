"""
=============================================================
TEMA: Criação e Manipulação de Atributos em Instancia

Nível:
🟢 Básico

Autor: Igor Rafael da Silva (Igor.py)
Última atualização: 31/07/2026
Pré-requisitos: Lógica de programação básica,
Tempo estimado de leitura: 30 min
=============================================================

O QUE É?
-------------------------------------------------------------
É o ato de definir quais dados de um objeto específico ele carrega,
como você lê ele e como se altera o mesmo ao longo do tempo.
-------------------------------------------------------------
COMO FUNCIONA?
-------------------------------------------------------------
A classe atua como a planta que define o modelo do objeto, 
enquanto a instância é o objeto real e único criado na memória a partir dessa planta. 
durante essa criação, o método __init__ entra em ação para definir os dados iniciais do objeto, 
utilizando o self para direcionar e salvar cada atributo como uma chave 
dentro do self.__dict__ (o mapa de memória daquele objeto)
assim, criar um atributo significa registrar uma nova chave dentro 
do self.__dict__, e manipulá-lo é o ato de consultar, alterar ou deletar 
os valores armazenados nessa estrutura, garantindo que cada instância
gerencie suas próprias informações de forma totalmente independente.


-------------------------------------------------------------
POR QUE EXISTE?
-------------------------------------------------------------
Existe para que cada objeto possa manter seus próprios dados organizados
e independentes, permitindo que o programa crie,acesse e altere as informações
de cada item de forma dinâmica sem misturar os dados nem duplicar código.
-------------------------------------------------------------
QUANDO USAR?
-------------------------------------------------------------
Sempre que você quiser que objetos do seu programa tenham
seus próprios dados e que você consiga altera-los e evolui-los 
ao longo do tempo

-------------------------------------------------------------
QUANDO NÃO USAR?
-------------------------------------------------------------
Você não deve usar quando: o dado for igual para todo objeto,
quando o dado é temporário, quando a classe não precisa guardar dados 
e quando o dado é sensível.
-------------------------------------------------------------
VANTAGENS
-------------------------------------------------------------
Isolamento de Dados: Cada objeto guarda suas próprias informações sem que as alterações feitas nele interfiram nos outros.
Reaproveitamento de Código: Permite usar a mesma estrutura de classe para criar infinitos objetos com valores totalmente diferentes.
Evolução Dinâmica: Dá a capacidade de o objeto mudar de estado ao longo do tempo para acompanhar os acontecimentos do programa.
Flexibilidade: Permite consultar, adicionar e modificar as características do objeto de forma prática em tempo de execução.
Segurança e Organização: Facilita o controle sobre como e quando os dados podem ser alterados através de regras e métodos.

-------------------------------------------------------------
DESVANTAGENS
-------------------------------------------------------------
Gasto de memória: Guardar dados repetidos em cada objeto gasta mais memória do computador.
Bagunça no código: Alterar valores direto no objeto pode gerar bugs e dificultar o teste do programa.
Perda de padrão: Criar ou apagar atributos só em um objeto deixa ele diferente dos outros e pode travar o código.
Um pouco mais lento: O computador demora um pouquinho a mais para procurar variáveis dentro do objeto do que em variáveis comuns.

-------------------------------------------------------------
ERROS MAIS COMUNS
-------------------------------------------------------------
Salva o dado em uma variável temporária em vez de guardar dentro do objeto.
Usar o dado antes de criar: Tenta ler uma informação que ainda não foi definida, fazendo o programa travar.
Misturar os dados de todos: Coloca a informação no lugar errado e faz todos os objetos compartilharem o mesmo dado sem querer.
Mudar o dado sem checar: Altera uma informação importante, correndo o risco de colocar um valor impossível ou errado.
Errar uma letra do nome: Digita o nome do dado errado e faz o computador criar uma informação nova em vez de atualizar a antiga.

-------------------------------------------------------------
BOAS PRÁTICAS
-------------------------------------------------------------
Crie todos os atributos dentro do método __init__ e altere seus valores apenas através de métodos, 
garantindo um padrão único e a segurança dos dados do objeto.

-------------------------------------------------------------
ANALOGIA
-------------------------------------------------------------
Criar atributos de instância é como dar a cada pessoa a sua própria carteira,
a forma da carteira é a mesma para todo mundo,mas o dinheiro 
e os documentos dentro de cada uma pertencem
e mudam só para o seu dono.

-------------------------------------------------------------
RESUMO
-------------------------------------------------------------
Criar um atriputo é dar um dado especificamente para um objeto,
enquando a parte de manipular é ler, alterar ou evoluir o mesmo
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


class Carro:

    def __init__(self, modelo, cor):
        # atributos são declarados aqui usando self
        self.modelo = modelo
        self.cor = cor

    def pintar(self, nova_cor):
         #alteração de dados feita com segurança através de um método
        self.cor = nova_cor


# cada objeto é criado com seus próprios dados isolados
carro_a = Carro("Fusca", "Azul")
carro_b = Carro("Civic", "Preto")

carro_a.pintar("Vermelho")  # muda apenas a cor do Fusca

print(carro_a.cor)  # vermelho
print(carro_b.cor)  # preto (continua intacto)


"""
Explicação escrita

Ao definir tudo dentro do método inicializador usando a palavra self,
você garante que cada objeto nasça com suas próprias informações totalmente isoladas na memória.
Dessa forma, criar dois carros com cores diferentes faz com que cada um mantenha seus próprios dados 
sem que um interfira no outro. Por fim, ao alterar os valores através de um método dedicado
em vez de mudar diretamente por fora, você garante que apenas o objeto correto seja atualizado com segurança.
"""

"""
-------------------------------------------------------------
CÓDIGO INCORRETO
-------------------------------------------------------------
"""

class Carro:
    cor = "Preto"  #virou atributo de classe (todos vão compartilhar a mesma cor)


meu_carro = Carro()

# esqueceu de criar o modelo no __init__ e tenta usar direto
print(meu_carro.modelo)  # o programa trava porque 'modelo' não existe.

# 3. digita o nome errado ao tentar mudar a cor
meu_carro.cro = "Azul"  # criou um atributo 'cro' sem querer e a 'cor' continuou 'Preto'


"""
Explicação escrita

ao declarar a variável diretamente no corpo da classe, 
você cria um dado compartilhado por todos em vez de individual, 
o que pode alterar o valor de todos os carros sem querer. 
também tentar ler um atributo que não foi criado no início faz o 
programa travar imediatamente com um erro. além disso,ao cometer um erro de
digitação ao alterar um valor de fora, o Python não te avisa do erro
e apenas cria um dado novo e inútil no objeto, mantendo o valor antigo intacto.
"""
"""
=============================================================
DESAFIO
=============================================================
Crie um programa onde você cadastra uma pessoa com o seu dinheiro inicial, 
adiciona um novo valor à conta dessa pessoa e no final mostra na tela o nome
dela junto com a quantia total atualizada.
=============================================================
REFERÊNCIAS
=============================================================
- Documentação oficial: https://docs.python.org/pt-br/3/reference/datamodel.html
- https://github.com/xavecoding/pandas-essencial/blob/main/manipulacao_de_dados_codigo_base.ipynb
=============================================================
"""