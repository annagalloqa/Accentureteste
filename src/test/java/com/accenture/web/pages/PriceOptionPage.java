package com.accenture.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceOptionPage {
	
	private WebDriver driver;

	public PriceOptionPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	static String title = "Select Price Option";
    @FindBy (xpath = "//th[@colspan='4']//label[4]") WebElement planoUltimate;
    @FindBy (id = "nextsendquote") WebElement botaoNext;

    public String getTitle(){return title;}
    public WebElement getBotaoNext() {return botaoNext;}
    public WebElement getPlanoUltimate() {return planoUltimate;}
}
