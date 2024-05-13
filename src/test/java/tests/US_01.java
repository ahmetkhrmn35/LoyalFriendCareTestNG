package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_01  {


    //Ziyaretçi olarak ana sayfaya erişebilmeliyim.

    @Test
    public void US01(){

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        //Ana sayfa site logosu
        WebElement loyalfriendlogo=Driver.getDriver().findElement(By.xpath("//*[@class='logo_normal']"));

        Assert.assertTrue(loyalfriendlogo.isDisplayed());


    }



}
