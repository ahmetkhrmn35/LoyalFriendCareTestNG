package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_07 {


    @Test
    public void US_07(){

        //Kayıtlı kullanıcı olarak Home page sayfasının header
        // bölümündeki öğelerin görünür ve fonksiyonların
        // aktif olduğunu görüntüleyebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        signin.click();

        //GİRİŞ EMAİL ŞİFRE İŞLEMLERİ
        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));

        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmet@testotomasyonu.com");

        password.sendKeys("Ahmet.123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        //HEADER GÖRÜNÜM KONTROL
        WebElement loyalfriendlogo=Driver.getDriver().findElement(By.xpath("//*[@class='logo_normal']"));

        Assert.assertTrue(loyalfriendlogo.isDisplayed());

        loyalfriendlogo.click();


        //HEADER GÖRÜNÜM KONTROL
        WebElement home=Driver.getDriver().findElement(By.xpath("(//*[text()='Home'])[2]"));

        Assert.assertTrue(home.isDisplayed());

        home.click();

        Driver.getDriver().navigate().back();


        //HEADER GÖRÜNÜM KONTROL
        WebElement Aboutus=Driver.getDriver().findElement(By.xpath("(//*[text()='About Us'])[2]"));

        Assert.assertTrue(Aboutus.isDisplayed());

        Aboutus.click();

        Driver.getDriver().navigate().back();


        //HEADER GÖRÜNÜM KONTROL
        WebElement departments=Driver.getDriver().findElement(By.xpath("(//*[text()='Departments '])[3]"));

        Assert.assertTrue(departments.isDisplayed());

        departments.click();

        Driver.getDriver().navigate().back();


        //HEADER GÖRÜNÜM KONTROL
        WebElement doktor=Driver.getDriver().findElement(By.xpath("(//*[text()='Doctors'])[4]"));

        Assert.assertTrue(doktor.isDisplayed());

        doktor.click();

        Driver.getDriver().navigate().back();

        //HEADER GÖRÜNÜM KONTROL
        WebElement medicines=Driver.getDriver().findElement(By.xpath("(//*[text()='Medicines'])[3]"));

        Assert.assertTrue(medicines.isDisplayed());

        medicines.click();

        Driver.getDriver().navigate().back();


        //HEADER GÖRÜNÜM KONTROL
        WebElement vaccinations=Driver.getDriver().findElement(By.xpath("(//*[text()='Vaccinations'])[5]"));

        Assert.assertTrue(vaccinations.isDisplayed());

        vaccinations.click();

        Driver.getDriver().navigate().back();



        System.out.println("--------KULLANICININ TIKLAYIP KULLANICI AYARLARINA ERİŞEMEDİĞİ BUGLU YER----------");


        WebElement signın=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        Assert.assertTrue(signın.isDisplayed());

        signın.click();

        Driver.getDriver().navigate().back();



        System.out.println("-----------ÇIKIŞ YAPMAK İÇİN AŞAĞIDAKİ KODU YAZARSINIZ SAYFADA KALMAK İÇİN YAZMAYA GEREK YOK");

        WebElement signup=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[2]"));

        Assert.assertTrue(signup.isDisplayed());

        signup.click();

        System.out.println("--------KULLANICI GİRİŞ YAPTIKTAN SONRA HEADERDAKİ KULLANICI İSMİNE TIKLADIKTAN SONRA " +
                "HERHANGİ BİR ALANA YÖNLENDİRİLMİYOR BUG VAR");



    }


}
