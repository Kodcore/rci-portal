#langhage: pt-br
  Feature:
    Como usuário do Portal RCI
    desejo receber e-mail com link de acesso
    para criar nova senha e acessar o portal de privacidade.


@Scenario: 01 - autenticacao nova senha via email


- acessar página  [Portal RCI](https://portal.bancorenault.com.br/)
- retorna tela de login
- clicar no *link* “[Esqueceu sua senha? Clique aqui](https://portal.bancorenault.com.br/portal/indexRENAULT.html#esqueci_minha_senha)“
- retorna tela para solicitar a nova senha



- no campo "identificação" informar email/cpf
- marcar o checkpoint "não sou um robô"
- clicar no botão "próximo"
- retorna tela "siga os passos a seguir"



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
