package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By sliderResult = By.cssSelector(".sliderContainer span#range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void pressArrows(){
        driver.findElement(slider).sendKeys(Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT));
    }

    public String  getNumber(){
        return driver.findElement(sliderResult).getText();
    }
}
