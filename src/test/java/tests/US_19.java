package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoyalFriendpages;
import utilities.Driver;

public class US_19 {



    @Test
    public void US_19(){

        //Admin yetkisi ile giriş yapabilmek için admin sayfasına ulaşabilmeliyim

        LoyalFriendpages royalFriendpages=new LoyalFriendpages();
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmetkahraman@loyalfriendcare.com");

        password.sendKeys("Lfc.2604");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();

        Assert.assertTrue(royalFriendpages.instagram.isDisplayed());


    }

}
