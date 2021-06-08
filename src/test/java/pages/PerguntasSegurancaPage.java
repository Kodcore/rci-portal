package pages;
/*
    tela para responder perguntas de segurança e clicar botão "RESPONDER"
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerguntasSegurancaPage extends BasePage{
    public PerguntasSegurancaPage(WebDriver navegador){super(navegador);}

    public PerguntasSegurancaPage primeiroChefe(){
        navegador.findElement(By.id("resposta0")).sendKeys("2");
        return this;
    }
    public PerguntasSegurancaPage livroFavorito(){
        navegador.findElement(By.id("resposta1")).sendKeys("1");
        return this;
    }
    public PerguntasSegurancaPage ruaPrimeiraCasa(){
        navegador.findElement(By.id("resposta2")).sendKeys("3");
        return this;
    }

    //clicar no botão com o texto "RESPONDER" XPATH //*[@id="respotaPerguntaSeguranca"]/div/div/input
    public RedefinirSenhaPage clicarBotaoResponder(){
        navegador.findElement(By.xpath("//*[@id=\"respotaPerguntaSeguranca\"]/div/div/input")).click();
        return new RedefinirSenhaPage(navegador);
    }
}
