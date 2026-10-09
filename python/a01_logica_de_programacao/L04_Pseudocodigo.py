"""
L04 - Pseudocódigo

@modulo         Lógica de Programação
@roadmap        c01_logica_de_programacao → L04
@trilha         Python → Lógica de Programação → 🟢 Básico
@nivel          🟢 Básico
@prerequisitos  L03_Fluxograma
@proximos       L05_Variaveis

@autor          FXArth
@atualizado     21/09/2026
@tempoLeitura   10 min
"""

# ---------------------------------------------------------------
# O QUE É?
# ---------------------------------------------------------------
# Pseudocódigo é uma maneira de descrever a lógica de um algoritmo 
# utilizando uma linguagem simples e próxima da humana (como o português).
# Ele atua como um "falso código", ou seja, não foi feito para ser lido por 
# um computador ou compilador, mas sim para facilitar o raciocínio humano.



# ---------------------------------------------------------------
# COMO FUNCIONA?
# ---------------------------------------------------------------
# Por não ser uma linguagem formal, não existem regras de sintaxe rígidas.
# Você escreve o passo a passo estruturando as ideias de forma clara 
# (ex: "SE chover ENTÃO pegue o guarda-chuva"), concentrando-se apenas 
# no fluxo lógico que o programa deverá seguir.



# ---------------------------------------------------------------
# POR QUE EXISTE?
# ---------------------------------------------------------------
# Ele existe para separar o raciocínio lógico da sintaxe da linguagem.
# Tentar resolver um problema complexo e ao mesmo tempo lembrar se
# você deve usar chaves, dois pontos ou indentação pode sobrecarregar
# a mente. O pseudocódigo permite focar 100% na solução do problema.



# ---------------------------------------------------------------
# QUANDO USAR?
# ---------------------------------------------------------------
# - Ao planejar sistemas ou algoritmos complexos antes da codificação.
# - Em entrevistas de emprego (para demonstrar sua linha de raciocínio).
# - Ao validar e discutir regras de negócio com equipes que não programam.



# ---------------------------------------------------------------
# QUANDO EVITAR?
# ---------------------------------------------------------------
# - Em algoritmos extremamente simples e óbvios de 2 ou 3 linhas.
# - Quando a equipe já mapeou a mesma regra usando fluxogramas visuais
#   extremamente detalhados.



# ---------------------------------------------------------------
# VANTAGENS
# ---------------------------------------------------------------
# - Acessibilidade: Qualquer pessoa, técnica ou não, consegue entender.
# - Foco: Reduz a carga cognitiva ao remover a preocupação com a sintaxe.
# - Universalidade: O mesmo pseudocódigo pode ser traduzido para Python, Java ou C#.



# ---------------------------------------------------------------
# DESVANTAGENS
# ---------------------------------------------------------------
# - Não executável: Não é possível compilar ou rodar o pseudocódigo para testes automatizados.
# - Sem padronização estrita: Se a equipe não entrar em consenso sobre as palavras, 
#   cada um escreverá de um jeito.



# ---------------------------------------------------------------
# BOAS PRÁTICAS
# ---------------------------------------------------------------
# - Use palavras-chave consistentes que remetam a estruturas reais (LEIA, IMPRIMA, SE, SENAO).
# - Mantenha a indentação (espaçamento) para indicar hierarquia e blocos de código,
#   facilitando muito a tradução posterior para o Python.



# ---------------------------------------------------------------
# ERROS MAIS COMUNS
# ---------------------------------------------------------------
# - Misturar sintaxe real de uma linguagem no pseudocódigo (ex: usar print() 
#   ou console.log() em vez de "IMPRIMA"). Isso mata a universalidade.
# - Ser abstrato ou vago demais (ex: "faça o cálculo do imposto"). O computador
#   precisa do detalhamento lógico desse cálculo.



# ---------------------------------------------------------------
# ANALOGIA
# ---------------------------------------------------------------
# Escrever pseudocódigo é como fazer o "rascunho" ou o "esqueleto" de uma redação.
# No rascunho, você joga suas ideias no papel, organiza a ordem lógica dos 
# parágrafos e o sentido do texto, sem se preocupar tanto com a caligrafia 
# final ou as regras mais estritas de formatação. Só depois de pronto, você 
# traduz isso para a versão definitiva (código).



# -----------------------------------------------------
# EXEMPLO PRÁTICO
# -----------------------------------------------------

def main():
    
    # ✔ Correto
    # Abaixo, temos um pseudocódigo planejado em português estruturado,
    # seguido imediatamente pela sua tradução exata em Python.
    
    """
    PSEUDOCÓDIGO (Rascunho):
    Início
        Leia a temperatura
        SE a temperatura for maior que 30:
            Imprima "Está muito quente!"
        SENÃO:
            Imprima "O clima está agradável."
    Fim
    """
    
    print("--- Tradução do Pseudocódigo ---")
    temperatura = 32
    
    if temperatura > 30:
        print("Está muito quente!")
    else:
        print("O clima está agradável.")
    print("-" * 40)
    
    # -------------------------------------------------
    
    # ❌ Errado / ingênuo
    # Tentar planejar o algoritmo misturando conceitos de linguagens diferentes,
    # perdendo a legibilidade e o propósito do pseudocódigo.
    
    """
    PSEUDOCÓDIGO CONFUSO:
    # O estudante misturou declaração de variáveis com sintaxe de outras linguagens
    var temp = 32
    if temp > 30 { console.log quente }
    """
    print("O pseudocódigo acima falhou no propósito de ser focado apenas na lógica da solução.\n")


if __name__ == "__main__":
    main()



# ---------------------------------------------------------------
# EXERCÍCIO
# ---------------------------------------------------------------
# Desafio: Escreva um pequeno pseudocódigo nos comentários do seu arquivo 
# para resolver a seguinte regra de negócio: "Verificar se um aluno passou 
# de ano (precisa de nota maior ou igual a 7)". 
# Depois de mapear a lógica, tente traduzir isso para código Python!



# ---------------------------------------------------------------
# CURIOSIDADES
# ---------------------------------------------------------------
# Ferramentas como o "VisuAlg" tornaram-se extremamente populares no Brasil 
# por permitirem compilar e rodar algoritmos escritos em português 
# estruturado (o famoso "Portugol"), ajudando muitos estudantes a 
# validar suas lógicas iniciais antes de irem para uma linguagem oficial.



# ---------------------------------------------------------------
# RESUMO
# ---------------------------------------------------------------
# O pseudocódigo é uma ferramenta fundamental de planejamento textual. Ele permite
# esquematizar o fluxo e as decisões lógicas de um algoritmo em uma linguagem
# próxima à humana, isolando o estudante da complexidade sintática de linguagens reais.



# ---------------------------------------------------------------
# REFERÊNCIAS
# ---------------------------------------------------------------
# - Planejamento com Pseudocódigo (Khan Academy): https://pt.khanacademy.org/computing/computer-programming/programming/good-practices/pt/planning-with-pseudo-code
