package Com.Pathway.webpages;

import org.openqa.selenium.By;

import Com.Pathway.Base.BasePage;

public class LogoutPage extends BasePage
{
	private By accounticon = By.xpath("//img[@id='profile-img']");
	private By logoutbutton = By.xpath("//a[contains(text(),'Logout')]");
	
	public void logoutUser()
	{
		MOuseoverelement(accounticon);
		sleep();
		click(logoutbutton);
		sleep();
	}
}
