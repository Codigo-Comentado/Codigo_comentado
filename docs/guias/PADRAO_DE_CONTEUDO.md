# 📑 Padrão de Conteúdo

> Código Comentado
>
> **Aprender Programação Ensinando Programação**

---

## 📑 Índice

- [Objetivo](#-objetivo)
- [Nossa filosofia](#-nossa-filosofia)
- [Estrutura obrigatória](#-estrutura-obrigatória)
- [Cabeçalho de navegação](#-cabeçalho-de-navegação)
- [Como escrever as explicações](#-como-escrever-as-explicações)
- [Comentários no código](#-comentários-no-código)
- [Exemplos práticos](#-exemplos-práticos)
- [Analogias](#-analogias)
- [Exercícios](#-exercícios)
- [Erros comuns](#️-erros-comuns)
- [Boas práticas](#-boas-práticas)
- [Curiosidades](#-curiosidades)
- [Referências (opcional)](#-referências-opcional)
- [Convenções de nomenclatura](#-convenções-de-nomenclatura)
- [Antes de abrir um Pull Request](#-antes-de-abrir-um-pull-request)
- [Nosso compromisso](#-nosso-compromisso)

---

## 🎯 Objetivo

O Código Comentado é um projeto educacional.

Nosso objetivo não é apenas disponibilizar código funcional, mas transformar cada arquivo em um pequeno material de estudo.

Este documento define o padrão que todos os conteúdos do projeto devem seguir, garantindo consistência, qualidade e uma experiência de aprendizado uniforme para todos os estudantes.

Independentemente da linguagem ou do autor, todos os conteúdos devem transmitir a mesma identidade didática.

---

## 💡 Nossa filosofia

Antes de escrever código, pense no estudante que irá ler o arquivo.

Pergunte-se:

- Este conteúdo ensina?
- A explicação está clara?
- Eu explico apenas **como fazer** ou também **por que fazer**?
- Um iniciante conseguiria entender este conceito?

O foco do projeto é ensinar raciocínio, e não apenas sintaxe.

---

## 📂 Estrutura obrigatória

Todo arquivo deve seguir uma estrutura semelhante à abaixo.

```
Cabeçalho de navegação

Título

O que é?

Como funciona?

Por que existe?

Quando utilizar?

Quando evitar?

Vantagens

Desvantagens

Boas práticas

Erros comuns

Analogia

Exemplo prático

Exercício

Resumo
```

Nem todas as seções serão obrigatórias para todos os assuntos, mas essa deve ser a referência utilizada durante a criação do conteúdo.

---

## 🧭 Cabeçalho de navegação

Todo arquivo de código começa com um cabeçalho que conecta a aula ao Roadmap e à Trilha correspondentes. É o que permite que o estudante ou qualquer ferramenta, saiba onde aquele arquivo está na jornada de aprendizado, sem precisar abrir outro documento.

O cabeçalho é escrito **no formato de comentário de documentação nativo da linguagem** (Javadoc, docstring, etc.), nunca em caixa ASCII ou outro formato decorativo. Isso garante que ele seja lido por IDEs, geradores de documentação e, futuramente, por scripts de validação.

**Campos obrigatórios:**

| Campo | Descrição |
|---|---|
| Título | Código do Roadmap + nome do conceito |
| Módulo | Nome do módulo ao qual o conceito pertence |
| Roadmap | Módulo e código exatos, conforme o Roadmap da linguagem |
| Trilha | Linguagem → Módulo → Nível, conforme a Trilha |
| Nível | 🟢 Básico / 🟡 Intermediário / 🟠 Avançado / 🔵 Backend / 🟣 Frameworks / 🔴 Arquitetura |
| Pré-requisitos | Conceitos que o estudante já deve dominar |
| Próximos assuntos | Conceitos recomendados após este |

**Exemplo em Java:**

```java
/**
 * A06 — Encapsulamento
 *
 * @modulo         Programação Orientada a Objetos
 * @roadmap        Módulo 3 → A06
 * @trilha         Java → POO → Básico
 * @nivel          🟢 Básico
 * @prerequisitos  Classes, Objetos, Atributos, Métodos
 * @proximos       Getters e Setters, Construtores, this
 */
```

**Exemplo em Python:**

```python
"""
A06 — Encapsulamento

@modulo         Programação Orientada a Objetos
@roadmap        Módulo 3 → A06
@trilha         Python → POO → Básico
@nivel          🟢 Básico
@prerequisitos  Classes, Objetos, Atributos, Métodos
@proximos       Properties, Construtor (__init__), self
"""
```

Se o Roadmap, a Trilha ou a pasta física do arquivo mudarem, o cabeçalho deve ser atualizado na mesma Pull Request, os quatro devem sempre contar a mesma história.

**Campos opcionais de metadados:**

Além dos 7 campos obrigatórios, o cabeçalho pode incluir metadados de controle, quando fizer sentido para o histórico do conteúdo:

| Campo | Descrição |
|---|---|
| Autor | Quem escreveu a versão original do conteúdo |
| Última atualização | Data da última revisão relevante |
| Tempo estimado de leitura | Ajuda o estudante a planejar o estudo |

---

## 📝 Como escrever as explicações

Explique como se estivesse ensinando alguém que está estudando o assunto pela primeira vez.

Evite assumir conhecimentos prévios desnecessários.

Sempre que possível:

- Utilize linguagem simples
- Explique termos técnicos
- Apresente exemplos reais
- Construa a explicação em ordem lógica

Prefira explicar um conceito completamente antes de apresentar outro.

---

## 💬 Comentários no código

Os comentários devem complementar o código. Evite comentários que apenas descrevem exatamente o que já está escrito.

❌ **Evite:**

```java
// Soma dois números
int soma = a + b;
```

✅ **Prefira:**

```java
// Guardamos o resultado da soma para reutilizá-lo posteriormente,
// evitando repetir o cálculo em outros pontos do programa.
int soma = a + b;
```

O comentário deve explicar a intenção da solução, não apenas a sintaxe.

---

## 🌎 Exemplos práticos

Sempre que possível, utilize exemplos próximos da realidade. Prefira situações como:

- Cadastro de clientes
- Contas bancárias
- Pedidos
- Produtos
- Veículos
- Funcionários
- Pagamentos

Evite exemplos excessivamente abstratos quando eles dificultarem a compreensão.

---

## 🎭 Analogias

As analogias são uma das principais características do Código Comentado.

Uma boa analogia aproxima um conceito técnico de uma situação conhecida pelo estudante.

**Exemplos:**

| Conceito técnico | Analogia |
|---|---|
| Classe | Planta de uma casa |
| Objeto | Casa construída |
| Encapsulamento | Caixa eletrônico |
| Interface | Tomada elétrica |
| Herança | Relação entre pai e filho |

A analogia deve facilitar o entendimento, nunca substituir a explicação técnica.

---

## 🧪 Exercícios

Sempre que possível, inclua um exercício ao final. Os exercícios devem incentivar o estudante a aplicar o conceito estudado.

**Exemplos:**

- Modificar o código
- Adicionar uma nova funcionalidade
- Corrigir um erro
- Implementar uma pequena variação

Evite exercícios que dependam de conhecimentos ainda não apresentados.

---

## ⚠️ Erros comuns

Sempre que existir um erro frequente relacionado ao assunto, ele deve ser apresentado.

**Exemplos:**

- Esquecer de inicializar uma variável
- Comparar Strings utilizando `==`
- Criar objetos desnecessariamente
- Utilizar herança quando composição seria mais adequada

Antecipar esses erros ajuda o estudante a evitá-los.

---

## ✅ Boas práticas

Sempre destaque as boas práticas relacionadas ao tema.

**Exemplos:**

- Utilizar nomes significativos
- Manter métodos pequenos
- Evitar duplicação
- Respeitar o princípio da responsabilidade única
- Preferir composição à herança quando apropriado

O estudante deve aprender desde cedo a escrever código de qualidade.

---

## 📖 Curiosidades

Quando o assunto possuir contexto histórico ou técnico relevante, inclua uma curiosidade.

**Exemplos:**

- Origem do nome da linguagem
- Motivo da criação do recurso
- Versões em que determinada funcionalidade foi introduzida

Curiosidades enriquecem o aprendizado, mas não devem desviar o foco principal.

---

## 📎 Referências (opcional)

Quando fizer sentido, inclua links para fontes externas confiáveis que aprofundam o assunto, documentação oficial, artigos técnicos reconhecidos.

**Exemplos:**

- Documentação oficial da linguagem
- Artigos técnicos de referência (ex: Baeldung, Real Python)

Esta seção é opcional e deve vir por último no arquivo, após o Resumo. Não substitui a explicação do próprio conteúdo, é um complemento para quem quiser se aprofundar.

---

## 📌 Convenções de nomenclatura

Os arquivos devem seguir o padrão do projeto.

```
A01_Classes.java

A02_Objetos.java

A03_Atributos.java
```

A numeração deve acompanhar o Roadmap correspondente.

---

## 🔍 Antes de abrir um Pull Request

Confira:

- [ ] O cabeçalho de navegação está presente e correto
- [ ] O código compila e funciona corretamente
- [ ] A explicação está tecnicamente correta
- [ ] Existe um exemplo prático
- [ ] Existe uma analogia
- [ ] Existem boas práticas
- [ ] Foram destacados erros comuns
- [ ] O conteúdo segue a ordem definida neste documento
- [ ] O texto foi revisado
- [ ] O arquivo está na pasta correta

---

## 🎯 Nosso compromisso

Cada arquivo do Código Comentado deve ser capaz de ensinar um conceito de forma clara, organizada e acessível.

Mais importante do que escrever código é ajudar outra pessoa a compreender o raciocínio por trás dele.

Se cada novo conteúdo tornar o aprendizado de alguém um pouco mais simples, estaremos cumprindo a missão deste projeto.