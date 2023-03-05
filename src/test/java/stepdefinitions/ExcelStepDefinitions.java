package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {
    //Page Objelerini Olustur
    HomePage homePage;
    LoginPage loginPage;
    ExcelUtils excelUtils;
    List<Map<String, String>> excelData;

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String sayfaAdi) throws IOException {
        String path = ".\\src\\test\\resources\\testdata\\mysmoketestdata.xlsx";
 //       String sayfa = "customer_info";
        excelUtils = new ExcelUtils(path, sayfaAdi);
        excelData = excelUtils.getDataList();

//      NOTE LOOP KODU
        for (Map<String, String> data : excelData) {
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));//HOME SAYFASINA
            homePage = new HomePage();
            loginPage = new LoginPage();

            homePage.firstLogin.click();
            loginPage.email.sendKeys(data.get("username"));
            loginPage.password.sendKeys(data.get("password"));
            loginPage.login.click();

            ReusableMethods.verifyElementDisplayed(homePage.userID);
            ReusableMethods.getScreenshot("Login_Goruntusu");

            homePage.userID.click();
            homePage.logOutButton.click();
            homePage.OKButton.click();
        }
        Driver.closeDriver();
    }
}

/*

LAMDA ILE
excelData.forEach(data -> {
    Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    homePage = new HomePage();
    loginPage = new LoginPage();
    homePage.firstLogin.click();
    ReusableMethods.waitFor(1);
    loginPage.email.sendKeys(data.get("username"));
    loginPage.password.sendKeys(data.get("password"));
    loginPage.login.click();
});
 */