package support;
/*
    acessar página  [Portal RCI](https://portal.bancorenault.com.br/)
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Web {
    public static WebDriver createChrome(){

        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        navegador.get("https://portal.bancorenault.com.br/");

        return navegador;
    }
}
