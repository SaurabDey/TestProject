package test.com.TestProject;

import java.util.concurrent.TimeUnit;

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

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			System.out.println("Check Merge Issues 1");

			driver.manage().window().maximize();
			System.out.println("Check Merge Issues 2");
			
			System.out.println("Check Merge Issues 3");
		}
		
		@Test
		public void f() throws InterruptedException
		{


			System.out.println("Chaitanya Changes");

             System.out.println("Vikas Changes");
			System.out.println("SaurabI Modified Changes");
			System.out.println("VikasI modified Changes");


			Thread.sleep(5000);
			System.out.println("ChaitanyaI modified Changes");
			WebElement ok = driver.findElement(By.xpath("//input[@type = 'button']"));
			ok.click();

		}
		

		@AfterTest
		public void afterTest(){

//			driver.quit();
		}

	

}
