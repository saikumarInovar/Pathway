package Com.Pathway.users;

import Com.Pathway.webpages.CancelationPage;
import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Testdata.DataRetrival;

public class LegalUser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	CancelationPage cancel = new CancelationPage();
	DataRetrival data = new DataRetrival();
	
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

}
