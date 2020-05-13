package Com.Pathway.users;

import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Com.Pathway.webpages.Renewalflow;
import Testdata.DataRetrival;

public class MOuser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	DataRetrival data = new DataRetrival();
	Renewalflow renewalpage = new Renewalflow();
	
	public void loginwithMouser()
	{
		String email =data.getUsername(7);
		String password = data.getPassword(7);
		login.doLogin(email, password);
	}
	
	public void renewalrequestwithMOuser(String statusofapplication)
	{
		homepage.renewalbutton();
		if (statusofapplication.equals("Approved"))
		{
			renewalpage.renewlapprovewithMOuser();
		}
		else {
			renewalpage.rejectrenewalwithMOuser();
		}
	}


}
