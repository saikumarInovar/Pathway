package Com.Pathway.users;

import Com.Pathway.webpages.Buildoutflow;
import Com.Pathway.webpages.CancelationPage;
import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Com.Pathway.webpages.Renewalflow;
import Testdata.DataRetrival;

public class LegalUser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	CancelationPage cancel = new CancelationPage();
	DataRetrival data = new DataRetrival();
	Renewalflow  renewalpage = new Renewalflow();
	Buildoutflow buildout = new Buildoutflow();
	
	public void loginwithLeaglUser()
	{
		String email = data.getUsername(5);
		String password = data.getPassword(5);
		
		login.doLogin(email, password);
	}
	
	public void CancelationrequestwithLeagluser()
	{
		homepage.cancelationbutton();
		
		cancel.sendtoFCCwithLegaluser();
	}
	
	public void renewalrequestsendtoFCCwithLegalsuer()
	{
		homepage.renewalbutton();
		renewalpage.sendtoFCCforrenewalconnection();
	}
	public void sendtoFCCbuildrequestwithLegalsuer()
	{
		homepage.Buildoutbutton();
		buildout.sendtoFCCbuildoutrequest();
		
	}
	
	

}
