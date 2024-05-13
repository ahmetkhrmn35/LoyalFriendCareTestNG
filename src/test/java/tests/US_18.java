package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoyalFriendpages;
import utilities.Driver;

public class US_18 {

    @Test
    public void US_18(){

        LoyalFriendpages royalFriendpages=new LoyalFriendpages();
        //Kayıtlı kullanıcı olarak admin yetkisi olmadan admin sayfasına ulaşamamalıyım

        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");


        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("1234@testotomasyonu.com");

        password.sendKeys("ahmet.123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();

        Assert.assertTrue(royalFriendpages.admingirishatamesajı.isDisplayed());

        System.out.println("ADMİN SAYFASINA ERİŞİLEMİYOR 403 HATA MESAJI VERİYOR");



    }

}
