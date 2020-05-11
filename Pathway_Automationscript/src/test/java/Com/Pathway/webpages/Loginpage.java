package Com.Pathway.webpages;

import org.openqa.selenium.By;

import Com.Pathway.Base.BasePage;

public class Loginpage extends BasePage
{
	private By Emailfieldbox = By.id("i0116");
	private By Nextbuttonforsignin = By.id("idSIButton9");
	private By Passwordfiledbox = By.id("i0118");
	private By signinbutton = By.cssSelector("#idSIButton9");
	private By Yesbutton = By.xpath("#idSIButton9");
	private By loginsecondaccount = By.xpath("(.//*[@data-bind='imgSrc'])[3]");
	private By loginwiththirdaccount = By.xpath("(.//*[@data-bind='imgSrc'])[5]");
	private By loginwithfourthaccount = By.xpath("(.//*[@data-bind='imgSrc'])[7]");
	private By loginwithfifthaccount = By.xpath("(.//*[@data-bind='imgSrc'])[9]");
	
	
	public void doLogin( String email, String password)
	{
		enterText(Emailfieldbox, email);
		sleep();
		click(Nextbuttonforsignin);
		sleep();
		enterText(Passwordfiledbox, password);
		sleep();
		click(signinbutton);
		sleep();
	}
	public void ClickYesbutton()
	{
		click(Yesbutton);
		sleep();
	}
	
	public void loginwithsecondaccount()
	{
		click(loginsecondaccount);
		sleep();
	}
	public void loginwithThirdaccount()
	{
		click(loginwiththirdaccount);
		sleep();
	}
	public void loginwithFourthaccount()
	{
		click(loginwithfourthaccount);
		sleep();
	}
	
	public void loginwithfifthaccount()
	{
		click(loginwithfifthaccount);
		sleep();
	}

}
