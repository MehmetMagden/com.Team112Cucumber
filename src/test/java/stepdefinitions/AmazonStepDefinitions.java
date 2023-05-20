package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();


    @Given("user goes to amazon homepage")
    public void user_goes_to_amazon_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("user searchs for Nutella in search box")
    public void user_searchs_for_nutella_in_search_box() {



        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
    }

    @Then("tests that result text contains Nutella word")
    public void tests_that_result_text_contains_nutella_word() {

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

        amazonPage.amazonSearchBox.sendKeys("TeaPot"+Keys.ENTER);
    }

    @Then("tests that result text contains TeaPot word")
    public void tests_that_result_text_contains_tea_pot_word() {
        String expectedWord = "TeaPot";

        String actualResultText = amazonPage.amazonResultTextBox.getText();

        Assert.assertTrue(actualResultText.contains(expectedWord));


    }

    @Given("user searchs for Flower in search box")
    public void user_searchs_for_flower_in_search_box() {

        amazonPage.amazonSearchBox.sendKeys("Flower"+Keys.ENTER);
    }
    @Then("tests that result text contains Flower word")
    public void tests_that_result_text_contains_flower_word() {
        String expectedWord = "Flower";
        String actualResultText = amazonPage.amazonResultTextBox.getText();

        Assert.assertTrue(actualResultText.contains(expectedWord));
    }

}
