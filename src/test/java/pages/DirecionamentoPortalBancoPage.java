package pages;
/*
    US 02: tela de direcionamento para o banco Renault e para o Banco Nissan
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DirecionamentoPortalBancoPage {
    protected WebDriver navegador;

    public DirecionamentoPortalBancoPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public IdentificacaoUsuarioPage iniciarTesteRenault(){
        navegador.findElement(By.id("linkInicialRenault")).click();
        return new IdentificacaoUsuarioPage(navegador);
    }

    public IdentificacaoUsuarioPage iniciarTesteNissan(){
        navegador.findElement(By.id("linkInicialNissan")).click();
        return new IdentificacaoUsuarioPage(navegador);
    }
}
