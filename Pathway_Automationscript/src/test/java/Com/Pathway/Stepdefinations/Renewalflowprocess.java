package Com.Pathway.Stepdefinations;

import Com.Pathway.Base.BasePage;
import Com.Pathway.constants.Pathwayconstants;
import Com.Pathway.users.LegalUser;
import Com.Pathway.users.MDuser;
import Com.Pathway.users.MOuser;
import Com.Pathway.users.MarketUser;
import Com.Pathway.users.NOCuser;
import Com.Pathway.users.RPMuser;
import Com.Pathway.webpages.Loginpage;
import Com.Pathway.webpages.LogoutPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Renewalflowprocess extends BasePage
{

	MarketUser markertuser = new MarketUser();
	RPMuser rpmuser = new RPMuser();
	MDuser mduser = new MDuser();
	MOuser mouser = new MOuser();
	NOCuser nocuser = new NOCuser();
	LegalUser legaluser = new LegalUser();
	Loginpage login = new Loginpage();
	LogoutPage logout = new LogoutPage();
@Given("^Enter Url of application into the \"([^\"]*)\" browsern for Renewal process$")
public void enter_Url_of_application_into_the_browsern_for_Renewal_process(String browsername) throws Throwable {
   init(browsername);
   geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
}

@When("^Market user loginwith valid credtinals for Renewal process$")
public void market_user_loginwith_valid_credtinals_for_Renewal_process() throws Throwable {
    markertuser.loginwithMarketUser();
    login.ClickYesbutton();
}

@Then("^Rise a Renewal  request with Marketuser (\\d+)$")
public void rise_a_Renewal_request_with_Marketuser(int i) throws Throwable {
   markertuser.renewalrequest(i);
}

@Then("^Logout MarketUser after rise a request for  Renewal process$")
public void logout_MarketUser_after_rise_a_request_for_Renewal_process() throws Throwable {
    logout.logoutUser();
}

@When("^MDU user login with valid credtinals for Renewal process$")
public void mdu_user_login_with_valid_credtinals_for_Renewal_process() throws Throwable {
   login.loginwithsecondaccount();
   mduser.loginwithMDuser();
}

@Then("^MDU user \"([^\"]*)\" Renewal signal$")
public void mdu_user_Renewal_signal(String arg1) throws Throwable {
    mduser.renewlrequetwithMDuser();
}

@Then("^Logout MDU user after check the status of Renewal request$")
public void logout_MDU_user_after_check_the_status_of_Renewal_request() throws Throwable {
   logout.logoutUser();
}

@When("^MO user login with valid credtinals for Renewal process$")
public void mo_user_login_with_valid_credtinals_for_Renewal_process() throws Throwable {
   login.loginwithThirdaccount();
   mouser.loginwithMouser();
}

@Then("^MO user \"([^\"]*)\" Renewal Signal$")
public void mo_user_Renewal_Signal(String statusofapplication) throws Throwable {
   
	mouser.renewalrequestwithMOuser(statusofapplication);
}

@Then("^Logout MO user after check the status of Renewal request$")
public void logout_MO_user_after_check_the_status_of_Renewal_request() throws Throwable {
   logout.logoutUser();
}

@When("^RPM user login with Valid credtinals for Renewal process$")
public void rpm_user_login_with_Valid_credtinals_for_Renewal_process() throws Throwable {
  login.loginwithFourthaccount();
  rpmuser.loginwithRPMUser();
}

@Then("^RPM user \"([^\"]*)\" Renewal signal$")
public void rpm_user_Renewal_signal(String statsuoftheapplication) throws Throwable {
   rpmuser.RenewalrequetwithRPMuser(statsuoftheapplication);
}

@Then("^Logout RPM user after suucesful check the status of Renewal Process$")
public void logout_RPM_user_after_suucesful_check_the_status_of_Renewal_Process() throws Throwable {
  logout.logoutUser();
}

@When("^NOC user login with Valid credtinals for Renewal process$")
public void noc_user_login_with_Valid_credtinals_for_Renewal_process() throws Throwable {
    login.loginwithfifthaccount();
    nocuser.loginwithNOCUser();
}

@Then("^NOC user \"([^\"]*)\" Renewal signal$")
public void noc_user_Renewal_signal(String statusoftheapplication) throws Throwable {
  nocuser.renewalrequestwithNOCuser(statusoftheapplication);
}

@Then("^Logout NOC user after suucesful check the status of Renewal Process$")
public void logout_NOC_user_after_suucesful_check_the_status_of_Renewal_Process() throws Throwable {
   logout.logoutUser();
}

@When("^LEGAL user login with valid credtinals for Renewal Process$")
public void legal_user_login_with_valid_credtinals_for_Renewal_Process() throws Throwable {
   login.loginwitsixthaccount();
   legaluser.loginwithLeaglUser();
}

@Then("^Request send to FCC with Legal user FOR Renewal PROCESS$")
public void request_send_to_FCC_with_Legal_user_FOR_Renewal_PROCESS() throws Throwable {
    legaluser.renewalrequestsendtoFCCwithLegalsuer();
}


@Then("^Logout LEGAL user after succesful Renewal Request Send to FCC$")
public void logout_LEGAL_user_after_succesful_Renewal_Request_Send_to_FCC() throws Throwable {
   logout.logoutUser();
}

}
