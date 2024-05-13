package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class US_05 {

    //Bir ziyaretçi olarak homepage sayfasına ulaşabilmeli ve
    //Sign Up butonuna tıklayarak üye kayıt sayfasına ulaşıp üye kayıt formunu doldurup üye olabilmeliyim
    //Sign outla çıkış yapabilmeliyim.

    @Test
    public void US_05(){

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");


        WebElement signup=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[2]"));

        signup.click();

        //DOLDURULACAK FORM TARZI VERİLER İÇİN ACTİON VE FAKER KULLANDIM

        Actions actions=new Actions(Driver.getDriver());

        Faker faker=new Faker();


        WebElement username=Driver.getDriver().findElement(By.xpath("//*[@id='name']"));

        actions.click(username)
                .sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("istanblue.123")
                .sendKeys(Keys.TAB)
                .sendKeys("istanblue.123").perform();

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        WebElement kayıtsonrasıçıkışbutonu=Driver.getDriver().findElement(By.xpath("(//*[@class='btn_add'])[2]"));

        kayıtsonrasıçıkışbutonu.click();










    }

}
