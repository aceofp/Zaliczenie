package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    @Given("^open browser on https:\\/\\/mystore-testlab.coderslab.pl\\/$")
    public void openBrowserOnHttpsMystoreTestlabCoderslabPl() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/");


    }

    @When("user logged in with correct login and password")
    public void userLoggedInWithCorrectLoginAndPassword() {

    }

    @And("click addresses tile")
    public void clickAddressesTile() {

    }

    @And("click +create new address")
    public void clickCreateNewAddress() {

    }

    @And("fill out and save form with correct values: <Alias>, <Address>, <City>, <Zip Code>, <Country>, <Phone>")
    public void fillOutAndSaveFormWithCorrectValuesAliasAddressCityZipCodeCountryPhone() {

    }

    @Then("Address is saved")
    public void addressIsSaved() {
    }
}
