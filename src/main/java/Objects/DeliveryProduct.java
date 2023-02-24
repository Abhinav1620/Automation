package Objects;

import BaseClass.BaseDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DeliveryProduct {
    public DeliveryProduct(WebDriver driver){
        PageFactory.initElements(BaseDrivers.driver, this);
    }


    public By productToAdd = By.id("item_0_title_link");

    public By addToCart = By.id("add-to-cart-sauce-labs-bike-light");

    public By cartIMG = By.cssSelector(".shopping_cart_link");

    public By checkOut = By.id("checkout");


    public WebElement productToAdd(){
        return BaseDrivers.driver.findElement(productToAdd);
    }

    public WebElement addToCart(){
        return BaseDrivers.driver.findElement(addToCart);
    }
    public WebElement productIMG(){
        return BaseDrivers.driver.findElement(cartIMG);
    }
    public WebElement checkout(){
        return BaseDrivers.driver.findElement(checkOut);
    }
}
