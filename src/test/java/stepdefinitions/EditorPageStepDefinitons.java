package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorPageStepDefinitons {

    EditorPage editorPage = new EditorPage();

    @Then("user clicks on new button")
    public void user_clicks_on_new_button() {

        editorPage.editorHomePageNewButton.click();

    }
    @Then("user enters {string} to firstName box")
    public void user_enters_to_first_name_box(String firstName) {

        editorPage.firstNameTextBox.sendKeys(firstName);
    }
    @Then("user enters {string} to lastName box")
    public void user_enters_to_last_name_box(String lastName) {
        editorPage.lastNameTextBox.sendKeys(lastName);

    }
    @Then("user enters {string} to position box")
    public void user_enters_to_position_box(String position) {
        editorPage.positionTextBox.sendKeys(position);

    }
    @Then("user enters {string} to office box")
    public void user_enters_to_office_box(String office) {
        editorPage.officeTextBox.sendKeys(office);
    }

    @Then("user enters {string} to extension box")
    public void user_enters_to_extension_box(String extension) {
        editorPage.extensionTextBox.sendKeys(extension);

    }
    @Then("user enters {string} to startdate box")
    public void user_enters_to_startdate_box(String startDate) {
        editorPage.startDateTextBox.sendKeys(startDate);
    }
    @Then("user enters {string} to salary box")
    public void user_enters_to_salary_box(String salary) {
        editorPage.salaryTextBox.sendKeys(salary);

    }

    @Then("user clicks on create button")
    public void user_clicks_on_create_button() {
        editorPage.createButton.click();
    }

    @Then("user sends the {string} to search box")
    public void user_sends_the_to_search_box(String firstName) {
        editorPage.serachBox.sendKeys(firstName+ Keys.ENTER);
    }


    @Then("tests that user's {string} is in the list")
    public void testsThatUserSIsInTheList(String firstName) {
        String actualData = editorPage.tableFirstNameElement.getText();
        String expectedData = firstName;

        Assert.assertTrue(actualData.contains(expectedData));

    }
}
