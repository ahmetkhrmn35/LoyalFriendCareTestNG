package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_11 {

    @Test
    public void US_11(){

        //******************************************************************************
        //SAYFADA RANDEVU OLUŞTURA DİREK BASTIMI RANDEVU OLUŞTURUYOR TARİH ERKEN GİRERSEN RANDEVU OLUŞTURUYOR
        //TELEFON NUMARA YAZMASAN BİLE RANDEVU OLUŞUYOR FEEDBACK DİREK BASILDIMI BUG HATASI VERİYOR BAŞKA SAYFA ÇIKIYOR
        //****************************************************************************
        //Kayıtlı kullanıcı olarak body bölümünde bulunan doktorların sayfalarına
        //ulaşıp ulaştığım doktorun sayfasında doktor hakkında feedback
        //verebilmeli ve randevu oluşturabilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        signin.click();


        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmet@testotomasyonu.com");

        password.sendKeys("Ahmet.123");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();

        WebElement dralejandromartinez=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[9]"));

        Assert.assertTrue(dralejandromartinez.isDisplayed());

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
        WebElement doktorsecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[14]"));


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


        WebElement drmarcusrodriguez=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[10]"));

        Assert.assertTrue(drmarcusrodriguez.isDisplayed());

        drmarcusrodriguez.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

         categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
         categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[8]"));
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

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));

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

        WebElement droliviabennett=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[11]"));

        Assert.assertTrue(droliviabennett.isDisplayed());

        droliviabennett.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[8]"));
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

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));

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

        WebElement dremilychang=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[12]"));

        Assert.assertTrue(dremilychang.isDisplayed());

        dremilychang.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[8]"));
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

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));

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

        WebElement drnathanpatel=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[13]"));

        Assert.assertTrue(drnathanpatel.isDisplayed());

        drnathanpatel.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[8]"));
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

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));

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

        WebElement drısabellawong=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[14]"));

        Assert.assertTrue(drısabellawong.isDisplayed());

        drısabellawong.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[8]"));
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

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));

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

        WebElement drlıamconnor=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[15]"));

        Assert.assertTrue(drlıamconnor.isDisplayed());

        drlıamconnor.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[8]"));
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

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));

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

        WebElement drsophıakım=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[16]"));

        Assert.assertTrue(drsophıakım.isDisplayed());

        drsophıakım.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[8]"));
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

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));

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

        WebElement isimsizdoktor1=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[17]"));

        Assert.assertTrue(isimsizdoktor1.isDisplayed());

        isimsizdoktor1.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[8]"));
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

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));

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

        WebElement isimsizdoktor2=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[18]"));

        Assert.assertTrue(isimsizdoktor2.isDisplayed());

        isimsizdoktor2.click();

        date=Driver.getDriver().findElement(By.xpath("//*[@id='Date']"));


        actions.click(date)
                .sendKeys("01052024")
                .sendKeys(Keys.TAB)
                .sendKeys("9113453366")
                .sendKeys(Keys.TAB).perform();

        categorybölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='nice-select wide'])[2]"));
        categorysecenek=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[8]"));
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

        puanlama=Driver.getDriver().findElement(By.xpath("(//*[@class='option'])[2]"));

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
