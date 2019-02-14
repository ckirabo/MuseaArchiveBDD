package com.clare.MuseaTests.BDDCucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//*[@id=\"topNavJS\"]/a[2]")
	private WebElement museumNavBar;
	
	public void navigateToMusuemPage() {
		museumNavBar.click();
	}
}
