package Com.Pathway.webpages;

import org.openqa.selenium.By;

import Com.Pathway.Base.BasePage;

public class CancelationPage extends BasePage
{

private By createNewcancelationbutton = By.xpath(".//*[@class='btn-grid approve create-cancel ml-0 mr-0 button-margin']");
private By partialcancelation = By.xpath("//label[contains(text(),'Partial Cancellation')]");
private By fullCancelation = By.xpath("//label[contains(text(),'Full Cancellation')]");
private By txidfieldbox = By.xpath("//input[@placeholder='Enter TX Site ID']");
private By rxidfieldbox = By.xpath("//input[@placeholder='Enter RX Site ID']");
private By searchaccountforcancelation = By.cssSelector("#search-button");
private By CancelationchecklistboxforMU = By.xpath("//div[@class='slick-cell l0 r0 true']//label");
private By reasonlbl = By.className("reject-text");
private By selectreasondropdown = By.xpath("//select[@class='ng-untouched ng-pristine ng-valid']");
private By proceedbutton = By.xpath("//button[contains(text(),'PROCEED')]");
private By confirmationbutton = By.xpath("(.//*[text()='YES'])[1]");
private By requestOKbutton = By.xpath("(.//*[text()='OK'])[1]");
private By RPMuserchecklistbox = By.xpath("//body/app-root/app-cancellations/app-mu-cancellationsdatagrid/div[@class='container-fluid content']/div[@class='row m-0 p-0']/div[@class='main-content m-0 p-0']/div[@class='page-info']/div[@class='mv-tabs-container']/section[@id='tabs']/div[@class='w-100 m-0 p-0']/div[@class='col-xs-12 m-0 p-0']/app-admin-grid/div[@class='w-100 pl-3 pr-3']/div[@class='grid-component grid-component-primary grid-component-primary--pos']/angular-slickgrid/div[@id='slickGridContainer-grid4']/div[@id='grid4']/div[@class='slick-pane slick-pane-top slick-pane-left']/div[@class='slick-viewport slick-viewport-top slick-viewport-left']/div[@class='grid-canvas grid-canvas-top grid-canvas-left']/div[1]/div[1]");
private By approvebutton = By.name("approveBtn:0");
private By rejectbutton = By.name("rejectBtn:0");
private By selectreasonforrejection = By.xpath("//select[@class='w-100 ng-untouched ng-pristine ng-valid']");
private By rejectconfirmationbutton = By.xpath("//div[@class='modal-dialog reject-modal']//button[@class='btn-grid approve'][contains(text(),'YES')]");
private By RRMuserchecklistbox = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
private By NOCuserchecklistbox = By.xpath("//div[@class='slick-cell l0 r0 true']");
private By Leagluserchecklistbox = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
private By sendtoFCCbutton = By.xpath("//button[@name='approveBtn:0']");
private By legaluserconfirmationbutton = By.xpath("(.//*[text()='YES'])[1]");


public void riseCancelationRequestWithMUuser( String Txid, String Rxid)
{   click(createNewcancelationbutton);
	sleep();
	click(partialcancelation);
	sleep();
	enterText(txidfieldbox, Txid);
	sleep();
	enterText(rxidfieldbox, Rxid);
	sleep();
	click(searchaccountforcancelation);
	sleep();
	click(CancelationchecklistboxforMU);
	sleep();
	scrollintoelement(reasonlbl);
	sleep();
	select(selectreasondropdown, "Link no longer needed");
	sleep();
	scrollintoelement(proceedbutton);
	sleep();
	click(proceedbutton);
	sleep();
	click(confirmationbutton);
	sleep();
	click(requestOKbutton);
	sleep();
}

public void approvecancelationwithRPMuser()
{
	click(RPMuserchecklistbox);
	sleep();
	click(approvebutton);
	sleep();
	click(confirmationbutton);
	sleep();
}

public void rejectcancelationwithRPMuser()
{
	click(RPMuserchecklistbox);
	sleep();
	click(rejectbutton);
	sleep();
	select(selectreasonforrejection, "Link no longer needed");
	sleep();
	click(rejectconfirmationbutton);
	sleep();
}
public void approvecancelationwithRRMuser()
{
	click(RRMuserchecklistbox);
	sleep();
	click(approvebutton);
	sleep();
	click(confirmationbutton);
	sleep();
}

public void rejectcancelationwithRRMuser()
{
	click(RRMuserchecklistbox);
	sleep();
	click(rejectbutton);
	sleep();
	select(selectreasonforrejection, "Link no longer needed");
	sleep();
	click(rejectconfirmationbutton);
	sleep();
}
public void approvecancelationwithNOCuser()
{
	click(NOCuserchecklistbox);
	sleep();
	click(approvebutton);
	sleep();
	click(confirmationbutton);
	sleep();
}

public void rejectcancelationwithNOCuser()
{
	click(NOCuserchecklistbox);
	sleep();
	click(rejectbutton);
	sleep();
	select(selectreasonforrejection, "Link no longer needed");
	sleep();
	click(rejectconfirmationbutton);
	sleep();
}

public void sendtoFCCwithLegaluser()
{
	click(Leagluserchecklistbox);
	sleep();
	click(sendtoFCCbutton);
	sleep();
	click(legaluserconfirmationbutton);
	sleep();
}
}
