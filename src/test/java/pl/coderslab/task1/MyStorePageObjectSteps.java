package pl.coderslab.task1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class MyStorePageObjectSteps {
    private WebDriver driver;
    private MyStoreMyAccountPage myAddressesPage;

    @Given("I'm on shop main page")
    public void imOnMyStoreLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
    }

    @When("I login using {string} and {string}")
    public void iLoginUsing(String email, String password) {
        MyStoreLoginPage loginPage = new MyStoreLoginPage(driver);
        loginPage.loginAs("mhgwrsdzokmeyjvcha@cazlp.com", "haslo");
    }

    @And("I go to my addresses page")
    public void iGoToMyAddressesPage() {
        MyStoreMyAccountPage myAccountPage = new MyStoreMyAccountPage(driver);
        myAccountPage.goToMyAddressesPage();
        myAddressesPage = new MyStoreMyAccountPage(driver);
    }
    @When("I add new address")
    public void iAddNewAddress() {
        myAddressesPage.addNewAddress();
    }

    @And("I enter new address alias {string} address {string} city {string} zip {string} country {string} phone {string}")
    public void iEnterNewAddress(String alias, String address, String city, String zip, String country, String phone) {
        MyStoreNewAddressPage newAddressPage = new MyStoreNewAddressPage(driver);
        newAddressPage.enterNewAddressData(alias, address, city, zip, country, phone);
    }

    @Then("I can see new address {string}")
    public void iCanSeeMessage(String alertText) {
        WebElement alert = driver.findElement(By.xpath
                ("//li[contains(text(),'Address successfully added!')]"));
        Assertions.assertEquals(alertText, alert.getText());
    }

    @And("I verify created address alias {string} address {string} city {string} zip {string} country {string} phone {string}")
    public void verifyAddress(String alias, String address, String city, String zip, String country, String phone) {
        Assertions.assertEquals("1", alias);
        Assertions.assertEquals("Golden 12", address);
        Assertions.assertEquals("London", city);
        Assertions.assertEquals("21-354", zip);
        Assertions.assertEquals("United Kingdom", country);
        Assertions.assertEquals("0501234567", phone);
    }
//    @And("I remove the address")
//    public void iRemoveTheAddress() {
//        myAddressesPage.removeAddresses();
//    }
    @And("I close the browser")
    public void iCloseTheBrowser() {
        driver.quit();
    }
}