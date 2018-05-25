package test.com.TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saurab {

	WebDriver driver;
		@BeforeTest
		public void beforeTest() 
		{
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver= new  ChromeDriver();
			driver.get("http://output.jsbin.com/usidix/1");
			driver.manage().window().maximize();
		}
		
		@Test
		public void f() throws InterruptedException
		{
			Thread.sleep(5000);
			WebElement ok = driver.findElement(By.xpath("//input[@type = 'button']"));
			ok.click();
		}

		@AfterTest
		public void afterTest(){

//			driver.quit();
		}

	

}
