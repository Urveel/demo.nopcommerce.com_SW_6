package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("Click on login link")
    public void clickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("verify that {string} message display")
    public void verifyThatMessageDisplay(String message) {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }

    @And("Enter EmailId")
    public void enterEmailId(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("Enter Password")
    public void enterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("Verify that the Error message")
    public void verifyThatTheErrorMessage() {
    }

    @Then("Verify that LogOut link is display")
    public void verifyThatLogOutLinkIsDisplay() {
    }

    @And("Click on LogOut Link")
    public void clickOnLogOutLink() {
        new LoginPage().getErrorMessage();
    }

    @Then("Verify that LogIn Link Display")
    public void verifyThatLogInLinkDisplay() {
        new HomePage().isLogOutLinkDisplayed();
    }
}
