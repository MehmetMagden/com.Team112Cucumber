package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class HowToGeBeautifulReportAutomationStepDefinitions {

    /*

    To get beautiful report
    first we neet to open pom.xml file

    from plugins
    we need to change 2 include tags for sure-fire and fail-safe plugins
    we should enter unique name for our runner there
    like
    /*
    <include>**///runners/*RunnerBR*.java</include>
    /*
    <include>**///runners/*RunnerBR*.java</include>


    /*
    we also need to change numbers of browsers depending  how many we want to open
    <threadCount>1</threadCount>

     */

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
        automationPage.loginPageSignUpButton.click();
    }

    @Given("user enters personal and contact information")
    public void user_enters_personal_and_contact_information() {

        automationPage.informationPageGenderRadioButton.click();
        password = faker.internet().password();
        String lastname = faker.name().lastName();


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
                .sendKeys(Keys.TAB)
                .sendKeys(name)
                .sendKeys(Keys.TAB)
                .sendKeys(lastname)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United State")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("65468")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();


    }

    @Given("the user clicks the Create Account button")
    public void the_user_clicks_the_create_account_button() {

        automationPage.informationPageCreateAccountButton.click();


    }

    @Then("verify account creation")
    public void verify_account_creation() {

        Assert.assertTrue(automationPage.regesteredUserMessage.isDisplayed());

    }


}
