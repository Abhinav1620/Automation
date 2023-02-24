package StepDefinations;

import Actions.Oprerations;
import BaseClass.BaseDrivers;
import Objects.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs extends Oprerations {
    String username;
    String password;
    Login login = new Login(BaseDrivers.driver);
    @Given("I navigated to website")
    public void iNavigatedToWebsite() {
        BaseDrivers.driver.get("https://www.saucedemo.com/");
    }

    @And("Enter {string} and {string}")
    public void enterAnd(String arg0, String arg1) {
        username=arg0;
        password=arg1;

        type(login.username(), arg0);
        type(login.password(), arg1);
    }

    @When("I hit login button")
    public void iHitLoginButton() {
        click(login.loginBTN());
    }

    @Then("I should be able to see homepage of the website")
    public void iShouldBeAbleToSeeHomepageOfTheWebsite() {
        Assert.assertEquals(login.product(), "PRODUCTS");
    }

    @Then("I should be able to see error message")
    public void iShouldBeAbleToSeeErrorMessage() {
        Assert.assertEquals(login.errorMSG(), "Epic sadface: Username and password do not match any user in this service");
    }
}
