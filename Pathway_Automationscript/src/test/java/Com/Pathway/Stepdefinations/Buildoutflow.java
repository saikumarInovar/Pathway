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

public class Buildoutflow extends BasePage
{

	MarketUser markertuser = new MarketUser();
	RPMuser rpmuser = new RPMuser();
	NOCuser nocuser = new NOCuser();
	LegalUser legaluser = new LegalUser();
	Loginpage login = new Loginpage();
	LogoutPage logout = new LogoutPage();
@Given("^Enter Url of application into the \"([^\"]*)\" browser for BUildOutrequest$")
public void enter_Url_of_application_into_the_browser_for_BUildOutrequest(String browsername) throws Throwable 
{
    init(browsername);
    geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
}

@When("^Market user loginwith valid credtinals for BUildOutrequest process$")
public void market_user_loginwith_valid_credtinals_for_BUildOutrequest_process() throws Throwable {
    markertuser.loginwithMarketUser();
    login.ClickYesbutton();
}

@Then("^Rise a BUildOut request with Marketuser (\\d+) with date \"([^\"]*)\"$")
public void rise_a_BUildOut_request_with_Marketuser(int i , String date) throws Throwable {
   markertuser.buildoutrequest(i, date);
   
}

@Then("^Logout MarketUser after rise a request for  BUildOut$")
public void logout_MarketUser_after_rise_a_request_for_BUildOut() throws Throwable {
   logout.logoutUser();
}

@When("^RPM user login with valid credtinals for BUildOut process$")
public void rpm_user_login_with_valid_credtinals_for_BUildOut_process() throws Throwable {
    login.loginwithsecondaccount();
    rpmuser.loginwithRPMUser();
}

@Then("^RPM user \"([^\"]*)\" BUildOut request signal$")
public void rpm_user_BUildOut_request_signal(String statusoftheapplication) throws Throwable {
    rpmuser.buildoutrequestwithRPMuser(statusoftheapplication);
}

@Then("^Logout RPM user after check the status of BUildOut request$")
public void logout_RPM_user_after_check_the_status_of_BUildOut_request() throws Throwable {
  logout.logoutUser();
}

@When("^NOC user login with valid credtinals for BUildOutrequest process$")
public void noc_user_login_with_valid_credtinals_for_BUildOutrequest_process() throws Throwable {
   login.loginwithThirdaccount();
   nocuser.loginwithNOCUser();
}

@Then("^NOC user \"([^\"]*)\" BUildOutrequest Signal$")
public void noc_user_BUildOutrequest_Signal(String statusoftheapplication) throws Throwable {
    nocuser.buildourequestwithNOCuser(statusoftheapplication);
}

@Then("^Logout NOC user after check the status of BUildOutrequest$")
public void logout_NOC_user_after_check_the_status_of_BUildOutrequest() throws Throwable {
    logout.logoutUser();
}

@When("^LEGAL user login with valid credtinals for BUildOutrequest$")
public void legal_user_login_with_valid_credtinals_for_BUildOutrequest() throws Throwable {
login.loginwithFourthaccount();
legaluser.loginwithLeaglUser();
}

@Then("^Request send to FCC with Legal user FOR BUildOutrequest$")
public void request_send_to_FCC_with_Legal_user_FOR_BUildOutrequest() throws Throwable {
   legaluser.sendtoFCCbuildrequestwithLegalsuer();
}

@Then("^Logout LEGAL user after succesful BUildOutrequest Send to FCC$")
public void logout_LEGAL_user_after_succesful_BUildOutrequest_Send_to_FCC() throws Throwable {
    logout.logoutUser();
}

}
