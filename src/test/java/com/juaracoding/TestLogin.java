package com.juaracoding;
import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(2);
        DriverSingleton.closeObjectInstance();
    }

    //TCC.HRM.001
    @Given("User enter url HRM")
    public void user_enter_url_hrm(){ //pakaisnakecase
        driver.get(Constants.URL);
    }

    @When("User input valid username")
    public void user_input_valid_username(){

        loginPage.inputUsername("Admin");
    }

   @And("User input valid password")
    public void user_input_valid_password(){
    loginPage.inputPassword("admin123");
    }

    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickBtnLogin();
    }

    @Then("User get text title page dashboard")
    public void user_get_text_title_page_dashboard(){
        Assert.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
    }

    //TCC.HRM.002
    @Given("User logout")
    public void user_logout(){
        loginPage.logout();
    }
    @When("User input invalid password")
    public void user_input_invalid_password(){
        loginPage.inputPassword("admin1234");
    }
    @Then("User get text invalid credential")
    public void user_get_text_invalid_credential(){
        Assert.assertEquals(loginPage.getTxtInvalid(), "Invalid credentials");
    }

    //TCC.HRM.003
    @Given("User input empty password")
    public void user_input_empty_password(){
        loginPage.inputPassword("");
    }
    @Then("User get text required")
    public void user_get_text_required(){
        Assert.assertEquals(loginPage.getTxtErrorMessage(), "Required");
    }

}
