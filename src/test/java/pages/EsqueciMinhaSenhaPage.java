package pages;
/*
    na pagina "Esqueci minha senha", informar o cpf/cnpj, clicar no recaptcha e botão próximo
    mensagem é enviada para o email do usuário.(api)
    apresenta opção: "Não tem mais acesso a este e-mail? Clique aqui"
    & opção: "Se preferir responda as perguntas de segurança agora e redefina sua senha."
    obs: cenário botão "VOLTAR"
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EsqueciMinhaSenhaPage extends BasePage{
    public EsqueciMinhaSenhaPage(WebDriver navegador) {
        super(navegador);
    }

    public RecuperaSenhaPage informarCpfCnpj() {
        //no campo identificacao com id="cpfcnpj" informar o cpf "00003172090"
        navegador.findElement(By.id("cpfcnpj")).sendKeys("00003172090");

        //clicar no recaptcha com xpath "//*[@id="recaptcha-anchor"]/div[1]"
        navegador.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();

        //clicar no botão de value="PRÓXIMO"
        navegador.findElement(By.xpath("//*[@id=\"form-forgetPassword\"]/div[3]/div/input")).click();
        //validar que abra página "recupera senha" contendo o texto: "Siga as instruções encaminhadas para redefinir a sua senha."
        return new RecuperaSenhaPage(navegador);
    }

}
