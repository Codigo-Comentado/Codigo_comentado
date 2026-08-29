""" L03 - Fluxograma
@modulo         Lógica de Programação
@roadmap        c01_logica_de_programacao → L03
@trilha         Python → Lógica de Programação → 🟢 Básico
@nivel          🟢 Básico
@prerequisitos  L02_Algoritmos
@proximos       L04_Pseudocodigo
@autor          FXArth
@atualizado     27/08/2026
@tempoLeitura   10 min
"""


# ---------------------------------------------------------------
# O QUE É?
# ---------------------------------------------------------------
# Um fluxograma é a representação visual de um algoritmo. Ele utiliza 
# formas geométricas padronizadas conectadas por setas para demonstrar 
# o passo a passo e o fluxo de execução de um processo ou programa, 
# desde o seu início até a sua conclusão.


# ---------------------------------------------------------------
# COMO FUNCIONA?
# ---------------------------------------------------------------
# O fluxograma funciona mapeando ações e decisões para símbolos específicos:
# - Oval (Cápsula): Indica o Início ou o Fim do processo.
# - Paralelogramo: Indica Entrada ou Saída de dados (ex: ler uma variável).
# - Retângulo: Indica um Processamento ou ação (ex: fazer um cálculo).
# - Losango: Indica uma Decisão (ex: uma pergunta que gera caminhos de Sim/Não).
# As setas indicam a direção que a leitura (ou a execução) deve seguir.


# ---------------------------------------------------------------
# POR QUE EXISTE?
# ---------------------------------------------------------------
# O cérebro humano processa informações visuais muito mais rápido do que texto. 
# O fluxograma existe para facilitar o planejamento, a comunicação e a 
# documentação da lógica de programação antes que uma única linha de 
# código seja escrita. Ele transcende a barreira das linguagens (Python, Java, etc.).


# ---------------------------------------------------------------
# QUANDO USAR?
# ---------------------------------------------------------------
# - Ao planejar a lógica de um algoritmo complexo antes de programar.
# - Para explicar o funcionamento de um sistema para pessoas não-técnicas.
# - Para encontrar falhas lógicas (bugs) no fluxo de um programa existente.


# ---------------------------------------------------------------
# QUANDO EVITAR?
# ---------------------------------------------------------------
# - Em scripts extremamente curtos e triviais, onde o esforço de desenhar 
#   é maior que o de codificar.
# - Em sistemas colossais (um único fluxograma gigante fica ilegível; o 
#   ideal é quebrá-lo em pequenos fluxogramas modulares).


# ---------------------------------------------------------------
# VANTAGENS
# ---------------------------------------------------------------
# - Clareza visual: Torna a lógica complexa mais fácil de digerir.
# - Padronização: Qualquer programador no mundo entende os mesmos símbolos.
# - Planejamento: Evita que você comece a codificar na direção errada.


# ---------------------------------------------------------------
# DESVANTAGENS
# ---------------------------------------------------------------
# - Manutenção: Se a regra de negócio mudar, atualizar o desenho pode ser trabalhoso.
# - Espaço: Algoritmos muito grandes geram diagramas difíceis de ler na tela.


# ---------------------------------------------------------------
# BOAS PRÁTICAS
# ---------------------------------------------------------------
# - Siga o fluxo natural de leitura: de cima para baixo e da esquerda para a direita.
# - Nunca deixe cruzamentos de setas confusos ou "caminhos sem saída".
# - Mantenha o texto dentro das formas o mais breve e direto possível.


# ---------------------------------------------------------------
# ERROS MAIS COMUNS
# ---------------------------------------------------------------
# - Usar o símbolo errado (ex: colocar uma decisão dentro de um retângulo).
# - Esquecer de mapear o caminho do "Não" em um losango de decisão, 
#   criando um fluxo que simplesmente "desaparece" se a condição for falsa.


# ---------------------------------------------------------------
# ANALOGIA
# ---------------------------------------------------------------
# Pense no fluxograma como a planta baixa de uma casa feita por um arquiteto.
# Você não começaria a empilhar tijolos (escrever código) sem antes desenhar 
# onde ficam as portas e janelas. O fluxograma permite visualizar se a casa
# faz sentido antes de gastar material e tempo construindo-a.


