package pages;
/*
    nesta pagina informar senha, confirma senha e clica no botao "redefinir senha"
    retorna pagina de validação com texto="VALIDAÇÃO" ou mensagem de texto="SENHA REDEFINIDA COM SUCESSO!"

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
    public ConexaoPage clicarBotaoRedefinirSenha(){
        navegador.findElement(By.xpath("//*[@id=\"form-cadastrese3\"]/div[4]/div/input")).click();
        return new ConexaoPage(navegador);
    }


}




//no campo com id="password" informar nova senha "Rci@123*"

//no campo com id="confirmpassword" confirmar nova senha "Rci@123*"

//clicar no botão com value="REDEFINIR SENHA" com xpath "//*[@id="form-cadastrese3"]/div[4]/div/input"


