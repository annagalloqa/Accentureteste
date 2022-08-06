package com.accenture.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuotePage {
	
	private WebDriver driver;

	public SendQuotePage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	public static String password = "Tosca!12345";

    @FindBy (id = "email") WebElement campoEmail;
    @FindBy (id = "phone") WebElement campoPhone;
    @FindBy (id = "username") WebElement campoUsername;
    @FindBy (id = "password") WebElement campoPassword;
    @FindBy (id = "confirmpassword") WebElement campoConfirm;
    @FindBy (id = "sendemail") WebElement botaoSend;
    @FindBy (xpath = "//h2") WebElement mensagemSucesso;

    public String getPassword(){return password;}
    public WebElement getBotaoSend() { return botaoSend;}
    public WebElement getCampoConfirm() { return campoConfirm;}
    public WebElement getCampoEmail() { return campoEmail;}
    public WebElement getCampoPhone() { return campoPhone;}
    public WebElement getCampoPassword() { return campoPassword;}
    public WebElement getCampoUsername() { return campoUsername;}
    public WebElement getMensagemSucesso() { return mensagemSucesso;}
}
