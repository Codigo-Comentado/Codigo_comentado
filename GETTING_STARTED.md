# 🧭 Primeiros Passos - Como configurar o projeto na sua máquina
 
Este guia é para quem nunca clonou um repositório antes. Siga na ordem, sem pular etapas.
 
---
 
## 🧰 Parte 1 - Instalar as ferramentas (só uma vez)
 
### 1.1 Instalar o Git
 
- Baixe em: https://git-scm.com/downloads
- Instale com as opções padrão (pode clicar "Next" em tudo).
- Confirme que instalou corretamente abrindo o terminal (ou "Git Bash" no Windows) e digitando:
```bash
git --version
```
 
Se aparecer um número de versão, deu certo.
 
### 1.2 Configurar seu nome e e-mail no Git
 
Isso identifica quem fez cada commit. Faça isso só uma vez:
 
```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu-email@exemplo.com"
```
 
> Use o mesmo e-mail da sua conta do GitHub.
 
### 1.3 Instalar a IDE da sua linguagem
 
- **Java:** [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download) (gratuito)
- **Python:** [PyCharm Community](https://www.jetbrains.com/pycharm/download) ou [VS Code](https://code.visualstudio.com/) com a extensão Python
- **JavaScript:** [VS Code](https://code.visualstudio.com/)
Instale normalmente, sem precisar mudar nenhuma configuração.
 
---
 
## 📥 Parte 2 - Clonar o projeto
 
### 2.1 Pegue o link do repositório
 
No GitHub, dentro do repositório, clique no botão verde **"Code"** e copie a URL (formato HTTPS). Vai ser algo assim:
 
```
https://github.com/Morcineck/Codigo_comentado.git
```
 
### 2.2 Escolha uma pasta no seu computador
 
Decida onde vai guardar o projeto (ex: dentro de `Documentos`). **Evite criar uma pasta com o mesmo nome do repositório antes de clonar**, o próprio comando de clone já cria a pasta pra você. Isso evita o erro mais comum: uma pasta duplicada dentro da outra.
 
### 2.3 Clone
 
Abra o terminal, navegue até a pasta escolhida e rode:
 
```bash
cd Documentos
git clone https://github.com/Morcineck/Codigo_comentado.git
```
 
Isso cria uma pasta `Codigo_comentado` com todo o projeto dentro, não precisa criar essa pasta manualmente antes.
 
### 2.4 Entre na pasta do projeto
 
```bash
cd Codigo_comentado
```
 
> ⚠️ **Atenção:** se ao abrir a pasta no explorador de arquivos ou na IDE você perceber uma pasta com o mesmo nome *dentro* dela (tipo `Codigo_comentado/Codigo_comentado/`), algo deu errado na hora do clone. A solução mais simples é apagar tudo e clonar de novo, seguindo os passos 2.2 a 2.4 com atenção.
 
---
 
## 💻 Parte 3 - Abrir na IDE
 
**No IntelliJ ou PyCharm:**
1. Abra a IDE
2. **File → Open**
3. Selecione a pasta que você acabou de clonar (`Codigo_comentado`)
4. Aguarde a IDE indexar o projeto
**No VS Code:**
1. Abra o VS Code
2. **File → Open Folder**
3. Selecione a pasta clonada
### Sobre avisos da IDE
 
Você pode ver alguns avisos ao abrir o projeto, são normais e não indicam erro no seu código:
 
- *"Java file is located outside of the module source root, so it won't be compiled"* → pode ignorar. Este repositório não é um projeto Java "de verdade" (com Maven/Gradle), é uma coleção de arquivos didáticos, então esse aviso não se aplica.
- *"IDE project settings can be added to Git"* → clique em **"Don't Ask Again"**. As configurações da IDE são pessoais e não devem ser commitadas.
---
 
## 🌿 Parte 4 - Trocar para a branch `develop`
 
Por padrão, o Git te deixa na `main` depois de clonar. Sempre trabalhamos a partir da `develop`:
 
```bash
git checkout develop
git pull origin develop
```
 
O `git pull` garante que você está com a versão mais recente, sem nada desatualizado.
 
---
 
## 🌱 Parte 5 - Criar sua branch de trabalho
 
**Nunca trabalhe direto na `develop` ou na `main`.** Sempre crie uma branch sua:
 
```bash
git checkout -b feature/categoria-tema
```
 
Exemplos reais:
```bash
git checkout -b feature/poo-heranca
git checkout -b feature/python-variaveis
```
 
---
 
## ✍️ Parte 6 - Escrever seu conteúdo
 
1. Copie o template da sua linguagem, de dentro da pasta `templates/`.
2. Cole dentro de `<linguagem>/<categoria>/`, renomeando seguindo o padrão `A0X_Tema.<extensão>` (ex: `A03_Heranca.java`).
3. Preencha o conteúdo seguindo as seções obrigatórias descritas no [`CONTRIBUTING.md`](./CONTRIBUTING.md).
---
 
## ✅ Parte 7 - Commit
 
Verifique o que foi alterado:
 
```bash
git status
```
 
Adicione o arquivo:
 
```bash
git add java/poo/A03_Heranca.java
```
 
Faça o commit, seguindo o [padrão de commits](./CONTRIBUTING.md#-padr%C3%A3o-de-commits):
 
```bash
git commit -m "feat: adiciona explicação sobre heranca em Java"
```
 
---
 
## ☁️ Parte 8 - Enviar para o GitHub
 
```bash
git push origin feature/poo-heranca
```
 
Na primeira vez que você faz push de uma branch nova, pode ser que peça login do GitHub, siga as instruções que aparecerem na tela (geralmente abre o navegador para autorizar).
 
---
 
## 🔀 Parte 9 - Abrir o Pull Request
 
1. Vá até o repositório no GitHub. Deve aparecer um aviso com o botão **"Compare & pull request"**, clique nele. (Se não aparecer, o terminal também mostra um link direto após o `push`.)
2. Confira se a **base** está como `develop` (não `main`).
3. Escreva um título e uma breve descrição do que você fez.
4. Marque um revisor (veja a tabela de [Papéis e responsabilidades](./CONTRIBUTING.md#-pap%C3%A9is-e-responsabilidades) para saber quem é o revisor da sua linguagem).
5. Clique em **"Create pull request"**.
---
 
## 👀 Parte 10 - Aguardar revisão
 
O revisor vai avaliar seu PR seguindo a checklist do CONTRIBUTING.md. Se pedir ajustes:
 
1. Faça as alterações no mesmo arquivo, na sua máquina.
2. Repita os comandos `git add`, `git commit` e `git push` (na mesma branch, **não crie um PR novo**).
3. O PR já existente é atualizado automaticamente.
Depois de aprovado, o mantenedor faz o merge em `develop`. 🎉
 
---
 
## 🆘 Problemas comuns
 
**"Pasta duplicada dentro da pasta clonada"**
Você provavelmente criou a pasta manualmente antes de rodar `git clone`. Apague tudo e refaça a Parte 2, deixando o `git clone` criar a pasta sozinho.
 
**"Permission denied" ou pede senha toda hora no push**
O GitHub não aceita mais senha simples por linha de comando. Configure autenticação por token ou deixe a IDE abrir o navegador para autorizar via login.
 
**Esqueci em qual branch estou**
```bash
git branch
```
A branch atual aparece marcada com um `*`.
 
**Quero atualizar minha branch com o que mudou na `develop`**
```bash
git checkout develop
git pull origin develop
git checkout feature/sua-branch
git merge develop
```
 
---
 
Dúvidas que não estão aqui? 
Peça ajuda no grupo e se for uma dúvida que outras pessoas provavelmente também vão ter, considere sugerir uma adição a este guia.
