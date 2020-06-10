package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //maximize window
        //driver.manage().window().maximize();

        //full screen mode
        //driver.manage().window().fullscreen();

        //set specific size
        //driver.manage().window().setSize(new Dimension(375, 812));



        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}