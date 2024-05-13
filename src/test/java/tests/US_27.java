package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_27 {


    @Test
    public void US_27(){

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Pets Adsense ve alt menülerini,
        // aktf ve doğru çalıştıklarını görüntüleyebilmeli var olan adsense sayısını ve adsense'leri
        // görüntüleyebilmeli, resim ekleyerek yeni adsense oluşturabilmeli,  oluşturduğum adsense
        // bilgilerini düzenleyebilmeli ve adsense'i silebilmeliyim

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
        WebElement dashboardpetadsensemenü=Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[8]"));

        dashboardpetadsensemenü.click();

        ReusableMethods.bekle(2);


        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();

        WebElement dashboardpetadsensebölüm=Driver.getDriver().findElement(By.xpath("(//*[text()='Pets adsense'])[2]"));

        jse.executeScript("arguments[0].click();",dashboardpetadsensebölüm);

        Driver.getDriver().navigate().back();

        ReusableMethods.bekle(2);

        WebElement dashboardcreatepetadsense=Driver.getDriver().findElement(By.xpath("//*[text()='Create Pets adsense']"));

        jse.executeScript("arguments[0].click();",dashboardcreatepetadsense);

        Driver.getDriver().navigate().back();

        menu.click();

        dashboardpetadsensebölüm.click();

        Driver.getDriver().navigate().back();

        jse.executeScript("arguments[0].click();",dashboardpetadsensebölüm);



        WebElement petsadsense=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(petsadsense.isDisplayed());

        List<WebElement> sayfadakipetadsense=Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]"));

        System.out.println("Sayfadaki petadsense isimleri " + ReusableMethods.stringListeDonustur(sayfadakipetadsense));


        List<WebElement> petadsensesayısı=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("Sayfadaki var olan petadsense sayısı "  + petadsensesayısı.size() + " dir");


        WebElement petadsenseeklemebutonu=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-tag btn-success btn-tag-rounded']"));

        petadsenseeklemebutonu.click();



        ReusableMethods.bekle(2);

        //Form1 button
        Driver.getDriver().findElement(By.xpath("(//*[text()='Home'])[2]")).click();

        WebElement bölümsecimi=Driver.getDriver().findElement(By.xpath("(//*[@class='select2-results__option'])[3]"));

        bölümsecimi.click();

        WebElement form2controlpettitle=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[1]"));
        form2controlpettitle.click();
        form2controlpettitle.sendKeys("Alex");

        WebElement form3controlpettitle=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[2]"));
        form3controlpettitle.click();
        form3controlpettitle.sendKeys("Kevın");


        WebElement form4controlpets=Driver.getDriver().findElement(By.xpath("(//*[@class='switchery switchery-default'])"));

        form4controlpets.click();

        //CODE SEÇİM BÖLÜMÜ BUGLU EDİT KISMINDA TEKRAR DÖNÜŞ YAPILDIĞI TAKDİRDE SAVE KAYDEDİLMİYOR SÜREKLİ YANLIŞTIR İFADESİ VERİYOR
        Driver.getDriver().findElement(By.xpath("(//*[@class='select2-selection__rendered'])[2]")).click();
        WebElement form5codesecenek=Driver.getDriver().findElement(By.xpath("//*[@class='select2-results__option']"));

        form5codesecenek.click();


        //Form image button
        Driver.getDriver().findElement(By.xpath("//*[text()=' Image']")).click();

        //BU KISIMDA BUG VAR NORMALDE RESİM SEÇMEKLE LAZIM AMA URL YAZIYOR RESİM SEÇİM EKRANI YOK
        WebElement form6yoururlimage=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[3]"));

        //RESİM SEÇME EKRANI OLMADIĞI İÇİN URL OLARAK RASTGELE BİR ŞEY YAZDIM
        form6yoururlimage.click();
        form6yoururlimage.sendKeys("https://www.testotomasyonu.com");

        System.out.println("------------RESİM SEÇİM EKRANI YOK YUKARIDAKİ ALANDA BUG VAR------------");

        //Adsense button
        Driver.getDriver().findElement(By.xpath("//*[text()=' AdSense']")).click();


        WebElement form7adsensemesajkutu=Driver.getDriver().findElement(By.xpath("//div[@class='note-editable']"));

        form7adsensemesajkutu.click();
        form7adsensemesajkutu.sendKeys("hello");


        WebElement savebutton=Driver.getDriver().findElement(By.xpath("//*[@type='submit']"));

        savebutton.click();


        String expectedadsenseismi="Alex";

        String olusturulanadsensegörüntüleme=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(olusturulanadsensegörüntüleme.contains(expectedadsenseismi));


        WebElement editbilgileridüzenle=Driver.getDriver().findElement(By.xpath("(//*[text()='Edit'])[2]"));

        editbilgileridüzenle.click();

        ReusableMethods.bekle(2);

        Driver.getDriver().findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).click();

        WebElement editbölümsecimi=Driver.getDriver().findElement(By.xpath("(//*[@class='select2-results__option'])[4]"));

        editbölümsecimi.click();


        WebElement editform2controlpettitle=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[1]"));
        editform2controlpettitle.click();
        editform2controlpettitle.sendKeys("Alexxx");


        WebElement editform3controlpettitle=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[2]"));
        editform3controlpettitle.click();
        editform3controlpettitle.sendKeys("Kevınnnn");

        //EDİT FORM 5
        Driver.getDriver().findElement(By.xpath("(//*[@class='select2-selection__rendered'])[2]")).click();

        ReusableMethods.bekle(2);

       //EDİT FORM 5 SECENEK
        Driver.getDriver().findElement(By.xpath("(//*[@role='treeitem'])[3]")).click();

        ReusableMethods.bekle(1);

        //Form image button
        Driver.getDriver().findElement(By.xpath("//*[text()=' Image']")).click();

        ReusableMethods.bekle(1);

        //BU KISIMDA BUG VAR NORMALDE RESİM SEÇMEKLE LAZIM AMA URL YAZIYOR RESİM SEÇİM EKRANI YOK
        WebElement editform6yoururlimage=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[3]"));

        //RESİM SEÇME EKRANI OLMADIĞI İÇİN URL OLARAK RASTGELE BİR ŞEY YAZDIM
        editform6yoururlimage.click();
        editform6yoururlimage.sendKeys("https://www.youtube.com");

        WebElement editsavebuttonu=Driver.getDriver().findElement(By.xpath("//*[text()='save']"));

        editsavebuttonu.click();

        System.out.println("----Ayarları başka şekilde yapmama rağmen savelemiyor bug var----");

        WebElement petadsensesildelete=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));

        petadsensesildelete.click();


        WebElement petadsensesilindiyazısı=Driver.getDriver().findElement(By.xpath("//span[text()='AdSense deleted successfully']"));

        Assert.assertTrue(petadsensesilindiyazısı.isDisplayed());


        System.out.println("---------RESİM YÜKLEMEK İÇİN BİR GÖRSEL YOK--------");
        System.out.println("---------FARKLI KOD ALANLARINI SEÇMEME RAĞMEN HATA ALIYORUM------");
        System.out.println("----------FORM KISMI RAKAM VE SAYI TARZI ŞEYLERİ KABUL EDİYOR------");
















    }

}
