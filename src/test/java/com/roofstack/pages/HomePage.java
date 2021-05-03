package com.roofstack.pages;

import com.roofstack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath="(//a[@class='nav-link dropdown-toggle'])[3]")
    public WebElement careerBtn;
}
