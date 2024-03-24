package PageObjectFactory.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMFactoryClass {
    public final WebDriver webDriver;
    @FindBy(id = "nav-link-login")
    public WebElement loginLink;
    @FindBy(id = "nav-link-profile")
    public WebElement profilePageLink;
    @FindBy(id ="defaultLoginFormUsername")
    public WebElement usernameTextField;
    @FindBy(xpath = "//form/input[@id='defaultLoginFormPassword']")
    public WebElement passwordTextField;
    @FindBy(xpath = "//*[@class='remember-me']/input[@type='checkbox']")
    public WebElement rememberMeCheckbox;
    @FindBy(id = "sign-in-button")
    public WebElement signInButton;

    public POMFactoryClass(WebDriver driver){
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }
}
