package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private String topFrame = "frame-top";
    private WebDriver driver;
    private String leftFrameName = "frame-left";
    private String bottomFrameName = "frame-bottom";
    private By frameText = By.tagName("body");


    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTextFromLeftFrame(){
        switchToLeftFrame();
        String text = driver.findElement(frameText).getText();
        switchLeftToMainArea();
        return text;
    }

    public String getTextFromBottomFrame(){
        switchToBottomFrame();
        String text = driver.findElement(frameText).getText();
        switchBottomToMainArea();
        return text;
    }

    private void switchToLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrameName);
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrameName);
    }

    private void switchLeftToMainArea(){
        driver.switchTo().parentFrame();//exit frame Nest+1(left)
        driver.switchTo().parentFrame(); //exit nest(parent)
    }
    private void switchBottomToMainArea(){
        driver.switchTo().parentFrame(); //exit nest(parent)
    }
}
