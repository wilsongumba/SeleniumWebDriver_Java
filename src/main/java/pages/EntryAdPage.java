package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {

    private WebDriver driver;
    private By closeButton = By.xpath(".//p[text()='Close']");
    private By enableAD = By.id("restart-ad");


    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCloseAdButton(){
        driver.findElement(closeButton).click();
    }

    public String getReEnableAdText(){
        return driver.findElement(enableAD).getText();
    }
}
