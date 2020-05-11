package Com.Pathway.users;

import Com.Pathway.webpages.CancelationPage;
import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Testdata.DataRetrival;

public class RRMuser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	CancelationPage cancel = new CancelationPage();
	DataRetrival data = new DataRetrival();
	
	public void loginwithRRMUser()
	{
		String email = data.getUsername(3);
		String password = data.getPassword(3);
		
		login.doLogin(email, password);
	}
	
	public void CancelationrequestwithRRMuser(String statusoftheapplication)
	{
		homepage.cancelationbutton();
		
		if (statusoftheapplication.equals("Approved"))
		{
			cancel.approvecancelationwithRRMuser();
		}
		else {
			cancel.rejectcancelationwithRRMuser();
		}
	}
}
