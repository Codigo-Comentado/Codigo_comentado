# 🚀 Código Comentado

> **Aprender Programação Ensinando Programação**

Um repositório colaborativo onde cada conceito de programação é explicado através do próprio código não apenas escrito, mas comentado, justificado e ensinado.

---

## 💡 O problema que queremos resolver

Existem milhares de repositórios com código de estudo no GitHub. A maioria mostra **o quê** e **como** fazer.

Poucos explicam **por quê**.

```java
this.nome = nome;
```

Qualquer pessoa aprende a escrever essa linha. Poucas entendem por que o `this` existe, que problema ele resolve, e quando ele realmente é necessário.

Este projeto nasce para preencher essa lacuna: transformar cada arquivo de código em um pequeno capítulo de aprendizado, com raciocínio, analogias e decisões explicadas, não só sintaxe.

---

## 🎯 Objetivos

Ao contribuir com este projeto, o time pratica:

- Lógica de programação e estruturas de dados
- Orientação a Objetos
- Frameworks (ex: Spring Boot)
- Git e GitHub no fluxo real de um projeto colaborativo
- Escrita técnica e documentação
- Code Review e trabalho em equipe

Tudo isso dentro de um único projeto, com propósito e padrão definidos.

---

## 🥇 Regra de Ouro do Projeto

> **Todo Pull Request deve agregar conhecimento, não apenas código.**

O objetivo de um PR não é apenas adicionar uma funcionalidade ou exemplo, mas deixar o repositório mais útil para quem está aprendendo.

Antes de aprovar um PR, o revisor deve conseguir responder "sim" a estas perguntas:

- [ ] O código funciona corretamente?
- [ ] A explicação está tecnicamente correta?
- [ ] O autor explicou *por que* tomou aquela decisão?
- [ ] Existem exemplos práticos?
- [ ] Existe uma analogia que facilite o entendimento?
- [ ] Foram destacadas boas práticas e erros comuns?
- [ ] Um iniciante conseguiria aprender aquele conceito apenas lendo o arquivo?

**Um Pull Request só está completo quando ensina algo novo para a próxima pessoa que o ler.**

---

## 📂 Estrutura do repositório

```
codigo-comentado/
├── README.md
├── CONTRIBUTING.md
├── src/
│   └── java/
│       ├── logica-sequencial/
│       ├── poo/
│       ├── collections/
│       ├── exceptions/
│       ├── streams/
│       └── spring/
```

> A estrutura em `src/<linguagem>/` já nasce pensada para receber outras linguagens no futuro (ver Roadmap).

Cada arquivo segue um padrão obrigatório, contendo:

**O que é? · Como funciona? · Por que existe? · Quando usar? · Quando evitar? · Vantagens · Desvantagens · Erros comuns · Boas práticas · Analogia · Exemplo prático · Exercício · Resumo**

---

## 🏆 Sistema de progressão

| Nível | Descrição |
|---|---|
| 🟢 Básico | Sintaxe, lógica, estruturas de controle |
| 🟡 Intermediário | POO, Collections, Exceptions |
| 🔴 Avançado | Streams, Generics, Threads |
| 🟣 Especialista | Spring, JPA, Microsserviços, Docker |

---

## 🗺️ Roadmap

**Fase 1 — Fundação**
Lógica de programação · Estruturas de controle · Métodos · POO

**Fase 2 — Estruturas avançadas**
Collections · Exceptions · Generics · Streams

**Fase 3 — Ecossistema Spring**
Spring Boot · JPA · Hibernate · Security · Docker

**Fase 4 — Projetos reais**
Sistema bancário · CRUD completo · API REST · Microsserviços · Autenticação JWT · Deploy

**Fase 5 — Expansão multi-linguagem**
Replicar o mesmo padrão didático para outras linguagens (Python, JavaScript, etc.), mantendo a mesma metodologia de ensino por código comentado.

---

## 🤝 Como contribuir

O processo completo de contribuição (branches, commits, Pull Requests e Code Review) está detalhado em [`CONTRIBUTING.md`](./CONTRIBUTING.md).

---

## 📜 Manifesto

Acreditamos que conhecimento compartilhado vale mais do que conhecimento guardado.

Este repositório não existe apenas para armazenar código, mas para registrar a lógica, as decisões e os fundamentos por trás dele.

Queremos criar o material que gostaríamos de ter encontrado quando começamos a estudar programação.

Nosso compromisso é simples:

- Cada linha de código deve ensinar algo.
- Cada comentário deve reduzir uma dúvida.
- Cada Pull Request deve tornar o projeto melhor do que estava antes.

> **"A melhor forma de aprender é ensinar. E a melhor forma de ensinar é explicar o porquê."**
