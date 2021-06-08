package tests;
/*
    apresenta o portal privacy tools
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import support.Generator;
import support.Screenshot;
import support.Web;


public class ValidacaoPageTest {
    private WebDriver navegador;

    @Rule
    public TestName testName = new TestName();
    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }
    @Test
    public void testValidaPortalPrivacyTools(){
        String msgPortal = navegador.findElement(By.xpath("//*[@id=\"privacy-tools-app\"]/main/header/div/h1")).getText();
        assertEquals("PORTAL DE PRIVACIDADE",msgPortal);

        String screenshotArquivo = "C:\\projects\\test-report\\portalPrivacyTools\\" + Generator.dataHoraParaArquivo() + testName.getMethodName() +".png";
        Screenshot.tirarPhoto(navegador,screenshotArquivo);

    }
    @After
    public void tearDown(){
        navegador.quit();
    }
}




