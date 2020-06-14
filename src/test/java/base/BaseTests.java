package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}





//Run test after test(close browser and open new onw for each test

//package base;
//
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.chrome.ChromeDriver;
//        import org.testng.annotations.*;
//        import pages.HomePage;
//
//public class BaseTests {
//
//    private WebDriver driver;
//    protected HomePage homePage;
//
//    //@BeforeClass
//    @BeforeMethod
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/");
//        homePage = new HomePage(driver);
//    }
//
//    //@AfterClass
//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
//}












////without page object model (unencouraged)
//package base;
//
//        import org.openqa.selenium.By;
//        import org.openqa.selenium.Dimension;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WebElement;
//        import org.openqa.selenium.chrome.ChromeDriver;
//
//        import java.util.List;
//
//public class BaseTests {
//
//    private WebDriver driver;
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//
//        //maximize window
//        //driver.manage().window().maximize();
//
//        //full screen mode
//        //driver.manage().window().fullscreen();
//
//        //set specific size
//        //driver.manage().window().setSize(new Dimension(375, 812));
//
//
//        //find several elements and count
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        //find specific element by linktext
//        //driver.findElement(By.linkText("Inputs"));
//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();
//
//
//
//
//
//        System.out.println(driver.getTitle());
//
//        driver.quit();
//    }
//
//    public static void main(String args[]){
//        BaseTests test = new BaseTests();
//        test.setUp();
//    }
//}