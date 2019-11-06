package co.uk.safebear;

import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver browser;

    @Given("I am a registered user with username {string}")
    public void i_am_a_registered_user_with_username(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter username {string} and {string}")
    public void i_enter_username_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


    @Then("The user is sucessfully logged in")
    public void the_user_is_sucessfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Before
    public void setup(){
        browser = Driver.getDriver();
        browser.navigate().to(Driver.getUrl());
    }

    @After
    public void tearDown(){
        browser.quit();
    }

}