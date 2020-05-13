package Com.Pathway.users;

import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Com.Pathway.webpages.Renewalflow;
import Testdata.DataRetrival;

public class MDuser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	Renewalflow renewalpage = new Renewalflow();
	DataRetrival data = new DataRetrival();
	
	public void loginwithMDuser()
	{
		String email =data.getUsername(6);
		String password = data.getPassword(6);
		login.doLogin(email, password);
	}

	public void renewlrequetwithMDuser()
	{
		homepage.renewalbutton();
		renewalpage.renewlapprovewithMDuser();
		
	}
}
