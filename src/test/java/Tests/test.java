package Tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GratisPage;
import utilities.ConfigReader;
import utilities.*;

import java.util.ResourceBundle;


//import static utilities.Driver.driver;

public class test {
    static int bekle = 1500;
    GratisPage gratisPage = new GratisPage();
    @BeforeClass
    public void setUp() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("gratisURL"));

    }

    @Test
    public void test01() throws InterruptedException {
        gratisPage.popUp.click();
        gratisPage.searchBox.click();
        gratisPage.searchBox.sendKeys(ConfigReader.getProperty("secilenMarka"));
        Thread.sleep(bekle);
        gratisPage.searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(gratisPage.aramaSonuclari.isDisplayed());



    }

    @Test
    public void test02(){

        String beklenenSonuc = ConfigReader.getProperty("secilenMarka");
        String gelenSonuc = gratisPage.markaKontrol.getText();
        if (gelenSonuc.contains(beklenenSonuc)){
            System.out.println("Doğru marka aratıldı: " +gelenSonuc);
        }
        else {
            System.out.println("Marka yanlış aratıldı " +gelenSonuc);
        }
        Assert.assertTrue(gelenSonuc.contains(beklenenSonuc));

    }

    @Test
    public void test03(){

       Assert.assertTrue(gratisPage.ilkUrun.isDisplayed());


    }
    @Test
    public void test04(){

        gratisPage.markaKontrol.click();
        Assert.assertTrue(gratisPage.sepeteEkleButonu.isDisplayed());

    }


    @Test
    public void girisYapUyariTesti(){
        //son adımda favori butonuna tıklanması gerekir


        String uyari =gratisPage.girisYapUyarisi.getText();
        if (gratisPage.girisYapUyarisi.isDisplayed()){
            System.out.println("Giris yapılmamış--> " +uyari);
        }
    }



}
