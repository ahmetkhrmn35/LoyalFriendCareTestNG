package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_24 {

    @Test
    public void US_24(){

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Departmens ve alt menülerini
        //aktif ve doğru çalıştıklarını görüntüleyebilmeli, var olan departman sayısını
        //ve departmanları görüntüleyebilmeli, yeni departman oluşturabilmeli, oluşturduğum
        //departmanı ilgili sayfalarda görüntüleyebilmeli, admin kullanıcı olarak oluşturduğum
        //departmanın bilgilerini düzenleyebilmeli ve departmanı silebilmeliyim

        //ADMİN SAYFASINA GİRİŞ YERİNE GİDELİM
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //EMAİL OLDUĞU YER LOCATE
        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));

        //ŞİFRE OLDUĞU YER LOCATE
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        //EMAİL YAZALIM
        email.sendKeys("ahmetkahraman@loyalfriendcare.com");

        //ŞİFREMİZİ YAZALIM
        password.sendKeys("Lfc.2604");

        //GİRİŞ BUTONU LOCATE EDELİM
        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        //GİRİŞ BUTONU TIKLAYALIM
        signupbutton.click();

        //SOL TARAFTAKİ DASHBOARD MENÜ LOCATE EDELİM
        WebElement menu=Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']"));

        //DASHBOARD MENÜYE TIKLAYALIM
        menu.click();

        //İLGİLİ DEPARTMEN MENÜ LOCATE EDELİM
        WebElement departmentmenu=Driver.getDriver().findElement(By.xpath("(//*[text()='Departments'])[1]"));

        //İLGİLİ DEPARTMENTMENÜ TIKLAYALIM
        departmentmenu.click();

        //İLGİLİ DEPARTMENBÖLÜMÜ LOCATE EDELİM
        WebElement departmenbölümü=Driver.getDriver().findElement(By.xpath("(//*[text()='Departments'])[2]"));

        //BEKLE 1 SN
        ReusableMethods.bekle(1);

        //İLGİLE DEPARTMEN BÖLMÜ TIKLAYALIM
        departmenbölümü.click();

        //MENÜYE GERİ GELELİM
        Driver.getDriver().navigate().back();


        WebElement createdepartment=Driver.getDriver().findElement(By.xpath("//*[text()='Create Departments']"));

        createdepartment.click();

        ReusableMethods.bekle(1);

        Driver.getDriver().navigate().back();

        Driver.getDriver().findElement(By.xpath("(//*[text()='Departments'])[2]")).click();


        WebElement deparmentler=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(deparmentler.isDisplayed());

        List<WebElement> tablodakidepartment=Driver.getDriver().findElements(By.xpath("//tbody/tr/td[3]"));

        System.out.println("Sayfadaki departmentsler " + ReusableMethods.stringListeDonustur(tablodakidepartment));


        List<WebElement> departmentsayısı=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("Sayfadaki var olan deparment sayısı "  + departmentsayısı.size() + " dur");

        WebElement departmentolusturma=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-tag btn-success btn-tag-rounded']"));

        departmentolusturma.click();

        Actions actions=new Actions(Driver.getDriver());

        WebElement velibölümüdepartment=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[1]"));

        actions.click(velibölümüdepartment)
                .sendKeys("12345")      //NAME RAKAM OLARAK KABUL EDİYOR DÜZELTİLMESİ GEREK BUG
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("abc").perform();   //BUG VAR ŞİFRE GİRMEDENDE KABUL EDİYOR
        ReusableMethods.bekle(1);

        WebElement deparmentcolor=Driver.getDriver().findElement(By.xpath("//*[@class='select2-selection__rendered']"));

        WebElement departmenseçim=Driver.getDriver().findElement(By.xpath("//*[@value='complete']"));

        deparmentcolor.click();
        departmenseçim.click();


        ReusableMethods.bekle(2);

        WebElement savekaydetmebutonu=Driver.getDriver().findElement(By.xpath("//*[@type='submit']"));

        savekaydetmebutonu.click();
        //SAYFADA OLUŞTURULDUMU DİYE KONTROL
        String expectedname="12345";
        String actualolusturulandepartment=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(actualolusturulandepartment.contains(expectedname));

        WebElement kayıtolustukapat=Driver.getDriver().findElement(By.xpath("//*[@class='close']"));

        kayıtolustukapat.click();


        WebElement adminprofilbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='profile-dropdown-toggle']"));

        adminprofilbutonu.click();


        WebElement adminlogoutbutonu=Driver.getDriver().findElement(By.xpath("//*[@class='clearfix bg-master-lighter dropdown-item']"));

        adminlogoutbutonu.click();


        WebElement headerdepartments=Driver.getDriver().findElement(By.xpath("(//*[text()='Departments '])[3]"));

        headerdepartments.click();


        String expectedheaderdepartmentsismi="abc";

        String actualdepartmentheadersayfa=Driver.getDriver().findElement(By.xpath("(//div[@class='container margin_60_35'])[1]")).getText();

        Assert.assertTrue(actualdepartmentheadersayfa.contains(expectedheaderdepartmentsismi));


        Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]")).click();


        Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']")).click();

        ReusableMethods.bekle(1);

        Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[5]")).click();

        ReusableMethods.bekle(1);


        Driver.getDriver().findElement(By.xpath("(//*[@href='https://qa.loyalfriendcare.com/Dashboard/Categories'])[1]")).click();

        WebElement editbilgileridüzenle=Driver.getDriver().findElement(By.xpath("(//*[text()='Edit'])[2]"));

        editbilgileridüzenle.click();


        //EDİT BİLGİLERİ DÜZENLEYELİM
        WebElement parent1=Driver.getDriver().findElement(By.xpath("(//*[@type='number'])[1]"));

        parent1.click();

        parent1.sendKeys("45678");


        WebElement order2=Driver.getDriver().findElement(By.xpath("(//*[@type='number'])[2]"));

        order2.click();

        order2.sendKeys("56789");


        WebElement tıtle3=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control'])[1]"));

        tıtle3.click();

        tıtle3.sendKeys("456");

        //DÜZENLEMEYE ONAV VERİP TIKLAYALIM
        Driver.getDriver().findElement(By.xpath("//*[@type='submit']")).click();

        WebElement deletebutton=Driver.getDriver().findElement(By.xpath("//*[text()='Delete']"));

        deletebutton.click();

        WebElement departmansilindiyazısı=Driver.getDriver().findElement(By.xpath("//span[text()='Departments deleted successfully']"));

        Assert.assertTrue(departmansilindiyazısı.isDisplayed());
















    }

}
