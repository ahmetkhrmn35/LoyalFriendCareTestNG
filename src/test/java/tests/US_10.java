package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_10 {

    @Test
    public void US_10(){

        //Kayıtlı kullanıcı olarak body
        //bölümünde bulunan departmanların
        //sayfalarına ulaşıp randevu talebi oluşturabilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        signin.click();


        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmet@testotomasyonu.com");

        password.sendKeys("Ahmet.123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement wellness=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[1]"));

        Assert.assertTrue(wellness.isDisplayed());

        wellness.click();

        WebElement date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


            actions.click(date)
                  .sendKeys("01052024")
                  .sendKeys(Keys.TAB)
                  .sendKeys("9113453366")
                  .sendKeys(Keys.TAB).perform();

        WebElement categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        WebElement categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));
        WebElement doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        WebElement doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[12]"));


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


        WebElement dentalcare=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[2]"));

        Assert.assertTrue(dentalcare.isDisplayed());

        dentalcare.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[4]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[13]"));


        categorybölümü.click();
        ReusableMethods.bekle(2);
        categorysecenek.click();
        ReusableMethods.bekle(2);
        doktorbölüm.click();
        ReusableMethods.bekle(2);
        doktorsecenek.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys("HELLO WORLD").perform();


        randevurezervasyonbutonu=Driver.getDriver().findElement(By.xpath("//*[@id='submit-contact-detail']"));

        randevurezervasyonbutonu.click();

        ReusableMethods.bekle(2);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());



        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        WebElement anaesthesia=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[3]"));

        Assert.assertTrue(anaesthesia.isDisplayed());

        anaesthesia.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));
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

        ReusableMethods.bekle(2);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());


        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        WebElement dermatology=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[4]"));

        Assert.assertTrue(dermatology.isDisplayed());

        dermatology.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[10]"));


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

        ReusableMethods.bekle(2);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());


        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        WebElement diagnostics=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[5]"));

        Assert.assertTrue(diagnostics.isDisplayed());

        diagnostics.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[6]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[9]"));


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

        ReusableMethods.bekle(2);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());


        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        WebElement vaccinations=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[6]"));

        Assert.assertTrue(vaccinations.isDisplayed());

        vaccinations.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[4]"));
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

        ReusableMethods.bekle(2);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());


        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        WebElement paincontrol=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[7]"));

        Assert.assertTrue(paincontrol.isDisplayed());

        paincontrol.click();
        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[1]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[10]"));


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

        ReusableMethods.bekle(2);

        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());


        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        WebElement boarding=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[8]"));

        Assert.assertTrue(boarding.isDisplayed());

        boarding.click();
        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));
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


        ReusableMethods.bekle(2);


        randevurezervasyonuolustuyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));

        Assert.assertTrue(randevurezervasyonuolustuyazısı.isDisplayed());


        Driver.getDriver().navigate().back();

        Driver.getDriver().navigate().back();






    }

}
