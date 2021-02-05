package com.vytrack.pages;


import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

//    @FindBy(xpath = "//td[text()='mbrackstone9@example.com'][@data-column-label='Email']")
//    public WebElement email;

    @FindBy(css=".input-widget")
    public WebElement pageNumber;

    public WebElement getContactEmail(String email){
        String xpath="//td[text()='"+email+"'][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }


}
