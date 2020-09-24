package pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class UdemyClass {

    private WebDriver driver = null;
    private JavascriptExecutor jav;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        jav = (JavascriptExecutor) driver;
        driver.get("https://letskodeit.teachable.com");
//        jav.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
//    }
//
//    @Test
//    public void testing() throws InterruptedException {
//        driver.findElement(By.cssSelector("[class='fedora-navbar-link navbar-link']")).click();
//        Thread.sleep(2000);
//
////        String parentHandel = driver.getWindowHandle();
////        WebElement elemnet = driver.findElement(By.id("openwindow"));
////        elemnet.click();
//
////        Set<String> handles = driver.getWindowHandles();
//
////        for (String hand : handles) {
////            System.out.println("Handles is :" + hand);
////            if (!hand.equals(parentHandel)) {
////                driver.switchTo().window(hand);
////                WebElement el = driver.findElement(By.id("search-courses"));
////                el.sendKeys("pyhton");
////                Thread.sleep(3000);
////
////                break;
////
////            }
////           driver.switchTo().window(parentHandel);
////            Thread.sleep(2000);
////       }
//        Thread.sleep(2000);
//        long heigth = (Long) jav.executeScript("return window.innerHeight;");
//        Thread.sleep(2000);
//        long width = (Long) jav.executeScript("return window.innerWidth;");
//        System.out.println("The heigth is :" + heigth);
//        System.out.println("The width is :" + width);
//
//        driver.switchTo().frame("courses-iframe");
//        Thread.sleep(3000);
//        driver.findElement(By.id("search-courses")).sendKeys("python");
//        driver.switchTo().defaultContent();
//
//        Thread.sleep(3000);
//        driver.findElement(By.id("name")).sendKeys("Test succuseful");
//        Thread.sleep(2000);
//        WebElement element = driver.findElement(By.id("mousehover"));
//        Actions action = new Actions(driver);
//        Thread.sleep(2000);
//        action.moveToElement(element).perform();
//        driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Reload']")).click();
    }
    @Test
    public void newtest() throws InterruptedException {

//        driver.findElement(By.xpath("//a[contains(@href,'sign_in')]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("user_email")).sendKeys("test@email.com");
//        Thread.sleep(5000);
//        driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);
//        driver.findElement(By.id("user_password")).sendKeys("123123");
//        Thread.sleep(2000);
//        driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class='fedora-navbar-link navbar-link']")).click();
        Thread.sleep(5000);
       driver.findElement(By.id("openwindow")).sendKeys(Keys.COMMAND + "a");

    }



}