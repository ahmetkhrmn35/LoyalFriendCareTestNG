package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_29 {

    @Test
    public void US_29(){

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Tickets menüsünü,
        // aktif ve doğru çalıştığını görüntüleyebilmeli, var
        // olan randevu başvurularını  görüntüleyebilmeliyim

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
        WebElement dashboardticketmenü=Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[12]"));

        dashboardticketmenü.click();

        //BURDA TAM NE ANLATMAK İSTEDİNİ ANLAMADIM BÜTÜN SİTEDEKİ RANDEVULARI LOCATE ETTİM

        WebElement randevu01=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[1]"));
        WebElement randevu02=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[2]"));
        WebElement randevu03=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[3]"));
        WebElement randevu04=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[4]"));
        WebElement randevu05=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[5]"));
        WebElement randevu06=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[6]"));
        WebElement randevu07=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[7]"));
        WebElement randevu08=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[8]"));
        WebElement randevu09=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[9]"));
        WebElement randevu10=Driver.getDriver().findElement(By.xpath("(//div[@class='card social-card share col2 m-t-30 m-b-30 m-r-30'])[10]"));

        //YAPILAN RANDEVU BAŞVURU LOCATELERİ SAYFADA GÖRÜNÜYORMU BAKTIM
        Assert.assertTrue(randevu01.isDisplayed());
        Assert.assertTrue(randevu02.isDisplayed());
        Assert.assertTrue(randevu03.isDisplayed());
        Assert.assertTrue(randevu04.isDisplayed());
        Assert.assertTrue(randevu05.isDisplayed());
        Assert.assertTrue(randevu06.isDisplayed());
        Assert.assertTrue(randevu07.isDisplayed());
        Assert.assertTrue(randevu08.isDisplayed());
        Assert.assertTrue(randevu09.isDisplayed());
        Assert.assertTrue(randevu10.isDisplayed());

        //RANDEVULAR GÖZÜKÜYOR YALNIZ RANDEVULARA TIKLANMIYOR
        //RANDEVULAR ÜSTÜNDE BİR DEĞİŞİKLİKTE YAPILMIYOR
        //BUNUN HARİCİ SORUN YOK


    }

}
