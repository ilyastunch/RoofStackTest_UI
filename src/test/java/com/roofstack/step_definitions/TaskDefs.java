package com.roofstack.step_definitions;


import com.roofstack.pages.*;
import com.roofstack.utilities.BrowserUtils;
import com.roofstack.utilities.ConfigurationReader;
import com.roofstack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TaskDefs {
    GoogleHomePage googleHomePage = new GoogleHomePage();
    HomePage homePage = new HomePage();
    CareerPage careerPage = new CareerPage();
    ProductPage productPage = new ProductPage();
    TestLeadPage testLeadPage = new TestLeadPage();

    @Given("Google’a {string} şeklinde arama yapılır.")
    public void google_a_şeklinde_arama_yapılır(String searchWords) {

        Driver.get().get(ConfigurationReader.get("url"));

        googleHomePage.searchInput.sendKeys(searchWords);
        BrowserUtils.waitFor(1);
        googleHomePage.searchInput.sendKeys(Keys.ENTER);


    }

    @When("Sonuçlar listesinden https:\\/\\/roofstacks.com adresine girilir.")
    public void sonuçlar_listesinden_https_roofstacks_com_adresine_girilir() {
        googleHomePage.searchedItem.click();
    }

    @Then("Kariyer sayfasına gidilir.")
    public void kariyer_sayfasına_gidilir() {

        homePage.careerBtn.click();

    }

    @Then("İlanlar arasından Product pozisyonu seçilir.")
    public void i̇lanlar_arasından_Product_pozisyonu_seçilir() {

        try{
            careerPage.getPosition("Product");
        }catch (Exception e ){
            e.printStackTrace();
        }


    }

    @Then("Lead Product Tester seçilir.")
    public void lead_Product_Tester_seçilir() {

        productPage.leadProductTester.click();

    }

    @Then("Lead Product Tester sayfasında sayfanın gelip gelmediği, doğruluğu kontrol edilir.")
    public void lead_Product_Tester_sayfasında_sayfanın_gelip_gelmediği_doğruluğu_kontrol_edilir() {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(productPage.head.getText().equals("Lead Product Tester"));

    }

    @Then("SendCV butonuna basarak bir dosya upload edelim")
    public void sendcv_butonuna_basarak_bir_dosya_upload_edelim() {
    testLeadPage.sendCV.click();
    }

    @Then("Eposta adresine e-mail adresinizi girelim")
    public void eposta_adresine_e_mail_adresinizi_girelim() {
        testLeadPage.mailInput.sendKeys(ConfigurationReader.get("email"));
    }

    @Then("Sample bir dosya yükleyelim ve upload butonuna basarak dosyayı paylaşalım")
    public void sample_bir_dosya_yükleyelim_ve_upload_butonuna_basarak_dosyayı_paylaşalım() {

        testLeadPage.chooseFile.sendKeys("C:\\Users\\iltun\\Desktop\\CV.txt");
        testLeadPage.submitBtn.click();
        BrowserUtils.waitFor(5);

    }


}
