package pageobjects;

import com.sun.tools.internal.xjc.model.CElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Research {

    WebDriver driver=null;

    public Research(WebDriver driver){
        this.driver=driver;

    }
    public void reasrch1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class=\"_1U4gk\"] [data-linkname=\"header-research\"]")).click();
    }

    public void SearchCriteria(String Dropdown, String text) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.cssSelector("[name='" + Dropdown +"']"));
        Select src=new Select(element);
        src.selectByVisibleText(text);

    }
    public void videoandserach(){
        driver.findElement(By.cssSelector("[class=\"_1U4gk\"] [data-linkname=\"header-news\"]")).click();
    }

    public void singup(){
        driver.findElement(By.cssSelector("[data-linkname=\"header-sign-up\"")).click();
    }

    public void singInfo(String email,String password,String confr) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[data-linkname=\"header-sign-up\"")).click();
        driver.findElement(By.cssSelector("[class=\"ng-pristine ng-valid\"]"));


    }


}
