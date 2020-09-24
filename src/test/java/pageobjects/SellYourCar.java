package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SellYourCar {

   WebDriver driver=null;
    public SellYourCar(WebDriver driver){
       this.driver=driver;
    }

    public void sellclick() throws InterruptedException {
        Thread.sleep(2000);
//        Actions action=new Actions(driver);
//        action.moveToElement(driver.findElement(By.cssSelector("[class=\"_1U4gk\"] [data-linkname=\"header-sell\"]")));
        driver.findElement(By.cssSelector("[class=\"_1U4gk\"] [data-linkname=\"header-sell\"]")).click();

    }
    public void text9() throws InterruptedException {
        String expected="Get offers from dealers and sell your";
        Thread.sleep(2000);
        String actual=driver.findElement(By.cssSelector("[class=\"sell-product\"]:nth-of-type(2)")).getText();
      Assert.assertTrue(actual.contains(expected));
    }
}
