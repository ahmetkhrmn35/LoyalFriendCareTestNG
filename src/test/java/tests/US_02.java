package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_02 {

    //Bir ziyaretçi olarak Home page sayfasının header bölümündeki öğelerin görünür
    // ve fonksiyonların aktif olduğunu görüntüleyebilmeliyim

    @Test
    public void US02(){

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        //HEADER KISMI LOGO
        WebElement loyalfriendlogo=Driver.getDriver().findElement(By.xpath("//*[@class='logo_normal']"));

        Assert.assertTrue(loyalfriendlogo.isDisplayed());

        loyalfriendlogo.click();

        //HEADER KISMI HOME
        WebElement home=Driver.getDriver().findElement(By.xpath("(//*[text()='Home'])[2]"));

        Assert.assertTrue(home.isDisplayed());

        home.click();

        Driver.getDriver().navigate().back();


        //HEADER KISMI ABOUT
        WebElement Aboutus=Driver.getDriver().findElement(By.xpath("(//*[text()='About Us'])[2]"));

        Assert.assertTrue(Aboutus.isDisplayed());

        Aboutus.click();

        Driver.getDriver().navigate().back();

        //HEADER KISMI DEPARTMENTS
        WebElement departments=Driver.getDriver().findElement(By.xpath("(//*[text()='Departments '])[3]"));

        Assert.assertTrue(departments.isDisplayed());

        departments.click();

        Driver.getDriver().navigate().back();


        //HEADER KISMI DOKTOR
        WebElement doktor=Driver.getDriver().findElement(By.xpath("(//*[text()='Doctors'])[4]"));

        Assert.assertTrue(doktor.isDisplayed());

        doktor.click();

        Driver.getDriver().navigate().back();


        //HEADER KISMI MEDİCİNE-İLAÇ
        WebElement medicines=Driver.getDriver().findElement(By.xpath("(//*[text()='Medicines'])[3]"));

        Assert.assertTrue(medicines.isDisplayed());

        medicines.click();

        Driver.getDriver().navigate().back();

        //HEADER KISMI VACCİNATİONS-AŞI
        WebElement vaccinations=Driver.getDriver().findElement(By.xpath("(//*[text()='Vaccinations'])[5]"));

        Assert.assertTrue(vaccinations.isDisplayed());

        vaccinations.click();

        Driver.getDriver().navigate().back();


        //HEADER KISMI SİGNİN
        WebElement signın=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        Assert.assertTrue(signın.isDisplayed());

        signın.click();

        Driver.getDriver().navigate().back();


        //HEADER KISMI SİGNUP
        WebElement signup=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[1]"));

        Assert.assertTrue(signup.isDisplayed());

        signup.click();

        Driver.getDriver().navigate().back();


    }

}
