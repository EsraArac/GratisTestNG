package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

import static utilities.Driver.driver;

public class ReusableMethods {

    public static void goreneKadarKaydir(WebElement elementId){
        JavascriptExecutor jsx= (JavascriptExecutor) Driver.getDriver();
        jsx.executeScript("arguments[0].scrollIntoView(true);",elementId);

    }
    public static void yeniSekmeyeGec(){

        Set<String> windows; // sekmeleri tutar
        Iterator<String> window; // sekmeler arasında gezmemezi sağlayacak arama yapmamızı sağlar

        String parentId; //iterator için ana sekme
        String chilIdOne;
        windows = driver.getWindowHandles();

        window = windows.iterator();
        parentId = window.next();
        chilIdOne = window.next();
        driver.switchTo().window(chilIdOne);

    }

}
