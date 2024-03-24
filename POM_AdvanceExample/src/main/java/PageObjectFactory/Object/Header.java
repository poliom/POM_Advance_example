package PageObjectFactory.Object;

import PageObjectFactory.Factory.POMFactoryClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Header extends POMFactoryClass {

    public Header(WebDriver driver) {
        super(driver);
    }

    public void clickLogin(){
        loginLink.click();
    }

    public  void clickProfile(){
        WebDriverWait wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLink));
        profilePageLink.click();
    }
}
