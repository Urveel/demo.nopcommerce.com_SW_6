package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerSteps {
    @When("Click on Computer tab")
    public void clickOnComputerTab() {
        new HomePage().clickOnComputersTabLink();

    }

    @Then("Click on Desktops link")
    public void clickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopTabLink();
    }

    @And("Click on product name {string}")
    public void clickOnProductName(String productName) {
    }

    @And("Select processor {string}")
    public void selectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("Select RAM {string}")
    public void selectRAM(String RAM) {
        new BuildYourOwnComputerPage().selectRam(RAM);
    }

    @And("Select HDD {string}")
    public void selectHDD(String HDD) {
        new BuildYourOwnComputerPage().selectHDD(HDD);
    }

    @And("Select OS {string}")
    public void selectOS(String OS) {
        new BuildYourOwnComputerPage().selectOS(OS);
    }

    @And("Select Software {string}")
    public void selectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("Click on {string} Button")
    public void clickOnButton(String Button) {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }
}
