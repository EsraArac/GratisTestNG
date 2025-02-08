package Tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GratisPage;
import utilities.ConfigReader;
import utilities.*;

import java.util.ResourceBundle;


//import static utilities.Driver.driver;

public class test {
    static int bekle = 1500;
    GratisPage gratisPage = new GratisPage();

    @Test
    public void test01() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("gratisURL"));
       // driver.get("https://www.gratis.com/");
        //bir güncelleme

        gratisPage.cokkieKabul.click();
        gratisPage.searchBox.click();

        gratisPage.searchBox.sendKeys("Beaulis");
        Thread.sleep(bekle);
        gratisPage.searchBox.sendKeys(Keys.ENTER);



    }

    @Test
    public void test02(){

        String beklenenSonuc = "Beaulis";
        String gelenSonuc = gratisPage.markaKontrol.getText();
        if (beklenenSonuc.equals(gelenSonuc)){
            System.out.println("Doğru marka aratıldı: " +gelenSonuc);
        }
        else {
            System.out.println("Marka yanlış aratıldı " +gelenSonuc);
        }
        Assert.assertEquals(beklenenSonuc,gelenSonuc);

    }

    @Test
    public void test03(){
        ReusableMethods.goreneKadarKaydir(gratisPage.surprizSet);
        gratisPage.surprizSet.click();
        String beklenenIsim = "Beaulis Sürpriz Makyaj Seti";
        String gelenIsim = gratisPage.isimBak.getText();
        if(beklenenIsim.equals(gelenIsim)){
            System.out.println("Dogru ürün seçildi: " +gelenIsim);
        }else {
            System.out.println("Yanlis ürün seçildi " +gelenIsim);
        }
        Assert.assertEquals(beklenenIsim,gelenIsim);


    }
    @Test(enabled = false)
    public void yanlisUrunSecmeTesti(){
        gratisPage.yanlisUrun.click();
        String beklenenIsim = "Beaulis Sürpriz Makyaj Seti";
        String gelenIsim = gratisPage.isimBak.getText();
        if(beklenenIsim.equals(gelenIsim)){
            System.out.println("Dogru ürün seçildi: " +gelenIsim);
        }else {
            System.out.println("Yanlis ürün seçildi " +gelenIsim);
        }
       Assert.assertEquals(beklenenIsim,gelenIsim);

    }


    @Test(priority = 4)
    public void girisYapUyariTesti(){
        gratisPage.favEkle.click();

        String uyari =gratisPage.girisYapUyarisi.getText();
        if (gratisPage.girisYapUyarisi.isDisplayed()){
            System.out.println("Giris yapılmamış--> " +uyari);
        }
    }



}
