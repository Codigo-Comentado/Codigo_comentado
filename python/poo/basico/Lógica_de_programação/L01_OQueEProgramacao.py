""" L01 - O que é Programação
@modulo         Lógica de Programação
@roadmap        c01_logica_de_programacao → L01
@trilha         Python → Lógica de Programação → 🟢 Básico
@nivel          🟢 Básico
@prerequisitos  Nenhum
@proximos       L02_VariaveisETiposDeDados
@autor          FXArth
@atualizado     26/08/2026
@tempoLeitura   10 min
"""


# ---------------------------------------------------------------
# O QUE É?
# ---------------------------------------------------------------
# Programação é a arte de dar instruções a um computador para 
# que ele execute uma tarefa específica. Assim como usamos o 
# português para nos comunicar com outras pessoas, usamos as 
# linguagens de programação (como Python) para nos comunicar 
# com as máquinas.


# ---------------------------------------------------------------
# COMO FUNCIONA?
# ---------------------------------------------------------------
# Um computador não pensa por conta própria; ele apenas segue ordens. 
# A programação funciona quebrando um grande problema em pequenos 
# passos lógicos e sequenciais (um algoritmo). O computador lê esses 
# passos de cima para baixo e os executa de forma literal e exata.


# ---------------------------------------------------------------
# POR QUE EXISTE?
# ---------------------------------------------------------------
# Para automatizar tarefas e resolver problemas em grande escala. 
# Fazer cálculos complexos ou organizar milhares de dados manualmente 
# levaria anos. A programação existe para delegar esse trabalho pesado 
# para a máquina, que pode fazê-lo em frações de segundo.


# ---------------------------------------------------------------
# QUANDO USAR?
# ---------------------------------------------------------------
# - Para criar aplicativos de celular, sites e sistemas empresariais.
# - Para automatizar tarefas repetitivas do dia a dia (ex: planilhas).
# - Para analisar grandes volumes de dados.


# ---------------------------------------------------------------
# QUANDO EVITAR?
# ---------------------------------------------------------------
# Quando a tarefa é simples e pontual o suficiente para que o tempo 
# gasto escrevendo e testando um programa seja maior do que o tempo 
# para executá-la manualmente.


# ---------------------------------------------------------------
# VANTAGENS
# ---------------------------------------------------------------
# - Rapidez: Máquinas executam instruções em milissegundos.
# - Escala: Um código pode ser executado para uma ou um milhão de pessoas.
# - Automação: Reduz o trabalho manual e repetitivo.


# ---------------------------------------------------------------
# DESVANTAGENS
# ---------------------------------------------------------------
# - Rigidez: O computador faz exatamente o que você manda, inclusive erros.
# - Curva de aprendizado inicial voltada para a abstração e lógica.


# ---------------------------------------------------------------
# BOAS PRÁTICAS
# ---------------------------------------------------------------
# - Focar na lógica antes da sintaxe: Entenda os passos do problema 
#   antes de tentar escrever o código na linguagem escolhida.
# - Comentar seu código explicando o "porquê", e não o "o quê".


# ---------------------------------------------------------------
# ERROS MAIS COMUNS
# ---------------------------------------------------------------
# - Achar que precisa memorizar toda a linguagem: A sintaxe se pesquisa; 
#   a lógica se desenvolve.
# - Pular etapas: Tentar criar um programa complexo sem entender o básico, 
#   como variáveis e sequências lógicas.


# ---------------------------------------------------------------
# ANALOGIA
# ---------------------------------------------------------------
# Imagine que programar é como escrever uma receita de bolo para um 
# cozinheiro que nunca entrou em uma cozinha. Você não pode simplesmente 
# dizer "Faça um bolo". Você precisa dizer: 
# 1. Pegue 3 ovos. 
# 2. Quebre os ovos em uma tigela. 
# 3. Adicione duas xícaras de farinha. 
# Se a ordem estiver errada, o bolo não funciona.


# -----------------------------------------------------
# EXEMPLO PRÁTICO
# -----------------------------------------------------
# Abaixo, temos um exemplo de um programa simples recebendo 
# instruções ordenadas, e um exemplo ingênuo onde a ordem prejudica a lógica.


def main():
    
    # ✔ Correto
    # O computador executa passo a passo, em ordem lógica.
    print("--- Receita de Bolo ---")
    print("1. Misturar os ingredientes.")
    print("2. Colocar na forma.")
    print("3. Assar por 40 minutos.")
    print("Bolo pronto!\n")
    
    # ❌ Errado / ingênuo
    # Tentar executar ações antes de ter os requisitos prontos.
    # Um erro comum de iniciantes é inverter a ordem cronológica da lógica.
    # Exemplo: Tentar assar o bolo antes de misturar os ingredientes.
    print("--- Receita de Bolo Errada ---")
    print("1. Assar por 40 minutos.") # Como assar se ainda não misturou?
    print("2. Misturar os ingredientes.")
    print("Bolo estragado!\n")

if __name__ == "__main__":
    main()


# ---------------------------------------------------------------
# EXERCÍCIO
# ---------------------------------------------------------------
# Modifique o bloco correto dentro da função main() para criar 
# as instruções lógicas de como atravessar a rua com segurança 
# (ex: olhar para os dois lados, esperar os carros, etc.). 
# Lembre-se: a ordem dos passos é fundamental!


# ---------------------------------------------------------------
# CURIOSIDADES
# ---------------------------------------------------------------
# A primeira pessoa a escrever um algoritmo para ser processado 
# por uma máquina foi Ada Lovelace, no século XIX. Por isso, ela 
# é considerada a primeira programadora da história!


# ---------------------------------------------------------------
# RESUMO
# ---------------------------------------------------------------
# Programação é a habilidade de quebrar problemas reais em passos 
# simples e lógicos para que o computador os execute. A linguagem 
# (como Python) é apenas o idioma; o mais importante é saber 
# organizar as ideias.


# ---------------------------------------------------------------
# REFERÊNCIAS
# ---------------------------------------------------------------
# - Documentação oficial do Python: https://docs.python.org/3/
