package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {
    private Base base;

    public Post(Base base) {
        this.base = base;

    }

    /*
        @Dado("^que acesso a Wikipedia em Portugues$")
        public void queAcessoAWikipediaEmPortugues() {
            base.driver.get(base.url); // Abre o navegador no site alvo (extendendo da base)

        }

        @Quando("^pesquiso por \"([^\"]*)\"$")
        public void pesquisoPor(String produto) {
            base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

        }

        @Entao("^Exibe a expressao \"([^\"]*)\" no titulo da guia$")
        public void exibeAExpressaoNoTituloDaGuia(String produto) throws InterruptedException {
            Thread.sleep(6000);
            System.out.println("titulo: " + base.driver.getTitle());
            assertTrue(base.driver.getTitle().contains(produto));
        }
    }
    */
    @Given("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url); // Abre o navegador no site alvo (extendendo da base)

    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

    }

    @Then("^Exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto) throws InterruptedException {
        Thread.sleep(6000);
        System.out.println("titulo: " + base.driver.getTitle());
        assertTrue(base.driver.getTitle().contains(produto));
    }
}
