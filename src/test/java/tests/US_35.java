package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_35 {


    @Test
    public void US_35(){

        //Admin Dashboard'daki kullanıcı resmine tıklayıp açılan menüden
        //logout menüsü ile çıkış yapabimeli ve admin giriş sayfasına ulaşabilmeliyim

        //İlgili siteye gider
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Email locate
        WebElement email= Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        //Password locate
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        //email yazılacak yer
        email.sendKeys("ahmetkahraman@loyalfriendcare.com");

        //şifre yazılacak yer
        password.sendKeys("Lfc.2604");

        //Giriş butonu locate
        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();

        WebElement adminprofilbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='profile-dropdown-toggle']"));

        adminprofilbutonu.click();


        //ADMİN GİRİŞ SAYFASINA YÖNLENDİRİLMİYOR DİREK HOME SAYFASINA YÖNLENDİRİLİYOR
        WebElement adminlogoutbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='clearfix bg-master-lighter dropdown-item']"));

        adminlogoutbutonu.click();

        WebElement home=Driver.getDriver().findElement(By.xpath("(//*[text()='Home'])[2]"));

        Assert.assertTrue(home.isDisplayed());

        System.out.println("------ADMİN GİRİŞ SAYFASI DEĞİL HOME SAYFASI YÖNLENDİRMESİ BUG VEYA HATA VAR------");







    }

}