# -----------------------------------------------------
# EXEMPLO PRÁTICO
# -----------------------------------------------------
# Fluxograma (representado em texto/ASCII) para o sistema de verificação
# de idade abaixo. Repare como AMBOS os caminhos da decisão (Sim e Não)
# levam a uma saída clara — nenhum dos dois "some" no meio do caminho.
#
#            ┌────────┐
#            │ Início │
#            └───┬────┘
#                │
#       ┌────────▼─────────┐
#       │  Ler idade (int)  │
#       └────────┬──────────┘
#                │
#         ┌──────▼───────┐
#         │ idade >= 18 ? │
#         └──┬────────┬──┘
#         Sim│        │Não
#  ┌──────────▼──┐  ┌──▼────────────┐
#  │  "Liberado" │  │  "Bloqueado"  │
#  └──────┬──────┘  └───────┬───────┘
#         │                 │
#         └────────┬────────┘
#                   │
#              ┌────▼───┐
#              │  Fim   │
#              └────────┘
#
# Abaixo, a tradução desse fluxograma para código Python.

def main():

    # ✔ Correto
    # A lógica abaixo segue exatamente o fluxograma desenhado acima:
    # os dois caminhos da decisão ("Sim" e "Não") têm um destino definido.
    print("--- Sistema de Acesso (Fluxograma Correto) ---")
    idade = 20 # Entrada

    if idade >= 18: # Decisão (Losango)
        print("Acesso Liberado!") # Saída (Caminho Sim)
    else:
        print("Acesso Bloqueado!") # Saída (Caminho Não)

    print("-" * 40)

    # -------------------------------------------------

    # ❌ Errado / ingênuo
    # Um fluxograma incompleto geralmente ignora o caminho negativo de uma
    # decisão. Veja como o diagrama abaixo já nasce "quebrado": o caminho
    # "Não" simplesmente não existe, então o fluxo não tem para onde ir
    # se a condição falhar.
    #
    #            ┌────────┐
    #            │ Início │
    #            └───┬────┘
    #                │
    #       ┌────────▼─────────┐
    #       │  Ler idade (int)  │
    #       └────────┬──────────┘
    #                │
    #         ┌──────▼───────┐
    #         │ idade >= 18 ? │
    #         └──┬───────────┘
    #         Sim│      ？ <- Caminho "Não" nunca foi desenhado!
    #  ┌──────────▼──┐
    #  │  "Liberado" │
    #  └──────┬──────┘
    #         │
    #    ┌────▼───┐
    #    │  Fim   │
    #    └────────┘
    #
    # Se traduzirmos esse diagrama mal feito para código, o programa falha
    # silenciosamente ou deixa o usuário sem resposta se a condição não
    # for atendida.
    print("--- Sistema de Acesso (Fluxograma Incompleto) ---")
    idade_errada = 15 # Entrada

    if idade_errada >= 18:
        print("Acesso Liberado!")

    # Faltou o tratamento do "Não". O usuário de 15 anos não recebe feedback algum!
    print("Fim do programa (O usuário não soube o que aconteceu).")


if __name__ == "__main__":
    main()

# ---------------------------------------------------------------
# EXERCÍCIO
# ---------------------------------------------------------------
# Pegue um papel e uma caneta. Desenhe um fluxograma simples para a 
# seguinte situação: "Atravessar uma rua com semáforo". 
# Dica: Use um losango para perguntar "O sinal está verde para pedestres?". 
# Lembre-se de mapear o que acontece no "Sim" (atravessar) e no "Não" (esperar).


# ---------------------------------------------------------------
# CURIOSIDADES
# ---------------------------------------------------------------
# Os primeiros fluxogramas foram apresentados em 1921 por Frank e Lillian 
# Gilbreth à Sociedade Americana de Engenheiros Mecânicos. Eles usavam isso 
# para otimizar fluxos de trabalho industriais, muito antes dos computadores 
# modernos existirem!


# ---------------------------------------------------------------
# RESUMO
# ---------------------------------------------------------------
# Fluxogramas são ferramentas visuais poderosas que utilizam formas geométricas 
# para planejar e demonstrar o passo a passo de um algoritmo. Eles ajudam a 
# estruturar a lógica, evitar erros antes da codificação e facilitar a 
# comunicação entre a equipe.


# ---------------------------------------------------------------
# REFERÊNCIAS (opcional)
# ---------------------------------------------------------------
# - Símbolos de fluxograma (Lucidchart): https://www.lucidchart.com/pages/pt/simbolos-de-fluxograma