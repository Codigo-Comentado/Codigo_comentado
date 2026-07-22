# 🤝 Guia de Contribuição

Obrigado por querer contribuir com o **Código Comentado**! Este guia explica como propor, escrever e revisar conteúdo dentro do padrão do projeto.

---

## 🥇 Antes de tudo: a Regra de Ouro

> **Todo Pull Request deve agregar conhecimento, não apenas código.**

Isso significa que qualquer contribuição precisa ensinar algo para a próxima pessoa que ler o arquivo, não apenas "funcionar". Todo o resto deste guia existe para viabilizar essa regra na prática.

---

## 🤖 Uso de Inteligência Artificial

Ferramentas de IA (ChatGPT, Copilot, Claude, etc.) podem ser usadas neste projeto, mas de forma **responsável**.

O que isso significa na prática:

- **Não** peça para a IA gerar o código, os comentários ou as explicações prontas e simplesmente copie e cole no arquivo.
- É esperado que você entenda cada linha do que está enviando no Pull Request, se alguém perguntar "por que você fez assim?", você precisa saber responder sem depender da IA para isso.
- Use a IA para tirar dúvidas, validar um raciocínio, revisar clareza de um texto já escrito por você, ou explorar abordagens alternativas, não para pular a etapa de aprender.
- Se um trecho de código ou explicação foi inspirado por uma resposta de IA, reescreva com suas próprias palavras antes de submeter. O objetivo do projeto é o **seu** entendimento, não a produção de conteúdo.

**A IA é uma ferramenta de apoio à evolução do desenvolvedor, não uma dependência.** Um PR que "funciona" mas cujo autor não consegue explicar não cumpre a Regra de Ouro do projeto e será tratado como incompleto no Code Review.

---

## 👥 Papéis e responsabilidades
 
Para o projeto não depender de "todo mundo faz um pouco", algumas responsabilidades têm um dono definido. Não precisa uma pessoa por função no início, é normal acumular mais de um papel.
 
Como o projeto já nasce com mais de uma linguagem, os papéis marcados com 🌐 precisam de **pelo menos uma pessoa por linguagem**, já que exigem conhecimento técnico específico.
 
