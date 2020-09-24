package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingUpPage {

    @FindBy(how = How.CSS, using = "[data-linkname=\"header-sign-up\"]")
    public WebElement SignUp;
     @FindBy(how=How.CSS,using = "[ng-click=\"tabLabelCtrl.open()\"]")
     public WebElement lgn;

    @FindBy(how = How.CSS,using = "[type='text']")
    public WebElement SignEmail;

    @FindBy(how = How.CSS,using = "[type='password']")
    public WebElement SignPassword;

    @FindBy(how = How.CSS,using = "[type='submit']")
    public WebElement login;






}
