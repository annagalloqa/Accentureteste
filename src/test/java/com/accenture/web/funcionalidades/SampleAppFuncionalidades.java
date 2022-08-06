package com.accenture.web.funcionalidades;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.accenture.web.commons.Commons;
import com.accenture.web.pages.InsurantDataPage;
import com.accenture.web.pages.PriceOptionPage;
import com.accenture.web.pages.ProductData;
import com.accenture.web.pages.SendQuotePage;
import com.accenture.web.pages.VehicleDataPage;

public class SampleAppFuncionalidades {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	VehicleDataPage vehicleDataPage = new VehicleDataPage(driver);
	InsurantDataPage insurantDataPage = new InsurantDataPage(driver);
	ProductData productDataPage = new ProductData(driver);
	PriceOptionPage priceOptionPage = new PriceOptionPage(driver);
	SendQuotePage sendQuotePage = new SendQuotePage(driver);
	Commons common = new Commons();

	public void acessaSite(String site) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.manage().window().maximize();
		driver.get(site);
	}

	public boolean aguardarPor(String xpath, int segundos){
        boolean retorno;
        try{
            retorno = new WebDriverWait(driver, Duration.ofSeconds(segundos)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed();
        }catch (Exception e) {
            retorno = false;
        }
        return retorno;
    }
	
	private boolean temOpcoes(Select select){
        int tentativas = 0;
        boolean retorno = false;
        do{
            aguardarPor("//../NãoépraAchar!//" , 5);
            if (select.getOptions().size() > 0){
                retorno = true;
                break;
            }
        }while (tentativas < 3);
        return retorno;
    }
	
	public void selectCombo(String opcao, WebElement combobox) throws Exception {
		Select selecionar = new Select(combobox);
		if (combobox.isDisplayed()) {
			selecionar.selectByVisibleText(opcao);
		} else {
			throw new Exception("Não foi possível visualizar o elemento" + combobox);

		}
	}

	public void selecionarOpcaoComboboxPorPosicao(WebElement elemento, int posicao){
        Select combobox;
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
        new Actions(driver).moveToElement(elemento).perform();
        combobox = new Select(elemento);
        if (temOpcoes(combobox)){
            if (posicao < 0 ){
                combobox.selectByIndex(combobox.getOptions().size() - 1);
            }else{
                combobox.selectByIndex(posicao);
            }
        }else throw new IllegalStateException("O combobox não tinha opções.");
    }
	
	public void menuEnterVehicleData() throws Exception {

		wait.until(ExpectedConditions.titleIs(vehicleDataPage.getTitle()));
		driver.navigate().refresh();
		selectCombo(vehicleDataPage.getMake(), vehicleDataPage.getCampoMake());
		vehicleDataPage.getCampoEnginePerformance().sendKeys(common.randomNumber(2000, 1));
		vehicleDataPage.getCampoDateOfManufacture().sendKeys(common.alterarDataFormatado(0, -1, 0));
		selectCombo(vehicleDataPage.getNumberofSeats(), vehicleDataPage.getCampoNumberOfSeats());
		selectCombo(vehicleDataPage.getFuelType(), vehicleDataPage.getCampoFuelType());
		vehicleDataPage.getCampoListPrice().sendKeys(common.randomNumber(100000, 500));
		vehicleDataPage.getCampoAnnualMileage().sendKeys(common.randomNumber(100000, 100));
		vehicleDataPage.getBotaoNext().click();

	}

	public void menuEnterInsurantData() throws Exception {
		wait.until(ExpectedConditions.titleIs(insurantDataPage.getTitle()));
		insurantDataPage.getCampoFirstName().sendKeys(common.randomAlphabetic(10));
		insurantDataPage.getCampoLastName().sendKeys(common.randomAlphabetic(10));
		insurantDataPage.getCampoBirthDate().sendKeys(common.alterarDataFormatado(0, 0, -18));
		insurantDataPage.getAbaInsurantData().click();
		insurantDataPage.getCampoStreetAdress().sendKeys(common.randomAlphabetic(4));
		selectCombo(insurantDataPage.getBrazilCountry(), insurantDataPage.getCampoCountry());
		insurantDataPage.getCampoZipCode().sendKeys(common.randomNumber(80000, 40000));
		selectCombo(insurantDataPage.getFarmerOcuppation(), insurantDataPage.getCampoOccupation());
		insurantDataPage.getcampoCliffDiving().click();
		insurantDataPage.getBotaoNext().click();
	}

	public void menuEnterProductData() throws Exception {
		wait.until(ExpectedConditions.titleIs(productDataPage.getTitle()));
		productDataPage.getCampoStartDate().sendKeys(common.alterarDataFormatado(1, 1, 0));
		selecionarOpcaoComboboxPorPosicao(productDataPage.getCampoInsuranceSum(),
		productDataPage.getInsuranceSum());
		selectCombo(productDataPage.getMeritRating(), productDataPage.getCampoMeritRating());
		selectCombo(productDataPage.getDamageInsurance(), productDataPage.getCampoDamageInsurance());
		productDataPage.getCampoEuroProtection().click();
		selecionarOpcaoComboboxPorPosicao(productDataPage.getCampoCourtesyCar(),
		productDataPage.getCourtesyCar());
		productDataPage.getNextselectpriceoption().click();
	}
	
	public void menuSelectPriceOption(){
		wait.until(ExpectedConditions.titleIs(priceOptionPage.getTitle()));
        priceOptionPage.getPlanoUltimate().click();
        priceOptionPage.getBotaoNext().click();
    }
	
	public void menuSendQuote(){
        sendQuotePage.getCampoEmail().sendKeys(common.emailAleatorio());
        sendQuotePage.getCampoPhone().sendKeys(common.randomNumber(1111111111,11111111));
        sendQuotePage.getCampoUsername().sendKeys(common.randomAlphabetic(10));
        sendQuotePage.getCampoPassword().sendKeys(sendQuotePage.getPassword());
        sendQuotePage.getCampoConfirm().sendKeys(sendQuotePage.getPassword());
        sendQuotePage.getBotaoSend().click();
        }
	
	public void mensagemSucesso(String mensagemesperada){
        wait.until(ExpectedConditions.visibilityOf(sendQuotePage.getMensagemSucesso()));
        String mensagem = sendQuotePage.getMensagemSucesso().getText();
        Assert.assertEquals(mensagemesperada,mensagem);
        driver.close();
    }
}
