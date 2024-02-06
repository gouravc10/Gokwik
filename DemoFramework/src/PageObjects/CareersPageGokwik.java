package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPageGokwik {
	
	WebDriver driver;
	
	public CareersPageGokwik(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'See Our Open Positions')]")
	WebElement seeOurPositionsCTA ;
	public void clickseeOurPositionsCTAs() {
		seeOurPositionsCTA.click();
		
		
	}
	@FindBy(xpath = "//input[@id='kh-hiro-searchText']")
	WebElement searchJobRole ;
	public void enterJobSearchJobRole(String job) {
		searchJobRole.sendKeys(job);
		
		
	}
	@FindBy(xpath = "//h3[contains(text(),'SDET 1 ( Automation )')]")
	WebElement selectSDETAUTOMATION ;
	public void selectSDETAUTOMATION() {
		selectSDETAUTOMATION.click();
		
		
	}
	
	
}
