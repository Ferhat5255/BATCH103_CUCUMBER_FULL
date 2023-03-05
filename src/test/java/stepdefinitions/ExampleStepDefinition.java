package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ExamplePage;

public class ExampleStepDefinition {
    ExamplePage examplePage = new ExamplePage();

    @When("kullanici login sayfasina gider")
    public void kullaniciLoginSayfasinaGider() {
examplePage.buttonLogin.click();
    }
    @And("kullanıcı adini girer {string}")
    public void kullanıcıAdiniGirer(String arg0) {
examplePage.boxEmail.sendKeys(arg0);
    }

    @And("sifreyi girer {string}")
    public void sifreyiGirer(String arg0) {
        examplePage.boxPassword.sendKeys(arg0);
    }

    @And("login buttoning basar")
    public void loginButtoningBasar() {
        examplePage.buttonLoginRegister.click();
    }

    @Then("login islemi gerçekleşir")
    public void loginIslemiGerçekleşir() {
        Assert.assertTrue(examplePage.buttonDropDown.isDisplayed());
    }


}
