package com.accenture.web.commons;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Commons {

	public String randomNumber(int upperBound, int lowerBound) {
		Random random = new Random();
		return String.valueOf(random.nextInt(upperBound - lowerBound) + lowerBound);
	}

	public String alterarDataFormatado(int date, int month, int year) {
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar gc = Calendar.getInstance();
		gc.add((GregorianCalendar.MONTH), month);
		gc.add((GregorianCalendar.DATE), date);
		gc.add((GregorianCalendar.YEAR), year);
		return sdf.format(gc.getTime());
	}
	
	 public String randomAlphabetic(int length){
	     return RandomStringUtils.randomAlphabetic(length);
	 }
	 
	 public String emailAleatorio(){
	        Random random = new Random();
	        String randomNumber = String.valueOf(random.nextInt(3)+1);
	        String randomAlphabetic = RandomStringUtils.randomAlphabetic(10);
	        return (randomAlphabetic+randomNumber+"@teste.com"); }
}
