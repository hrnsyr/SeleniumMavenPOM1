package selenium_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.SellYourCar;
import pageobjects.Service;

public class ServiceTest {

    WebDriver driver=null;
    Service src=null;




    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     src=new Service(driver);
        driver.manage().window().maximize();
        driver.get("https://www.cars.com/");
    }

    @Test
    public void ServiceTest(){

        src.serviceandrepair();
    }
}
