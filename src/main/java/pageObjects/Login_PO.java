package pageObjects;

import Utils.Global_Vars;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("All")
public class Login_PO extends Base_PO{
    private @FindBy (xpath = "//input[@id='text']")
    WebElement username_TextField;

    private @FindBy (xpath = "//input[@id='password']")
    WebElement password_TextField;

    private @FindBy (xpath = "//button[@id='login-button']")
    WebElement login_Button;

    public Login_PO() {
        super();
    }

    public void navigateTo_WebLoginPage () {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNVERSITY_URL + "/Login-Portal/index.html?");
    }

    public void setUsername(String username){
        sendKeys(username_TextField,username);
    }

    public void setPassword(String password){
        sendKeys(password_TextField,password);
    }

    public void clickOn_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }

}
