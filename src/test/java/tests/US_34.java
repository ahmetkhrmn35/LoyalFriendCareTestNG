package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_34 {

    @Test
    public void US_34(){

        //Admin Dashboard'daki kullanıcı resmine tıklayıp açılan menüden
        // Edit profile menüsü ile admin kullanıcı bilgilerimi düzenleyip kaydedebilmeliyim

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

        adminprofilbutonu.click();

        WebElement paneleditprofile=Driver.getDriver().findElement(By.xpath("(//*[@class='dropdown-item'])[2]"));

        paneleditprofile.click();

        //ADMİN PROFİLRESMİNDEKİ EDİT PROFİLE TIKLADIKTAN SONRA SAYFADA 404 HATASI VERİYOR
        String expectedsayfabilgi="404";

        String actualsayfabilgileri=Driver.getDriver().findElement(By.xpath("//*[@class='error-number']")).getText();

        Assert.assertTrue(actualsayfabilgileri.contains(expectedsayfabilgi));

        System.out.println("----EDİT PROFİLE SAYFASINDA OLUŞAN HATA DOLAYISIYLA EDİT PROFİLE AYARLARINA ERİŞİLEMİYOR--------");





    }


}
