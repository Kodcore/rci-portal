package pages;
 /*
     tela apresenta instruções para recuperação de senha através do e-mail ou das perguntas de segurança
     e botão "VOLTAR" para ser redirecionado à pagina Portal do Banco
     */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstrucaoRedefinirSenhaPage extends BasePage{
    public InstrucaoRedefinirSenhaPage(WebDriver navegador) { super(navegador);
    }

    public InstrucaoRedefinirSenhaPage clickBotaoVoltar(){
        navegador.findElement(By.name("VOLTAR")).click();
        return this;
    }
    public PerguntasSegurancaPage clicarLinkResponderPerguntasSeguranca(){
        navegador.findElement(By.linkText("Se preferir responda as perguntas de segurança agora e redefina sua senha.")).click();
        return new PerguntasSegurancaPage(navegador);
    }

}

