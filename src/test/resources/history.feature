#langhage: pt
 //Feature:
    Como usuário do Portal RCI
    desejo redefinir minha senha
    para acessar o portal de privacidade

   // Scenario: como usuario desejo acessar pagina de identificacao para que possa solicitar redefinicao de senha
      Given que estou na tela de <indexBancoRenault>
      When aciono o link "Esqueceu sua senha? Clique aqui"
      Then sera apresentada a pagina <IdentificacaoDoUsuario>

    //Scenario: como usuario desejo informar meu CPF para que possa solicitar redefinicao de senha
      Given estou na tela de <IdentificacaoDoUsuario>
      When  informo cpf/cnpj válido
      And marco o checkpoint "Não sou um robô"
      And aciono o button PRÓXIMO
      Then sera apresentada a pagina <InstrucaoRedefinirSenha>

    //Scenario: como usuário desejo escolher responder perguntas de segurança para que possa solicitar redefinição de
senha
      Given estou na tela de <InstrucaoRedefinirSenha>
      When aciono o link Se preferir responda as perguntas de segurança agora e redefina sua senha."
      Then sera apresentada a pagina <PerguntasDeSeguranca>

//    Scenario: como usuário desejo responder perguntas de segurança para que possa solicitar redefinição de senha
      Given estou na tela de <PerguntasDeSeguranca>
      And respondi a primeira pergunta corretamente
      And respondi a segunda pergunta corretamente
      When aciono o botão RESPONDER
      Then sera apresentada a pagina <RedefinaSuaSenha>

  //  Scenario: como usuário desejo redefinir minha senha para acessar o portal de privacidade
      Given estou na tela de <RedefinaSuaSenha>
      And que no campo *INSIRA SUA SENHA* informei nova senha valida
      And que confirmei nova senha valida
      When aciono o botão *REDEFINIR SENHA*
      Then sera apresentada a pagina <Validacao>

 //   Scenario: como usuário desejo ser redirecionado para o portal de privacidade após a redefinição de senha
      Given estou na tela de <Validacao>
      And que minha senha foi redefinida com sucesso
      When aciono o botão *IR PRA O PORTAL*
      Then sera apresentada a pagina <PortalPrivacyTools>