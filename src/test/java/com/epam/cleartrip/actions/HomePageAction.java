package com.epam.cleartrip.actions;

import com.epam.cleartrip.page.HomePage;
import com.epam.cleartrip.suitBase.BaseUtilityClearTrip;

public class HomePageAction extends BaseUtilityClearTrip {

	
	public void oneWayTripAction() {

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
		 pageobj.continueFinalPaymnt();
	}
	
}
