package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_33 {

    @Test
    public void US_33(){

        //Admin Dashboad'a ulaşıp sağ üstte bulunan kullanıcı resmine tıklayınca
        // açılan menüdeki öğleri, aktif ve doğru çalışıtklarını görüntüleyebilmeliyim

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

        WebElement panelsettings=Driver.getDriver().findElement(By.xpath("(//*[@class='dropdown-item'])[1]"));

        panelsettings.click();

        //SİTE SETTİNGS'E GİTMİYOR FAQ BÖLÜMÜNE GİDİYOR DÜZELTİLMESİ LAZIM BUG VAR
        String expectedurl="faq";

        String faq=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(faq.contains(expectedurl));

        Driver.getDriver().navigate().back();


        adminprofilbutonu.click();

        WebElement paneleditprofile=Driver.getDriver().findElement(By.xpath("(//*[@class='dropdown-item'])[2]"));

        paneleditprofile.click();

        //ADMİN PROFİLRESMİNDEKİ EDİT PROFİLE TIKLADIKTAN SONRA SAYFADA 404 HATASI VERİYOR
        String expectedsayfabilgi="404";

        String actualsayfabilgileri=Driver.getDriver().findElement(By.xpath("//*[@class='error-number']")).getText();

        Assert.assertTrue(actualsayfabilgileri.contains(expectedsayfabilgi));

        Driver.getDriver().navigate().back();


        //ADMİN LOGOUT BUTONU İLE KULLANICI ANA SAYFASINA YÖNLENDİRİLİYORUZ ADMİN HESABIMIZ KAPANMIYOR
        //ADMİN HESABI YÖNLENDİRİLEN SAYFADA HEADER BÖLÜMÜNDEN ÇIKIŞ YAPILARAK KAPATILABİLİYOR

        adminprofilbutonu.click();

        WebElement adminlogoutbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='clearfix bg-master-lighter dropdown-item']"));

        adminlogoutbutonu.click();

        WebElement home=Driver.getDriver().findElement(By.xpath("(//*[text()='Home'])[2]"));

        Assert.assertTrue(home.isDisplayed());

        System.out.println("--ADMİN GİRİŞ SAYFASI DEĞİL HOME SAYFASINA GİDİLİYOR ÇIKIŞ YAPMIYOR--");








    }

}
