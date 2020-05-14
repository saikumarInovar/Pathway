package Com.Pathway.users;

import Com.Pathway.webpages.Buildoutflow;
import Com.Pathway.webpages.CancelationPage;
import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Com.Pathway.webpages.Renewalflow;
import Testdata.DataRetrival;

public class RPMuser 
{

	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	CancelationPage cancel = new CancelationPage();
	DataRetrival data = new DataRetrival();
	Renewalflow renewalpage = new Renewalflow();
	Buildoutflow buildout = new Buildoutflow();
	public void loginwithRPMUser()
	{
		String email = data.getUsername(2);
		String password = data.getPassword(2);
		
		login.doLogin(email, password);
	}
	
	public void CancelationrequestwithRPMuser(String statusoftheapplication)
	{
		homepage.cancelationbutton();
		
		if (statusoftheapplication.equals("Approved"))
		{
			cancel.approvecancelationwithRPMuser();
		}
		else {
			cancel.rejectcancelationwithRPMuser();
		}
	}
	
	public void RenewalrequetwithRPMuser(String statsuoftheapplication)
	{
		homepage.renewalbutton();
		if (statsuoftheapplication.equals("Approved"))
		{
			renewalpage.renewlapprovewithRPMuser();
		}
		else {
			renewalpage.rejectrenewalwithRPMuser();
		}
	}
	
	public void buildoutrequestwithRPMuser(String statusoftheapplication)
	{
		homepage.Buildoutbutton();
		if (statusoftheapplication.equals("Approved"))
		{
			buildout.buildoutrequestapprovewithRPMuser();
		}
		else {
			buildout.buildoutrequestrejectwithRPMuser();
		}
	}
}
