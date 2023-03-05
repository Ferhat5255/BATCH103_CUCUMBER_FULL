package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPages;
import utilities.Driver;

public class DatatablesStepDefinitions {

    DataTablesPages dataTablesPages = new DataTablesPages();
    @Given("kullanici {string} gider")
    public void kullaniciGider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
  //    dataTablesPages.newButton.click();
        Driver.waitAndClick(dataTablesPages.newButton,5);
    }
    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
     //   dataTablesPages.firstName.sendKeys(string);
        Driver.waitAndSendText(dataTablesPages.firstName,string,5);
    }
    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {
        dataTablesPages.lastName.sendKeys(string);
    }
    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
        dataTablesPages.position.sendKeys(string);
    }
    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
        dataTablesPages.office.sendKeys(string);
    }
    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
        dataTablesPages.extension.sendKeys(string);
    }
    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {
        dataTablesPages.startDate.sendKeys(string);
    }
    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
        dataTablesPages.salary.sendKeys(string);
    }
    @When("kullanici create buttonuna basar")
    public void kullanici_create_buttonuna_basar() {
        dataTablesPages.create.click();
    }

    @When("kullanici firstname ile {string} arar")
    public void kullanici_firstname_ile_arar(String string) {
        dataTablesPages.search.sendKeys(string);
    }
    @Then("firstname {string} in olustugunu test et")
    public void firstname_in_olustugunu_test_et(String string) {
        Driver.wait(1);
        Assert.assertTrue(Driver.waitAndGetText(dataTablesPages.name,5).contains(string));
    //    Assert.assertTrue(dataTablesPages.name.getText().contains(string));
    }
}
