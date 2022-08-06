package com.accenture.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurantDataPage {

	private WebDriver driver;

	public InsurantDataPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
    static String farmerOcuppation = "Farmer";
    static String brazilCountry = "Brazil";
    static String title = "Enter Insurant Data";
    
    //elementos
    @FindBy(id = "firstname") WebElement campoFirstName;
    @FindBy(id = "lastname") WebElement campoLastName;
    @FindBy(id = "birthdate") WebElement campoBirthDate;
    @FindBy(id = "genderfemale") WebElement campoGenderFemale;
    @FindBy(id = "streetaddress") WebElement campoStreetAdress;
    @FindBy(id = "country") WebElement campoCountry;
    @FindBy(id = "zipcode") WebElement campoZipCode;
    @FindBy(id = "city") WebElement campoCity;
    @FindBy(id = "occupation") WebElement campoOccupation;
    @FindBy (xpath = "//p[@class='group']//label[3]") WebElement campoCliffDiving;
    @FindBy(id = "website")WebElement campoWebSite;
    @FindBy(id = "open")WebElement botaoOpen;
    @FindBy(id = "nextenterproductdata") WebElement botaoNext;
    @FindBy(id = "enterinsurantdata") WebElement abaInsurantData;

    //getter
    public String getTitle(){return title;}
    public String getBrazilCountry(){return brazilCountry;}
    public String getFarmerOcuppation(){return farmerOcuppation;}
    public WebElement getAbaInsurantData() {return abaInsurantData;}
    public WebElement getCampoFirstName() {return campoFirstName;}
    public WebElement getCampoLastName() {return campoLastName;}
    public WebElement getCampoBirthDate() {return campoBirthDate;}
    public WebElement getCampoGenderFemale() {return campoGenderFemale;}
    public WebElement getCampoStreetAdress() {return campoStreetAdress;}
    public WebElement getCampoCountry() {return campoCountry;}
    public WebElement getCampoZipCode() {return campoZipCode;}
    public WebElement getCampoCity() {return campoCity;}
    public WebElement getCampoOccupation() {return campoOccupation;}
    public WebElement getcampoCliffDiving(){return campoCliffDiving;}
    public WebElement getCampoWebSite() {return campoWebSite;}
    public WebElement getBotaoOpen() {return botaoOpen;}
    public WebElement getBotaoNext() {return botaoNext;}
}
