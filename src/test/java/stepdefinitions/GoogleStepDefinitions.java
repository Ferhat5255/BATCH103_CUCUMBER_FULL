package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePages;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {
    GooglePages googlePages = new GooglePages();

    @Given("kullanici google gider")
    public void kullanici_google_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
//    CEREZ CIKAN ARKADASLAR ICIN, CEREZI OKEYLEYELIM
        try {
            googlePages.popUpAccept.click();
        } catch (Exception e) {

        }
    }

    @When("kullanici iphone icin arama yapar")
    public void kullanici_iphone_icin_arama_yapar() {
        googlePages.searchBox.sendKeys("iPhone" + Keys.ENTER);
    }

    @Then("sonuclarda iphone oldugunu dogrular")
    public void sonuclarda_iphone_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));

    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @When("kullanici tesla icin arama yapar")
    public void kullanici_tesla_icin_arama_yapar() {
        googlePages.searchBox.sendKeys("tesla" + Keys.ENTER);
    }

    @Then("sonclarda tesla oldugunu dogrular")
    public void sonclarda_tesla_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("tesla"));
    }

    @When("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String string) {
        googlePages.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini dogrula")
    public void sonuclarin_icerdigini_dogrula(String string) {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(string));
    }

}
