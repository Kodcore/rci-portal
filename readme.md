**Funcionalidade**

	Como usuário do Portal RCI desejo redefinir minha senha para acessar o portal de privacidade, podendo ser através de link enviado para meu e-mail ou respondendo perguntas de segurança diretamente no site. 



**Fluxos:**

	1. autenticação de nova senha por *e-mail*
	2. autenticação de nova senha por questionário



**Cenário:**

Como usuário desejo redefinir minha senha respondendo perguntas de segurança para acessar o portal de privacidade.



**US 01:** como usuário desejo clicar no link de acesso ao portal do banco Renault/Nissan

**Dado** que estou na tela de <direcionamentoPortalBanco>

**Quando** aciono o link *Iniciar Teste RENAULT*

**Então deve** ser apresentada a tela <indexPortalBancoRenault>



**US 02:** como usuário desejo acessar página de identificação para que possa solicitar redefinição de senha

**Dado** que estou na tela de <indexBancoRenault>

**Quando** aciono o link *Esqueceu sua senha? Clique aqui*

**Então deve** ser apresentada a pagina <IdentificacaoDoUsuario>



**US 03:** como usuário desejo informar meu CPF/CNPJ para que possa solicitar redefinição de senha

**Dado** que estou na tela de <IdentificacaoDoUsuario>

**Quando** informo cpf/cnpj válido

**E** marco o *checkpoint "Não sou um robô"* 

**E** aciono o botão *PRÓXIMO*

**Então deve** ser apresentada a pagina <InstrucaoRedefinirSenha>



**US 04:** como usuário desejo escolher responder perguntas de segurança para que possa solicitar redefinição de senha 

**Dado** que estou na tela de <InstrucaoRedefinirSenha>

**Quando** aciono o link *Se preferir responda as perguntas de segurança agora e redefina sua senha."*

**Então deve** ser apresentada a pagina <PerguntasDeSeguranca>



**US 05:** como usuário desejo responder perguntas de segurança para que possa solicitar redefinição de senha 

**Dado** que estou na tela de <PerguntasDeSeguranca>

**E** que respondi a primeira pergunta corretamente

**E** que respondi a segunda pergunta corretamente

**Quando** aciono o botão *RESPONDER*

**Então deve** ser apresentada a pagina <RedefinaSuaSenha>



**US 06:** como usuário desejo redefinir minha senha para acessar o portal de privacidade 

**Dado** que estou na tela de <RedefinaSuaSenha>

**E** que no campo *INSIRA SUA SENHA* informei nova senha valida

**E** que confirmei nova senha valida

**Quando** aciono o botão *REDEFINIR SENHA*

**Então deve** ser apresentada a pagina <Validacao>



**US 07:** como usuário desejo ser redirecionado para o portal de privacidade após a redefinição de senha

**Dado** que estou na tela de <Validacao>

**E** que minha senha foi redefinida com sucesso

**Quando** aciono o botão *IR PRA O PORTAL*

**Então deve** ser apresentada a pagina <PortalPrivacyTools>

