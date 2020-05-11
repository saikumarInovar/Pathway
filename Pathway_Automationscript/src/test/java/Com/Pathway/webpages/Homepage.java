
package Com.Pathway.webpages;

import org.openqa.selenium.By;

import Com.Pathway.Base.BasePage;

public class Homepage extends BasePage
{
 private By cancelationbutton = By.xpath("(.//*[@class='menu-items'])[2]");
 
 public void cancelationbutton()
 {
	 click(cancelationbutton);
	 sleep();
 }
}
