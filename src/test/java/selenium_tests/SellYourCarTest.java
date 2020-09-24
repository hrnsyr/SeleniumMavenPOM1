package selenium_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.SellYourCar;

public class SellYourCarTest {

    WebDriver driver=null;
    SellYourCar sell=null;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         sell = new SellYourCar(driver);
         driver.manage().window().maximize();
        driver.get("https://www.cars.com/");



    }

  @Test
    public void SellYourCarTest() throws InterruptedException {
        sell.sellclick();
//        sell.text9();

   }


}
