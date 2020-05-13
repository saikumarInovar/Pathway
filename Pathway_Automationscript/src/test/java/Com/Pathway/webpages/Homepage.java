
package Com.Pathway.webpages;

import org.openqa.selenium.By;

import Com.Pathway.Base.BasePage;

public class Homepage extends BasePage
{
 private By cancelationbutton = By.xpath("(.//*[@class='menu-items'])[2]");
 private By Renewalbutton = By.xpath("(.//*[@class='menu-items'])[3]");
 private By Buildooutbuuton = By.xpath("(.//*[@class='menu-items'])[4]");
 public void cancelationbutton()
 {
	 click(cancelationbutton);
	 sleep();
 }
 public void renewalbutton()
 {
	 click(Renewalbutton);
	 sleep();
 }
 public void Buildoutbutton()
 {
	 click(Buildooutbuuton);
	 sleep();
 }
}

