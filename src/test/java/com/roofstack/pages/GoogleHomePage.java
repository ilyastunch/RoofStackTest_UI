package com.roofstack.pages;

import com.roofstack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
    public GoogleHomePage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath="//input[@class='gLFyf gsfi']")
    public WebElement searchInput;

    @FindBy(xpath="(//h3[@class='LC20lb DKV0Md'])[2]")
    public WebElement searchedItem;

}
