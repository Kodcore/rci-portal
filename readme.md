**Funcionalidade**

​	Como usuário do Portal RCI desejo receber e-mail com link de acesso para criar nova senha e acessar o portal de privacidade.



**Cenários:**

	1. autenticação de nova senha por *e-mail*
	2. autenticação de nova senha por questionário



**@Pagina 01:** autenticação de nova senha por *e-mail*

- acessar página  [Portal RCI](https://portal.bancorenault.com.br/) 
- retorna tela de login
  - clicar no *link* “[Esqueceu sua senha? Clique aqui](https://portal.bancorenault.com.br/portal/indexRENAULT.html#esqueci_minha_senha)“
  - retorna tela para solicitar a nova senha

**@Pagina 02:** pagina index

- no campo "identificação" informar email/cpf
- marcar o checkpoint "não sou um robô"
- clicar no botão "próximo"
- retorna tela "siga os passos a seguir"



**@Pagina 03:** EsqueciMinhaSenhaPage

- na tela "siga os passos a seguir"
- clicar no botão "voltar"
- retorna tela de login



- clicar no link contido no email de recuperação de senha
- deverá retornar a tela "redefina sua senha"
- na tela "redefina sua senha"



- na tela "redefina sua senha"
- no campo "redefina sua senha" criar nova senha contendo:
  - Letras maiúsculas e minúsculas
  - Um número
  - Um caracter especial
  - Oito caracteres
- no campo confirmação de senha, reinserir senha
- clicar no botão "redefinir senha"
- deverá retornar tela de mensagem: "Você redefiniu a senha com sucesso. Clique no botão abaixo para ir ao portal". 
- clicar no botão "ir ao portal"
- deverá retornar o portal *privacy tools*



- na tela de *login*, no campo identificação inserir cpf/cnpj
- no campo "insira sua senha", informe a nova senha
- clicar no botão "entrar"
- deverá retornar tela portal de privacidade







**Então** usuário deverá informar seu *login* e a nova senha criada

**E** acionar o botão “Entrar“

**Então** o Portal RCI deverá liberar o *token* de acesso para o usuário logado e autenticá-lo

**E** **em seguida** o Portal RCI deverá redirecionar o usuário para o Portal de Privacidade

→ <a senha foi envia para o e-mail do usuário>

| a senha foi envia com erro

| a senha não foi enviada

| ocorreu erro sistêmico