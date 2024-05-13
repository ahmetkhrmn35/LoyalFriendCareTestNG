package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_26 {


    @Test
    public void US_26(){
        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Medicines ve alt menülerini,aktf ve
        // doğru çalıştıklarını görüntüleyebilmeli var olan ilaç sayısını ve ilaçları görüntüleyebilmeli,
        // yeni ilaç oluşturabilmeli, oluşturduğum ilacı ilgili sayfalarda görüntüleyebilmeli, admin kullanıcı
        // olarak oluşturduğum ilaç bilgilerini düzenleyebilmeli ve ilacı silebilmeliyim

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
        WebElement dashboardmedicinemenü=Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[7]"));

        dashboardmedicinemenü.click();


        WebElement dashboardmedicinebölüm=Driver.getDriver().findElement(By.xpath("(//*[text()='Medicines'])[2]"));

        dashboardmedicinebölüm.click();


        Driver.getDriver().navigate().back();

        //İlaç oluştur menü
        WebElement createmedicine=Driver.getDriver().findElement(By.xpath("(//*[text()='Create Medicines'])"));

        createmedicine.click();

        Driver.getDriver().navigate().back();

        ReusableMethods.bekle(1);

        menu.click();

        Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/Dashboard/Instagrams']")).click();


        WebElement medicines=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(medicines.isDisplayed());

        List<WebElement> tablodakimedicines=Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));

        System.out.println("Sayfadaki ilaçların isimleri " + ReusableMethods.stringListeDonustur(tablodakimedicines));


        List<WebElement> medicinesayısı=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("Sayfadaki var olan medicine sayısı "  + medicinesayısı.size() + " dir");

        WebElement medicineeklemebutonu=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-tag btn-success btn-tag-rounded']"));

        medicineeklemebutonu.click();


        WebElement medicineform1=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[1]"));

        medicineform1.click();


        medicineform1.sendKeys("aspirin"); //Rakamları kabul ediyor bug var

        WebElement medicineform2=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[2]"));

        medicineform2.click();


        medicineform2.sendKeys("aspirin"); //Rakamları kabul ediyor bug var



        WebElement kaydetsave=Driver.getDriver().findElement(By.xpath("//span[text()='Save Medicines']"));

        kaydetsave.click();


        String expectedmedicineismi="aspirin";

        String olusturulanmedicinegörüntüleme=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(olusturulanmedicinegörüntüleme.contains(expectedmedicineismi));


        WebElement kayıtolustukapat=Driver.getDriver().findElement(By.xpath("//*[@class='close']"));

        kayıtolustukapat.click();


        ReusableMethods.bekle(1);

        WebElement adminprofilbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='profile-dropdown-toggle']"));

        adminprofilbutonu.click();


        WebElement adminlogoutbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='clearfix bg-master-lighter dropdown-item']"));

        adminlogoutbutonu.click();


        //Header panelinden ilaç sayfasına gitmek için
        WebElement headermedicine=Driver.getDriver().findElement(By.xpath("(//*[text()='Medicines'])[3]"));

        headermedicine.click();


        //Header panelinden gidilen sayfada ilaç varmı
        String expectedheadermedicineismi="aspirin";

        String actualmedicineheadersayfa=Driver.getDriver().findElement(By.xpath("(//div[@class='container margin_60_35'])[1]")).getText();

        Assert.assertTrue(actualmedicineheadersayfa.contains(expectedheadermedicineismi));


        Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]")).click();

        Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']")).click();

        ReusableMethods.bekle(1);


        Driver.getDriver().findElement(By.xpath("(//*[text()='Medicines'])[1]")).click();

        Driver.getDriver().findElement(By.xpath("(//*[text()='Medicines'])[2]")).click();

        WebElement editbilgileridüzenle=Driver.getDriver().findElement(By.xpath("(//*[text()='Edit'])[2]"));

        editbilgileridüzenle.click();


        WebElement medicinetıtleform1=Driver.getDriver().findElement(By.xpath("(//*[@type='text'])[1]"));

        medicinetıtleform1.sendKeys("456");



        WebElement medicinecontentform2=Driver.getDriver().findElement(By.xpath("(//*[@type='text'])[2]"));

        medicinecontentform2.sendKeys("345");

        Driver.getDriver().findElement(By.xpath("//*[text()='save']")).click();


        WebElement medicinesildelete=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));

        medicinesildelete.click();


        WebElement medicinesilindiyazısı=Driver.getDriver().findElement(By.xpath("//span[text()='Medicines deleted successfully']"));

        Assert.assertTrue(medicinesilindiyazısı.isDisplayed());


















    }

}
