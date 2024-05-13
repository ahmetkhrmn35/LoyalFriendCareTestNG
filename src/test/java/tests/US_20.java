package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_20 {

    @Test
    public void US_20(){

        //Doğru bilgilerle admin grişi yapıp admin dashboard sayfasını
        // görüntüleyebilmeli ve dasboard sayfasındaki öğelerin ayrıntılarına ulaşabilmeliyim


        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmetkahraman@loyalfriendcare.com");

        password.sendKeys("Lfc.2604");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();

        System.out.println("-----------GÖRÜNTÜLENEN SAYFADA DASHBOARD URLSİ YOKTUR YA BUG VEYA YADA HATA OLABİLİR " +
                "DASHBOARD TIKLAYINCA ADMİN ANA SAYFASINA DÖNÜYOR AŞAĞIDAKİ LOCATELER ADMİN SAYFASI ÖĞELER LOCATEDİR");

        WebElement dashboardadmindeparments=Driver.getDriver().findElement(By.xpath("(//*[@class='text-white'])[2]"));
        WebElement bedmanagers=Driver.getDriver().findElement(By.xpath("(//*[@class='text-white'])[3]"));
        WebElement roles=Driver.getDriver().findElement(By.xpath("(//*[@class='text-white'])[4]"));
        WebElement settings=Driver.getDriver().findElement(By.xpath("(//*[@class='text-white'])[5]"));
        WebElement ticket=Driver.getDriver().findElement(By.xpath("(//*[@class='text-white'])[6]"));
        WebElement petsadsense=Driver.getDriver().findElement(By.xpath("(//*[@class='text-white'])[7]"));
        WebElement medicines=Driver.getDriver().findElement(By.xpath("(//*[@class='text-white'])[8]"));

        dashboardadmindeparments.click();

        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();

        bedmanagers.click();

        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();

        roles.click();
        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();

        settings.click();
        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();

        ticket.click();
        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();

        petsadsense.click();
        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();

        medicines.click();
        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();











    }


}
