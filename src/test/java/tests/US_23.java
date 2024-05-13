package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_23 {

    @Test
    public void US_23(){
        // Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Bed managers ve alt menülerini,
        // aktif ve doğru çalıştıklarını görüntüleyebilmeli,  var olan yataklı oda sayısını ve yataklı
        // odaları görüntüleyebilmeli, yeni oda oluşturabilmeli, oluşturduğum odaları ilgili sayfada
        // görüntüleyebilmeli, admin kullanıcı olarak oluştturduğum odanın bilgilerini düzenleyebilmeli
        // ve kullanıcıyı silebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmetkahraman@loyalfriendcare.com");

        password.sendKeys("Lfc.2604");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        WebElement menu=Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']"));

        menu.click();

        WebElement badmanageryatakyöneticimenu=Driver.getDriver().findElement(By.xpath("(//*[text()='Bed managers'])[1]"));

        badmanageryatakyöneticimenu.click();

        WebElement badmanageryatakyöneticioda=Driver.getDriver().findElement(By.xpath("(//*[text()='Bed managers'])[2]"));

        badmanageryatakyöneticioda.click();

        WebElement yataklıodalar=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(yataklıodalar.isDisplayed());

        List<WebElement> sayfadakiyataklıodaisimleri=Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));

        System.out.println("Sayfadakiyataklıodalar " + ReusableMethods.stringListeDonustur(sayfadakiyataklıodaisimleri));


        List<WebElement> yataklıodasayısı=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("Sayfadaki var olan yataklıoda sayısı "  + yataklıodasayısı.size() + " dir");

        Driver.getDriver().navigate().back();



        WebElement createbedmanager=Driver.getDriver().findElement(By.xpath("//*[text()='Create Bed managers']"));

        ReusableMethods.bekle(1);

        menu.click();

        createbedmanager.click();

        WebElement odaismititle=Driver.getDriver().findElement(By.xpath("//*[@class='form-control ']"));

        odaismititle.click();
        odaismititle.sendKeys("İGOR");

        WebElement içerikutusucontent=Driver.getDriver().findElement(By.xpath("//*[@class='note-editable']"));

        içerikutusucontent.click();

        içerikutusucontent.sendKeys("deneme");

        WebElement bedmanagerscreate=Driver.getDriver().findElement(By.xpath("(//*[@class='select2-selection__rendered'])[1]"));

        bedmanagerscreate.click();

        WebElement bedmanagerscreatesecme=Driver.getDriver().findElement(By.xpath("(//*[text()='Wellness'])[3]"));

        bedmanagerscreatesecme.click();

        WebElement createddoctor=Driver.getDriver().findElement(By.xpath("(//*[@class='select2-selection__rendered'])[2]"));

        createddoctor.click();

        ReusableMethods.bekle(1);

        WebElement doctorsecim=Driver.getDriver().findElement(By.xpath("(//*[text()='Dr. Alejandro Martinez'])[2]"));

        doctorsecim.click();

        WebElement createdmedicine=Driver.getDriver().findElement(By.xpath("(//*[@class='select2-selection__rendered'])[3]"));

        createdmedicine.click();

        WebElement medicinesecim=Driver.getDriver().findElement(By.xpath("(//*[text()='Revolution (Selamectin)'])[2]"));

        medicinesecim.click();

        WebElement bedmanagerprice=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control'])[5]"));

        bedmanagerprice.click();

        bedmanagerprice.sendKeys("250");


        WebElement odaoluşturmabutonu=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-success btn-cons btn-animated from-left fa fa-save pull-right']"));

        odaoluşturmabutonu.click();




        String expectedoluşturulanisim="İGOR";

        String actualoluşturulanoda=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        ReusableMethods.bekle(2);

        Assert.assertTrue(actualoluşturulanoda.contains(expectedoluşturulanisim));


        WebElement kayıtolustukapat=Driver.getDriver().findElement(By.xpath("//*[@class='close']"));

        kayıtolustukapat.click();


        ReusableMethods.bekle(1);


        WebElement adminprofilbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='profile-dropdown-toggle']"));

        adminprofilbutonu.click();

        WebElement adminlogoutbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='clearfix bg-master-lighter dropdown-item']"));

        adminlogoutbutonu.click();


        WebElement headerdepartments=Driver.getDriver().findElement(By.xpath("(//*[text()='Departments '])[3]"));

        headerdepartments.click();

        WebElement wellnesbölüm=Driver.getDriver().findElement(By.xpath("(//div[@class='col-md-6'])[1]"));

        wellnesbölüm.click();

        //BURASI SAYFADAKİ OLUŞTURULAN ÖĞEYE GÖRE DEĞİŞİR ÖRNEK:[2] YERİNE [3] YAZILABİLİR.
        WebElement oluşturulansayfa=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[2]"));

        oluşturulansayfa.click();


        ////div[@class='col-lg-8']
        String expectedheaderbedmanagerdepartmentsismi="İGOR";

        String actualbedmanagerdepartmentheadersayfa=Driver.getDriver().findElement(By.xpath("//div[@class='col-lg-8']")).getText();

        //DEPARTMEN BÖLÜMÜNDE İGOR İSMİNDE ODA VARMI YOKMU
        Assert.assertTrue(actualbedmanagerdepartmentheadersayfa.contains(expectedheaderbedmanagerdepartmentsismi));

        Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]")).click();

        Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']")).click();

        ReusableMethods.bekle(1);

        Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[4]")).click();

        ReusableMethods.bekle(1);

        Driver.getDriver().findElement(By.xpath("//*[@href='https://qa.loyalfriendcare.com/Dashboard/Posts']")).click();


        WebElement editbilgileridüzenlebedmanager=Driver.getDriver().findElement(By.xpath("(//*[text()='Edit'])[2]"));

        editbilgileridüzenlebedmanager.click();


       WebElement bedmanageryorumcontect=Driver.getDriver().findElement(By.xpath("//div[@class='note-editable']"));

       bedmanageryorumcontect.click();

       bedmanageryorumcontect.clear();

       bedmanageryorumcontect.sendKeys("Hello");


        Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-success btn-cons btn-animated from-left fa fa-save pull-right']")).click();


        WebElement odayısildelete=Driver.getDriver().findElement(By.xpath("//*[text()='Delete']"));

        odayısildelete.click();

        WebElement odasilindiyazısı=Driver.getDriver().findElement(By.xpath("//*[text()='Tracks deleted successfully']"));

        Assert.assertTrue(odasilindiyazısı.isDisplayed());

        System.out.println("-----GENEL OLARAK PROBLEM YOK-------Yorumcontect iki kere farklı yerde kullandım" +
                "görmeme durumu VARDI halledildi SORUN YOK");





    }

}
