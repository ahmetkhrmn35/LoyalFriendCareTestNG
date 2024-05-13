package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_32 {

    @Test
    public void US_32(){

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden herhangi bir
        // sayfaya geçince yine sol açılır menüden Dashboard menüsünü görüntüleyebilmeli
        // ve bu menü ile admin dahsboard'a ulaşabilmeliyim

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


        WebElement dashboardsettingmenü=Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[14]"));

        dashboardsettingmenü.click();

        Actions actions=new Actions(Driver.getDriver());

        WebElement dashboardpanel=Driver.getDriver().findElement(By.xpath("//*[@class='m-t-30 ']"));

        actions.moveToElement(dashboardpanel).perform();

        ReusableMethods.bekle(3);


        WebElement dashboardbutton=Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[1]"));
        dashboardbutton.click();







    }


}
