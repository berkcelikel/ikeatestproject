package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BodyContent extends Parent{

    public BodyContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='search']")
    private WebElement search;

    @FindBy(xpath = "(//span[@class='icon-basket-new basket-add  mini-basket-btn'])[1]")
    private WebElement addtable;

    @FindBy(xpath = "//a[@class='icon-close-pure search-close']")
    private WebElement close;

    @FindBy(xpath = "//a[@class='shopping-basket']")
    private WebElement gotocart;

    @FindBy(xpath = "(//div[@class='col-md-6'])[2]")
    private WebElement cart;

    @FindBy(xpath = "//a[@class='btn btn-default btn-block']")
    private WebElement withoutmember;

    @FindBy(xpath = "//a[@class='not-address-link']")
    private WebElement adresekleme;

    @FindBy(xpath = "//input[@class='form-control email required']")
    private WebElement mail;

    @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ctrlAddressEditForm_txtEditFirstName']")
    private WebElement name;

    @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ctrlAddressEditForm_txtEditLastName']")
    private WebElement surname;

    @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ctrlAddressEditForm_txtEditPhone']")
    private WebElement mobile;

    @FindBy(xpath = "//select[@id='ctl00_ContentPlaceHolder1_ctrlAddressEditForm_ddlCities']")
    private WebElement il;

    @FindBy(xpath = "//select[@id='ctl00_ContentPlaceHolder1_ctrlAddressEditForm_ddlTowns']")
    private WebElement ilce;

    @FindBy(xpath = "//select[@id='ctl00_ContentPlaceHolder1_ctrlAddressEditForm_ddlDistricts']")
    private WebElement mahalle;

    @FindBy(xpath = "//textarea[@id='ctl00_ContentPlaceHolder1_ctrlAddressEditForm_txtEditDetail']")
    private WebElement adres;

    @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ctrlAddressEditForm_txtEditTCKNo']")
    private WebElement tc;

    @FindBy(xpath = "//a[@class='btn btn-primary submit-btn']")
    private WebElement addadress;

    @FindBy(xpath = "//a[@class='remove-product btn-text btn-text-icon']")
    private WebElement remove;

    @FindBy(xpath = "(//span[@class='icon-basket-new basket-add  mini-basket-btn'])[4]")
    private WebElement havlu;

    @FindBy(xpath = "//input[@class='btn btn-primary btn-block submit-btn']")
    private WebElement giris;

    @FindBy(css = "p[class=xs-mb-60]")
    private WebElement check;


    WebElement myElement22;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "search": myElement22 = search; break;
            case "mail": myElement22 = mail; break;
            case "name": myElement22 = name; break;
            case "surname": myElement22 = surname; break;
            case "mobile": myElement22 = mobile; break;
            case "adres": myElement22 = adres; break;
            case "tc": myElement22 = tc; break;
        }

        sendKeysFunction(myElement22, value);
    }

    public void findAndClick(String strElement22) {

        switch (strElement22) {
            case "addtable": myElement22= addtable; break;
            case "gotocart": myElement22= gotocart; break;
            case "cart": myElement22= cart; break;
            case "withoutmember": myElement22= withoutmember; break;
            case "adresekleme": myElement22= adresekleme; break;
            case "remove": myElement22= remove; break;
            case "addadress": myElement22= addadress; break;
            case "giris": myElement22= giris; break;
            case "close": myElement22= close; break;
            case "havlu": myElement22= havlu; break;


            case "il": myElement22= il; break;
            case "ilce": myElement22= ilce; break;
            case "mahalle": myElement22= mahalle; break;
        }
        clickFunction(myElement22);
    }

    public void  findandselectvalue(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "il": myElement22= il; break;
            case "ilce": myElement22= ilce; break;
            case "mahalle": myElement22= mahalle; break;

        }

        select(myElement22, text);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "il": myElement22= il; break;
            case "ilce": myElement22= ilce; break;
            case "mahalle": myElement22= mahalle; break;

            case "check": myElement22= check; break;

        }

        verifyContainsText(myElement22, text);
    }
}
