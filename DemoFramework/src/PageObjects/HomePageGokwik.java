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
	
	@FindBy(xpath = "//*[@id='header']/div/a/im")
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
	
}
