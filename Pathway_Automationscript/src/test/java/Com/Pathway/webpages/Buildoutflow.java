package Com.Pathway.webpages;

import org.openqa.selenium.By;

import Com.Pathway.Base.BasePage;

public class Buildoutflow extends BasePage
{
	private By createnewbuildoutbutton = By.xpath(".//*[@class='btn-grid approve create-cancel ml-0 mr-0 button-margin']");
	private By txidfiledbox = By.xpath("//input[@placeholder='Enter TX Site ID']");
	private By rxfieldboxforbuildout = By.xpath("//input[@placeholder='Enter RX Site ID']");
	private By searchidbutton = By.cssSelector("#search-button");
	private By marketuserchicklestbox = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By dateofcompletedlabel = By.xpath("//h2[contains(text(),'Date Completed')]");
	private By selectdatefieldbox = By.xpath("//input[@placeholder='Date To Complete']");
	private By proceedbuttonforbuildout = By.xpath("//button[contains(text(),'PROCEED')]");
	private By buildoutconfirmationbutton = By.xpath("(.//*[text()='YES'])[1]");
	private By okbutton = By.xpath("(.//*[text()='OK'])[1]");
	private By rpmchecklistbox = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By approvebuildoutbutton = By.name("approveBtn:0");
	private By rejectforbuildoutbutton = By.name("rejectBtn:0");
	private By selectrejectreasonforbuildout =By.xpath("//select[@class='w-100 ng-pristine ng-valid ng-touched']");
	private By rejectconfirmationbutton =By.xpath("(.//*[text()='YES'])[2]");
	private By noccheclistboxforbuildout = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By legalsuerchecklistbox = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By sendtofccbuildoutbutton = By.name("approveBtn:0");
	private By SendoutFCCconfirmatiobuttonforbuildout =By.xpath("(.//*[text()='YES'])[1]");
	
	public void createnewbuildoutrequestwithMarketuser(String txid, String rxid, String date)
	{
		click(createnewbuildoutbutton);
		sleep();
		enterText(txidfiledbox, txid);
		sleep();
		enterText(rxfieldboxforbuildout, rxid);
		sleep();
		click(searchidbutton);
		sleep();
		click(marketuserchicklestbox);
		sleep();
		scrollintoelement(dateofcompletedlabel);
		sleep();
		Cleartext(selectdatefieldbox);
		sleep();
		enterText(selectdatefieldbox, date);
		sleep();
		scrollintoelement(proceedbuttonforbuildout);
		sleep();
		click(proceedbuttonforbuildout);
		sleep();
		click(buildoutconfirmationbutton);
		sleep();
		click(okbutton);
		sleep();
		
		}
	
	public void buildoutrequestapprovewithRPMuser()
	{
		click(rpmchecklistbox);
		sleep();
		click(approvebuildoutbutton);
		sleep();
		click(buildoutconfirmationbutton);
		sleep();
	}
	public void buildoutrequestrejectwithRPMuser()
	{
		click(rpmchecklistbox);
		sleep();
		click(rejectforbuildoutbutton);
		sleep();
		select(selectrejectreasonforbuildout, "Link no longer needed");
		sleep();
		click(rejectconfirmationbutton);
		sleep();
	}
	
	public void buildoutrequestapprovewithNOCuser()
	{
		click(noccheclistboxforbuildout);
		sleep();
		click(approvebuildoutbutton);
		sleep();
		click(buildoutconfirmationbutton);
		sleep();
	}
	public void buildoutrequestrejectwithNOCuser()
	{
		click(noccheclistboxforbuildout);
		sleep();
		click(rejectforbuildoutbutton);
		sleep();
		select(selectrejectreasonforbuildout, "Link no longer needed");
		sleep();
		click(rejectconfirmationbutton);
		sleep();
	}
	public void sendtoFCCbuildoutrequest()
	{
		click(legalsuerchecklistbox);
		sleep();
		click(sendtofccbuildoutbutton);
		sleep();
		click(SendoutFCCconfirmatiobuttonforbuildout);
		sleep();
	}

	}

			
	
