package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Navee;

public class Navee1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
	}
	@Test

		public void testing() throws InterruptedException
		{
		Navee ob=new Navee(driver);
		ob.test1();
		Thread.sleep(3000);
		ob.name();
		Thread.sleep(3000);
		ob.test2();
		Thread.sleep(3000);
		ob.test3();
		Thread.sleep(3000);
		ob.radio();
		Thread.sleep(3000);
		ob.test4();
		Thread.sleep(3000);
		ob.test5();
		
		
	}

}



