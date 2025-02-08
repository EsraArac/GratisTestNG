package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GratisPage {
    public GratisPage(){
        PageFactory.initElements(Driver.getDriver(),this); //oop concept

    }

    @FindBy(xpath = "//*[@id='banner-accept-button']")
    public WebElement cokkieKabul;

    @FindBy(xpath = "//*[@class='popup_close']")
    public WebElement popUp;
    @FindBy(xpath = "//div[@class='right-content']//input[@class='search-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[.='Arama Sonuçları']")
    public WebElement aramaSonuclari;

    @FindBy(xpath = "(//h5[@class='title'])[1]")
    public WebElement markaKontrol;



    @FindBy(xpath = "(//*[@class='product-cards'])[1]")
    public WebElement ilkUrun;



    @FindBy(xpath = "//*[@class='add-to-basket round-btns fat']")
    public WebElement sepeteEkleButonu;

    @FindBy(xpath = "//*[@class='add-btns add-to-fav ng-star-inserted']")
    public WebElement favEkle;



    @FindBy(xpath = "//div[@class='alert alert-warning ng-star-inserted']/div[@class='container']")
    public WebElement girisYapUyarisi;


}
