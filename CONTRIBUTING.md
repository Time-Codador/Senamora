Como usar o GitHub Project, fazer uma issues e uma PR

Este documento serve para organizar como nós vamos usar o GitHub para desenvolver o **SeNamora**. Seguir esses passos vai evitar que a apaguem o código um do outro e vai ajudar a manter o projeto organizado para a entrega.



 1. GitHub Projects (Quadro de Tarefas)
O Projects é o painel para saber quem está fazendo o quê.
Ao começar uma tarefa: Vá na coluna do projeto, clique na sua tarefa e mude o Status de `Todo` (A fazer) para `Em andamento`.
Ao terminar: Mude o Status para `Concluído`.
Regra: Nunca comece a mexer em uma funcionalidade sem antes garantir que ela está atribuída a você no Projects para evitar trabalho duplicado.

2. Criando uma Issue (Problemas e Ideias)
Caso tenha encontrado um erro no código ou teve uma ideia nova para o site de namoro? Abra uma Issue!
1. Vá na aba Issues do repositório e clique em New Issue.
2. No título, seja direto: 
   Exemplo de Bug: `[BUG] Botão de curtir perfil não funciona`
   Exemplo de Ideia: `[SUGESTÃO] Adicionar filtro de distância entre usuários`
3. Na descrição, explique o problema ou a ideia e marque (`@nome`) o membro responsável para que ele receba uma notificação.



3. Fluxo de Código (Branch, Commits e Pull Requests)
Para manter o código principal seguro, nunca vamos programar direto na branch `main`. Vamos seguir este fluxo:

Passo 3.1: Criar uma ramificação (Branch)
Antes de começar a escrever o código da sua tarefa, crie uma branch separada com o seu nome e a tarefa.
Exemplo: `matheus/tela-login` ou `enzo/algoritmo-match`

Passo 3.2: Fazer o Pull Request (PR)
Terminou de programar e testar a sua parte? É hora de mandar para o repositório principal:
1. Envie suas alterações (Push) para o GitHub na sua branch.
2. Acesse a página do repositório no site do GitHub. Você verá um botão amarelo escrito Compare & pull request. Clique nele.
3. Diga o que você fez (ex: "Criei a estrutura HTML e estilização CSS da tela de login").
4. Clique em Create pull request.

Passo 3.3: Revisão e aprovação (Regra Importante)
Não junte o seu próprio código: Depois de abrir o PR, avise o grupo.
Pelo menos outro membro do time deve entrar no PR, dar uma olhada no código e clicar em Approve (Aprovar).
 Após a aprovação de um colega, o botão Merge pull request ficará verde. Aí sim, clique nele para juntar o código com a branch principal (`main`).
 
