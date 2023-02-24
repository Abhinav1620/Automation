package StepDefinations;

import BaseClass.BaseDrivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {
    @Before
    public void setup(){
        BaseDrivers.driver = new ChromeDriver();
        BaseDrivers.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BaseDrivers.wait = new WebDriverWait(BaseDrivers.driver, Duration.ofSeconds(10));
    }

    @After
    public void tearDown(){
        BaseDrivers.driver.quit();
    }
}
