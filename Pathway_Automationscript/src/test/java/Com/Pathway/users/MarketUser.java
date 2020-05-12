package Com.Pathway.users;

import Com.Pathway.webpages.CancelationPage;
import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Testdata.DataRetrival;

public class MarketUser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	CancelationPage cancel = new CancelationPage();
	DataRetrival data = new DataRetrival();
	
	public void loginwithMarketUser()
	{
		String email = data.getUsername(1);
		String password = data.getPassword(1);
		/*
		 * String email = data.getUsername(1); String password = data.getPassword(1);
		 * System.out.println(email); System.out.println(password);
		 */
		login.doLogin(email, password);
	}
	
	public void cancelationRequest(int i)
	{
		String Txid = data.getColumn_1(i);
		String Rxid = data.getColumn_2(i);
		homepage.cancelationbutton();
		cancel.riseCancelationRequestWithMUuser(Txid, Rxid);
	}

}
