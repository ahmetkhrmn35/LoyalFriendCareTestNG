package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_15 {

    @Test
    public void US_15(){

        //Kayıtlı kullanıcı olarak header menüden doktorlar sayfasına ulaşabilmeli,
        // ulaştığım sayfadan her bir doktorun sayfasına ulaşabilmeliyim,
        // doktor ile ilgili feedback verebilmeli ve randevu oluşturabilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        signin.click();


        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmet@testotomasyonu.com");

        password.sendKeys("Ahmet.123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();

        WebElement doktor=Driver.getDriver().findElement(By.xpath("(//*[text()='Doctors'])[4]"));

        doktor.click();

        WebElement dralejandromartinez=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[1]"));
        WebElement marcusrodriguez=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[2]"));
        WebElement droliviabannet=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[3]"));
        WebElement dremilychang=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[4]"));
        WebElement drnathanpatel=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[5]"));
        WebElement drısabellawong=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[6]"));
        WebElement drliamoconnor=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[7]"));
        WebElement drsophiakim=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[8]"));
        WebElement isimsizdoktor1=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[7]"));
        WebElement isimsizdoktor2=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[8]"));


        dralejandromartinez.click();

        Actions actions=new Actions(Driver.getDriver());

        WebElement date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        WebElement categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        WebElement categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        WebElement doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
        WebElement doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[15]"));


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

        WebElement rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        WebElement puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        WebElement yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        WebElement submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();



        marcusrodriguez.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
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

        rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();



        droliviabannet.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
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

        rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();



        dremilychang.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
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

        rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();




        drnathanpatel.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
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

        rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();



        drısabellawong.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
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

        rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();



        drliamoconnor.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
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

        rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();



        drsophiakim.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
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

        rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        isimsizdoktor1.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
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

        rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        isimsizdoktor2.click();
        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[7]"));
        doktorbölüm=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[3]"));
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

        rating=Driver.getDriver().findElement(By.xpath("(//div[@class='nice-select wide'])[1]"));

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[3]"));

        yorumbölümü=Driver.getDriver().findElement(By.xpath("//*[@id='Comment']"));

        submitbutton=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_1'])"));

        rating.click();

        ReusableMethods.bekle(1);

        puanlama.click();
        ReusableMethods.bekle(1);

        yorumbölümü.click();
        yorumbölümü.sendKeys("Kontrol");

        ReusableMethods.bekle(1);

        submitbutton.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();






    }

}
