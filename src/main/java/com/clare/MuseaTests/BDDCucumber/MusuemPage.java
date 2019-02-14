package com.clare.MuseaTests.BDDCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MusuemPage {
	@FindBy(xpath = "//*[@id=\"searchBoxId\"]")
	private WebElement searchBox;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/nav/div/div/div/div[2]/div/ul/li[4]")
	private WebElement contactNumber;

	public void clickSearchBar() {
		searchBox.click();
		
	}

	public void enterInfo(String arg1) {
	
		searchBox.sendKeys(arg1);
	}

	public boolean searchForDetails(WebDriverWait wait) {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div/div[2]/div[1]/ul/li[4]")));
		
		if(contactNumber.getText() != "") {
			return true;
		}
		
		return false;
	}
	

	
}
