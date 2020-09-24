package selenium_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.Research;

public class researchtest {
    WebDriver driver=null;
    Research rest=null;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        rest=new Research(driver);
        driver.manage().window().maximize();
        driver.get("https://www.cars.com/");
    }
    @Test
    public void researctest() throws InterruptedException {
//        rest.reasrch1();
//        rest.SearchCretria("makeId","Toyota");
//        rest.SearchCretria("modelId","Camry");
//        rest.SearchCretria("year","2015");
//        rest.videoandserach();
        rest.singInfo("asdg@gmail.com","1234","1234");

    }
}
