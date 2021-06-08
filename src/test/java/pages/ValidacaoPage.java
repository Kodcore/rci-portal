package pages;
/*
    pagina apresenta mensagem de texto="SENHA REDEFINIDA COM SUCESSO!"
    apresenta o botão com value="IR PARA O PORTAL"
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidacaoPage extends BasePage{
    public ValidacaoPage(WebDriver navegador) { super(navegador);
    }
    public ValidacaoPage clicarBotaoIrParaPortal(){

       navegador.findElement(By.xpath("//*[@id=\"conexao\"]/div/div/div/div[3]/div/form/input")).click();

        return null;
    }

}


