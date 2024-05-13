package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_28 {

    @Test
    public void US_28(){

        //LOG.TXT HATASI VAR BUG DA OLABİLİR

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Consultasion menüsünü,
        // aktif ve doğru çalıştığını görüntüleyebilmeli, var olan görüşme tutanaklarını
        // pdf olarak görüntüleyebilmeliyim


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
        WebElement dashboardconsultasionmenü=Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[11]"));

        dashboardconsultasionmenü.click();

        WebElement consultassionaltbölüm=Driver.getDriver().findElement(By.xpath("(//*[text()='Consultation'])[2]"));

        consultassionaltbölüm.click();

        WebElement consultaasionpdf1=Driver.getDriver().findElement(By.xpath("(//div[@class='gallery-item'])[1]"));

        consultaasionpdf1.click();

        // PDFLER BİR RESİM ŞEKLİNDE GÖZÜKÜYOR TIKLANIYOR ANCAK SİTEYE PDF DÖKÜMANLARININ
        //GÖRÜŞME TUTANAKLARINA ERİŞEMİYORUM LOG.TXT HATASI VAR

        WebElement consultaasionpdf2=Driver.getDriver().findElement(By.xpath("(//div[@class='gallery-item'])[2]"));
        WebElement consultaasionpdf3=Driver.getDriver().findElement(By.xpath("(//div[@class='gallery-item'])[3]"));
        WebElement consultaasionpdf4=Driver.getDriver().findElement(By.xpath("(//div[@class='gallery-item'])[4]"));

        Assert.assertTrue(consultaasionpdf1.isDisplayed());
        Assert.assertTrue(consultaasionpdf2.isDisplayed());
        Assert.assertTrue(consultaasionpdf3.isDisplayed());
        Assert.assertTrue(consultaasionpdf4.isDisplayed());

        //ERİŞİM SAĞLANAMADIĞINDAN DOLAYI LOG.TXT HATASI



    }

}
