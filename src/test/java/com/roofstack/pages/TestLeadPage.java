package com.roofstack.pages;

import com.roofstack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLeadPage {
    public TestLeadPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath="/html/body/main/div[3]/div/div[2]/div/div[1]/div/a/h3")
    public WebElement sendCV;

    @FindBy(id="email")
    public WebElement mailInput;

    @FindBy(xpath="//input[@id='file']")
    public WebElement chooseFile;

    @FindBy(xpath="//input[@id='btn_upload']")
    public WebElement submitBtn;






}
