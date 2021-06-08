package pages;
 /*
    segundo fluxo: recuperar senha respondendo questionario
     */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecuperaSenhaPage extends BasePage{
    public RecuperaSenhaPage(WebDriver navegador) { super(navegador);
    }
    //validar texto "Siga as instruções encaminhadas para redefinir a sua senha."

    //clicar no link com texto: "Se preferir responda as perguntas de segurança agora e redefina sua senha."
    //ou xpath //*[@id="conexao"]/div/div[2]/div[2]/div/p
    public RecuperaSenhaPage primeiroChefe(){
        navegador.findElement(By.id("resposta0")).sendKeys("2");
        return this;
    }
    public RecuperaSenhaPage livroFavorito(){
        navegador.findElement(By.id("resposta1")).sendKeys("1");
        return this;
    }
    public RecuperaSenhaPage ruaPrimeiraCasa(){
        navegador.findElement(By.id("resposta2")).sendKeys("3");
        return this;
    }

    //clicar no botão com o texto "RESPONDER" XPATH //*[@id="respotaPerguntaSeguranca"]/div/div/input
    public RedefinirSenhaPage clicarBotaoResponder(){
        navegador.findElement(By.xpath("//*[@id=\"respotaPerguntaSeguranca\"]/div/div/input")).click();
        return new RedefinirSenhaPage(navegador);
    }
}


//na pagina formulario com id="respotaPerguntaSeguranca", no campo com id="resposta0" informar resposta Livro Favorito:1

//no campo com id="resposta1" informar resposta QUAL É O NOME DO SEU PRIMEIRO CHEFE: 2 ou Qual nome da rua primeira casa: 3

//clicar no botão com value="RESPONDER" ou xpath //*[@id="respotaPerguntaSeguranca"]/div/div/input

//validar que abra a pagina "redefinir senha" contendo o texto "REDEFINA SUA SENHA"