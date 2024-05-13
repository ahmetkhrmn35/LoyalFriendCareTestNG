package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class US_22 {


    @Test
    public void US_22_01(){

        ////*[text()='User Store successfully.'] OLUŞTURULDU YAZISI ÇIKIYOR
        //OLUŞTURULAN KULLANICI SAYFAYA ERİŞİM SAĞLAYAMIYOR HATA VERİYOR 403

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Users ve
        // alt menülerini, aktf ve doğru çalıştıklarını görüntüleyebilmeli,
        // var olan kayıtlı kullanıcı sayısını ve kayıtı kullanıcıları görüntüleyebilmeli,
        // yeni kullanıcı oluşturup,// o kullanıcı ile giriş yapabilmeli,
        // admin yetkisi ile oluşturduğum kullanıcılarını bilgilerini //KULLANICI GÖZÜKMÜYOR USER 6CI SAYFA BUGLU
        // düzenleyebilmeli ve kullanıcıyı silebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmetkahraman@loyalfriendcare.com");

        password.sendKeys("Lfc.2604");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        WebElement menu=Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']"));

        menu.click();


        WebElement rolesmenü=Driver.getDriver().findElement(By.xpath("(//*[text()='Roles'])[1]"));

        rolesmenü.click();

        WebElement altmenüroles=Driver.getDriver().findElement(By.xpath("(//*[text()='Roles'])[2]"));

        altmenüroles.click();

        Driver.getDriver().navigate().back();

        menu.click();

        WebElement altmenücreaterole=Driver.getDriver().findElement(By.xpath("//*[text()='Create Role']"));

        altmenücreaterole.click();

        Driver.getDriver().navigate().back();

    }

    @Test
    public void US_22_02(){

        //"------!!!!!ALTINCI SAYFADA HATA VERİYOR BUG VAR RAPOR EDİLMESİ LAZIM---!!!----"
        //var olan kayıtlı kullanıcı sayısını ve kayıtı kullanıcıları görüntüleyebilmeli,
        //        // yeni kullanıcı oluşturup,// o kullanıcı ile giriş yapabilmeli, //FAİLED
        //        // admin yetkisi ile oluşturduğum kullanıcılarını bilgilerini
        //        // düzenleyebilmeli ve kullanıcıyı silebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmetkahraman@loyalfriendcare.com");

        password.sendKeys("Lfc.2604");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        WebElement menu=Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']"));

        menu.click();

        WebElement userkullanıcımenü=Driver.getDriver().findElement(By.xpath("(//*[text()='Users'])[1]"));

        userkullanıcımenü.click();

        WebElement user=Driver.getDriver().findElement(By.xpath("(//*[text()='Users'])[2]"));

        user.click();

                            System.out.println("--------1İNCİ SAYFA-------------");
        WebElement usersayfası1=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(usersayfası1.isDisplayed());

        List<WebElement> usersayısısayfa1=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("1.ci sayfadaki var olan user sayısı "  + usersayısısayfa1.size() + " dur");

        WebElement nextbutonu=Driver.getDriver().findElement(By.xpath("//*[@rel='next']"));

        nextbutonu.click();

                               System.out.println("--------2İNCİ SAYFA-------------");
        WebElement usersayfası2=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(usersayfası2.isDisplayed());

        List<WebElement> usersayısısayfa2=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("2.ci sayfadaki var olan user sayısı "  + usersayısısayfa2.size() + " dur");

        WebElement nextbutonu2cisayfa=Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/en/Dashboard/Users?page=3']"));


        nextbutonu2cisayfa.click();

                                System.out.println("--------3ÜNCÜ SAYFA-------------");
        WebElement usersayfası3=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(usersayfası3.isDisplayed());

        List<WebElement> usersayısısayfa3=Driver.getDriver().findElements(By.xpath("//tbody/tr"));


        System.out.println("3.cü sayfadaki var olan user sayısı "  + usersayısısayfa3.size() + " dur");


        WebElement nextbutonu3cüsayfa=Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/en/Dashboard/Users?page=4']"));

        nextbutonu3cüsayfa.click();


                                System.out.println("--------4ÜNCÜ SAYFA-------------");
        WebElement usersayfası4=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(usersayfası4.isDisplayed());


        List<WebElement> usersayısısayfa4=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("4.cü sayfadaki var olan user sayısı "  + usersayısısayfa4.size() + " dur");


        WebElement nextbutonu4üncüsayfa=Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/en/Dashboard/Users?page=5']"));

        nextbutonu4üncüsayfa.click();

                                  System.out.println("--------5İNCİ SAYFA-------------");
        WebElement usersayfası5=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(usersayfası5.isDisplayed());


        List<WebElement> usersayısısayfa5=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("5.ci sayfadaki var olan user sayısı "  + usersayısısayfa5.size() + " dur");


        WebElement nextbutonu5incisayfa=Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/en/Dashboard/Users?page=6']"));

        nextbutonu5incisayfa.click();

        System.out.println("------!!!!!ALTINCI SAYFADA HATA VERİYOR BUG VAR RAPOR EDİLMESİ LAZIM---!!!----");
        System.out.println("--------KULLANICILAR GÖZÜKMÜYOR-------");
        Driver.getDriver().navigate().back();


    }

    @Test
    public void US_22_03(){

        //yeni kullanıcı oluşturup,// o kullanıcı ile giriş yapabilmeli,
         // admin yetkisi ile oluşturduğum kullanıcılarını bilgilerini
         // düzenleyebilmeli ve kullanıcıyı silebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmetkahraman@loyalfriendcare.com");

        password.sendKeys("Lfc.2604");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        WebElement menu=Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']"));

        menu.click();

        WebElement userkullanıcımenü=Driver.getDriver().findElement(By.xpath("(//*[text()='Users'])[1]"));

        userkullanıcımenü.click();

        WebElement createuser=Driver.getDriver().findElement(By.xpath("(//*[text()='Create User'])[1]"));

        createuser.click();

        Actions actions=new Actions(Driver.getDriver());

        WebElement name=Driver.getDriver().findElement(By.xpath("//*[@id='name']"));

        WebElement checkboxuser=Driver.getDriver().findElement(By.xpath("//*[@type='checkbox']"));

        actions.click(name)
                .sendKeys("123")      //NAME RAKAM OLARAK KABUL EDİYOR DÜZELTİLMESİ GEREK BUG
                .sendKeys(Keys.TAB)
                .sendKeys("123")
                .sendKeys(Keys.TAB).perform();
        actions.click(checkboxuser)   //USER BUTONUNU SEÇMEDENDE KABUL EDİYOR BUG VAR
                .sendKeys(Keys.TAB)
                .sendKeys("123")     //BUG VAR ŞİFRE GİRMEDENDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("123")     ////BUG VAR ŞİFRE GİRMEDENDE KABUL EDİYOR
                .sendKeys(Keys.TAB)
                .sendKeys("ahmet@testotomasyonu.com").perform();


        WebElement save=Driver.getDriver().findElement(By.xpath("//span[text()='save']"));

        save.click();


        WebElement kullanıcıolusturuldumesajı=Driver.getDriver().findElement(By.xpath("//*[text()='User Store successfully.']"));

        Assert.assertTrue(kullanıcıolusturuldumesajı.isDisplayed());


        WebElement kullanıcıolusturuldumesajıkapat=Driver.getDriver().findElement(By.xpath("//*[@class='close']"));

        kullanıcıolusturuldumesajıkapat.click();


        WebElement adminprofilbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='profile-dropdown-toggle']"));

        adminprofilbutonu.click();


        WebElement adminlogoutbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='clearfix bg-master-lighter dropdown-item']"));

        adminlogoutbutonu.click();


        WebElement sıgnoutcıkıs=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[2]"));

        sıgnoutcıkıs.click();


        WebElement sıgnıngiris=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        sıgnıngiris.click();


        WebElement emailbölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[1]"));
        emailbölümü.sendKeys("ahmet@testotomasyonu.com");
        WebElement passwordbölümü=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[2]"));
        passwordbölümü.sendKeys("123");

        Driver.getDriver().findElement(By.xpath("//*[@type='submit']")).click();

        // admin yetkisi ile oluşturduğum kullanıcılarını bilgilerini
        // düzenleyebilmeli ve kullanıcıyı silebilmeliyim

        System.out.println("-------KULLANICI BİLGİLERİNİ GÖRÜNTÜLEYEMEDİMDEN BİLGİLERİNİ DÜZENLEYEMİYOM BUG VAR");

    }

    }


