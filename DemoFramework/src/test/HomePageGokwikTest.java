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

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class HomePageGokwikTest {
	WebDriver driver;
	
	
	@BeforeTest
	void initsetup() {
		System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		
	}
	
	@BeforeClass
	void getURL() {
		
		driver.get("https://www.gokwik.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
		
	}
	
	@BeforeMethod
	public void setDriver(ITestContext context){

	  context.setAttribute("driver", driver);
	}
	
	@Test
	void logoTest() {
		HomePageGokwik hp = new HomePageGokwik(driver);
		hp.islogoDisplayed();
		hp.goToWhyGoKwik();
		
	}
	
	
}
