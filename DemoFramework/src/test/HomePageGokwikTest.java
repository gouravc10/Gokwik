package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePageGokwik;
import Utils.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.This;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class HomePageGokwikTest extends BrowserConfiguration{

	
	
	@Test
	void logoTest() {
		HomePageGokwik hp = new HomePageGokwik(driver);
		hp.islogoDisplayed();
		
		
	}
	@Test
	void aboutUsPage() {
		HomePageGokwik hp = new HomePageGokwik(driver);
		hp.goToWhyGoKwik();
		hp.clickAboutUs();
		hp.isjourneySoFarTextDisplayed();
	
		
	}
	
	
}
