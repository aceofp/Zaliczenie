package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Steps {
    WebDriver driver;

    @Given("^open browser on https://mystore-testlab.coderslab.pl/$")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/");
        WebElement signInBox = driver.findElement(By.cssSelector("body.lang-en.country-pl.currency-eur.layout-full-width.page-index.tax-display-enabled:nth-child(2) nav.header-nav div.container div.row div.hidden-sm-down div.col-md-7.right-nav div:nth-child(2) div.user-info a:nth-child(1) > span.hidden-sm-down"));
        signInBox.click();


    }

    @When("^user logged in with correct login and password$")
    public void userLoggedIn() {
        WebElement mailBox = driver.findElement(By.cssSelector(".form-control[name=\"email\"]"));
        mailBox.sendKeys("aceofp@gmail.com");
        WebElement passwordBox = driver.findElement(By.cssSelector(".form-control[name=\"password\"]"));
        passwordBox.sendKeys("haslo_fest_oryginalne_1111");
        WebElement submitButton = driver.findElement(By.cssSelector("#submit-login"));
        submitButton.click();

    }

    @And("^click addresses tile$")
    public void clickAddressesTile() {
        WebElement addressTile = driver.findElement(By.id("addresses-link"));
        addressTile.click();

    }

    @And("click +create new address")
    public void clickCreateNewAddress() {
        WebElement createNewAddress = driver.findElement(By.className("addresses-footer")).findElement(By.tagName("a"));
        createNewAddress.click();

    }


    @And("^fill out and save form with correct values (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void fillOutAndSaveForm(String alias, String address, String city, String postcode, String country, String phone) {
        WebElement aliasBox = driver.findElement(By.name("alias"));
        aliasBox.sendKeys(alias);

        WebElement addressBox = driver.findElement(By.name("address1"));
        addressBox.sendKeys(address);

        WebElement cityBox = driver.findElement(By.name("city"));
        cityBox.sendKeys(city);

        WebElement postcodeBox = driver.findElement(By.name("postcode"));
        postcodeBox.sendKeys(postcode);

        WebElement countryBox = driver.findElement(By.name("id_country"));
        countryBox.sendKeys(country);

        WebElement phoneBox = driver.findElement(By.name("phone"));
        phoneBox.sendKeys(phone);
    }


    @Then("Address is saved")
    public void addressIsSaved() {
        WebElement submitButton = driver.findElement(By.name("submitAddress"));
        submitButton.submit();
    }
}

