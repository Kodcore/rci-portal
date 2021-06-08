package pages;
/*
    informar nova senha, confirma nova senha e clica no botao "redefinir senha"

 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RedefinirSenhaPage extends BasePage{
    public RedefinirSenhaPage(WebDriver navegador) {
        super(navegador);
    }
    public RedefinirSenhaPage informarNovaSenha(){
        navegador.findElement(By.id("password")).sendKeys("Rci@123*");
        return this;
    }
    public RedefinirSenhaPage confirmarNovaSenha(){
        navegador.findElement(By.id("confirmpassword")).sendKeys("Rci@123*");
        return this;
    }
    public ValidacaoPage clicarBotaoRedefinirSenha(){
        navegador.findElement(By.xpath("//*[@id=\"form-cadastrese3\"]/div[4]/div/input")).click();
        return new ValidacaoPage(navegador);
    }

}




