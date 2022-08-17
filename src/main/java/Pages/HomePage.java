package Pages;

import Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Browser.Browser.getPropertyValue;

public class HomePage {
    @FindBy(id="txtUsername") private WebElement userName;
    @FindBy(id="txtPassword") private WebElement passwordElement;
    @FindBy(id="btnLogin")private WebElement loginButton;

    public void logIn(){
        userName.sendKeys(getPropertyValue("userName"));
        passwordElement.sendKeys(getPropertyValue("pass"));
        loginButton.click();
    }
}
