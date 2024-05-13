package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_06 {

    @Test
    public void US_06_01(){

        //Bir ziyaretçi olarak sitenin anasayfasına ulaşıp
        // Sign In ile kullanıcı giriş sayfasına ulaşıp,
        // doğru bilgilerle siteye giriş yapabilmeliyim,
        // şifremi unutursam şifre yenileme talebimi iletebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        signin.click();


        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));

        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));


        email.sendKeys("ahmet@testotomasyonu.com");

        password.sendKeys("Ahmet.123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        WebElement kullanıcıgirişyaptı=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        Assert.assertTrue(kullanıcıgirişyaptı.isDisplayed());

        System.out.println("-------KULLANICININ HEADER BÖLÜMÜNDE GİRİŞ YAPTIĞI YERİ GÖSTEREN KISIM TIKLAMAYLA ÇALIŞMIYOR BUG OLABİLİR");
        System.out.println("VEYA ADMİNLERE ÖZEL BİR ERİŞİM PANELİ OLABİLİR KULLANICILARDA İŞE YARAMAYABİLİR");

    }

    @Test
    public void US_06_02(){

        //Bir ziyaretçi olarak sitenin anasayfasına ulaşıp
        //Sign In ile kullanıcı giriş sayfasına ulaşıp,
        //Bilgilerle siteye giriş yapamazsam,
        //şifremi unutursam şifre yenileme talebimi iletebilmeliyim
        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        signin.click();


        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));

        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmet@testotomasyonu.com");

        password.sendKeys("Ahmet1123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        System.out.println("---------BUG VAR SİGN UP BASTIKTAN SONRA ŞİFRE YANLIŞ OLSA BİLE EMAİL YANLIŞ DİYOR");

        WebElement şifremiunuttum=Driver.getDriver().findElement(By.xpath("//*[@class='text-info small']"));

        şifremiunuttum.click();

        WebElement emailbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='email']"));

        emailbölümü.click();

        emailbölümü.sendKeys("ahmet@testotomasyonu.com");

        WebElement şifreresetlemebutonu=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary']"));

        şifreresetlemebutonu.click();


        WebElement şifresıfırlamaonayı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(şifresıfırlamaonayı.isDisplayed());

        System.out.println("-----------BURDA EMAİL GEÇERLİ OLMASI UYARISINI VERİYOR GEÇERSİZ EMAİLİ KABUL ETMİYOR PASSED------------");






    }

}
