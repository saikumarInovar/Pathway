package Com.Pathway.users;

import Com.Pathway.webpages.CancelationPage;
import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Com.Pathway.webpages.Renewalflow;
import Testdata.DataRetrival;

public class NOCuser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	CancelationPage cancel = new CancelationPage();
	DataRetrival data = new DataRetrival();
	Renewalflow renewalpage = new Renewalflow();
	
	public void loginwithNOCUser()
	{
		String email = data.getUsername(4);
		String password = data.getPassword(4);
		
		login.doLogin(email, password);
	}
	
	public void CancelationrequestwithNOCuser(String statusoftheapplication)
	{
		homepage.cancelationbutton();
		
		if (statusoftheapplication.equals("Approved"))
		{
			cancel.approvecancelationwithNOCuser();
		}
		else {
			cancel.rejectcancelationwithNOCuser();
		}
	}
	public void renewalrequestwithNOCuser(String statusoftheapplication)
	{
		homepage.renewalbutton();		
		if (statusoftheapplication.equals("Approved"))
		{
			renewalpage.renewlapprovewithNOCuser();
		}
		else {
			renewalpage.rejectrenewalwithNOCuser();
		}
	}
}
