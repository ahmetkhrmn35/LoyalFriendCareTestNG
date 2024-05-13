package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_30 {

    @Test
    public void US_30(){

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Vaccinations ve alt menülerini,
        // aktf ve doğru çalıştıklarını görüntüleyebilmeli, var olan aşı sayısını ve
        // aşıları görüntüleyebilmeli, yeni aşı ekleyebilmeli, eklediğim aşıyı
        // ilgili sayfalarda görüntüleyebilmeli, admin kullanıcı olarak oluşturduğum aşı
        // bilgilerini düzenleyebilmeli ve aşıyı silebilmeliyim

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

        //Menü
        WebElement dashboardvaccinationsmenü=Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[13]"));

        dashboardvaccinationsmenü.click();

        //VACCİNATİONS ALT MENÜ CREATE VACCİNATİONS EKLENMEMİŞ PANELDE OLMASI LAZIMDI BUG VAR
        //VACCİNATİONS CREATE BÖLÜMÜNE VACCİONATİONS BÖLÜMÜNDEN DİREK ULAŞILABİLİYOR
        //YALNIZ PANELDE ÇIKAN YAZIYLA İLGİLİ BİR BÖLÜM DASHBOARD MENÜDE YOK
        //Dashboard/Pets/Create Pets BURAYLA İLGİLİ BİR BÖLÜM YOK DASHBOARDDA EKLENMEMİŞ
        //VACCİNATİONS MENÜSÜNDEN DİREK ADD VACCİNATİONSA TIKLAYARAK AŞI OLUŞTURMA FORMUNA GİDİLEBİLİYOR.

        //SAYFADAKİ AŞILARIN İSMİNİ YAZDIRDIM
        List<WebElement> vaccinations=Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));

        System.out.println("Sayfadaki aşılar " + ReusableMethods.stringListeDonustur(vaccinations));


        WebElement aşısayfası=Driver.getDriver().findElement(By.xpath("//div[@id='tableWithSearch_wrapper']"));

        Assert.assertTrue(aşısayfası.isDisplayed());


        List<WebElement> aşısayısı=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("Sayfadaki var olan aşı sayısı "  + aşısayısı.size() + " dur");


        WebElement aşıeklemebutonu=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-tag btn-success btn-tag-rounded']"));

        aşıeklemebutonu.click();


        WebElement aşıeklemeform1=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[1]"));

        aşıeklemeform1.click();

        aşıeklemeform1.sendKeys("12345"); //Rakamları kabul ediyor bug var


        WebElement aşıeklemeform2=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[2]"));

        aşıeklemeform2.click();

        aşıeklemeform2.sendKeys("12345"); //Rakamları kabul ediyor bug var


        WebElement aşıeklemeform3=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[3]"));

        aşıeklemeform3.click();

        aşıeklemeform3.sendKeys("12345"); //Rakamları kabul ediyor bug var

        WebElement kaydetsave=Driver.getDriver().findElement(By.xpath("//*[text()='save']"));

        kaydetsave.click();


        String expectedvaccinationsismi="12345";

        String olusturulanvaccinationsgörüntüleme=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(olusturulanvaccinationsgörüntüleme.contains(expectedvaccinationsismi));


        WebElement kayıtolustukapat=Driver.getDriver().findElement(By.xpath("//*[@class='close']"));

        kayıtolustukapat.click();

        ReusableMethods.bekle(1);


        WebElement adminprofilbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='profile-dropdown-toggle']"));

        adminprofilbutonu.click();


        WebElement adminlogoutbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='clearfix bg-master-lighter dropdown-item']"));

        adminlogoutbutonu.click();


        WebElement headervaccinations=Driver.getDriver().findElement(By.xpath("(//*[text()='Vaccinations'])[5]"));

        headervaccinations.click();


        //Header panelinden gidilen sayfada aşı varmı
        String expectedheadervaccinationsismi="12345";

        String actualvaccinationsheadersayfa=Driver.getDriver().findElement(By.xpath("(//div[@class='container margin_60_35'])[1]")).getText();

        Assert.assertTrue(actualvaccinationsheadersayfa.contains(expectedheadervaccinationsismi));


        Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]")).click();


        Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']")).click();

        ReusableMethods.bekle(1);

        //VACCİNATİONS DASHBOARDDAKİ AŞI SAYFASINA BAZEN YUKARDAKİ LOCATE GİTMİYOR FİNDBY YAPMADIMDAN OLABİLİR
        Driver.getDriver().findElement(By.xpath("//*[text()='Vaccinations']")).click();

        WebElement editbilgileridüzenle=Driver.getDriver().findElement(By.xpath("(//*[text()='Edit'])[2]"));

        editbilgileridüzenle.click();


        WebElement vaccinationsform1=Driver.getDriver().findElement(By.xpath("(//*[@type='text'])[1]"));

        vaccinationsform1.sendKeys("456");



        WebElement vaccinationsform2=Driver.getDriver().findElement(By.xpath("(//*[@type='text'])[2]"));

        vaccinationsform2.sendKeys("345");

        WebElement vaccinationsform3=Driver.getDriver().findElement(By.xpath("(//*[@type='text'])[3]"));

        vaccinationsform2.sendKeys("345");


        Driver.getDriver().findElement(By.xpath("//*[@type='submit']")).click();


        WebElement vaccinationssildelete=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));

        vaccinationssildelete.click();


        WebElement vaccinationssilindiyazısı=Driver.getDriver().findElement(By.xpath("//span[text()='Pets deleted successfully']"));

        Assert.assertTrue(vaccinationssilindiyazısı.isDisplayed());




















    }

}
