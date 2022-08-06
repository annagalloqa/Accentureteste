package com.accenture.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductData {
	
	private WebDriver driver;

	public ProductData(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	static String title = "Enter Product Data";
    static String meritRating = "Super Bonus";
    static String damageInsurance = "Partial Coverage";
    static int CourtesyCar = 1;
    static int insuranceSum = 9;

    @FindBy (id = "startdate")
    WebElement campoStartDate;

    @FindBy (id = "insurancesum")
    WebElement campoInsuranceSum;

    @FindBy (id = "meritrating")
    WebElement campoMeritRating;

    @FindBy (id = "damageinsurance")
    WebElement campoDamageInsurance;

    @FindBy(xpath = "//section[3]/div[5]/p/label[1]")
    WebElement campoEuroProtection;

    @FindBy(id = "courtesycar")
    WebElement campoCourtesyCar;

    @FindBy(id = "nextselectpriceoption")
    WebElement nextselectpriceoption;

    public String getTitle(){return title;}
    public int getInsuranceSum(){return insuranceSum;}
    public String getMeritRating(){return meritRating;}
    public String getDamageInsurance() {return damageInsurance;}
    public int getCourtesyCar(){return CourtesyCar;}
    public WebElement getNextselectpriceoption(){return nextselectpriceoption;}
    public WebElement getCampoCourtesyCar(){return campoCourtesyCar;}
    public WebElement getCampoEuroProtection() {return campoEuroProtection;}
    public WebElement getCampoDamageInsurance() {return campoDamageInsurance;}
    public WebElement getCampoMeritRating() {return campoMeritRating;}
    public WebElement getCampoStartDate() {return campoStartDate;}
    public WebElement getCampoInsuranceSum() {return campoInsuranceSum;}
}
