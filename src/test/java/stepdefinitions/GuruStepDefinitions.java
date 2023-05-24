package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @Given("{string} prints all values in its column")
    public void prints_all_values_in_its_column(String columnName) {

        // Company
        //List<WebElement> listOfCompanyNames=Driver.getDriver().findElements(By.xpath("//a[@href='http://demo.guru99.com/']"));

        List<WebElement> listOfCompanies = guruPage.companyElementsList;

        for (WebElement each : listOfCompanies
        ) {
            System.out.println(each.getText());
        }


    }

    @Then("test that {string} list has {string} name")
    public void testThatListHasName(String companyName, String desiredCompanyName) {

        List<WebElement> listOfCompanies = guruPage.companyElementsList;
        int flag = 0;

        for (WebElement each : listOfCompanies
        ) {
            if (each.getText().equals(desiredCompanyName)) {
                               flag = 1;
                System.out.println("list has the "+desiredCompanyName);
            }

        }

        Assert.assertTrue(flag==1);


    }

    @Then("test that {string} list has {string} name withReusableMethod")
    public void testThatListHasNameWithReusableMethod(String companyName, String desiredCompanyName) {

       List<String> companyNames = ReusableMethods.getElementsText(guruPage.companyElementsList);

       Assert.assertTrue(companyNames.contains(desiredCompanyName));

    }
}
