package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise1 {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());

        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();

        WebElement example1MenuElements = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1MenuElements.click();

        List<WebElement> menuElements = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuElements.size());

        driver.quit();

    }

    public static void main(String args[]){
        Exercise1 test = new Exercise1();
        test.setUp();
    }
}




//you can also comment above code and run this

//public class Exercise1 {
//
//    private WebDriver driver;
//
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//
//        driver.findElement(By.linkText("Shifting Content")).click();
//        driver.findElement(By.linkText(("Example 1: Menu Element"))).click();
//        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
//        System.out.println("Number of menu items: " + menuItems.size());
//
//        driver.quit();
//    }
//
//    public static void main(String args[]){
//        Exercise1 test = new Exercise1();
//        test.setUp();
//    }
//}
