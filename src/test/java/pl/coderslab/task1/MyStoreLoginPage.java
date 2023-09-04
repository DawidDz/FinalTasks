package pl.coderslab.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreLoginPage {
    private final WebDriver driver;
    @FindBy(name = "email")
    private WebElement loginInput;
    @FindBy(name = "password")
    private WebElement passwdInput;
    @FindBy(id = "submit-login")
    private WebElement signInButton;
    public MyStoreLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void loginAs(String email, String passwd) {
        loginInput.clear();
        loginInput.sendKeys(email);

        passwdInput.clear();
        passwdInput.sendKeys(passwd);

        signInButton.click();
    }
}