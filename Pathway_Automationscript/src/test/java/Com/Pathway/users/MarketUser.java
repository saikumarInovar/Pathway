package Com.Pathway.users;

import Com.Pathway.webpages.Buildoutflow;
import Com.Pathway.webpages.CancelationPage;
import Com.Pathway.webpages.Homepage;
import Com.Pathway.webpages.Loginpage;
import Com.Pathway.webpages.Renewalflow;
import Testdata.DataRetrival;

public class MarketUser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	CancelationPage cancel = new CancelationPage();
	Renewalflow renewalpage = new Renewalflow();
	DataRetrival data = new DataRetrival();
	Buildoutflow buildout = new Buildoutflow();
	
	public void loginwithMarketUser()
	{
		String email = data.getUsername(1);
		String password = data.getPassword(1);
		login.doLogin(email, password);
	}
	
	public void cancelationRequest(int i)
	{
		String Txid = data.getColumn_1(i);
		String Rxid = data.getColumn_2(i);
		homepage.cancelationbutton();
		cancel.riseCancelationRequestWithMUuser(Txid, Rxid);
	}

	public void renewalrequest(int i)
	{
		String txid = data.getColumn_1(i);
		String rxid = data.getColumn_2(i);
		homepage.renewalbutton();
		renewalpage.renewalrequestwithmarketuser(txid, rxid);
	}
	public void buildoutrequest(int i, String date)
	{
		String txid = data.getColumn_1(i);
		String rxid = data.getColumn_2(i);
		homepage.Buildoutbutton();
		buildout.createnewbuildoutrequestwithMarketuser(txid, rxid, date);
	}
}
