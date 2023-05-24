package stepdefinitions;

import org.junit.After;

import utilities.Driver;
import utilities.ReusableMethods;

public class Hooks {


    @After
    public void tearDown(){

        System.out.println("page will be closed in 2 sec");
        ReusableMethods.wait(2);
        Driver.closeDriver();

    }
}
