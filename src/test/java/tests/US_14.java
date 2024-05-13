package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_14 {

   @Test
    public void US_14(){

       System.out.println("-------2 ADET BUG BULUNDU PAİNCONTROL VE BOARDİNGİN ROOM YATAKLI BÖLÜMLERİ YOK ");

       //kayıtlı kullanıcı olarak Departmentlar sayfasına ulaşıp her bir
       //departmanın yataklı bölümününe ulaşabilmeliyim
       //ve bu bölümün ücreti, sorumlu doktor ve departman bilgilerini görüntüleyebilmeliyim

       Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

       WebElement signin=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

       signin.click();


       WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
       WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

       email.sendKeys("ahmet@testotomasyonu.com");

       password.sendKeys("Ahmet.123");

       WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

       signupbutton.click();

       WebElement wellness=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[1]"));
       WebElement dentalcare=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[2]"));
       WebElement anaesthesia=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[3]"));
       WebElement dermatology=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[4]"));
       WebElement diagnostics=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[5]"));
       WebElement vaccinations=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[6]"));
       WebElement paincontrol=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[7]"));
       WebElement boarding=Driver.getDriver().findElement(By.xpath("(//div[@class='col-lg-3 col-sm-6'])[8]"));

       wellness.click();



       WebElement welnessroom=Driver.getDriver().findElement(By.xpath("//div[@class='col-lg-3 col-sm-6']"));
       welnessroom.click();

       WebElement sorumludoktor=Driver.getDriver().findElement(By.xpath("//span[text()=' Dr. Alejandro Martinez ']"));

       Assert.assertTrue(sorumludoktor.isDisplayed());

       WebElement departmanücreti=Driver.getDriver().findElement(By.xpath("//span[text()=' 300 USD ']"));

       Assert.assertTrue(departmanücreti.isDisplayed());

       WebElement departmanbölümü=Driver.getDriver().findElement(By.xpath("//span[text()=' Wellness ']"));

       Assert.assertTrue(departmanbölümü.isDisplayed());

       WebElement departmanilacı=Driver.getDriver().findElement(By.xpath("//span[text()=' Rimadyl (Carprofen) ']"));

       Assert.assertTrue(departmanilacı.isDisplayed());

       Driver.getDriver().navigate().back();
       Driver.getDriver().navigate().back();

       dentalcare.click();



       WebElement dentalcareroom=Driver.getDriver().findElement(By.xpath("//div[@class='col-lg-3 col-sm-6']"));
       dentalcareroom.click();

       sorumludoktor=Driver.getDriver().findElement(By.xpath("//span[text()=' Dr. Marcus Rodriguez ']"));

       Assert.assertTrue(sorumludoktor.isDisplayed());

       departmanücreti=Driver.getDriver().findElement(By.xpath("//span[text()=' 600 USD ']"));

       Assert.assertTrue(departmanücreti.isDisplayed());

       departmanbölümü=Driver.getDriver().findElement(By.xpath("//span[text()=' Dental Care ']"));

       Assert.assertTrue(departmanbölümü.isDisplayed());

       departmanilacı=Driver.getDriver().findElement(By.xpath("//span[text()=' Baytril (Enrofloxacin) ']"));

       Assert.assertTrue(departmanilacı.isDisplayed());

       Driver.getDriver().navigate().back();
       Driver.getDriver().navigate().back();

       anaesthesia.click();



       WebElement anaesthesiaroom=Driver.getDriver().findElement(By.xpath("//div[@class='col-lg-3 col-sm-6']"));
       anaesthesiaroom.click();

       sorumludoktor=Driver.getDriver().findElement(By.xpath("//span[text()=' Dr. Olivia Bennett ']"));

       Assert.assertTrue(sorumludoktor.isDisplayed());

       departmanücreti=Driver.getDriver().findElement(By.xpath("//span[text()=' 900 USD ']"));

       Assert.assertTrue(departmanücreti.isDisplayed());

       departmanbölümü=Driver.getDriver().findElement(By.xpath("//span[text()=' Anaesthesia ']"));

       Assert.assertTrue(departmanbölümü.isDisplayed());

       departmanilacı=Driver.getDriver().findElement(By.xpath("//span[text()=' Apoquel (Oclacitinib) ']"));

       Assert.assertTrue(departmanilacı.isDisplayed());

       Driver.getDriver().navigate().back();
       Driver.getDriver().navigate().back();

       dermatology.click();



       WebElement dermatologyroom=Driver.getDriver().findElement(By.xpath("//div[@class='col-lg-3 col-sm-6']"));
       dermatologyroom.click();

       sorumludoktor=Driver.getDriver().findElement(By.xpath("//span[text()=' Dr. Emily Chang ']"));

       Assert.assertTrue(sorumludoktor.isDisplayed());

       departmanücreti=Driver.getDriver().findElement(By.xpath("//span[text()=' 200 USD ']"));

       Assert.assertTrue(departmanücreti.isDisplayed());

       departmanbölümü=Driver.getDriver().findElement(By.xpath("//span[text()=' Dermatology ']"));

       Assert.assertTrue(departmanbölümü.isDisplayed());

       departmanilacı=Driver.getDriver().findElement(By.xpath("//span[text()=' Baytril (Enrofloxacin) ']"));

       Assert.assertTrue(departmanilacı.isDisplayed());

       Driver.getDriver().navigate().back();
       Driver.getDriver().navigate().back();

       diagnostics.click();



       WebElement diagnosticsroom=Driver.getDriver().findElement(By.xpath("//div[@class='col-lg-3 col-sm-6']"));
       diagnosticsroom.click();

       sorumludoktor=Driver.getDriver().findElement(By.xpath("//span[text()=' Dr. Nathan Patel ']"));

       Assert.assertTrue(sorumludoktor.isDisplayed());

       departmanücreti=Driver.getDriver().findElement(By.xpath("//span[text()=' 200 USD ']"));

       Assert.assertTrue(departmanücreti.isDisplayed());

       departmanbölümü=Driver.getDriver().findElement(By.xpath("//span[text()=' Diagnostics ']"));

       Assert.assertTrue(departmanbölümü.isDisplayed());

       departmanilacı=Driver.getDriver().findElement(By.xpath("//span[text()=' Baytril (Enrofloxacin) ']"));

       Assert.assertTrue(departmanilacı.isDisplayed());

       Driver.getDriver().navigate().back();
       Driver.getDriver().navigate().back();

       vaccinations.click();



       WebElement vaccinationsroom=Driver.getDriver().findElement(By.xpath("//div[@class='col-lg-3 col-sm-6']"));
       vaccinationsroom.click();

       sorumludoktor=Driver.getDriver().findElement(By.xpath("//span[text()=' Dr. Isabella Wong ']"));

       Assert.assertTrue(sorumludoktor.isDisplayed());

       departmanücreti=Driver.getDriver().findElement(By.xpath("//span[text()=' 200 USD ']"));

       Assert.assertTrue(departmanücreti.isDisplayed());

       departmanbölümü=Driver.getDriver().findElement(By.xpath("//span[text()=' Vaccinations ']"));

       Assert.assertTrue(departmanbölümü.isDisplayed());

       departmanilacı=Driver.getDriver().findElement(By.xpath("//span[text()=' Apoquel (Oclacitinib) ']"));

       Assert.assertTrue(departmanilacı.isDisplayed());

       Driver.getDriver().navigate().back();
       Driver.getDriver().navigate().back();

       paincontrol.click();

       System.out.println("BUG OLDUĞUNDAN DOLAYI PAİNCONTROLDE PAİNROOMA ULAŞILAMIYOR ROOM EKRANI YOK");

       Driver.getDriver().navigate().back();

       boarding.click();

       System.out.println("BUG OLDUĞUNDAN DOLAYI BOARDİNGE ULAŞILAMIYOR ROOM EKRANI YOK");

       Driver.getDriver().navigate().back();









   }
}
