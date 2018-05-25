package test.com.TestProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NaukriWindowHandling 
{


	@Test
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		String mainWindow = driver.getWindowHandle();
		Set<String> mupltipleWindow =driver.getWindowHandles();
		
		System.out.println(mupltipleWindow.size());
		
		for (String myWindow : mupltipleWindow) {
			
			if (!myWindow.equals(mainWindow)) {
				

				driver.switchTo().window(myWindow);
				
				driver.close();
				
			}
				
			Thread.sleep(5000);			
		
		}
		
	}
	
	@Test
	public void hash (){
		
		
	}
	
}
