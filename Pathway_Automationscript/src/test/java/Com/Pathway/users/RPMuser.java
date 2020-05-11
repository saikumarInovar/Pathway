package Com.Pathway.users;

import Com.Pathway.webpages.CancelationPage;
import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Testdata.DataRetrival;

public class RPMuser 
{

	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	CancelationPage cancel = new CancelationPage();
	DataRetrival data = new DataRetrival();
	
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
}
