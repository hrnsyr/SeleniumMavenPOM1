package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Service {

    public WebDriver driver=null;

    public Service(WebDriver driver) {
        this.driver=driver;

    }

    public void serviceandrepair(){
        driver.findElement(By.cssSelector("[class=\"_1U4gk\"] [data-linkname=\"header-service\"]")).click();
    }
}