| Papel | O que faz | Responsável(is) |
|---|---|---|
| 🔧 Mantenedor do repositório | Aprova merges de `develop` → `main`, e mantém README/CONTRIBUTING atualizados | _a preencher_ |
| 📋 Organização do Trello | Mantém o quadro em dia, evita temas duplicados, sinaliza cards parados | [Afonso Gabriel](https://github.com/1colossos)  <br>
| 👀 Revisor (Code Review) 🌐 | Revisa PRs seguindo a checklist antes do merge em `develop` | JavaScript:_a preencher_ <br> JavaScript: _a preencher_ |
| 🎯 Qualidade didática 🌐 | Garante que o conteúdo ensina de verdade, aplicando a Regra de Ouro com rigor | Java: _a preencher_ <br> JavaScript: _a preencher_  <br> JavaScript: [_a preencher_ 
| 🚪 Onboarding | Recebe novos colaboradores, explica o fluxo e adiciona no GitHub | Trabalho Feito por todos os integrantes da equipe |
| 📣 Comunicação | Envia resumos e avisos ao time | _a preencher_ |
 
> A tabela se Atualiza conforme o time se organiza. Se uma linguagem nova for adicionada ao projeto (ver [Adicionando uma nova linguagem](#-adicionando-uma-nova-linguagem)). 
 
---

## 🧭 Como escolher um tema

O controle do que está sendo desenvolvido é feito pelo [quadro de Projects do GitHub](https://github.com/orgs/Codigo-Comentado/projects/12), organizado a partir de Issues.

1. Verifique o [Roadmap](./README.md#%EF%B8%8F-roadmap) e o quadro do Trello, na coluna **"Disponível"**.
2. Mova o card para **"Em desenvolvimento"** e coloque seu nome nele antes de começar (evita duplicidade).
3. Se o tema ainda não existir como card, crie um novo card na coluna **"Backlog"** descrevendo o tema, e aguarde um mantenedor mover para "Disponível".
4. Ao abrir o Pull Request, referencie o card do Trello na descrição (link do card).
5. Quando o PR for aprovado e mergeado, mova o card para **"Concluído"**.

### Colunas sugeridas do quadro

| Coluna | Significado |
|---|---|
| 📋 Backlog | Ideias de temas ainda não validadas |
| 🟢 Disponível | Tema validado, pronto para alguém assumir |
| 🔵 Em desenvolvimento | Alguém já assumiu e está escrevendo |
| 🟡 Em revisão | PR aberto, aguardando Code Review |
| ✅ Concluído | Mergeado na `main` |

---

## 📁 Onde o arquivo deve ficar

```
<linguagem>/<categoria>/<nivel>/<Numero>_<Tema>.<extensao>
```

Exemplo:

```
java/poo/A03_This.java
python/poo/a03_self.py
```

- `<linguagem>`: `java`, `python`, etc.
- `<categoria>`: `logica-sequencial`, `poo`, `collections`, `exceptions`, `streams`, `spring`, etc.
- O número prefixado indica a ordem sugerida de estudo dentro da categoria.

---

## 📑 Padrão obrigatório do arquivo

Todo arquivo de conteúdo deve conter, nesta ordem:

1. **Cabeçalho** —> tema, nível (🟢🟡🔴🟣), autor, última atualização, pré-requisitos, tempo estimado.
2. **O que é?**
3. **Como funciona?**
4. **Por que existe?**
5. **Quando usar?**
6. **Quando não usar?**
7. **Vantagens**
8. **Desvantagens**
9. **Erros mais comuns**
10. **Boas práticas**
11. **Analogia**
12. **Exemplo prático** (correto vs. errado)
13. **Exercício** (desafio para o leitor)
14. **Curiosidade** (opcional)
15. **Resumo**

### Exemplo (Java)

```java
package poo;

public class A03_This {

    /*
     =====================================================
     O QUE É?
     =====================================================
     "this" representa o objeto atual.

     =====================================================
     POR QUE EXISTE?
     =====================================================
     Para diferenciar atributos da classe dos parâmetros
     do método.
     =====================================================
     */

    private String nome;

    public A03_This(String nome){
        // nome (direita) -> parâmetro
        // this.nome (esquerda) -> atributo do objeto
        this.nome = nome;
    }
}
```

### Regra dos comentários

Comentários devem explicar **decisões**, não repetir o código.

❌ Evitar:
```java
int idade = 20; // cria idade
```

✔ Melhor:
```java
int idade = 20;
// Representa a idade da pessoa. Usamos int porque
// idade nunca possui casas decimais.
```

---

## 🌐 Adicionando uma nova linguagem

Se a linguagem que você quer usar ainda não existe no projeto:

1. Crie uma Issue no GitHub, explicando a motivação para a nova linguagem, e adicione ao Project na coluna **Backlog**.
2. Aguarde aprovação de pelo menos um mantenedor.
3. Crie a pasta `<linguagem>/` replicando as mesmas categorias já existentes (`poo/`, `collections/`, etc.), adaptando apenas o que fizer sentido para a linguagem.
4. O arquivo deve seguir o mesmo padrão obrigatório descrito acima, só a sintaxe muda, a estrutura didática não.
5. Comece por um tema equivalente a um já existente em Java (ex: `A03_This.java` → `a03_self.py`), para facilitar a comparação entre linguagens.

---

## 🌳 Modelo de branches

O projeto usa três camadas de branch:

| Branch | Papel |
|---|---|
| `main` | Versão validada e "oficial" do projeto o que aparece pronto para quem visita o repositório |
| `develop` | Branch de integração onde os temas concluídos se encontram antes de ir para `main` |
| `feature/<categoria>-<tema>` | Uma branch por tema, criada a partir de `develop` |

### Fluxo

```
feature/poo-this  ──PR──▶  develop  ──PR──▶  main
```

1. Crie sua branch de feature **a partir de `develop`** (nunca a partir de `main`).
2. Desenvolva o tema e abra o PR **direcionado para `develop`**.
3. Após aprovado, a branch é mergeada em `develop`.
4. Periodicamente, um mantenedor abre um PR de `develop` → `main`, promovendo o conteúdo já validado para a versão oficial do projeto.

Nunca commite diretamente em `main` ou `develop` , todo conteúdo entra por PR, mesmo o de mantenedores.

### Nomenclatura das branches de feature

```
feature/<categoria>-<tema>
```

Exemplos:
```
feature/poo-this
feature/collections-hashmap
feature/python-self
```

---

## 📝 Padrão de commits

```
feat: adiciona explicação sobre operadores
docs: melhora documentação do this
refactor: reorganiza exemplos de Collections
style: padroniza comentários
fix: corrige exemplo de Stream
test: adiciona testes dos exemplos
```

---

## 🔀 Processo de Pull Request

1. Crie a branch a partir de `develop`.
2. Desenvolva o conteúdo seguindo o padrão obrigatório.
3. Abra o PR **direcionado para `develop`**, usando o template `pull_request_template.md`, referenciando a Issue correspondente na descrição (ex: `Closes #12`).
4. Marque ao menos um revisor.
5. Responda aos comentários da revisão.
6. Só é permitido o merge após aprovação.

> A promoção de `develop` para `main` é feita separadamente por um mantenedor, depois que o conteúdo já está validado (ver [Modelo de branches](#-modelo-de-branches)).

### Checklist de PR

- [ ] Código funciona corretamente
- [ ] Explicação está tecnicamente correta
- [ ] Existe exemplo prático
- [ ] Existe analogia
- [ ] Existe exercício
- [ ] Segue o padrão obrigatório de arquivo
- [ ] Um iniciante conseguiria aprender o conceito só lendo o arquivo

---

## 👀 Code Review

Ao revisar um PR de outra pessoa, pergunte-se:

- Um iniciante entenderia isso sem ajuda externa?
- Existe uma forma mais simples de explicar?
- Existe uma analogia melhor?
- O exemplo é realmente útil ou é só decorativo?
- Existe alguma má prática sendo ensinada sem querer?

Revisões devem ser construtivas: aponte o problema e sugira uma alternativa, sempre que possível.

---

## 🏆 Níveis de contribuição

| Nível | Java | Python |
|---|---|---|
| 🟢 Básico | Sintaxe e lógica fundamental | Sintaxe e lógica fundamental |
| 🟡 Intermediário | POO, Collections, Exceptions | POO, Estruturas de Dados (listas, dicionários, sets), Exceções |
| 🔴 Avançado | Streams, Generics, Threads | Generators, Decorators, Context Managers, Threads/Async |
| 🟣 Especialista | Spring, JPA, Microsserviços, Docker | Django/Flask/FastAPI, ORMs, Microsserviços, Docker |

---

Dúvidas? Abra uma Issue com a label `duvida` ou pergunte no canal do time.