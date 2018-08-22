package com.epam.cleartrip.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.epam.cleartrip.suitBase.BaseUtilityClearTrip;

public class HomePage extends BaseUtilityClearTrip {

	String date = "Thu, 23 Aug, 2018";
	String fdest = "pune";
	String tolocation = "Nagpur, IN - Dr. Babasaheb Ambedkar (NAG)";
	String adultCount = "1";
	
	@FindBy(how=How.XPATH, using=".//input[@id='FromTag']")
	WebElement fromdest;
	
	@FindBy(how=How.XPATH, using=".//input[@id='ToTag']")
	WebElement todest;
	
	@FindBy(how=How.XPATH, using="//*[@id='DepartDate']")
	WebElement departdate;
	
	@FindBy(how=How.XPATH,using="//*[@id='Adults']")
	WebElement select_adult;
	
	@FindBy(how=How.XPATH,using="//input[@id=\"SearchBtn\"]")
	WebElement searchflightbutton;
	
	
	public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterFromDest(){
		
		fromdest.sendKeys(fdest);
	}
	
	public void enterToLocation() {
		
		todest.sendKeys(tolocation);
	}

    public void selectDateOfJourney(){
    	
    	departdate.sendKeys(date);
    }
    
    public void selectAdult(){
    	
    	select_adult.click();
    }

    public void selectadultCount() {
    	
    	selectAdultcountFJ(adultCount, select_adult);
    }
    
    public void searchFlight() {
    	
    	searchflightbutton.click();	
    }
    
}
