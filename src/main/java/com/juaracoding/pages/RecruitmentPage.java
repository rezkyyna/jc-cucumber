package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

    private WebDriver driver;

    public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator
    @FindBy(xpath = "///span[normalize-space()='Recruitment']")
    private WebElement menuRecruitment;
    @FindBy(xpath = "//a[normalize-space()='Vacancies']")
    private WebElement tabVacancies;
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement btnAdd;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
    private WebElement vacancyName;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement jobTitle;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement hiringManager;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;



    public void clickMenuRecruitment(){
    menuRecruitment.click();
    }

    public void clickTabVacancies(){
    tabVacancies.click();
    }
    public void clickAddVacancy(){
        btnAdd.click();
    }
    public void inputVacancyName(String vacancyName){
    this.vacancyName.sendKeys(vacancyName);
    }
    public void inputJobTitle(String jobTitle){
    this.jobTitle.sendKeys(jobTitle);
    }
    public void inputHiringManager(String hiringManager){
    this.hiringManager.sendKeys(hiringManager);
    }
    public void clickButtonSave(){
    btnSave.click();
    }

    public void vacanciesForm(){
        tabVacancies.click();
        btnAdd.click();
        vacancyName.sendKeys("Test");
        jobTitle.sendKeys("Chief Financial Officer");
        hiringManager.sendKeys("Sara Tencrady");
        btnSave.click();

}


}


