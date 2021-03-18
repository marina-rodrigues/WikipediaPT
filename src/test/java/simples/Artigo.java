package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Atributos
public class Artigo {
    String url;     // Endereço do site alvo
    WebDriver driver; // Objeto do selenium webdriver

    @Before
    public void iniciar() {
        url = "https://pt.wikipedia.org/";
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");
        driver = new ChromeDriver(); //Instanciar o Selenium como Chrome Driver

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void consultarArtigo() {
        // Abrir o site
        driver.get(url);

        // Pesquisar por "Ovo de Páscoa"
        driver.findElement(By.id("searchInput")).sendKeys("Ovo de Páscoa");
        //driver.findElement(By.id("searchButton")).click(); // Clica na lupa
        driver.findElement(By.cssSelector("button.wvui-button")).click();

        // Validar o título da página
        // assertEquals("Ovo de Páscoa - Wikipédia, a enciclopédia livre", driver.getTitle());
        assertTrue(driver.getTitle().contains("Ovo de Páscoa"));

    }

    @After
    public void finalizar() {
        driver.quit();

    }
}
