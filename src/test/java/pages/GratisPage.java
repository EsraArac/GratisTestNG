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

    @FindBy(xpath = "//div[@class='right-content']//input[@class='search-input']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='label ng-star-inserted'])[4]")
    public WebElement markaKontrol;

    @FindBy(xpath = "//h5[.='Beaulis Sürpriz Makyaj Seti']")
    public WebElement surprizSet;

    @FindBy(xpath = "//*[@class='product-title pdp-product-title ng-star-inserted']")
    public WebElement isimBak;

    @FindBy(xpath = "//app-custom-product-grid-item[1]//app-custom-media[@class='cx-product-image is-initialized']")
    public WebElement yanlisUrun;

    @FindBy(xpath = "//*[@class='add-btns add-to-fav ng-star-inserted']")
    public WebElement favEkle;


    @FindBy(xpath = "//div[@class='alert alert-warning ng-star-inserted']/div[@class='container']")
    public WebElement girisYapUyarisi;


}
