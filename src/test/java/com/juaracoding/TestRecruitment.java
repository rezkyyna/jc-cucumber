package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.juaracoding.utils.Constants;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestRecruitment {
    private static WebDriver driver;
    private static LoginPage loginPage;
    private static RecruitmentPage recruitmentPage;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage();
        recruitmentPage = new RecruitmentPage();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(2);
        DriverSingleton.closeObjectInstance();
    }

    @Given("User login")
    public void user_login(){
        loginPage.inputPassword("admin123");
    }
    @When("User click menu Recruitment")
    public void user_click_menu_Recruitment(){
        recruitmentPage.clickMenuRecruitment();
    }
    @And("User click tab vacancies")
    public void user_click_tab_vacancies(){
        recruitmentPage.clickTabVacancies();
    }
    @And("User click button add")
    public void user_click_button_add(){
    recruitmentPage.clickAddVacancy();
    }
    @And("User input vacancy name")
    public void user_input_vacancy_name(){
        recruitmentPage.inputVacancyName("juara coding");
    }
    @And("User input job title")
    public void user_input_job_title(){
        recruitmentPage.inputJobTitle("Account Assistant");
    }
    @And("User input hiring manager")
    public void user_input_hiring_manager(){
        recruitmentPage.inputHiringManager("Lisa Andrews");
    }

    @And("User click button save")
    public void user_click_button_save() {
        recruitmentPage.clickButtonSave();
    }
}
