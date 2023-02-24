package StepDefinations;

import Actions.Oprerations;
import BaseClass.BaseDrivers;
import Objects.DataToEnter;
import Objects.DeliveryProduct;
import Objects.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Delivery extends Oprerations {
    String firstName;
    String lastName;
    String zipCode;
    DeliveryProduct deliveryProduct = new DeliveryProduct(BaseDrivers.driver);
    DataToEnter toEnter = new DataToEnter(BaseDrivers.driver);
    Login login = new Login(BaseDrivers.driver);


    @And("Proceed for checkout after adding my product")
    public void proceedForCheckoutAfterAddingMyProduct() {
        click(deliveryProduct.productToAdd());
        click(deliveryProduct.productIMG());
        click(deliveryProduct.checkout());
    }

    @When("I enter my {string} and {string}")
    public void iEnterMyAnd(String arg0, String arg1) {
        lastName=arg0;
        zipCode=arg1;
        type(toEnter.lastName(), arg0);
        type(toEnter.zipCode(), arg1);
        click(toEnter.continueBTN());
    }

    @Then("And error should be appear in front of user")
    public void andErrorShouldBeAppearInFrontOfUser() {
        Assert.assertEquals(login.errorMSG(), "Error: First Name is required");
    }

    @Then("And error should be appear in front of user of lastname")
    public void andErrorShouldBeAppearInFrontOfUserOfLastname() {
        Assert.assertEquals(login.errorMSG(), "Error: Last Name is required");
    }

    @Then("And error should be appear in front of user of zipcode")
    public void andErrorShouldBeAppearInFrontOfUserOfZipcode() {
        Assert.assertEquals(login.errorMSG(), "Error: Postal Code is required");
    }

    @When("I enter my {string} and {string} and leave zipcode")
    public void iEnterMyAndAndLeaveZipcode(String arg0, String arg1) {
        lastName=arg0;
        firstName=arg1;

        type(toEnter.firstName(), arg0);
        type(toEnter.lastName(), arg1);
        click(toEnter.continueBTN());
    }

    @When("I enter my {string} and {string} and leave lastname")
    public void iEnterMyAndAndLeaveLastname(String arg0, String arg1) {
        firstName=arg0;
        zipCode=arg1;

        type(toEnter.firstName(), arg0);
        type(toEnter.zipCode(), arg1);
        click(toEnter.continueBTN());
    }
}
