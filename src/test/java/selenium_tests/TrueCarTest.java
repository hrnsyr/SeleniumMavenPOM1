package selenium_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.TrueCarHomePage;

public class TrueCarTest {


    private WebDriver driver = null;
    private TrueCarHomePage trueCarHomePage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        trueCarHomePage = PageFactory.initElements(driver, TrueCarHomePage.class);
        driver.get("https://www.truecar.com");
    }


//    @Test
//    public void testtruecar() {
//        trueCarHomePage.shoppingBottom.click();
//        trueCarHomePage.mzd.click();
//        trueCarHomePage.FirstModel.click();



    }




