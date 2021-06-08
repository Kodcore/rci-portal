package pages;
/*
    na tela index portal do banco, clicar no link que possui o texto “Esqueceu sua senha? Clique aqui"
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage{
    public IndexPage(WebDriver navegador) {
        super(navegador);
    }

    public IdentificacaoUsuarioPage clicarLinkEsqueceuSuaSenha() {

        navegador.findElement(By.linkText("Esqueceu sua senha? Clique aqui")).click();
        return new IdentificacaoUsuarioPage(navegador);
    }
}
