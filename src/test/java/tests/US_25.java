package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_25 {

    @Test
    public void US_25(){

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Doctors ve alt menülerini,
        // aktf ve doğru çalıştıklarını görüntüleyebilmeli, var olan doktor sayısını ve
        // doktorları görüntüleyebilmeli, yeni doktor ekleyebilmeli, eklediğim doktoru ilgili
        // sayfalarda görüntüleyebilmeli, admin kullanıcı olarak oluşturduğum doktor bilgilerini
        // düzenleyebilmeli ve doktoru silebilmeliyim

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

        WebElement doktormenü=Driver.getDriver().findElement(By.xpath("(//*[text()='Doctors'])[1]"));

        doktormenü.click();


        WebElement doktorbölümü=Driver.getDriver().findElement(By.xpath("(//*[text()='Doctors'])[2]"));

        doktorbölümü.click();

        Driver.getDriver().navigate().back();


        WebElement doktorolustur=Driver.getDriver().findElement(By.xpath("//*[text()='Create Doctors']"));

        doktorolustur.click();

        Driver.getDriver().navigate().back();


        menu.click();

        doktorbölümü.click();

        WebElement doktorlar=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(doktorlar.isDisplayed());


        List<WebElement> tablodakidoktorlar=Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));

        System.out.println("Sayfadaki doktor isimleri " + ReusableMethods.stringListeDonustur(tablodakidoktorlar));


        List<WebElement> doktorsayısı=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("Sayfadaki var olan doktor sayısı "  + doktorsayısı.size() + " dir");


        WebElement doktoreklemebutonu=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-tag btn-success btn-tag-rounded']"));

        doktoreklemebutonu.click();


        WebElement doktorform1=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[1]"));

        doktorform1.click();

        doktorform1.sendKeys("Alex"); //Rakamları kabul ediyor bug var


        WebElement doktorform2=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[2]"));

        doktorform2.click();

        doktorform2.sendKeys("Alex"); //Rakamları kabul ediyor bug var


        WebElement kaydetsave=Driver.getDriver().findElement(By.xpath("//span[text()='Doctors save']"));

        kaydetsave.click();


        String expecteddoktorismi="Alex";

        String olusturulandoktorgörüntüleme=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(olusturulandoktorgörüntüleme.contains(expecteddoktorismi));


        WebElement kayıtolustukapat=Driver.getDriver().findElement(By.xpath("//*[@class='close']"));

        kayıtolustukapat.click();


        ReusableMethods.bekle(1);

        WebElement adminprofilbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='profile-dropdown-toggle']"));

        adminprofilbutonu.click();


        WebElement adminlogoutbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='clearfix bg-master-lighter dropdown-item']"));

        adminlogoutbutonu.click();


        WebElement headerdoktor=Driver.getDriver().findElement(By.xpath("(//*[text()='Doctors'])[4]"));

        headerdoktor.click();


        String expectedheaderdoktorismi="Alex";

        String actualdoktorheadersayfa=Driver.getDriver().findElement(By.xpath("(//div[@class='container margin_60_35'])[1]")).getText();

        Assert.assertTrue(actualdoktorheadersayfa.contains(expectedheaderdoktorismi));


        Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]")).click();

        Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']")).click();

        ReusableMethods.bekle(1);

        Driver.getDriver().findElement(By.xpath("(//*[text()='Doctors'])[1]")).click();

        ReusableMethods.bekle(1);


        Driver.getDriver().findElement(By.xpath("(//*[text()='Doctors'])[2]")).click();

        WebElement editbilgileridüzenle=Driver.getDriver().findElement(By.xpath("(//*[text()='Edit'])[2]"));

        editbilgileridüzenle.click();


        WebElement doktormesajcontent=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control'])[1]"));

        doktormesajcontent.click();

        doktormesajcontent.clear();

        doktormesajcontent.sendKeys("HELLO");

        Driver.getDriver().findElement(By.xpath("//*[text()='Save Doctors']")).click();


        WebElement doktorusildelete=Driver.getDriver().findElement(By.xpath("//*[text()='Delete']"));

        doktorusildelete.click();


        WebElement doktorsilindiyazısı=Driver.getDriver().findElement(By.xpath("//span[text()='Doctors deleted successfully']"));

        Assert.assertTrue(doktorsilindiyazısı.isDisplayed());














    }

}
