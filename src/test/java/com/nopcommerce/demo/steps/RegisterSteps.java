package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();

    }

    @When("Click on Register Link")
    public void clickOnRegisterLink(String registerText) {
        Assert.assertEquals(new RegisterPage().getRegisterText(), registerText, "I verify the register text is not displayed");
    }

    @Then("Verify {string} text")
    public void verifyText(String error) {
        Assert.assertEquals(new RegisterPage().getFirstNameRequired(), error, "Error Message");

    }

    @When("Click on {string} button")
    public void clickOnButton(String button) {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("Verify the error message {string}")
    public void verifyTheErrorMessage(String error) {
        Assert.assertEquals(new RegisterPage().getLastNameRequired(), error, "Error Message");
    }

    @Given("I am on RegisterPage")
    public void iAmOnRegisterPage() {
    }

    @And("Select gender {string}")
    public void selectGender(String female) {
        new RegisterPage().selectGender("Female");
    }

    @And("Enter firstname")
    public void enterFirstname(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("Enter lastname")
    public void enterLastname(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("Select day")
    public void selectDay(String text) {
        new RegisterPage().selectDay(text);
    }

    @And("Select month")
    public void selectMonth(String text) {
        new RegisterPage().selectMonth(text);
    }

    @And("Select year")
    public void selectYear(String text) {
        new RegisterPage().selectYear(text);
    }

    @And("Enter email")
    public void enterEmail(String text) {
        new RegisterPage().enterEmail(text);
    }

    @And("Enter password")
    public void enterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("Enter Confirm Password")
    public void enterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterPassword(confirmPassword);
    }

    @Then("Verify message {string}")
    public void verifyMessage(String message) {
        Assert.assertEquals(new RegisterPage().getYourRegCompletedText(), message, "I verify the register text is displayed");
    }
    }

