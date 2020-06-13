package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By emailConfirmation = By.cssSelector("#content.large-12.columns");

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getConfirmationText(){
        return driver.findElement(emailConfirmation).getText();
    }
}
