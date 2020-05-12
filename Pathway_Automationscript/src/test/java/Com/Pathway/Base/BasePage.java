package Com.Pathway.Base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Pathway.Drivermanager.DriverManager;



public class BasePage
{

	public static  WebDriver driver;
	final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(BasePage.class);

	public void geturl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void click(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}
	public void MOuseoverelement( By locator)
	{
		WebElement element = driver.findElement(locator);
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		
	}
	public void enterText(By locator, String text) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}

	public WebElement explicitWait(By locator) {
		return new WebDriverWait(driver, 70).until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void explicitWaitClickable(By locator) {
		new WebDriverWait(driver, 70).until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public void explicitWaitVisibility(By locator) {
		new WebDriverWait(driver, 70).until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
	}
	
	public void explicitWaitForHiddenElements(By locator) {
		new WebDriverWait(driver, 70).until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public Timeouts implicitWait() {
		return driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public Timeouts implicitWait(int sec) {
		return driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
	public void scrollDownBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}
	
	public void scrollUpBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500, 0);");
	}
	
	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

	public void scrollintoelement(By locator)
	{
		WebElement element = driver.findElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			logger.error(e.getMessage());
		}
	}
	
	
	public void select(String Value, By locator)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByValue(Value);
		sleep();
		
	}
	
	public void select(By locator, String VisibleText)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByVisibleText(VisibleText);
		sleep();
	}
	
	public void selectOnWait(By locator, String VisibleText)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		explicitWaitVisibility(locator);
		element.click();	
		s.selectByVisibleText(VisibleText);
		sleep();
	}
	
	public void selectExecutor(By locator, String VisibleText)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('taxons-list').click();");
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByVisibleText(VisibleText);
		sleep();
	}
	
	public void select(By locator, int Index)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByIndex(Index);
	}

	public void datepicker(By locator1, By locator2) {
		WebElement element= driver.findElement(locator1);
		element.click();
		List <WebElement> allDates = driver.findElements(locator2);
		for(WebElement wb : allDates) {
			String date= wb.getText();
			if(date.equalsIgnoreCase(date)) {
				wb.click();
				break;
			}
		}
	}
	
	public void init(String browsername)
	{
		if (browsername.equals("chrome")) 
		{
			driver = DriverManager.getChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = DriverManager.getFirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("IE")) 
		{
			driver = DriverManager.getIEDriver();
		}
		else if (browsername.equalsIgnoreCase("EDGE"))
		{
			driver = DriverManager.getedgedriver();
		}
		
		else if (browsername.equals("headlesschrome")) {
			driver = DriverManager.getHeadlessChromeDriver();
		}
		
		else {
			driver = DriverManager.getHeadlessFirefoxDriver();
		}
	}
	
	public boolean exists(By locator)
	{
		try { 
			return driver.findElement(locator).isDisplayed();
			
		}catch(Exception e) {
			logger.error("Locator not found "+e.getMessage());
		}
		
		return false;
	}

}
