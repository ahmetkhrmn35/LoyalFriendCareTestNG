package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_04 {


    @Test
    public void US_04(){

        //Bir ziyaretçi olarak Home page sayfasının
        //footer bölümündeki öğelerin görünür ve fonksiyonların aktif olduğunu görüntüleyebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        WebElement footerlogo=Driver.getDriver().findElement(By.xpath("(//*[@class='logo_sticky'])[1]"));

        //SAYFADAKİ ELEMENT GÖZÜKMEZ DİYE JSE KULLANDIM
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView();",footerlogo);

        Assert.assertTrue(footerlogo.isDisplayed());


        ReusableMethods.bekle(2);

        //FOOTER KONTROL
        WebElement wellness=Driver.getDriver().findElement(By.xpath("(//a[@href='https://qa.loyalfriendcare.com/Departments/wellness'])[3]"));

        Assert.assertTrue(wellness.isDisplayed());

        wellness.click();

        Driver.getDriver().navigate().back();


        //FOOTER KONTROL
        WebElement dentalcare=Driver.getDriver().findElement(By.xpath("(//*[@href='https://qa.loyalfriendcare.com/Departments/dental-care'])[3]"));

        Assert.assertTrue(dentalcare.isDisplayed());

        dentalcare.click();

        Driver.getDriver().navigate().back();


        //FOOTER KONTROL
        WebElement Anaesthesia=Driver.getDriver().findElement(By.xpath("(//a[@href='https://qa.loyalfriendcare.com/Departments/anaesthesia'])[3]"));

        Assert.assertTrue(Anaesthesia.isDisplayed());

        Anaesthesia.click();

        Driver.getDriver().navigate().back();




        //FOOTER KONTROL
        WebElement Dermatology=Driver.getDriver().findElement(By.xpath("(//a[@href='https://qa.loyalfriendcare.com/Departments/dermatology'])[3]"));

        Assert.assertTrue(Dermatology.isDisplayed());

        Dermatology.click();

        Driver.getDriver().navigate().back();


        //FOOTER KONTROL
        WebElement Diagnostics=Driver.getDriver().findElement(By.xpath("(//a[@href='https://qa.loyalfriendcare.com/Departments/diagnostics'])[3]"));

        Assert.assertTrue(Diagnostics.isDisplayed());

        Diagnostics.click();

        Driver.getDriver().navigate().back();


        //FOOTER KONTROL BURDA BUG VAR FACEBOOK YERİNE BAŞKA SAYFAYA YÖNLENİYOR
        WebElement facebook=Driver.getDriver().findElement(By.xpath("//*[@class='fab fa-facebook-square']"));

        Assert.assertTrue(facebook.isDisplayed());

        facebook.click();

        try {
            Assert.assertTrue(facebook.isDisplayed());
        } catch (StaleElementReferenceException e){
            System.out.println("TIKLANAN SAYFA FACEBOOK SAYFASI DEĞİLDİR BUG VARDIR");
        }


        Driver.getDriver().navigate().back();

        ReusableMethods.bekle(2);


        //FOOTER KONTROL UFAK BİR PROBLEM OLUYOR DETAY AŞAĞIDA
        WebElement twitter=Driver.getDriver().findElement(By.xpath("//*[@href='https://twitter.com']"));

            Assert.assertTrue(twitter.isDisplayed());

            twitter.click();

            WebElement hesapolustur=Driver.getDriver().findElement(By.xpath("//*[@data-testid='signupButton']"));

            hesapolustur.click();

            Driver.getDriver().navigate().back();
            Driver.getDriver().navigate().back();
            Driver.getDriver().navigate().back();

        System.out.println("-------------Twitter sayfasına giriyor geri gelirken hata veriyordu içinde" +
                "site locate tanımladım ona basarak geri geldim twitterı incelenmeli X olarak tanımlıyor olabilir---------");


        //FOOTER KONTROL
        WebElement Youtube=Driver.getDriver().findElement(By.xpath("//a[@href='https://www.youtube.com']"));

        Assert.assertTrue(Youtube.isDisplayed());

        Youtube.click();

        Driver.getDriver().navigate().back();


        //FOOTER KONTROL
        WebElement Pinterest=Driver.getDriver().findElement(By.xpath("//*[@class='fab fa-pinterest-square']"));

        Assert.assertTrue(Pinterest.isDisplayed());

        Pinterest.click();

        Driver.getDriver().navigate().back();



        //FOOTER KONTROL
        WebElement İnstagram=Driver.getDriver().findElement(By.xpath("//*[@class='fab fa-instagram']"));

        Assert.assertTrue(İnstagram.isDisplayed());

        İnstagram.click();

        Driver.getDriver().navigate().back();


        //FOOTER KONTROL
        WebElement contactotel=Driver.getDriver().findElement(By.xpath("//*[@class='fas fa-hotel']"));

        Assert.assertTrue(contactotel.isDisplayed());

        //FOOTER KONTROL
        WebElement contactelefon=Driver.getDriver().findElement(By.xpath("//*[@class='fas fa-headphones-alt']"));

        Assert.assertTrue(contactelefon.isDisplayed());

        //FOOTER KONTROL
        WebElement contactemail=Driver.getDriver().findElement(By.xpath("//*[@class='fas fa-envelope']"));

        Assert.assertTrue(contactemail.isDisplayed());


        //FOOTER KONTROL
        WebElement footerterms=Driver.getDriver().findElement(By.xpath("//*[text()='Terms and conditions']"));

        Assert.assertTrue(footerterms.isDisplayed());

        footerterms.click();

        Driver.getDriver().navigate().back();


        //FOOTER KONTROL
        WebElement faq=Driver.getDriver().findElement(By.xpath("//*[text()='Faq']"));

        Assert.assertTrue(faq.isDisplayed());

        faq.click();

        Driver.getDriver().navigate().back();


        //FOOTER KONTROL
        WebElement yapımtarih=Driver.getDriver().findElement(By.xpath("//*[text()='© 2023']"));

        Assert.assertTrue(yapımtarih.isDisplayed());

        yapımtarih.click();

        Driver.getDriver().navigate().back();

        System.out.println("----------2023 BUTONUNA TIKLANDIĞINDA ANA SAYFAYA ATIYOR BUG OLABİLİR---------------");



    }

}
