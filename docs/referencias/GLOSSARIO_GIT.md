# 📖 Glossário de Git

Este glossário existe porque **todo colaborador do projeto precisa entender os termos básicos de Git**, 
independente da linguagem em que vai contribuir. Não é preciso decorar tudo de uma vez, use como referência sempre que tiver dúvida.
 
---

## Conceitos fundamentais

**Git** - 
Sistema de controle de versão. Guarda o histórico de todas as mudanças feitas nos arquivos do projeto, permitindo voltar no tempo, 
comparar versões, e trabalhar em paralelo sem sobrescrever o trabalho de outra pessoa.

**Repositório (repo)** -
A "pasta" do projeto controlada pelo Git, com todo o histórico de mudanças guardado dentro dela (na pasta oculta `.git/`).

**GitHub** -
Serviço online que hospeda repositórios Git na nuvem, e adiciona funcionalidades como Pull Requests, revisão de código,
e colaboração em equipe. Git é a ferramenta; GitHub é onde o repositório mora online.

**Commit** -
Um "salvamento" no histórico do Git, uma foto de como os arquivos estavam naquele momento, com uma mensagem explicando o que mudou.

**Branch (ramificação)** -
Uma linha paralela de desenvolvimento. Permite trabalhar numa mudança sem afetar o código principal, até que essa mudança esteja pronta para ser unida.

**Merge** -
O ato de unir o conteúdo de uma branch em outra (ex: unir `feature/poo-classes` dentro de `develop`).

**Clone** -
Baixar uma cópia completa de um repositório remoto (do GitHub) para o computador local.

**Pull** -
Baixar as atualizações mais recentes de uma branch remota para a cópia local.

**Push** -
Enviar os commits feitos localmente para o repositório remoto (GitHub).

**Pull Request (PR)** -
Uma solicitação formal para que o conteúdo de uma branch seja revisado e, se aprovado, mergeado em outra. É o ponto onde o Code Review acontece.

**Code Review** -
Processo de revisão do conteúdo de um PR por outra pessoa, antes do merge, verificando se está correto, claro e segue o padrão do projeto.

**Conflito de merge** -
Acontece quando duas mudanças diferentes afetam a mesma linha do mesmo arquivo, e o Git não consegue decidir sozinho qual manter. 
Precisa ser resolvido manualmente.
 
---

## Prefixos de branch usados neste projeto

| Prefixo | Quando usar |
|---|---|
| `feature/` | Um novo tema de conteúdo (ex: `feature/poo-heranca`) |
| `chore/` | Tarefa estrutural/organizacional, sem conteúdo didático (ex: `chore/adiciona-gitignore`) |
| `docs/` | Mudança em documentação do projeto (ex: `docs/adiciona-glossario-git`) |
| `fix/` | Correção de um erro em conteúdo já existente |
 
---

## Prefixos de commit usados neste projeto

| Prefixo | Quando usar |
|---|---|
| `feat:` | Adiciona um novo tema/conteúdo |
| `docs:` | Mudança em documentação |
| `chore:` | Tarefa estrutural/organizacional |
| `fix:` | Correção de um erro |
| `refactor:` | Reorganiza algo já existente, sem mudar o comportamento |
| `style:` | Ajuste de formatação/padronização, sem mudar o conteúdo |
| `test:` | Adiciona ou ajusta testes |
 
---

## Comandos essenciais do dia a dia

```bash
git status              # mostra o que mudou e o que está pendente
git branch               # lista as branches locais (a atual tem um *)
git checkout <branch>     # troca para outra branch
git checkout -b <branch>  # cria e já troca para uma nova branch
git pull origin <branch>  # baixa as atualizações da branch remota
git add <arquivo>         # marca um arquivo para entrar no próximo commit
git commit -m "mensagem"  # salva as mudanças marcadas, com uma mensagem
git push origin <branch>  # envia os commits para o GitHub
git log --oneline         # mostra o histórico de commits, resumido
```
 
---

## Dúvidas comuns

**Qual a diferença entre `git pull` e `git fetch`?**
`git fetch` baixa as atualizações do remoto, mas não aplica na sua branch atual. 
`git pull` faz as duas coisas: baixa e já aplica (na prática, `pull` = `fetch` + `merge`).

**Por que preciso criar uma branch nova toda vez?**
Pra nunca trabalhar direto em `develop` ou `main`. Isso protege o conteúdo já validado de mudanças não revisadas.

**O que significa "a branch está desatualizada"?**
Significa que `develop` recebeu novidades depois que você criou sua branch. 
Resolve-se trazendo essas novidades pra sua branch (`git merge develop`, estando na sua branch).

---

## Referências

- Documentação oficial do Git: https://git-scm.com/doc
- Git - Guia de referência rápida: https://git-scm.com/docs
- GitHub Docs - Sobre Pull Requests: https://docs.github.com/pt/pull-requests
- Conventional Commits (padrão de prefixos de commit): https://www.conventionalcommits.org/pt-br/

---

Dúvida que não está aqui? 
Pergunte no grupo e se for algo que outras pessoas provavelmente também vão perguntar, sugira adicionar a este glossário.