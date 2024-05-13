package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_12 {


    @Test
    public void US_12(){

        //Kayıtlı kullanıcı olarak body bölümünde bulunan aşıların
        // sayfalarına ulaşıp randevu talebi oluşturabilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        signin.click();


        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmet@testotomasyonu.com");

        password.sendKeys("Ahmet.123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();

        WebElement rabiesvacine=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[19]"));

        Assert.assertTrue(rabiesvacine.isDisplayed());

        rabiesvacine.click();

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

        WebElement dhppvaccıne=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[20]"));

        Assert.assertTrue(dhppvaccıne.isDisplayed());

        dhppvaccıne.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[5]"));
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

        WebElement felineleukemiavaccine=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[21]"));

        Assert.assertTrue(felineleukemiavaccine.isDisplayed());

        felineleukemiavaccine.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[5]"));
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

        WebElement fıvvaccine=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[22]"));

        Assert.assertTrue(fıvvaccine.isDisplayed());

        fıvvaccine.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[5]"));
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

        WebElement bordetella=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[23]"));

        Assert.assertTrue(bordetella.isDisplayed());

        bordetella.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[5]"));
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

        WebElement fpv=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[24]"));

        Assert.assertTrue(fpv.isDisplayed());

        fpv.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[5]"));
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

        WebElement fhv=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[25]"));

        Assert.assertTrue(fhv.isDisplayed());

        fhv.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[5]"));
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

        WebElement surgicalprocedure=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[26]"));

        Assert.assertTrue(surgicalprocedure.isDisplayed());

        surgicalprocedure.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[1]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[5]"));
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






    }

}
