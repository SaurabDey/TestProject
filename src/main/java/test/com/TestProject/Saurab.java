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
			System.out.println("Check Merge Issues 1");
			driver.manage().window().maximize();
			System.out.println("Check Merge Issues 2");
			
			System.out.println("Check Merge Issues 3");
		}
		
		@Test
		public void f() throws InterruptedException
		{
             System.out.println("Vikas Changes");
			System.out.println("Saurab Changes");
			System.out.println("Vikas Changes");

			System.out.println("Saurab Changes");
			Thread.sleep(5000);

			System.out.println("Chaitanya Changes");

			WebElement ok = driver.findElement(By.xpath("//input[@type = 'button']"));
			System.out.println("Saurab Changes");
			ok.click();
			System.out.println("Saurab Changes");

		}
		

		@AfterTest
		public void afterTest(){

//			driver.quit();
		}

	

}
