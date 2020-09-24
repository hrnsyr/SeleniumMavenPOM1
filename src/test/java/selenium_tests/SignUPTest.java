package selenium_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SingUpPage;

public class SignUPTest {
    private WebDriver driver = null;
    private SingUpPage sing = null;

    private JavascriptExecutor jav;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        jav=(JavascriptExecutor)driver;



        driver.manage().window().maximize();
        driver.navigate().to("https://cars.com");


        sing = PageFactory.initElements(driver, SingUpPage.class);
    }

    @Test
    public void verify() throws InterruptedException {
        sing.SignUp.click();
        Thread.sleep(2000);
        sing.lgn.click();
        Thread.sleep(3000);
        sing.SignEmail.sendKeys("ahshs@gmail.com");
        sing.SignPassword.sendKeys("hsakd");
        sing.login.click();
        Thread.sleep(3000);

        long height=(Long) jav.executeScript("return window.innerHeight;");
        Thread.sleep(3000);
        long width=(Long) jav.executeScript("return window.innerWidth;");
        System.out.println("The heigth is :" + height);
        System.out.println("The witdh is :" +width);
        Thread.sleep(2000);

        jav.executeScript("window.scrollBy(0,500);");
        Thread.sleep(3000);

        WebElement element=driver.findElement(By.cssSelector("[href='/about/']"));
        jav.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[href='/about/']")).click();
        


    }

}
