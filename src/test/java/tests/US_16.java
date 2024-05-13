package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoyalFriendpages;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_16 {


    @Test
    public void US_16_01()  {

        //Kayıtlı kullanıcı olarak header
        // menüden İlaçlar sayfasına ulaşabilmeli,
        // ulaştığım sayfadan ilaç için randevu oluşturabilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");
        LoyalFriendpages royalFriendpages=new LoyalFriendpages();
        royalFriendpages.sıgnın.click();
        royalFriendpages.email.sendKeys("ahmet1@testotomasyonu.com");
        royalFriendpages.password.sendKeys("ahmet.123");
        royalFriendpages.sıgnupbutton.click();
        royalFriendpages.medicines.click();

        royalFriendpages.headerrimadymedicine.click();

        royalFriendpages.rezervasyonbutonu.click(); //BUG VAR REZERVASYONBUTONU BASILDIMI REZERVASYON OLUŞUYOR

        ReusableMethods.tumSayfaScreenshot(Driver.getDriver(),"Rezervasyon Butonu Hatası");


        Actions actions=new Actions(Driver.getDriver());

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.headerrevolutionmedicine.click();

        royalFriendpages.rezervasyonbutonu.click(); //BUG VAR REZERVASYONBUTONU BASILDIMI REZERVASYON OLUŞUYOR

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.headerbaytrilmedicine.click();

        royalFriendpages.rezervasyonbutonu.click(); //BUG VAR REZERVASYONBUTONU BASILDIMI REZERVASYON OLUŞUYOR


        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.headerapoquelmedicine.click();

        royalFriendpages.rezervasyonbutonu.click(); //BUG VAR REZERVASYONBUTONU BASILDIMI REZERVASYON OLUŞUYOR



        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        royalFriendpages.headermetacammedicine.click();

        royalFriendpages.rezervasyonbutonu.click(); //BUG VAR REZERVASYONBUTONU BASILDIMI REZERVASYON OLUŞUYOR



        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        royalFriendpages.headerviocidmedicine.click();

        royalFriendpages.rezervasyonbutonu.click(); //BUG VAR REZERVASYONBUTONU BASILDIMI REZERVASYON OLUŞUYOR


        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();



    }

    @Test
    public void US_16_02(){

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");
        LoyalFriendpages royalFriendpages=new LoyalFriendpages();
        royalFriendpages.sıgnın.click();
        royalFriendpages.email.sendKeys("ahmet1@testotomasyonu.com");
        royalFriendpages.password.sendKeys("ahmet.123");
        royalFriendpages.sıgnupbutton.click();
        royalFriendpages.medicines.click();

        royalFriendpages.headerrimadymedicine.click();

        Actions actions=new Actions(Driver.getDriver());

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();


        royalFriendpages.headerrevolutionmedicine.click();


        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();


        royalFriendpages.headerbaytrilmedicine.click();


        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();


        royalFriendpages.headerapoquelmedicine.click();



        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();


        royalFriendpages.headermetacammedicine.click();



        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaScreenshot(Driver.getDriver(),"Geçmiş Tarih randevu kabul");
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();

        royalFriendpages.headerviocidmedicine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("25042024")  //BUG VAR GEÇMİŞ TARİH VERİLDİĞİ TAKDİRDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaScreenshot(Driver.getDriver(),"Geçmiş Tarih randevu kabul");
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();




    }

    @Test
    public void US_16_03(){

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");
        LoyalFriendpages royalFriendpages=new LoyalFriendpages();
        royalFriendpages.sıgnın.click();
        royalFriendpages.email.sendKeys("ahmet1@testotomasyonu.com");
        royalFriendpages.password.sendKeys("ahmet.123");
        royalFriendpages.sıgnupbutton.click();
        royalFriendpages.medicines.click();

        royalFriendpages.headerrimadymedicine.click();


        ReusableMethods.tumSayfaScreenshot(Driver.getDriver());


        Actions actions=new Actions(Driver.getDriver());

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();


        royalFriendpages.headerrevolutionmedicine.click();


        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();


        royalFriendpages.headerbaytrilmedicine.click();


        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();


        royalFriendpages.headerapoquelmedicine.click();



        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello ");
        royalFriendpages.rezervasyonbutonu.click();
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();


        royalFriendpages.headermetacammedicine.click();



        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaScreenshot(Driver.getDriver(),"Eksik telefon randevu oluşturma");
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();


        royalFriendpages.headerviocidmedicine.click();

        actions.click(royalFriendpages.date)
                .sendKeys("30082024")
                .sendKeys(Keys.TAB)
                .sendKeys("911").perform();  //BUG VAR TELEFON NUMARASI 3 HANELİ GİRİLSE VEYA GİRİLMESE BİLE KABUL EDİYOR.

        royalFriendpages.categorybölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.categorysecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorbölümmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.doktorsecenekmedicine.click();
        ReusableMethods.bekle(1);
        royalFriendpages.mesajkutusu.click();
        royalFriendpages.mesajkutusu.sendKeys("Hello");
        royalFriendpages.rezervasyonbutonu.click();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaScreenshot(Driver.getDriver(),"Eksik telefon randevu oluşturma");
        Assert.assertTrue(royalFriendpages.rezervasyonyazısı.isDisplayed());
        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();








    }

}
