package Com.Pathway.Stepdefinations;

import Com.Pathway.Base.BasePage;
import Com.Pathway.constants.Pathwayconstants;
import Com.Pathway.users.LegalUser;
import Com.Pathway.users.MarketUser;
import Com.Pathway.users.NOCuser;
import Com.Pathway.users.RPMuser;
import Com.Pathway.users.RRMuser;
import Com.Pathway.webpages.Loginpage;
import Com.Pathway.webpages.LogoutPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cancelationflow extends BasePage
{
	MarketUser markertuser = new MarketUser();
	RPMuser rpmuser = new RPMuser();
	RRMuser rrmuser = new RRMuser();
	NOCuser nocuser = new NOCuser();
	LegalUser legaluser = new LegalUser();
	Loginpage login = new Loginpage();
	LogoutPage logout = new LogoutPage();
	@Given("^Enter Url of application into the \"([^\"]*)\" browser$")
	public void enter_Url_of_application_into_the_browser(String browsername) throws Throwable 
	{
		init(browsername);
		geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
	}

	@When("^Market user loginwith valid credtinals for Cancelation process$")
	public void market_user_loginwith_valid_credtinals_for_Cancelation_process()  
	{
	    markertuser.loginwithMarketUser();
	    login.ClickYesbutton();
	    
	    
	}

	@Then("^Rise a Cancelation request with Marketuser (\\d+)$")
	public void rise_a_Cancelation_request_with_Marketuser(int i) throws Throwable {
	    markertuser.cancelationRequest(i);
	}

	@Then("^Logout MarketUser after rise a request for  Cancelation$")
	public void logout_MarketUser_after_rise_a_request_for_Cancelation() throws Throwable {
	    logout.logoutUser();
	}

	@When("^RPM user login with valid credtinals for Cancelation process$")
	public void rpm_user_login_with_valid_credtinals_for_Cancelation_process() throws Throwable 
	{
		login.loginwithsecondaccount();
	    rpmuser.loginwithRPMUser();
	}

	@Then("^RPM user \"([^\"]*)\" Cancelation signal$")
	public void rpm_user_Cancelation_signal(String statusoftheapplication) throws Throwable 
	{
		
	 rpmuser.CancelationrequestwithRPMuser(statusoftheapplication);
	}

	@Then("^Logout RPM user after check the status of cancelation request$")
	public void logout_RPM_user_after_check_the_status_of_cancelation_request() throws Throwable {
		logout.logoutUser();
	}

	@When("^RRM user login with valid credtinals for Cancelation process$")
	public void rrm_user_login_with_valid_credtinals_for_Cancelation_process() throws Throwable {
	    login.loginwithThirdaccount();
	    rrmuser.loginwithRRMUser();
	}

	@Then("^RRM user \"([^\"]*)\" Cancelation Signal$")
	public void rrm_user_Cancelation_Signal(String statusoftheapplication) throws Throwable {
	  rrmuser.CancelationrequestwithRRMuser(statusoftheapplication);
	}

	@Then("^Logout RRM user after check the status of cancelation request$")
	public void logout_RRM_user_after_check_the_status_of_cancelation_request() throws Throwable {
	   logout.logoutUser();
	}

	@When("^NOC user login with Vlaid credtinals for Cancletaion process$")
	public void noc_user_login_with_Vlaid_credtinals_for_Cancletaion_process() throws Throwable {
	   login.loginwithFourthaccount();
	   nocuser.loginwithNOCUser();
	}

	@Then("^NOC user \"([^\"]*)\" Cancelation signal$")
	public void noc_user_Cancelation_signal(String statusoftheapplication) throws Throwable {
	    nocuser.CancelationrequestwithNOCuser(statusoftheapplication);
	}

	@Then("^Logout NOC user after suucesful check the status of Cancelation Process$")
	public void logout_NOC_user_after_suucesful_check_the_status_of_Cancelation_Process() throws Throwable {
	    logout.logoutUser();
	}

	@When("^LEGAL user login with valid credtinals for Cancelation Process$")
	public void legal_user_login_with_valid_credtinals_for_Cancelation_Process() throws Throwable {
	    login.loginwithfifthaccount();
	    legaluser.loginwithLeaglUser();
	}

	@Then("^Request send to FCC with Legal user$")
	public void request_send_to_FCC_with_Legal_user() throws Throwable {
	    legaluser.CancelationrequestwithLeagluser();
	}

	@Then("^Logout LEGAL user after succesful Cancelation Request Send to FCC$")
	public void logout_LEGAL_user_after_succesful_Cancelation_Request_Send_to_FCC() throws Throwable {
	   logout.logoutUser();
	}



}
