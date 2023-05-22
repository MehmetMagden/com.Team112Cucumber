package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    /*
    sometimes we may need to create an object in all the methods it is used
     */

    AmazonPage amazonPage = new AmazonPage();


    @Given("user goes to amazon homepage")
    public void user_goes_to_amazon_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("user searchs for Nutella in search box")
    public void user_searchs_for_nutella_in_search_box() {
        amazonPage = new AmazonPage();


        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
    }

    @Then("tests that result text contains Nutella word")
    public void tests_that_result_text_contains_nutella_word() {
        amazonPage = new AmazonPage();
        String expectedWord = "Nutella";
        String actualResultText =amazonPage.amazonResultTextBox.getText();

        Assert.assertTrue(actualResultText.contains(expectedWord));

    }

    @Then("closes the page")
    public void closes_the_page() {

        Driver.closeDriver();

    }


    @Then("user searchs for TeaPot in search box")
    public void user_searchs_for_tea_pot_in_search_box() {
        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("TeaPot"+Keys.ENTER);
    }

    @Then("tests that result text contains TeaPot word")
    public void tests_that_result_text_contains_tea_pot_word() {
        amazonPage = new AmazonPage();

        String expectedWord = "TeaPot";

        String actualResultText = amazonPage.amazonResultTextBox.getText();

        Assert.assertTrue(actualResultText.contains(expectedWord));


    }

    @Given("user searchs for Flower in search box")
    public void user_searchs_for_flower_in_search_box() {
        amazonPage = new AmazonPage();

        amazonPage.amazonSearchBox.sendKeys("Flower"+Keys.ENTER);
    }
    @Then("tests that result text contains Flower word")
    public void tests_that_result_text_contains_flower_word() {
        amazonPage = new AmazonPage();

        String expectedWord = "Flower";
        String actualResultText = amazonPage.amazonResultTextBox.getText();

        Assert.assertTrue(actualResultText.contains(expectedWord));
    }

    @And("user searchs for {string} in search box")
    public void userSearchsForInSearchBox(String word) {
        amazonPage = new AmazonPage();

        amazonPage.amazonSearchBox.sendKeys(word+Keys.ENTER);

    }

    @Then("tests that result text contains {string} word")
    public void testsThatResultTextContainsWord(String word) {
        amazonPage = new AmazonPage();

        String actualResultText = amazonPage.amazonResultTextBox.getText();
        String expectedWord = word;

        Assert.assertTrue(actualResultText.contains(expectedWord));

    }

    @Given("user goes to {string} homepage")
    public void userGoesToHomepage(String desiredUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(desiredUrl));

    }

    @Then("tests that Url has {string} word")
    public void testsThatUrlHasWord(String urlWord) {

        String actualUrl = Driver.getDriver().getCurrentUrl(); // https://www.amazon.com
        String expectedWord = urlWord; // amazon

        Assert.assertTrue(actualUrl.contains(expectedWord));



    }

    @Then("searches for {string} in amazon searchBox")
    public void searches_for_in_amazon_search_box(String wordToSend) {
        amazonPage.amazonSearchBox.sendKeys(wordToSend);
    }

    @Then("tests that result text contains {string} words")
    public void tests_that_result_text_contains_words(String expectedWord) {
        String actualResultText = amazonPage.amazonResultTextBox.getText();

        Assert.assertTrue(actualResultText.contains(expectedWord));

    }

}
