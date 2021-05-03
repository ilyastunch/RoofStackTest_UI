package com.roofstack.pages;

import com.roofstack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage {
    public ProductPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath="(//*[@class='post-title'])[3]")
    public WebElement leadProductTester;

    @FindBy(xpath="//*[@class='section-title full-width']")
    public WebElement head;


}
