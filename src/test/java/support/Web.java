package support;
/*
    US01: abrir o browser na tela inicial de direcionamento
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Web {
    public static WebDriver createChrome(){

        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //inserir link inicial da tela de direcionamento
        navegador.get("https://portal.bancorenault.com.br/");

        return navegador;
    }

}
