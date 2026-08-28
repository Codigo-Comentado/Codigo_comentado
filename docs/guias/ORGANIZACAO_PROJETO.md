# 🗂️ Organização do Projeto

> Código Comentado
>
> **Aprender Programação Ensinando Programação**
 
---
---
## 📑 Índice

- [Objetivo](#-objetivo)
- [Visão geral da estrutura](#-visão-geral-da-estrutura)
- [Pasta docs/](#-pasta-docs)
- [Pasta por linguagem](#-pasta-por-linguagem)
- [Organização por módulo](#-organização-por-módulo)
- [Convenção de nomenclatura de arquivos](#-convenção-de-nomenclatura-de-arquivos)
- [Relação entre pasta, Roadmap e Trilha](#-relação-entre-pasta-roadmap-e-trilha)
- [Onde entram exercícios, desafios e projetos](#-onde-entram-exercícios-desafios-e-projetos)
- [Regras gerais](#-regras-gerais)
---

## 🎯 Objetivo

Este documento define **onde cada arquivo do Código Comentado deve viver** dentro do repositório.

Enquanto o PADRAO_DE_CONTEUDO.md define *como escrever* uma aula, este documento define *onde ela é colocada*, garantindo que qualquer pessoa encontre (ou saiba criar) o arquivo certo sem depender de explicações informais.

A regra geral é simples:

> A estrutura de pastas deve espelhar exatamente a estrutura do Roadmap.
 
---
---
## 📁 Visão geral da estrutura

```
codigo-comentado/
 
├── README.md
├── CONTRIBUTING.md
 
├── docs/
│   ├── trilhas/
│   │     ├── TRILHA-JAVA.md
│   │     └── TRILHA-PYTHON.md
│   ├── roadmaps/
│   │     ├── ROADMAP-JAVA.md
│   │     └── ROADMAP-PYTHON.md
│   ├── guias/
│   │     └── COMO_ESTUDAR.md
│   └── organizacao/
│         ├── ORGANIZACAO_PROJETO.md
│         └── PADRAO_DE_CONTEUDO.md
 
├── java/
│   ├── a01_logica_de_programacao/
│   ├── b02_fundamentos_java/
│   ├── c03_programacao_orientada_a_objetos/
│   ├── d04_recursos_da_linguagem/
│   ├── e05_excecoes/
│   ├── f06_collections/
│   ├── g07_programacao_funcional/
│   ├── h08_arquivos/
│   ├── i09_data_e_hora/
│   ├── j10_concorrencia/
│   ├── k11_testes/
│   ├── l12_banco_de_dados/
│   ├── m13_maven_e_gradle/
│   ├── n14_spring/
│   └── o15_arquitetura/
 
├── python/
│   ├── a01_logica_de_programacao/
│   ├── b02-fundamentos-python/
│   ├── c03_programacao_orientada_a_objetos/
│   ├── d04_recursos_da_linguagem/
│   ├── e05_excecoes/
│   ├── f06_collections/
│   ├── g07_programacao_funcional/
│   ├── h08_arquivos/
│   ├── i09_data_e_hora/
│   ├── j10_concorrencia/
│   ├── k11_testes/
│   ├── l12_banco_de_dados/
│   ├── m13-gerenciamento-de-pacotes/
│   └── n14-frameworks-web/
 
└── javascript/
      └── (estrutura futura, seguindo o mesmo padrão)
```

**Por que essa estrutura?**

Separamos claramente **documentação** (`docs/`) de **conteúdo de código** (`java/`, `python/`, ...) para que cada tipo 
de arquivo tenha um lugar único e previsível. Dentro de cada linguagem, as pastas são numeradas na mesma ordem do Roadmap 
para que a listagem de arquivos no repositório já funcione como um índice de estudo, sem exigir que ninguém memorize onde 
cada módulo está. Essa escolha também torna o projeto **escalável**: adicionar uma nova linguagem ou um novo módulo significa
apenas seguir o mesmo padrão numérico, sem redesenhar a organização existente.
 
---
---
## 📚 Pasta docs/

Concentra toda a documentação de apoio — nenhum conteúdo de código vive aqui.

| Subpasta | Conteúdo                                                                                     |
|---|----------------------------------------------------------------------------------------------|
| `trilhas/` | Um arquivo `TRILHA-<LINGUAGEM>.md` por linguagem, caminho recomendado de estudo              |
| `roadmaps/` | Um arquivo `ROADMAP-<LINGUAGEM>.md` por linguagem, catálogo completo de conceitos            |
| `guias/` | Guias de apoio ao estudante (ex: COMO_ESTUDAR.md)                                            |
| `organizacao/` | Documentos que definem as regras do próprio projeto (este arquivo e o PADRAO_DE_CONTEUDO.md) |
 
---
---
## 💻 Pasta por linguagem

Cada linguagem possui sua própria pasta na raiz do repositório (`java/`, `python/`, `javascript/`, ...).

Dentro dela, o conteúdo é dividido em **subpastas por módulo**, seguindo exatamente a ordem e os nomes usados no Roadmap daquela linguagem.

Isso significa que:

- Um novo módulo no Roadmap → uma nova subpasta.
- Uma reordenação no Roadmap → uma renumeração das subpastas.
- Nenhum conteúdo deve existir numa pasta que não corresponda a um módulo do Roadmap.
---

## 🧩 Organização por módulo

Cada subpasta de módulo é numerada com dois dígitos, na mesma ordem em que aparece no Roadmap, isso garante que a listagem de arquivos no repositório siga a ordem de estudo.

**Exemplo (Java):**

```
java/03-c03_programacao_orientada_a_objetos/
├── A01_Classes.java
├── A02_Objetos.java
├── A03_InstanciacaoDeObjetos.java
├── A04_Atributos.java
└── A05_Metodos.java
```

O prefixo de código (`A01`, `A02`, ...) é **o mesmo código usado no Roadmap**, isso é o que conecta fisicamente o arquivo ao seu lugar na jornada de aprendizado.
 
---

## 📌 Convenção de nomenclatura de arquivos

```
<CÓDIGO>_<NomeDoConceitoEmPascalCase>.<extensão>
```
---
**Exemplos:**

| Arquivo | Linguagem |
|---|---|
| `A06_Encapsulamento.java` | Java |
| `A06_Encapsulamento.py` | Python |
| `F22_StreamAPI.java` | Java |
| `C14_Dicionarios.py` | Python |

Regras:

- O código (`A06`, `F22`, ...) deve ser **idêntico** ao código correspondente no Roadmap.
- O nome do conceito é escrito em PascalCase, sem acentos ou espaços.
- Um arquivo por conceito, não agrupe múltiplos conceitos num único arquivo.
---

## 🔗 Relação entre pasta, Roadmap e Trilha

A pasta física, o Roadmap e a Trilha devem sempre contar a mesma história:

```
Roadmap (Módulo 3, código A06)
        ↓
Trilha (Java → POO → Básico)
        ↓
Pasta física (java/03-c03_programacao_orientada_a_objetos/A06_Encapsulamento.java)
        ↓
Cabeçalho do arquivo (aponta de volta para Módulo, Roadmap e Trilha)
```

Se um desses três (Roadmap, Trilha, pasta física) mudar, os outros dois devem ser atualizados na mesma Pull Request.
 
---
---
## 🧪 Onde entram exercícios, desafios e projetos

Essas categorias ainda não possuem conteúdo migrado, mas já têm local reservado:

| Tipo | Pasta |
|---|---|
| Exercícios avulsos | `<linguagem>/<modulo>/exercicios/` |
| Desafios (múltiplos conceitos) | `<linguagem>/desafios/` |
| Projetos práticos sugeridos nas Trilhas | `<linguagem>/projetos/` |

A documentação detalhada de cada categoria será feita nos respectivos documentos (`EXERCICIOS.md`, `DESAFIOS.md`, `PROJETOS_PRATICOS.md`), ainda a serem criados.
 
---
---
## ⚠️ Regras gerais

- Nenhum arquivo de conteúdo deve ficar solto na raiz do repositório.
- Nenhuma subpasta de módulo deve ser criada sem um módulo correspondente no Roadmap.
- Toda nova linguagem adicionada ao projeto deve seguir esta mesma estrutura desde o primeiro commit.
- Renomeações de pasta só devem ocorrer junto de uma atualização do Roadmap e da Trilha correspondente.