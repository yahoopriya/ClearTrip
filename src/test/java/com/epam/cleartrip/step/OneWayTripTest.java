package com.epam.cleartrip.step;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.epam.cleartrip.actions.HomePageAction;
import com.epam.cleartrip.page.HomePage;
import com.epam.cleartrip.suitBase.BaseUtilityClearTrip;

public class OneWayTripTest extends BaseUtilityClearTrip {
	
	 WebDriver driver = null;
	 
	 
	@Test
	public void onewayTrip() {
		
		
		HomePageAction homeactions = new HomePageAction();
		homeactions.oneWayTripAction();
		
		/*
		HomePage pageobj = new HomePage(getDriver());
		 pageobj .enterFromDest();
		 pageobj .enterToLocation();
		 pageobj.selectDateOfJourney();
		 pageobj .selectAdult();
		 pageobj .selectadultCount();
		 pageobj .searchFlight();	
		 pageobj.selectFirstFlight();
		 pageobj.clickPolicyCheck();
		 pageobj.continuePayment();
		 pageobj.enterEmail();
		 pageobj.ClickonContinue2();
		 pageobj.selectTitle();
		 pageobj.enterFirstName();
		 pageobj.enterLastName();
		 pageobj.enterMobileNo();
		 pageobj.continueFinalPaymnt();*/
		 
	}

}
