package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_03 {

    //Bir ziyaretçi olarak Home page sayfasının body bölümündeki öğelerin görünür
    // ve fonksiyonların aktif olduğunu görüntüleyebilmeliyim

    @Test
    public void US_03(){

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        //ARAMA KUTUSU TEST
        WebElement aramakutusu=Driver.getDriver().findElement(By.xpath("//*[@name='search']"));

        aramakutusu.sendKeys("Rimadyl"+ Keys.ENTER);

        Driver.getDriver().navigate().back();


        //LOCATE BULAMAZSA AŞAĞI İNDİRMEK İÇİN ACTİON
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement wellness=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[1]"));

        Assert.assertTrue(wellness.isDisplayed());

        wellness.click();

        Driver.getDriver().navigate().back();


        //BODY DENTAL
        WebElement dentalcare=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[2]"));

        Assert.assertTrue(dentalcare.isDisplayed());

        dentalcare.click();

        Driver.getDriver().navigate().back();


        //BODY ANAESTHESİA
        WebElement anaesthesia=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[3]"));

        Assert.assertTrue(anaesthesia.isDisplayed());

        anaesthesia.click();

        Driver.getDriver().navigate().back();


        //BODY DERMATOLOGY KONTROL
        WebElement dermatology=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[4]"));

        Assert.assertTrue(dermatology.isDisplayed());

        dermatology.click();

        Driver.getDriver().navigate().back();


        //BODY DİAGNOSTİCS KONTROL
        WebElement diagnostics=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[5]"));

        Assert.assertTrue(diagnostics.isDisplayed());

        diagnostics.click();

        Driver.getDriver().navigate().back();

        //BODY VACCİNATİONS KONTROL
        WebElement vaccinations=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[6]"));

        Assert.assertTrue(vaccinations.isDisplayed());

        vaccinations.click();

        Driver.getDriver().navigate().back();


        //BODY PAİN CONTROL
        WebElement paincontrol=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[7]"));

        Assert.assertTrue(paincontrol.isDisplayed());

        paincontrol.click();

        Driver.getDriver().navigate().back();


        //BODY BOARDİNG KONTROL
        WebElement boarding=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[8]"));

        Assert.assertTrue(boarding.isDisplayed());

        boarding.click();

        Driver.getDriver().navigate().back();

        //AŞAĞI KAYDIRMA ACTİON
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //BODY DOKTOR KONTROL
        WebElement dralejandromartinez=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[9]"));

        Assert.assertTrue(dralejandromartinez.isDisplayed());

        dralejandromartinez.click();

        Driver.getDriver().navigate().back();

        //BODY DOKTOR KONTROL
        WebElement drmarcusrodriguez=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[10]"));

        Assert.assertTrue(drmarcusrodriguez.isDisplayed());

        drmarcusrodriguez.click();

        Driver.getDriver().navigate().back();


        //BODY DOKTOR KONTROL
        WebElement droliviabennett=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[11]"));

        Assert.assertTrue(droliviabennett.isDisplayed());

        droliviabennett.click();

        Driver.getDriver().navigate().back();


        //BODY DOKTOR KONTROL
        WebElement dremilychang=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[12]"));

        Assert.assertTrue(dremilychang.isDisplayed());

        dremilychang.click();

        Driver.getDriver().navigate().back();


        //BODY DOKTOR KONTROL
        WebElement drnathanpatel=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[13]"));

        Assert.assertTrue(drnathanpatel.isDisplayed());

        drnathanpatel.click();

        Driver.getDriver().navigate().back();


        //BODY DOKTOR KONTROL
        WebElement drısabellawong=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[14]"));

        Assert.assertTrue(drısabellawong.isDisplayed());

        drısabellawong.click();

        Driver.getDriver().navigate().back();


        //BODY DOKTOR KONTROL
        WebElement drlıamconnor=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[15]"));

        Assert.assertTrue(drlıamconnor.isDisplayed());

        drlıamconnor.click();

        Driver.getDriver().navigate().back();


        //BODY DOKTOR KONTROL
        WebElement drsophıakım=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[16]"));

        Assert.assertTrue(drsophıakım.isDisplayed());

        drsophıakım.click();

        Driver.getDriver().navigate().back();



        //BU DOKTORLAR YOKTU SONRADAN EKLENMİŞ LOCATE ALINDI LİSTEDE YOKSA SİLİNEBİLİR
        WebElement isimsizdoktor1=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[17]"));

        Assert.assertTrue(isimsizdoktor1.isDisplayed());

        isimsizdoktor1.click();

        Driver.getDriver().navigate().back();

        //BU DOKTORLAR YOKTU SONRADAN EKLENMİŞ LOCATE ALINDI LİSTEDE YOKSA SİLİNEBİLİR
        WebElement isimsizdoktor2=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[18]"));

        Assert.assertTrue(isimsizdoktor2.isDisplayed());

        isimsizdoktor2.click();

        Driver.getDriver().navigate().back();

        //BODY KONTROL AŞILAR
        WebElement rabiesvacine=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[19]"));

        Assert.assertTrue(rabiesvacine.isDisplayed());

        rabiesvacine.click();

        Driver.getDriver().navigate().back();

        //BODY KONTROL AŞILAR
        WebElement dhppvaccıne=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[20]"));

        Assert.assertTrue(dhppvaccıne.isDisplayed());

        dhppvaccıne.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL AŞILAR
        WebElement felineleukemiavaccine=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[21]"));

        Assert.assertTrue(felineleukemiavaccine.isDisplayed());

        felineleukemiavaccine.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL AŞILAR
        WebElement fıvvaccine=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[22]"));

        Assert.assertTrue(fıvvaccine.isDisplayed());

        fıvvaccine.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL AŞILAR
        WebElement bordetella=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[23]"));

        Assert.assertTrue(bordetella.isDisplayed());

        bordetella.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL AŞILAR
        WebElement fpv=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[24]"));

        Assert.assertTrue(fpv.isDisplayed());

        fpv.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL AŞILAR
        WebElement fhv=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[25]"));

        Assert.assertTrue(fhv.isDisplayed());

        fhv.click();

        Driver.getDriver().navigate().back();


        //BODY KONTROL AŞILAR
        WebElement surgicalprocedure=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[26]"));

        Assert.assertTrue(surgicalprocedure.isDisplayed());

        surgicalprocedure.click();

        Driver.getDriver().navigate().back();




    }

}
