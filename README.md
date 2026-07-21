# 🚀 Código Comentado
![Java](https://img.shields.io/badge/Java-2563EB?style=flat-square)
![Python](https://img.shields.io/badge/Python-10B981?style=flat-square)
![JavaScript](https://img.shields.io/badge/JavaScript-7C3AED?style=flat-square)
![Contribuições](https://img.shields.io/badge/contribuições-bem--vindas-10B981?style=flat-square)
![Status](https://img.shields.io/badge/status-em_desenvolvimento-7C3AED?style=flat-square)
 
> **Aprender Programação Ensinando Programação**
 
Um repositório colaborativo onde cada conceito de programação é explicado através do próprio código, não apenas escrito, mas comentado, justificado e ensinado.

---

> 🧭 Novo no projeto? Comece por aqui: [GETTING_STARTED.md](./GETTING_STARTED.md)
 
---
 
## 💡 O problema que queremos resolver
 
Existem milhares de repositórios com código de estudo no GitHub. A maioria mostra **o quê** e **como** fazer.
 
Poucos explicam **por quê**.
 
```java
this.nome = nome;
```
 
Qualquer pessoa aprende a escrever essa linha. Poucas entendem por que o `this` existe, que problema ele resolve, e quando ele realmente é necessário.
 
Este projeto nasce para preencher essa lacuna: transformar cada arquivo de código num pequeno capítulo de aprendizado, com raciocínio, analogias e decisões explicadas, não só sintaxe.
 
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
├── java/
│   ├── poo/
│   │   ├── A01_Classes.java
│   │   ├── A02_Atributos.java
│   │   ├── A03_Metodos.java
│   │   └── ...
│   │
│   ├── colecoes/
│   ├── exceptions/
│   ├── streams/
│   └── spring/
```
 
> A estrutura em `linguagem/<tema>/` já nasce pensada para receber outras linguagens no futuro (ver Roadmap).
 
Cada arquivo segue um padrão obrigatório, contendo:
 
**O que é? · Como funciona? · Por que existe? · Quando usar? · Quando evitar? · Vantagens · Desvantagens · Erros comuns · Boas práticas · Analogia · Exemplo prático · Exercício · Resumo**
 
---
 
## 🌐 Múltiplas linguagens
 
O projeto nasce com Java, mas a metodologia (explicar o *porquê*, não só o *como*) não é exclusiva de uma linguagem. Por isso a estrutura já separa o código por linguagem dentro de `codigo-comentado/`, permitindo que outras linguagens sejam adicionadas seguindo o mesmo padrão didático:
 
```
codigo-comentado/
├── java/
│   ├── poo/
│   │   ├── A01_Classes.java
│   │   ├── A02_Atributos.java
│   │   ├── A03_Metodos.java
│   │   └── ...
│   │
│   ├── collections/
│
├── python/
│   ├── poo/
│   │   ├── A01_Classes.py
│   │   ├── A02_Atributos.py
│   │   └── ...
│   │
│   ├── collections/
│
└── javascript/
    ├── poo/
    │   ├── A01_Classes.js
    │   ├── A02_Atributos.js
```
 
Cada nova linguagem segue o mesmo modelo de arquivo (o que é, por que existe, analogia, exemplo, exercício), só muda a sintaxe. O processo detalhado para propor uma nova linguagem está em [`CONTRIBUTING.md`](./CONTRIBUTING.md).
 
---

### 📁 Por que essa organização de pastas?
 
Dentro de cada linguagem, o código é organizado por **domínio/assunto** (`poo`, `collections`, `exceptions`, `streams`...), e não por critério técnico (como tipo de arquivo ou ordem de criação).
 
Essa escolha foi feita porque:
 
- Quem quer estudar um assunto específico encontra tudo relacionado a ele em um único lugar.
- Reforça a trilha de estudos: dá pra seguir uma pasta inteira como uma sequência lógica de aprendizado.
- Escala melhor conforme o projeto cresce: novos temas viram só mais um arquivo dentro de uma pasta já existente, sem precisar reorganizar nada.
- É um padrão amplamente utilizado atualmente, inclusive em documentações técnicas, cursos e projetos open source, o que facilita a navegação para quem já está acostumado com esse tipo de estrutura.
- Facilita a manutenção: se um conceito precisar ser corrigido ou atualizado, fica claro onde procurar.
- Deixa mais fácil comparar como o mesmo assunto é tratado em linguagens diferentes, já que a mesma pasta de domínio existe replicada em cada linguagem (ex: `codigo-comentado/java/poo/` e `codigo-comentado/python/poo/`).

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
 
**Fase 1 -> Fundação**
Lógica de programação · Estruturas de controle · Métodos · POO
 
**Fase 2 -> Estruturas avançadas**
Collections · Exceptions · Generics · Streams
 
**Fase 3 -> Ecossistema Spring**
Spring Boot · JPA · Hibernate · Security · Docker
 
**Fase 4 -> Projetos reais**
Sistema bancário · CRUD completo · API REST · Microsserviços · Autenticação JWT · Deploy
 
**Fase 5 -> Expansão multi-linguagem**
Replicar o mesmo padrão didático para outras linguagens (Python, JavaScript, etc.), mantendo a mesma metodologia de ensino por código comentado.
 
---
 
## 🤝 Como contribuir

O acompanhamento de temas em desenvolvimento é feito pelo nosso [quadro de Projects no GitHub](https://github.com/orgs/Codigo-Comentado/projects/12). O processo completo de contribuição (branches, commits, Pull Requests e Code Review) está detalhado em [`CONTRIBUTING.md`](./CONTRIBUTING.md).
 
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
