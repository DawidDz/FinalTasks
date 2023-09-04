package pl.coderslab.task1;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyStoreMyAccountPage {
    private final WebDriver driver;
    @FindBy(xpath = "//span[contains(text(),'Create new address')]")
    private WebElement newAddressBtn;

    @FindBy(xpath = "//address")
    private List<WebElement> addresses;

    public MyStoreMyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToMyAddressesPage() {
        driver.findElement(By.cssSelector("a[title=Addresses]")).click();
    }

    public void addNewAddress() {
        newAddressBtn.click();
    }

    public void removeAddresses() {
        for (WebElement address : addresses) {
            address.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
        }
    }
}