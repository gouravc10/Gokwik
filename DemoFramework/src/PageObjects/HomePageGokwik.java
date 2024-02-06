package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageGokwik {
	
	WebDriver driver;
	
	public HomePageGokwik(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='header']/div/a/img")
	WebElement logo;
	public boolean islogoDisplayed() {
		
		return logo.isDisplayed();
	}
	@FindBy(xpath = "//a[contains(text(),'Why GoKwik')]")
	WebElement WhyGoKwik ;
	public void goToWhyGoKwik() {
		Actions ac = new Actions(driver);
		ac.moveToElement(WhyGoKwik).perform();
		
		
	}
	@FindBy(xpath = "//h4[contains(text(),'About Us')]")
	WebElement aboutUs ;
	public void clickAboutUs() {
		aboutUs.click();
		
		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Careers')]")
	WebElement careers ;
	public void clickCcareers() {
		careers.click();
		
		
	}
	@FindBy(xpath = "//*[contains(text(),'On our journey so far')]")
	WebElement journeySoFarText;
	public boolean isjourneySoFarTextDisplayed() {
		
		return logo.isDisplayed();
	}
	
}
