package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_08 {

    @Test
    public void US_08(){

        //Kayıtlı kullanıcı olarak Home page
        // sayfasının body bölümündeki öğelerin görünür ve
        // fonksiyonların aktif olduğunu görüntüleyebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        //KULLANICI GİRİŞ İŞLEMLERİ
        WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        signin.click();


        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmet@testotomasyonu.com");

        password.sendKeys("Ahmet.123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();

        //ARAMA KUTUSU TESTİ
        WebElement aramakutusu=Driver.getDriver().findElement(By.xpath("//*[@name='search']"));

        aramakutusu.sendKeys("Rimadyl"+ Keys.ENTER);

        Driver.getDriver().navigate().back();

        //SAYFAYI AŞAĞI KAYDIRMAK İÇİN ACTİON KULLANIMI
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //BODY KONTROL
        WebElement wellness=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[1]"));

        Assert.assertTrue(wellness.isDisplayed());

        wellness.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement dentalcare=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[2]"));

        Assert.assertTrue(dentalcare.isDisplayed());

        dentalcare.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement anaesthesia=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[3]"));

        Assert.assertTrue(anaesthesia.isDisplayed());

        anaesthesia.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement dermatology=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[4]"));

        Assert.assertTrue(dermatology.isDisplayed());

        dermatology.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement diagnostics=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[5]"));

        Assert.assertTrue(diagnostics.isDisplayed());

        diagnostics.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement vaccinations=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[6]"));

        Assert.assertTrue(vaccinations.isDisplayed());

        vaccinations.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement paincontrol=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[7]"));

        Assert.assertTrue(paincontrol.isDisplayed());

        paincontrol.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement boarding=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[8]"));

        Assert.assertTrue(boarding.isDisplayed());

        boarding.click();

        Driver.getDriver().navigate().back();

        //AŞAĞI KAYDIRMA
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //BODY KONTROL
        WebElement dralejandromartinez=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[9]"));

        Assert.assertTrue(dralejandromartinez.isDisplayed());

        dralejandromartinez.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement drmarcusrodriguez=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[10]"));

        Assert.assertTrue(drmarcusrodriguez.isDisplayed());

        drmarcusrodriguez.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement droliviabennett=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[11]"));

        Assert.assertTrue(droliviabennett.isDisplayed());

        droliviabennett.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement dremilychang=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[12]"));

        Assert.assertTrue(dremilychang.isDisplayed());

        dremilychang.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement drnathanpatel=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[13]"));

        Assert.assertTrue(drnathanpatel.isDisplayed());

        drnathanpatel.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement drısabellawong=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[14]"));

        Assert.assertTrue(drısabellawong.isDisplayed());

        drısabellawong.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement drlıamconnor=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[15]"));

        Assert.assertTrue(drlıamconnor.isDisplayed());

        drlıamconnor.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement drsophıakım=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[16]"));

        Assert.assertTrue(drsophıakım.isDisplayed());

        drsophıakım.click();

        Driver.getDriver().navigate().back();



        //BODY KONTROL
        WebElement rabınesvacıne=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[17]"));

        Assert.assertTrue(rabınesvacıne.isDisplayed());

        rabınesvacıne.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement dhppvacıne=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[18]"));

        Assert.assertTrue(dhppvacıne.isDisplayed());

        dhppvacıne.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement felıneleukemıavaccıne=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[19]"));

        Assert.assertTrue(felıneleukemıavaccıne.isDisplayed());

        felıneleukemıavaccıne.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement fıvvaccıne=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[20]"));

        Assert.assertTrue(fıvvaccıne.isDisplayed());

        fıvvaccıne.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement bordetellavacıne=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[21]"));

        Assert.assertTrue(bordetellavacıne.isDisplayed());

        bordetellavacıne.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement fpv=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[22]"));

        Assert.assertTrue(fpv.isDisplayed());

        fpv.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement felıneherpesvırusvaccine=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[23]"));

        Assert.assertTrue(felıneherpesvırusvaccine.isDisplayed());

        felıneherpesvırusvaccine.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL
        WebElement surgıcalprocedure=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[24]"));

        Assert.assertTrue(surgıcalprocedure.isDisplayed());

        surgıcalprocedure.click();

        Driver.getDriver().navigate().back();





    }

}
