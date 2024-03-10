package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class LoginPage extends Base_PO {

    private WebDriver driver = getDriver();

    private Login_PO login_po;

    public LoginPage(Login_PO login_po){
        this.login_po = login_po;
    }

    @Given("user access the webDriver university login page")
    public void user_access_the_web_driver_university_login_page() {
        login_po.navigateTo_WebLoginPage();
    }
    @When("user enter a username {}")
    public void user_enter_a_username(String username) {
        login_po.setUsername(username);
    }
    @And("user enter a password {}")
    public void user_enter_a_password(String password) {
        login_po.setPassword(password);
    }
    @And("user click on the button login")
    public void user_click_on_the_button_login() {
        login_po.clickOn_Login_Button();
    }
    @Then("user should be presented with a validation {}")
    public void user_should_be_presented_with_a_validation(String status) {
        login_po.waitForAlert_And_ValidateText(status);
    }
}
