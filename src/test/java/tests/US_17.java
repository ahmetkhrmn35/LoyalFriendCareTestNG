package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoyalFriendpages;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_17 {

    @Test
    public void US_17_01(){

        //Kayıtlı kullanıcı olarak header menüden Aşılar
        // sayfasına ulaşabilmeli, ulaştığım sayfadan aşı
        // için randevu oluşturabilmeliyim

        LoyalFriendpages royalFriendpages=new LoyalFriendpages();

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");
        royalFriendpages.sıgnın.click();
        royalFriendpages.email.sendKeys("ahmet1@testotomasyonu.com");
        royalFriendpages.password.sendKeys("ahmet.123");
        royalFriendpages.sıgnupbutton.click();
        royalFriendpages.vaccinations.click();
        royalFriendpages.rabiesvaccine.click();
        royalFriendpages.rezervasyonbutonu.click(); //BUG VAR REZERVASYONBUTONU BASILDIMI REZERVASYON OLUŞUYOR

        ReusableMethods.tumSayfaScreenshot(Driver.getDriver(),"Form doldurmadan rezervasyon ");

        Actions actions=new Actions(Driver.getDriver());

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.dhppvaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.felineleukimavaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.fıvvaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.bordetellavaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.felinepanlekuiavaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.felinherpesvirusvaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.surgicalprocedure.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();




    }

    @Test
    public void US_17_02(){

        //Kayıtlı kullanıcı olarak header menüden Aşılar
        // sayfasına ulaşabilmeli, ulaştığım sayfadan aşı
        // için randevu oluşturabilmeliyim

        LoyalFriendpages royalFriendpages=new LoyalFriendpages();

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");
        royalFriendpages.sıgnın.click();
        royalFriendpages.email.sendKeys("ahmet1@testotomasyonu.com");
        royalFriendpages.password.sendKeys("ahmet.123");
        royalFriendpages.sıgnupbutton.click();
        royalFriendpages.vaccinations.click();
        royalFriendpages.rabiesvaccine.click();
        royalFriendpages.rezervasyonbutonu.click(); //BUG VAR REZERVASYONBUTONU BASILDIMI REZERVASYON OLUŞUYOR


        Actions actions=new Actions(Driver.getDriver());

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaScreenshot(Driver.getDriver(),"Geçmiş Tarih randevu alınması");

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.dhppvaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.felineleukimavaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.fıvvaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.bordetellavaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.felinepanlekuiavaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.felinherpesvirusvaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.surgicalprocedure.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();



    }

    @Test
    public void US_17_03(){

        //Kayıtlı kullanıcı olarak header menüden Aşılar
        // sayfasına ulaşabilmeli, ulaştığım sayfadan aşı
        // için randevu oluşturabilmeliyim

        LoyalFriendpages royalFriendpages=new LoyalFriendpages();

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");
        royalFriendpages.sıgnın.click();
        royalFriendpages.email.sendKeys("ahmet1@testotomasyonu.com");
        royalFriendpages.password.sendKeys("ahmet.123");
        royalFriendpages.sıgnupbutton.click();
        royalFriendpages.vaccinations.click();
        royalFriendpages.rabiesvaccine.click();


        Actions actions=new Actions(Driver.getDriver());

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaScreenshot(Driver.getDriver(),"Eksik telefon randevu alınması");

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.dhppvaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.felineleukimavaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.fıvvaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.bordetellavaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("HELLO WORLD");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.felinepanlekuiavaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.felinherpesvirusvaccine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.surgicalprocedure.click();

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.
        royalFriendpages.categorybölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümvaccions.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekvaccions.click();

        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");

        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();



    }

}
