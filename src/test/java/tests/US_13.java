package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_13 {

    @Test
    public void US_13(){
        //kayıtlı kullanıcı olarak header kısmındaki departments menüsü ile
        //departmanlar kısmına ulaşabilmeli ve ulaştığım sayfadan tüm
        //departmanların sayfasını görüntüleyebilmeliyim ve randevu oluştrabilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        signin.click();


        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmet@testotomasyonu.com");

        password.sendKeys("Ahmet.123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();

        WebElement departments=Driver.getDriver().findElement(By.xpath("(//*[text()='Departments '])[3]"));

        departments.click();

        WebElement departmanwellnes=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[1]"));
        WebElement departmandentalcare=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[2]"));
        WebElement departmananaesthesia=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[3]"));
        WebElement departmandermatology=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[4]"));
        WebElement departmandiagnostics=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[5]"));
        WebElement departmanvaccinations=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[6]"));
        WebElement departmanpaincontrol=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[7]"));
        WebElement departmanboarding=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[8]"));

        departmanwellnes.click();

        Actions actions=new Actions(Driver.getDriver());

        WebElement date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        WebElement categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        WebElement categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[5]"));
        WebElement doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        WebElement doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[13]"));


        categorybölümü.click();
        ReusableMethods.bekle(1);
        categorysecenek.click();
        ReusableMethods.bekle(1);
        doktorbölüm.click();
        ReusableMethods.bekle(2);
        doktorsecenek.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys("HELLO WORLD").perform();


        WebElement randevurezervasyonbutonu=Driver.getDriver().findElement(By.xpath("//*[@id='submit-contact-detail']"));

        randevurezervasyonbutonu.click();

        ReusableMethods.bekle(1);

        WebElement randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        departmandentalcare.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

         categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
         categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[4]"));
         doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
         doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[12]"));


        categorybölümü.click();
        ReusableMethods.bekle(1);
        categorysecenek.click();
        ReusableMethods.bekle(1);
        doktorbölüm.click();
        ReusableMethods.bekle(2);
        doktorsecenek.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys("HELLO WORLD").perform();


        randevurezervasyonbutonu=Driver.getDriver().findElement(By.xpath("//*[@id='submit-contact-detail']"));

        randevurezervasyonbutonu.click();

        ReusableMethods.bekle(1);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        departmananaesthesia.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[15]"));


        categorybölümü.click();
        ReusableMethods.bekle(1);
        categorysecenek.click();
        ReusableMethods.bekle(1);
        doktorbölüm.click();
        ReusableMethods.bekle(2);
        doktorsecenek.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys("HELLO WORLD").perform();


        randevurezervasyonbutonu=Driver.getDriver().findElement(By.xpath("//*[@id='submit-contact-detail']"));

        randevurezervasyonbutonu.click();

        ReusableMethods.bekle(1);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        departmandermatology.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[4]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[12]"));


        categorybölümü.click();
        ReusableMethods.bekle(1);
        categorysecenek.click();
        ReusableMethods.bekle(1);
        doktorbölüm.click();
        ReusableMethods.bekle(2);
        doktorsecenek.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys("HELLO WORLD").perform();


        randevurezervasyonbutonu=Driver.getDriver().findElement(By.xpath("//*[@id='submit-contact-detail']"));

        randevurezervasyonbutonu.click();

        ReusableMethods.bekle(1);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        departmandiagnostics.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[6]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[13]"));


        categorybölümü.click();
        ReusableMethods.bekle(1);
        categorysecenek.click();
        ReusableMethods.bekle(1);
        doktorbölüm.click();
        ReusableMethods.bekle(2);
        doktorsecenek.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys("HELLO WORLD").perform();


        randevurezervasyonbutonu=Driver.getDriver().findElement(By.xpath("//*[@id='submit-contact-detail']"));

        randevurezervasyonbutonu.click();

        ReusableMethods.bekle(1);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        departmanvaccinations.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[4]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[11]"));


        categorybölümü.click();
        ReusableMethods.bekle(1);
        categorysecenek.click();
        ReusableMethods.bekle(1);
        doktorbölüm.click();
        ReusableMethods.bekle(2);
        doktorsecenek.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys("HELLO WORLD").perform();


        randevurezervasyonbutonu=Driver.getDriver().findElement(By.xpath("//*[@id='submit-contact-detail']"));

        randevurezervasyonbutonu.click();

        ReusableMethods.bekle(1);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        departmanpaincontrol.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[12]"));


        categorybölümü.click();
        ReusableMethods.bekle(1);
        categorysecenek.click();
        ReusableMethods.bekle(1);
        doktorbölüm.click();
        ReusableMethods.bekle(2);
        doktorsecenek.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys("HELLO WORLD").perform();


        randevurezervasyonbutonu=Driver.getDriver().findElement(By.xpath("//*[@id='submit-contact-detail']"));

        randevurezervasyonbutonu.click();

        ReusableMethods.bekle(1);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        departmanboarding.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[5]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[14]"));


        categorybölümü.click();
        ReusableMethods.bekle(1);
        categorysecenek.click();
        ReusableMethods.bekle(1);
        doktorbölüm.click();
        ReusableMethods.bekle(2);
        doktorsecenek.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys("HELLO WORLD").perform();


        randevurezervasyonbutonu=Driver.getDriver().findElement(By.xpath("//*[@id='submit-contact-detail']"));

        randevurezervasyonbutonu.click();

        ReusableMethods.bekle(1);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();





    }

}
