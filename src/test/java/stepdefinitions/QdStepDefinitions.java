package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QdPage;
import utilities.ConfigReader;

public class QdStepDefinitions {

    QdPage qdPage = new QdPage();

    @Then("user click on qdHomePage login button")
    public void user_click_on_qd_home_page_login_button() {

        qdPage.qdLoginButton.click();

    }

    @Then("user enters a email to emailTextBox")
    public void user_enters_a_email_to_email_text_box() {
        qdPage.loginPageEmailTextBox.sendKeys(ConfigReader.getProperty("qdValidUserName"));
    }

    @Then("user enters a password to passwordTextBox")
    public void user_enters_a_password_to_password_text_box() {
        qdPage.loginPagePasswordTextBox.sendKeys(ConfigReader.getProperty("qdValidPassword"));

    }

    @Then("user click on loginPage login button")
    public void user_click_on_login_page_login_button() {
        qdPage.loginPageLoginButton.click();
    }

    @Then("test that user could be able to login")
    public void test_that_user_could_be_able_to_login() {

        Assert.assertTrue(qdPage.userHomePageMyCoursesButton.isDisplayed());
    }

    @Then("user enters a {string} to emailTextBox")
    public void user_enters_a_to_email_text_box(String desiredEmail) {

        qdPage.loginPageEmailTextBox.sendKeys(ConfigReader.getProperty(desiredEmail));

    }

    @Then("user enters a {string} to passwordTextBox")
    public void user_enters_a_to_password_text_box(String desiredPassword) {
        qdPage.loginPagePasswordTextBox.sendKeys(ConfigReader.getProperty(desiredPassword));
    }

    @Then("test that user could not be able to login")
    public void test_that_user_could_not_be_able_to_login() {

        Assert.assertTrue(qdPage.loginPageEmailTextBox.isDisplayed());
    }




}
