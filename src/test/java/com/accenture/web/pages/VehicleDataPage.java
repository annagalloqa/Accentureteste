package com.accenture.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleDataPage {
	
	private WebDriver driver;

	public VehicleDataPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	static String title = "Enter Vehicle Data";
	static String make = "Audi";
	static String fuelType = "Electric Power";
	static String numberofSeats = "5";
	
	//Elementos
	@FindBy (id = "entervehicledata")
	private WebElement tabName;
	
	@FindBy (id = "make")
	private WebElement campoMake;
	
	@FindBy (id = "engineperformance")
	private WebElement campoEnginePerformance;
	
	@FindBy (id = "dateofmanufacture")
	private WebElement campoDateOfManufacture;

	@FindBy(id = "numberofseats")
	private WebElement campoNumberOfSeats;

	@FindBy(id = "fuel")
	private WebElement campoFuelType;

	@FindBy(id = "listprice")
	private WebElement campoListPrice;

	@FindBy(id = "licenseplatenumber")
	private WebElement campoLicensePlateNumber;

	@FindBy(id = "annualmileage")
	private WebElement campoAnnualMileage;

	@FindBy(id = "nextenterinsurantdata")
	private WebElement botaoNext;


	//Getters

	public String getTitle() {return title;}
	public String getMake() {return make;}
	public String getNumberofSeats(){return numberofSeats;}
	public String getFuelType(){return fuelType;}
	public WebElement getTabName(){return tabName;}
	public WebElement getCampoMake(){return campoMake;}
	public WebElement getCampoEnginePerformance(){return campoEnginePerformance;}
	public WebElement getCampoDateOfManufacture(){return campoDateOfManufacture;}
	public WebElement getCampoNumberOfSeats(){return campoNumberOfSeats;}
	public WebElement getBotaoNext(){return botaoNext;}
	public WebElement getCampoAnnualMileage(){return campoAnnualMileage;}
	public WebElement getCampoFuelType(){return campoFuelType;}
	public WebElement getCampoLicensePlateNumber(){return campoLicensePlateNumber;}
	public WebElement getCampoListPrice(){return campoListPrice;}
}
