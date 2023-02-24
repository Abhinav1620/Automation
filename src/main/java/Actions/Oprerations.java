package Actions;

import org.openqa.selenium.WebElement;

public class Oprerations {

    public static void click(WebElement webElement){
        webElement.click();
    }


    public static void type(WebElement webElement, String text){
        webElement.sendKeys(text);
    }
}
