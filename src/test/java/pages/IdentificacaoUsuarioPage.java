package pages;
/*
    na pagina "Esqueci minha senha", informar o cpf/cnpj, clicar no recaptcha e botão próximo
    mensagem é enviada para o email do usuário.(api)

 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdentificacaoUsuarioPage extends BasePage{
    public IdentificacaoUsuarioPage(WebDriver navegador) {
        super(navegador);
    }

    public InstrucaoRedefinirSenhaPage informarCpfCnpj() {
        //no campo identificacao com id="cpfcnpj" informar o cpf "00003172090"
        navegador.findElement(By.id("cpfcnpj")).sendKeys("00003172090");

        //clicar no recaptcha "Não sou robô."
        navegador.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();

        //clicar no botão "PRÓXIMO"
        navegador.findElement(By.xpath("//*[@id=\"form-forgetPassword\"]/div[3]/div/input")).click();
        return new InstrucaoRedefinirSenhaPage(navegador);
    }

}
