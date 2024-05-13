package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_21 {

    @Test
    public void US_21(){

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Roles ve alt menülerini,
        // aktf ve doğru çalıştıklarını görüntüleyebilmeli, var olan rol sayısını
        // ve rolleri görüntüleyebilmeli, yeni rol oluşturup oluşturduğum rolleri silebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));

        WebElement password=Driver.getDriver().findElement(By.xpath("//*[@name='password']"));

        email.sendKeys("ahmetkahraman@loyalfriendcare.com");

        password.sendKeys("Lfc.2604");

        WebElement signupbutton=Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-cons m-t-10']"));

        signupbutton.click();


        WebElement menu=Driver.getDriver().findElement(By.xpath("//*[@class='page-sidebar']"));

        menu.click();



        WebElement rolesmenü=Driver.getDriver().findElement(By.xpath("(//*[text()='Roles'])[1]"));

        rolesmenü.click();


        WebElement altmenüroles=Driver.getDriver().findElement(By.xpath("(//*[text()='Roles'])[2]"));

        altmenüroles.click();


        WebElement rollersayfası=Driver.getDriver().findElement(By.xpath("//*[@id='tableWithSearch']"));

        Assert.assertTrue(rollersayfası.isDisplayed());


        List<WebElement> sayfadakirolisimleri=Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]"));

        System.out.println("Sayfadaki rol isimleri " + ReusableMethods.stringListeDonustur(sayfadakirolisimleri));


        List<WebElement> rollersayısı=Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        System.out.println("Sayfadaki var olan rol sayısı "  + rollersayısı.size() + " dir");


        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();

        menu.click();


        WebElement altmenücreaterole=Driver.getDriver().findElement(By.xpath("//*[text()='Create Role']"));

        altmenücreaterole.click();


        WebElement createrolename=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[1]"));

        createrolename.sendKeys("abcde");


        WebElement createroledısplayname=Driver.getDriver().findElement(By.xpath("(//*[@class='form-control '])[2]"));

        createroledısplayname.sendKeys("12345");

        WebElement savebutton=Driver.getDriver().findElement(By.xpath("//*[text()='save']"));

        savebutton.click();


        String expectedrolname="abcde";

        String actuakrolsayfa=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(actuakrolsayfa.contains(expectedrolname));


        WebElement deletebutton=Driver.getDriver().findElement(By.xpath("//*[text()='Delete']"));

        deletebutton.click();


        WebElement deleteyazısı=Driver.getDriver().findElement(By.xpath("//*[text()='Role deleted successfully']"));

        Assert.assertTrue(deleteyazısı.isDisplayed());

        ReusableMethods.bekle(1);









    }

}
