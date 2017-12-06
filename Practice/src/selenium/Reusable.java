package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {
	
	public  WebDriver driver;

	public  WebDriverWait wait;
	
	
	public  WebElement returnElementIfPresent(By element,String varElementDesc) throws Exception {

		WebElement webElement = null;	
		try {
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
			scrollToView(webElement);	
		} catch (NoSuchElementException exception) {
			//report.updateTestLog("Checking " + varElementDesc, varElementDesc+ " NOT Displayed", Status.FAIL);
			System.out.println("RESULT: FAIL - Unable to locate " + element	+ " Please check and update UIMap file");
			throw exception;
		}
		return webElement;		
	}
	
	@SuppressWarnings("unchecked")
	public  void scrollToView(WebElement element){
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		je.executeScript("window.scrollBy(0,-100)", "");
	}
	
	
	public  void clickCustomize(By element, String elementDesc) throws Exception {
		try {
			returnElementIfPresent(element, elementDesc).click();			
		} catch (Exception e) {
			
			throw e;
		}
	}

}
