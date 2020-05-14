package Com.Pathway.webpages;

import org.openqa.selenium.By;

import Com.Pathway.Base.BasePage;

public class Renewalflow extends BasePage
{
	private By createnewRenewalbutton = By.xpath("//*[@class='btn-grid approve create-cancel ml-0 mr-0 button-margin']");
	private By entertxidfiledforrenewal = By.xpath("//input[@placeholder='Enter TX Site ID']");
	private By enterrxidfieldforrenewal = By.xpath("//input[@placeholder='Enter RX Site ID']");
	private By searchbutton = By.cssSelector("#search-button");
	private By Marketuserchecklistbox = By.xpath("//div[@class='slick-cell l0 r0 true']//label");
	private By reasonlbl = By.className("reject-text");
	private By reasonforrenewal = By.xpath("//select[@class='ng-untouched ng-pristine ng-valid']");
	private By proceedbutton = By.xpath("//button[contains(text(),'PROCEED')]");
	private By renewalconfirmationbutton = By.xpath("(.//*[text()='YES'])[1]");
	private By okbuttonforrenewal = By.xpath("(.//*[text()='OK'])[1]");
	private By MDUchecklistboxforrenewal = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By approverenewalbutton = By.name("approveBtn:0");
	private By rejectrenewalbutton = By.name("rejectBtn:0");
	private By rejectreasonforrenewal = By.xpath("//select[@class='w-100 ng-untouched ng-pristine ng-valid']");
	private By rejectconfirmationbutton = By.xpath("(.//*[text()='YES'])[2]");
	private By mochekclistforrenewal = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By RPMchecklistforrenewal = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By NOCchecklistforrenewal = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By Legaluserchecklistforrenewal =By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By sendtofccforrenewalbutton = By.name("approveBtn:0");
	private By legaluserconfirmationbutton = By.xpath("(.//*[text()='YES'])[1]");
	
	
	public void renewalrequestwithmarketuser(String txid, String rxid)
	{
		click(createnewRenewalbutton);
		sleep();
		enterText(entertxidfiledforrenewal,txid );
		sleep();
		enterText(enterrxidfieldforrenewal, rxid);
		sleep();
		click(searchbutton);
		sleep();
		click(Marketuserchecklistbox);
		sleep();
		scrollintoelement(reasonlbl);
		sleep();
		select(reasonforrenewal, " Test Child Renewal Reason ");
		sleep();
		scrollintoelement(proceedbutton);
		sleep();
		click(proceedbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
		click(okbuttonforrenewal);
		sleep();
		
	}
	
	public void renewlapprovewithMDuser()
	{
		click(MDUchecklistboxforrenewal);
		sleep();
		click(approverenewalbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
	}
	
	public void rejectrenewalwithMDuser()
	{	
      click(MDUchecklistboxforrenewal);
      sleep();
      click(rejectrenewalbutton);
      sleep();
      select(rejectreasonforrenewal, "Test Child Renewal Reason");
      sleep();
      click(rejectconfirmationbutton);
      sleep();
}
	public void renewlapprovewithMOuser()
	{
		click(mochekclistforrenewal);
		sleep();
		click(approverenewalbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
	}
	
	public void rejectrenewalwithMOuser()
	{	
      click(mochekclistforrenewal);
      sleep();
      click(rejectrenewalbutton);
      sleep();
      select(rejectreasonforrenewal, "Test Child Renewal Reason");
      sleep();
      click(rejectconfirmationbutton);
      sleep();
}
	public void renewlapprovewithRPMuser()
	{
		click(RPMchecklistforrenewal);
		sleep();
		click(approverenewalbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
	}
	
	public void rejectrenewalwithRPMuser()
	{	
      click(RPMchecklistforrenewal);
      sleep();
      click(rejectrenewalbutton);
      sleep();
      select(rejectreasonforrenewal, "link no longer needed");
      sleep();
      click(rejectconfirmationbutton);
      sleep();
}
	public void renewlapprovewithNOCuser()
	{
		click(NOCchecklistforrenewal);
		sleep();
		click(approverenewalbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
	}
	
	public void rejectrenewalwithNOCuser()
	{	
      click(NOCchecklistforrenewal);
      sleep();
      click(rejectrenewalbutton);
      sleep();
      select(rejectreasonforrenewal, "link no longer needed");
      sleep();
      click(rejectconfirmationbutton);
      sleep();
}
	public void sendtoFCCforrenewalconnection()
	{
		click(Legaluserchecklistforrenewal);
		sleep();
		click(sendtofccforrenewalbutton);
		sleep();
		click(legaluserconfirmationbutton);
		sleep();
	}

} 
