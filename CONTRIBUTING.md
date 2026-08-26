# 🤝 Guia de Contribuição

Obrigado por querer contribuir com o **Código Comentado**!

Este documento explica como participar do projeto, desde a escolha de um tema até a aprovação do Pull Request.

---

## 📑 Índice

- [Antes de começar](#-antes-de-começar)
- [Regra de Ouro](#-regra-de-ouro)
- [Uso de Inteligência Artificial](#-uso-de-inteligência-artificial)
- [Organização da equipe](#-organização-da-equipe)
- [Antes de escrever um conteúdo](#-antes-de-escrever-um-conteúdo)
- [Escolhendo um tema](#-escolhendo-um-tema)
- [Modelo de Branches](#-modelo-de-branches)
- [Padrão de commits](#-padrão-de-commits)
- [Pull Request](#-pull-request)
- [Checklist](#-checklist)
- [Code Review](#-code-review)
- [Dúvidas](#-dúvidas)
- [Obrigado!](#️-obrigado)
---

# 🎯 Antes de começar

Antes de contribuir, recomendamos conhecer a documentação do projeto.

Ordem sugerida:

```
README
    ↓
GETTING_STARTED
    ↓
COMO_ESTUDAR
    ↓
TRILHAS
    ↓
ROADMAPS
    ↓
CONTRIBUTING
```

Documentos úteis:

- 📖 [GETTING_STARTED.md](./GETTING_STARTED.md)
- 📚 [COMO_ESTUDAR.md](./docs/guias/COMO_ESTUDAR.md)
- 🗺️ ROADMAPS
- 🎓 TRILHAS

---

# 🥇 Regra de Ouro

> **Todo Pull Request deve agregar conhecimento, não apenas código.**

Mais do que escrever código funcional, cada contribuição deve ajudar outra pessoa a compreender aquele conceito.

Antes de abrir um Pull Request, pergunte a si mesmo:

- O código funciona?
- A explicação está clara?
- Um iniciante entenderia esse conteúdo?

Se a resposta for "sim", você está no caminho certo.

---

# 🤖 Uso de Inteligência Artificial

Ferramentas de IA são bem-vindas como apoio ao aprendizado.

Você pode utilizá-las para:

- Tirar dúvidas;
- Revisar explicações;
- Explorar alternativas;
- Validar raciocínios.

Evite utilizar respostas geradas automaticamente sem compreender completamente o conteúdo.

Todo colaborador deve ser capaz de explicar o próprio Pull Request durante a revisão.

---

# 👥 Organização da equipe

Os papéis existentes no projeto são documentados separadamente.

Consulte a documentação de cada função:

- 📄 [Colaboradores](./docs/organizacao/COLABORADORES.md)
- 🛠️ [Mantenedores](./docs/organizacao/MANTENEDORES.md)
- 🌎 [Representantes](./docs/organizacao/REPRESENTANTES.md)

---

# 📚 Antes de escrever um conteúdo

Todo novo conteúdo deve seguir o padrão oficial do projeto.

Leia:

**[Padrão de Conteúdo](./docs/guias/PADRAO_DE_CONTEUDO.md)**

Esse documento explica:

- estrutura obrigatória;
- comentários;
- analogias;
- exemplos;
- exercícios;
- boas práticas.

---

# 🧭 Escolhendo um tema

O desenvolvimento é organizado através das Issues e do GitHub Projects.

Fluxo recomendado:

```
Issue
    ↓
Branch
    ↓
Desenvolvimento
    ↓
Pull Request
    ↓
Code Review
    ↓
Merge em develop
    ↓
Merge em main
```

Sempre verifique se o tema já não está sendo desenvolvido por outra pessoa.

---

# 🌳 Modelo de Branches

O projeto utiliza três níveis de branch.

| Branch | Objetivo |
|---------|----------|
| main | versão oficial |
| develop | integração |
| feature/* | desenvolvimento de cada tema |

Fluxo:

```
feature
  ↓
develop
  ↓
main
```

Nunca desenvolva diretamente em `main` ou `develop`.

---

# 📝 Padrão de commits

Utilizamos Conventional Commits.

Exemplos:

```
feat:
docs:
fix:
refactor:
style:
test:
chore:
```

---

# 🔀 Pull Request

Ao concluir o desenvolvimento:

1. Atualize sua branch.
2. Abra um Pull Request para `develop`.
3. Utilize o template do projeto.
4. Relacione a Issue correspondente.
5. Solicite revisão.

---

# ✅ Checklist

Antes de solicitar revisão, confirme:

- [ ] O código funciona.
- [ ] A explicação está correta.
- [ ] Existe exemplo prático.
- [ ] Existe analogia.
- [ ] Existe exercício.
- [ ] O conteúdo segue o padrão oficial.
- [ ] Um iniciante conseguiria aprender apenas lendo o arquivo.

---

# 👀 Code Review

A revisão não procura apenas erros técnicos.

Também verifica se o conteúdo realmente ensina.

Durante a revisão, pergunte-se:

- A explicação ficou clara?
- Existe uma analogia melhor?
- O exemplo representa um caso real?
- O texto está coerente com o restante do projeto?

O objetivo do Code Review é elevar a qualidade do material didático.

---

# 📌 Dúvidas

Caso tenha dúvidas:

- Abra uma Issue;
- Converse com um mantenedor;
- Utilize os canais oficiais do projeto.

Toda dúvida pode contribuir para melhorar a documentação.

---

## 📜 Licenciamento das contribuições

Ao contribuir com o **Código Comentado**, você declara que possui os direitos necessários sobre o material enviado e concorda que sua contribuição seja disponibilizada sob a licença aplicável ao tipo de conteúdo enviado.

De forma geral:

* 📚 **Conteúdo educacional**, incluindo roadmaps, trilhas, guias, documentação pedagógica e materiais escritos, é disponibilizado sob a **Creative Commons Attribution-ShareAlike 4.0 International (CC BY-SA 4.0)**.
* 💻 **Código-fonte educacional**, incluindo aulas, exemplos e demonstrações executáveis, é disponibilizado sob a **GNU General Public License v3.0 (GPL-3.0)**.
* 🌐 **Softwares, ferramentas e plataformas** podem possuir licenças específicas, conforme definido no respectivo repositório.

Ao enviar uma contribuição, você também declara que:

* o conteúdo enviado é de sua autoria ou você possui os direitos e permissões necessários para disponibilizá-lo;
* sua contribuição não viola, de forma consciente, direitos autorais, licenças ou outros direitos de terceiros;
* materiais de terceiros somente serão incluídos quando sua licença ou autorização permitir sua utilização pelo projeto;
* você concorda com a distribuição da sua contribuição nos termos da licença aplicável;
* os créditos e avisos de licença existentes não devem ser removidos indevidamente.

### 🎨 Marca e identidade

As licenças aplicáveis ao código e ao conteúdo educacional não concedem automaticamente direitos sobre a identidade oficial do **Código Comentado**.

O nome **Código Comentado**, o logotipo, o mascote **Codee**, suas representações oficiais e demais elementos de identidade visual não estão automaticamente incluídos nas licenças abertas aplicáveis ao código e ao conteúdo.

### 🔎 Antes de contribuir

Recomendamos a leitura da política completa de licenciamento antes de enviar sua primeira contribuição:

📄 [Política de Licenciamento](./LICENSE.md)

Ao enviar um Pull Request para este repositório, você reconhece que sua contribuição estará sujeita às condições de licenciamento aplicáveis descritas acima e no `LICENSE.md`.


---

# ❤️ Obrigado!

O Código Comentado cresce graças às pessoas que compartilham conhecimento.

Cada melhoria, correção ou explicação adicionada torna o projeto mais útil para quem está aprendendo.

Seja bem-vindo à comunidade!