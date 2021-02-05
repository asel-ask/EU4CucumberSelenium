package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsPage extends BasePage {


    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

     @FindBy(xpath="//div[@class='btn btn-link dropdown-toggle']")
    public WebElement options;

     @FindBy(xpath = "//input[@type='number']")
    public WebElement pageNumber;

}