package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LoyalFriendpages {

    public LoyalFriendpages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='btn_add'])[1]")
    public WebElement sıgnın;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-cons m-t-10']")
    public WebElement sıgnupbutton;

    @FindBy(xpath = "(//*[text()='Medicines'])[3]")
    public WebElement medicines;

    @FindBy(xpath = "(//div[@class='nice-select wide'])[1]")
    public WebElement medicineseceneği;

    @FindBy(xpath = "(//div[@class='nice-select wide'])[2]")
    public WebElement medicinedoktorsecimi;

    @FindBy(xpath = "(//div[@class='col-md-6'])[1]")
    public WebElement headerrimadymedicine;

    @FindBy(xpath = "(//div[@class='col-md-6'])[2]")
    public WebElement headerrevolutionmedicine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[3]")
    public WebElement headerbaytrilmedicine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[4]")
    public WebElement headerapoquelmedicine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[5]")
    public WebElement headermetacammedicine;

    @FindBy(xpath = "//div[@class='col-md-6'][6]")
    public WebElement headerviocidmedicine;

    @FindBy(xpath = "(//div[@class='col-md-6'])[1]")
    public WebElement rabiesvaccine;

    @FindBy(xpath = "(//div[@class='col-md-6'])[2]")
    public WebElement dhppvaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[3]")
    public WebElement felineleukimavaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[4]")
    public WebElement fıvvaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[5]")
    public WebElement bordetellavaccine;


    @FindBy(xpath = "(//div[@class='col-md-6'])[6]")
    public WebElement felinepanlekuiavaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[7]")
    public WebElement felinherpesvirusvaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[8]")
    public WebElement surgicalprocedure;
    @FindBy(xpath = "(//div[@class='col-md-6'])[9]")
    public WebElement asi;
    @FindBy(xpath = "(//*[@class='nice-select wide'])[1]")
    public WebElement categorybölümvaccions;

    @FindBy(xpath = "(//*[@class='option'])[2]")
    public WebElement categorysecenekvaccions;

    @FindBy(xpath = "(//*[@class='nice-select wide'])[2]")
    public WebElement doktorbölümvaccions;

    @FindBy(xpath = "(//*[@class='option'])[9]")
    public WebElement doktorsecenekvaccions;



    @FindBy(xpath = "//*[@id='Date']")
    public WebElement date;

    @FindBy(xpath = "(//*[@class='nice-select wide'])[1]")
    public WebElement categorybölümmedicine;

    @FindBy(xpath = "(//*[@class='option'])[1]")
    public WebElement categorysecenekmedicine;

    @FindBy(xpath = "(//*[@class='nice-select wide'])[2]")
    public WebElement doktorbölümmedicine;

    @FindBy(xpath = "(//*[text()='Dr. Alejandro Martinez'])[3]")
    public WebElement doktorsecenekmedicine;

    @FindBy(xpath = "(//*[@class='form-control'])[3]")
    public WebElement mesajkutusu;

    @FindBy(xpath = "//*[@id='submit-contact-detail']")
    public WebElement rezervasyonbutonu;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement rezervasyonyazısı;

    @FindBy(xpath = "(//*[text()='Vaccinations'])[5]")
    public WebElement vaccinations;

    @FindBy(xpath = "//*[@class='logo_normal']")
    public WebElement anasayfalogo;

    @FindBy(xpath = "//div[@class='ml-4 text-lg text-gray-500 uppercase tracking-wider']")
    public WebElement admingirishatamesajı;

    @FindBy(xpath = "//*[@class='fab fa-instagram-square']")
    public WebElement instagram;

    @FindBy(xpath = "(//*[@class='text-white'])[2]")

    public WebElement dashboardadmindeparments;

    @FindBy(xpath = "(//*[@class='text-white'])[3]")
    public WebElement bedmanagers;

    @FindBy(xpath = "(//*[@class='text-white'])[4]")
    public WebElement Roles;

    @FindBy(xpath = "(//*[@class='text-white'])[5]")
    public WebElement Settings;

    @FindBy(xpath = "(//*[@class='text-white'])[6]")
    public WebElement Tickets;

    @FindBy(xpath = "(//*[@class='text-white'])[7]")
    public WebElement Petsadsense;

    @FindBy(xpath = "(//*[@class='text-white'])[8]")
    public WebElement Mediciness;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> Varolanrolsayısı;






}
