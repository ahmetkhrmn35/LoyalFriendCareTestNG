package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_31 {

    @Test
    public void US_31(){

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Settings menüsünü,
        // aktif ve doğru çalıştığını görüntüleyebilmeli, var olan ayarları görüntüleyebilmeliyim


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


        //Dashboard menüye ulaşmak için locate
        WebElement menu=Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']"));

        menu.click();

        //Menü AKTİF ÇALIŞIYOR
        WebElement dashboardsettingmenü=Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[14]"));

        dashboardsettingmenü.click();

        //SETTİNG LOCATE
        List<WebElement> sayfadakisettingler=Driver.getDriver().findElements(By.xpath("//div[@class='col-lg-3']"));


        System.out.println("Sayfadaki setting sayısı " + sayfadakisettingler.size());

        System.out.println("Sayfadaki setting isimleri " + ReusableMethods.stringListeDonustur(sayfadakisettingler));


        //Settinglerin olduğu body görünüyormu testi
        WebElement settingörüntüsü=Driver.getDriver().findElement(By.xpath("//div[@class='feed']"));

        Assert.assertTrue(settingörüntüsü.isDisplayed());

        System.out.println("----------VAR OLAN AYARLAR GÖRÜNTÜLENEMİYOR ÇÜNKÜ TIKLANAMIYOR--------------");
        System.out.println("-----------SADECE SAYFADAKİ AYARLARIN İSMİ VE SAYISI GÖZÜKÜYOR---------------");
        System.out.println("------------BUG VE LOG.TXT HATASI OLABİLİR-----------------------");




    }


}
