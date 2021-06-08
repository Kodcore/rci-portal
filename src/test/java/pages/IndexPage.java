package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/*
    na tela index, clicar no link que possui o texto “Esqueceu sua senha? Clique aqui"
 */
public class IndexPage extends BasePage{
    public IndexPage(WebDriver navegador) {
        super(navegador);
    }

    public EsqueciMinhaSenhaPage clicarLinkEsqueceuSuaSenha() {

        navegador.findElement(By.linkText("Esqueceu sua senha? Clique aqui")).click();
        return new EsqueciMinhaSenhaPage(navegador);
    }
}
