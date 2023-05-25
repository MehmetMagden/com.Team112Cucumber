package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

import javax.swing.*;

public class AutomationStepDefinitions {

    Faker faker = new Faker();
    AutomationPage automationPage = new AutomationPage();
    String name;
    String email;
    Actions actions = new Actions(Driver.getDriver());
    String password;

    @Given("clicks the user sign in link")
    public void clicks_the_user_sign_in_link() {

        automationPage.homePageLoginSignUpButton.click();
    }

    @Given("user enters email address and a name")
    public void user_enters_email_address_and_a_name() {
        name = faker.name().firstName();
        email = faker.internet().emailAddress();

        automationPage.loginPageNameTextBox.sendKeys(name);
        automationPage.loginPageEmailTextBox.sendKeys(email);
    }

    @Given("clicks the SignUp button")
    public void clicks_the_sign_up_button() {
        automationPage.homePageLoginSignUpButton.click();
    }

    @Given("user enters personal and contact information")
    public void user_enters_personal_and_contact_information() {

        automationPage.informationPageGenderRadioButton.click();
        password = faker.internet().password();
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys("19")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)



    }

    @Given("the user clicks the Create Account button")
    public void the_user_clicks_the_create_account_button() {

    }

    @Then("verify account creation")
    public void verify_account_creation() {

    }
}
