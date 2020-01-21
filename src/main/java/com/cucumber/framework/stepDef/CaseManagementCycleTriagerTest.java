package com.cucumber.framework.stepDef;




import org.apache.log4j.Logger;

import com.cucumber.framework.GeneralHelperSel.LoggerHelper;
import com.cucumber.framework.PageObjects.CaseManagementCycleTriagerPage;
import com.cucumber.framework.PageObjects.CommonPage;
import com.cucumber.framework.PageObjects.OneFlowLoginPage;
import com.cucumber.framework.configreader_TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseManagementCycleTriagerTest {

	private final Logger log = LoggerHelper.getLogger(CaseManagementCycleTriagerTest.class);
	
	public String subject;

	CaseManagementCycleTriagerPage caseManagementCycleTriagerPage;
	OneFlowLoginPage oneFlowLoginPage;
	CommonPage commonPage;
	
	

	/*#############################################################################
	 * Author : Babu
	 * Scenario outlook & browser lunch
	 * #############################################################################*/
	
	@Given("^Open the browser and navigate to particular url$")
	public void open_the_browser_and_navigate_to_particular_url() throws Throwable {
		OneFlowLoginPage.LaunchQBEApp();
	}
	
	/*#############################################################################
	 * Author : Babu
	 * Scenario application login
	 * #############################################################################*/

	@When("^I enter valid username  \"([^\"]*)\" and \"([^\"]*)\" click on Login button$")
	public void i_enter_valid_username_and_click_on_Login_button(String usernamefield, String passwordfield)
			throws Throwable {
		
		Thread.sleep(3000);
		OneFlowLoginPage.applogin(usernamefield, passwordfield);
		
	}
	
	/*#############################################################################
	 * Author : Babu
	 * Scenario login application
	 * #############################################################################*/

	@Then("^Login should be successfully completed$")
	public void login_should_be_successfully_completed() throws Throwable {
		System.out.println("Login succussfully completed");
		Thread.sleep(15000);
		

		
	}
	
	/*#############################################################################
	 * Author : Babu
	 * Scenario Complex WB
	 * #############################################################################*/

	@When("^verify cases routing to complex workbasket$")
	public void verify_cases_routing_to_complex_workbasket() throws Throwable {
		caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
		caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
		caseManagementCycleTriagerPage.clickonComplexWB();
	}
	
	/*#############################################################################
	 * Author : Babu
	 * Scenario case information screen
	 * #############################################################################*/

	@When("^click on case when user navigate to list of cases screen$")
	public void click_on_case_when_user_navigate_to_list_of_cases_screen() throws Throwable {
		CaseManagementCycleTriagerPage.informationNotedisplay();
	}
	
	/*#############################################################################
	 * Author : Babu
	 * Scenario information note 
	 * #############################################################################*/

	@Then("^verify information note available at top of the page$")
	public void verify_information_note_available_at_top_of_the_page() throws Throwable {
		System.out.println("verify information note text for complex work basket");

	}
	
	/*#############################################################################
	 * Author : Babu
	 * Scenario Exception WB & Complex WB information Note
	 * #############################################################################*/

	@When("^verify information note for ExceptionWB cases$")
	public void verify_information_note_for_ExceptionWB_cases() throws Throwable {
		CaseManagementCycleTriagerPage.informationNotedisplay();
		
	}
	
	@When("verify information note for ComplexWB cases")
	public void verify_information_note_for_ComplexWB_cases() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		CaseManagementCycleTriagerPage.informationNotedisplay();
	}
	
	/*#############################################################################
	 * Author : Babu
	 * Scenario logout application
	 * #############################################################################*/
	
	@Then("^click on logout link and close the browser$")
	public void click_on_logout_link_and_close_the_browser() throws Throwable {
		OneFlowLoginPage.applogout();
	    
	}
	
	/*#############################################################################
	 * Author : Babu
	 * Scenario get Nextwork
	 * #############################################################################*/
	
	@When("^validate get nextwork flow and case should be resolved$")
	public void validate_get_nextwork_flow_and_case_should_be_resolved() throws Throwable {
		caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
		caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
		caseManagementCycleTriagerPage.getNext_work();
	}
	
	/*#############################################################################
	 * Author : Babu
	 * Scenario Reassign work triager to cso or workbasket 
	 * #############################################################################*/
	
	@When("validate Reassign to Workbasket or worklist or operator")
	public void validate_Reassign_to_Workbasket_or_worklist_or_operator() throws Exception {
		caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
		caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
		caseManagementCycleTriagerPage.reassignwork();
	    
	}

	
	@Then("Open the case and verify the case is routed to complex work basket with {string} and {string}")
	public void open_the_case_and_verify_the_case_is_routed_to_complex_work_basket_with_and(String keywordinsubject, String policyorquotenoinsubject) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		subject = keywordinsubject + " " + policyorquotenoinsubject;
		caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
		caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
		caseManagementCycleTriagerPage.OpenComplexCaseAndVerifySubject(subject, "baburao.lunavath@qbe.com");
	}
	

	@Then("Open the case and verify the case is routed to exception work basket with {string} and {string}")
	public void open_the_case_and_verify_the_case_is_routed_to_exception_work_basket_with_and(String keywordinsubject, String policyorquotenoinsubject) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		subject = keywordinsubject + " " + policyorquotenoinsubject;
		caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
		caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
		caseManagementCycleTriagerPage.OpenExceptionCaseAndVerifySubject(subject, "baburao.lunavath@qbe.com");
	}
	
	@Then("Open the case and verify the case is routed to OutofScope work basket with {string} and {string}")
	public void open_the_case_and_verify_the_case_is_routed_to_OutofScope_work_basket_with_and(String keywordinsubject, String policyorquotenoinsubject) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		subject = keywordinsubject + " " + policyorquotenoinsubject;
		caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
		caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
		caseManagementCycleTriagerPage.OpenOutofScopeCaseAndVerifySubject(subject, "baburao.lunavath@qbe.com");
	}
	
	@When("validate newmailcompose send")
    public void validate_newmailcompose_send() throws Exception {
        // Write code here that turns the phrase above into concrete actions
		caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
		caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
		caseManagementCycleTriagerPage.composeNewEmail();
    }
   
    @When("validate forward mail")
    public void validate_forward_mail() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	CaseManagementCycleTriagerPage.forwardEmail();
    }
   
    @When("validate Reassign to  operator")
    public void validate_Reassign_to_operator() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	caseManagementCycleTriagerPage.reassignworktooperator();
    }
    
    @When("Ability to split emails with multiple requests into individual cases.")
    public void ability_to_split_emails_with_multiple_requests_into_individual_cases() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	caseManagementCycleTriagerPage.SplitCase();
    	
    	
    	
    }
    
    
    @When("Ability to respond to Requestor through reply email")
    public void ability_to_respond_to_Requestor_through_reply_email() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	caseManagementCycleTriagerPage.reply();
    }
    

    
    @When("Ability to have a functionality for the CSO or Triager on where they can see the allocated cases to them {string}")
    public void ability_to_have_a_functionality_for_the_CSO_or_Triager_on_where_they_can_see_the_allocated_cases_to_them(String string) throws Exception {
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	caseManagementCycleTriagerPage.allocatedCases(string);
       
    }
    
   /* @When("Validate Reassign to  other operator or user{string} and {string} and {string}")
    public void validate_Reassign_to_other_operator_or_user_and_and(String string, String string2, String string3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	caseManagementCycleTriagerPage.notification(string,string2,string3);
    }*/
    
    @When("Validate Reassign to  other operator or user{string} and {string} and {string}enter {string} and {string} and {string}and {string}")
    public void validate_Reassign_to_other_operator_or_user_and_and_enter_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	caseManagementCycleTriagerPage.notification(string,string2,string3,string6,string7,string4,string5);
    }
    
    @When("validate caseinformation note for reassign to complexWB")
    public void validate_caseinformation_note_for_reassign_to_complexWB() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	caseManagementCycleTriagerPage.informationNoteforComplex();
    }

    @When("validate caseinformation note for reassign to ExceptionWB")
    public void validate_caseinformation_note_for_reassign_to_ExceptionWB() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	caseManagementCycleTriagerPage.informationNoteforException();
    }
    
    @Then("verify Menu on the left pane view should include")
    public void verify_Menu_on_the_left_pane_view_should_include() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	caseManagementCycleTriagerPage = new CaseManagementCycleTriagerPage(TestBase.getDriver());
    	caseManagementCycleTriagerPage.sendCaseManagementCycleTriagerObject(caseManagementCycleTriagerPage);
    	//caseManagementCycleTriagerPage.triagerleftpanel();
    	caseManagementCycleTriagerPage.advancesearch();
    } 
    

    
    


}
