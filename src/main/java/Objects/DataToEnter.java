package Objects;

import BaseClass.BaseDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DataToEnter {
    public DataToEnter(WebDriver driver){
        PageFactory.initElements(BaseDrivers.driver, this);
    }


    public By firstName = By.id("first-name");
    public By lastName = By.id("last-name");
    public By zipCode = By.id("postal-code");
    public By continueBTN = By.id("continue");


    public WebElement firstName(){
        return BaseDrivers.driver.findElement(firstName);
    }
    public WebElement lastName(){
        return BaseDrivers.driver.findElement(lastName);
    }
    public WebElement zipCode(){
        return BaseDrivers.driver.findElement(zipCode);
    }
    public WebElement continueBTN(){
        return BaseDrivers.driver.findElement(continueBTN);
    }

}
