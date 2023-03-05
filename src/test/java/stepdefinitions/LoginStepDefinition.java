package stepdefinitions;

import io.cucumber.java.en.When;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginStepDefinition {


    @When("kullanici emaili ve sifresini girer")
    public void kullanici_emaili_ve_sifresini_girer(io.cucumber.datatable.DataTable dataTable) {
        LoginPage loginPage = new LoginPage();
//      1. List<String> olarak depolayabiliriz
//        List<String> musteriBilgisi = dataTable.row(1);
//        System.out.println(musteriBilgisi.get(0));
//        System.out.println(musteriBilgisi.get(1));
//        loginPage.email.sendKeys(musteriBilgisi.get(0));
//        loginPage.password.sendKeys(musteriBilgisi.get(1));
//        loginPage.login.click();

//2.   Datatable da datalari List<Map<String,String>> de depolayabiliriz
        List<Map<String,String>> musteriBilgisi = dataTable.asMaps(String.class,String.class);
        System.out.println(musteriBilgisi);
        for (Map<String ,String > musteri : musteriBilgisi){
            loginPage.email.sendKeys(musteri.get("email"));
            loginPage.password.sendKeys(musteri.get("sifre"));
            loginPage.login.click();
        }

/*
Scenari Outline ile DDT yapılabilir. Scenario Outline iyi bilinmelidir.
Test adimlarini(STEPS) data reusable yapmak icin kullanilir
En çok kullanılan cucumber ozelliklerinden biridir
Examples kelisi veri girisleri icin kullanilmalidir
Step definitionslardaki data tipi STRINGdir
Examples kelimesi en sonda kullanilir
Data Tables ile DDT yapılabilir
Test adimlarini(STEPS) data reusable yapmak icin kullanilir
Scenari Outline kadar yaygın degildir
Examples kelimesi kullanılmaz
Step definitionslardaki data tipi DATATABLE
DataTablelar ara adimlardada(STEPS) kullanilabilir
NOT: Datatables ve Scenario Outline birlikle kullanilabilir
 */

        /*
        Collectionslar nelerdir? -> list, set, queue
Collectionslari frameworkunde nasıl kullandın? -> Collectionslari ozellikle coklu data ihtiyacimiz oldugunda kullanırız.
Ornegin, findElements metotu kullanildiginda birden fazla element beklediğim icin, List<WebElement> kullanırız.
Yada, çoklu pencere geçişlerinde getWindowHandles ile Set kullanırız.
Dropdowndaki tum elementleri getOptions metot ile aldigimda List<WebElement> e koyariz.
Frameforkumuzde bazı utility classlar kullanıyoruz. Bunlarin icince çok sayıda collections kullanıyoruz. Ornegin ExcelUtils datalarını list e koyan metotlarımız vardır.
Cucumberda DataTables kullandigimda, gelen verileri List yada Map de depolayabiliriz.
         */

    }
}