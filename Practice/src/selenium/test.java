package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class test {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver","C:/Users/vdv/Downloads/chromedriver_2.33/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testMethod() throws InterruptedException{
		
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		
		
		WebElement close = driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]"));
		
		WebElement txtsearch = driver.findElement(By.xpath("//input[contains(@class,'LM6RPg')]"));
		
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		close.click();
		
		
		txtsearch.sendKeys("iphone");
		txtsearch.sendKeys(Keys.ENTER);
		
            	
       
		
	
		
	}

}
