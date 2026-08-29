""" L02 - Algoritmos
@modulo         Lógica de Programação
@roadmap        c01_logica_de_programacao → L02
@trilha         Python → Lógica de Programação → 🟢 Básico
@nivel          🟢 Básico
@prerequisitos  L01_OQueEProgramacao
@proximos       L03_Fluxograma
@autor          FXArth
@atualizado     27/08/2026
@tempoLeitura   10 min
"""


# ---------------------------------------------------------------
# O QUE É?
# ---------------------------------------------------------------
# Um algoritmo é uma sequência finita de passos lógicos, ordenados e 
# bem definidos para resolver um problema ou realizar uma tarefa. 
# Embora a palavra pareça complexa e técnica, algoritmos não são 
# exclusivos da programação; nós os usamos o tempo todo na vida real.


# ---------------------------------------------------------------
# COMO FUNCIONA?
# ---------------------------------------------------------------
# Todo algoritmo geralmente segue um fluxo de três etapas:
# 1. Entrada (Input): Os ingredientes ou dados iniciais.
# 2. Processamento: As instruções passo a passo do que fazer com os dados.
# 3. Saída (Output): O resultado final desejado.
# 
# O computador lê essas instruções sequencialmente, de cima para baixo,
# executando uma a uma rigorosamente como foi escrito.


# ---------------------------------------------------------------
# POR QUE EXISTE?
# ---------------------------------------------------------------
# Computadores são máquinas extremamente rápidas, porém não possuem 
# intuição ou capacidade de dedução. Os algoritmos existem para "traduzir" 
# a nossa intenção em uma série de comandos exatos que a máquina seja 
# capaz de executar sem divergências.


# ---------------------------------------------------------------
# QUANDO USAR?
# ---------------------------------------------------------------
# Algoritmos são a base de absolutamente todo software. 
# - Desde o cálculo do total de um carrinho de compras em uma loja online.
# - Até o sistema de recomendação que escolhe o próximo vídeo para você assistir.
# Na vida real, o usamos ao seguir uma receita médica ou o GPS do carro.


# ---------------------------------------------------------------
# QUANDO EVITAR?
# ---------------------------------------------------------------
# Na programação, não há como "evitar" algoritmos, pois o código É o algoritmo.
# Porém, deve-se evitar algoritmos excessivamente complexos para problemas 
# simples, buscando sempre a solução mais limpa e direta.


# ---------------------------------------------------------------
# VANTAGENS
# ---------------------------------------------------------------
# - Reprodutibilidade: Se seguir os mesmos passos exatos, terá o mesmo resultado.
# - Eficiência: Permite otimizar a resolução de um problema.
# - Automação: Um bom algoritmo pode ser executado milhões de vezes por uma máquina.


# ---------------------------------------------------------------
# DESVANTAGENS
# ---------------------------------------------------------------
# - Rigidez: Se um passo estiver fora de ordem, todo o processo pode falhar.
# - Exige precisão: O computador não "adivinha" o que você quis dizer. Se faltar
#   uma instrução, o programa quebra.


# ---------------------------------------------------------------
# BOAS PRÁTICAS
# ---------------------------------------------------------------
# - Planeje antes de codar: Escreva os passos no papel ou em português 
#   estruturado (pseudocódigo) antes de ir para o Python.
# - Mantenha simples (KISS - Keep It Simple, Stupid): Um passo deve fazer 
#   apenas uma coisa clara.


# ---------------------------------------------------------------
# ERROS MAIS COMUNS
# ---------------------------------------------------------------
# - Inversão de ordem: Tentar usar um dado que ainda não foi calculado ou lido.
# - Omissão de passos lógicos: Assumir que o computador vai entender algo "óbvio" 
#   que não foi explicitamente programado.


# ---------------------------------------------------------------
# ANALOGIA
# ---------------------------------------------------------------
# Imagine um algoritmo como um manual de montagem de um móvel.
# Se você tentar colocar o tampo da mesa (Saída) antes de parafusar as 
# pernas (Processamento), a mesa vai cair. O manual tem uma ordem 
# numerada exatamente para que, não importa quem monte, a mesa fique 
# pronta e firme no final.


# -----------------------------------------------------
# EXEMPLO PRÁTICO
# -----------------------------------------------------
# Abaixo, criamos um algoritmo simples para calcular a média de 
# notas de um aluno e decidimos se ele está aprovado.


def main():
    
    # ✔ Correto
    # O algoritmo segue a ordem natural de: Entrada -> Processamento -> Saída
    print("--- Calculadora de Média (Algoritmo Correto) ---")
    
    # 1. Entrada
    nota_1 = 8.0
    nota_2 = 6.0
    
    # 2. Processamento
    soma_das_notas = nota_1 + nota_2
    media = soma_das_notas / 2
    
    # 3. Saída
    print(f"Sua média foi: {media}")
    print("Status: Algoritmo finalizado com sucesso!\n")
    
    # -------------------------------------------------
    
    # ❌ Errado / ingênuo
    # Tentar calcular a média antes de definir quais são as notas.
    # O computador não saberá resolver o processamento sem a entrada prévia.
    # (Este código está comentado para não quebrar o programa)
    print("--- Calculadora de Média (Algoritmo Errado) ---")
    print("Se executássemos isso:")
    print("# media = (nota_x + nota_y) / 2")
    print("# nota_x = 8.0")
    print("# nota_y = 6.0")
    print("O programa daria um erro 'NameError' porque 'nota_x' não existe ainda.\n")


if __name__ == "__main__":
    main()


# ---------------------------------------------------------------
# EXERCÍCIO
# ---------------------------------------------------------------
# Desafio: Escreva um algoritmo em comentários (sem precisar de código Python complexo) 
# que descreva os passos lógicos e ordenados para "Trocar a lâmpada queimada do teto".
# Pense em todos os pequenos detalhes: pegar a escada, desligar o interruptor, etc.
# Lembre-se, o computador não entende "apenas troque", você precisa dar a sequência exata!


# ---------------------------------------------------------------
# CURIOSIDADES (opcional)
# ---------------------------------------------------------------
# A palavra "algoritmo" tem origem no nome do matemático persa do 
# século IX, Abdullah Muhammad bin Musa al-Khwarizmi. Os europeus 
# latinizaram o seu nome para "Algoritmi", que inicialmente significava 
# "o sistema decimal" e, posteriormente, a sequência de passos para 
# resolver um problema.


# ---------------------------------------------------------------
# RESUMO
# ---------------------------------------------------------------
# Um algoritmo é uma receita estruturada passo a passo que recebe uma 
# entrada (input), processa esses dados através de instruções e gera 
# um resultado (output). Ele é a fundação da programação, pois traduz 
# as intenções humanas para a linguagem das máquinas.


# ---------------------------------------------------------------
# REFERÊNCIAS (opcional)
# ---------------------------------------------------------------
# - O que é um Algoritmo? (Khan Academy): https://pt.khanacademy.org/computing/computer-science/algorithms
