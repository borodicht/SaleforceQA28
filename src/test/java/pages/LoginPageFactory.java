package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends BasePage{

    public LoginPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (id ="username")
    WebElement userNameField;

    @FindBy (id = "password")
    WebElement passwordField;

    @FindAll({
    @FindBy(id = "ssss"), @FindBy(tagName = "hvhjvv")
    })
    WebElement loginButton;

    public void open() {
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
    }

    public void login(String userName, String password) {
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
    }


}
