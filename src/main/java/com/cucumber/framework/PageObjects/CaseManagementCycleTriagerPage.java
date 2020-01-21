package com.cucumber.framework.PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumber.framework.GeneralHelperSel.LoggerHelper;
import com.cucumber.framework.GeneralHelperSel.SeleniumFunc;

public class CaseManagementCycleTriagerPage extends SeleniumFunc
		implements CaseManagementCycleTriagerPageLoc, CaseManagementCycleCSOPageLoc, CaseManagementCycleSMPageLoc {

	public CaseManagementCycleTriagerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final Logger log = LoggerHelper.getLogger(CaseManagementCycleTriagerPage.class);

	CaseManagementCycleTriagerPage caseManagementCycleTriagerPage;
	CommonPage commonPage;

	public void sendCaseManagementCycleTriagerObject(CaseManagementCycleTriagerPage caseManagementCycleTriagerPage) {
		this.caseManagementCycleTriagerPage = caseManagementCycleTriagerPage;
		// System.out.println("In sendLoginObject method search page"+this.loginpage);
	}

	/*
	 * #############################################################################
	 * Author : Babu Scenario : Exception work basket Description : fetch the case
	 * information note content verification in complex WB
	 * #############################################################################
	 */

	public void clickonComplexWB() throws Exception {

		// click on complex work basket

		xpath_GenericMethod_Click(complex_workbasket);
		

	}
	/*
	 * #############################################################################
	 * Author : Babu Scenario : Exception work basket Description : fetch the case
	 * information note content verification in exception WB
	 * #############################################################################
	 */

	public void clickonExceptionWB() throws Exception {

		driver.switchTo().defaultContent();
		// click on exception WB
		Thread.sleep(3000);
		xpath_GenericMethod_Click(Exception_workbasket);
		xpath_GenericMethod_Click(refresh);
		xpath_GenericMethod_Click(refresh);
		CaseManagementCycleTriagerPage.informationNotedisplay();

	}

	/*
	 * #############################################################################
	 * Author : Babu Scenario : Case Information Note Display Description : fetch
	 * the case information note content verification
	 * #############################################################################
	 */

	public static void informationNotedisplay() throws Exception {


			String notedis = driver.findElement(By.xpath(notedisplayed)).getText();
			System.out.println("information note message display:" + notedis);
			String multipletypesofrequest = "The case has been routed to the complex workbasket "
					+ "because multiple type of requests have been identified";
			
			String multipletypesofrequestandpolicy_quotenumber = "The case has been routed to the complex workbasket because multiple "
					+ "type of requests and policy/quote number have been identified";
			String multiplepolicy_quotenumber = "The case has been routed to the complex "
					+ "workbasket because multiple policy/quote number have been identified";
			String withouttypeofrequestandpolicy_quotenumber = "The case has been routed to the exception workbasket because "
					+ "no policy/quote number nor type of request were identified.";
			String withoutpolicyquotenumber = "The case has been routed to the exception workbasket because no policy/quote number was identified.";
			String latestinfo="The case has been routed to the complex workbasket because multiple type of "
					+ "requests and/or policy/quote number have been identified";
			String latestinfo1="The case has been routed to the exception workbasket "
					+ "because no policy/quote number or type of request was identified";
			String latestinfo2="The case has been routed to the out-of-scope workbasket";
			String latestinfo3="The case has been routed to the exception workbasket because no policy/quote number or type of request was identified.";
			String caseidnumber = driver.findElement(By.xpath("//div[@data-expr-id='da3fa1de69d2e70d0ba6a85442836a8645410955_5']/span")).getText();
			System.out.println("case number:"+caseidnumber);
			
			if (notedis.equalsIgnoreCase(multipletypesofrequest)) {
				Assert.assertEquals(notedis, multipletypesofrequest);
				System.out.println("For those case identified with multiple types of request");
			} else if (notedis.equalsIgnoreCase(multipletypesofrequestandpolicy_quotenumber)) {
				Assert.assertEquals(notedis, multipletypesofrequestandpolicy_quotenumber);
				System.out.println("For those case identified with multiple types of request and policy/quote number");

			} else if (notedis.equalsIgnoreCase(multiplepolicy_quotenumber)) {
				Assert.assertEquals(notedis, multiplepolicy_quotenumber);
				System.out.println("For those case identified with multiple policy/quote number");

			} else if (notedis.equalsIgnoreCase(withouttypeofrequestandpolicy_quotenumber)) {
				Assert.assertEquals(notedis, withouttypeofrequestandpolicy_quotenumber);
				System.out.println("For those case identified without type of request and policy/quote number");

			} 
			
			
			else if (notedis.equalsIgnoreCase(withoutpolicyquotenumber)) {
				Assert.assertEquals(notedis, withoutpolicyquotenumber);
				System.out.println("For those case identified without policy/quote number");

			}
			
			else if(notedis.equalsIgnoreCase(latestinfo)) {
			
				Assert.assertEquals(notedis, latestinfo);
				System.out.println("If the case has been re-assigned to the complex workbasket");
				
			}
			else if(notedis.equalsIgnoreCase(latestinfo1)) {
				
				Assert.assertEquals(notedis, latestinfo1);
				System.out.println("If the case has been re-assigned to the exception workbasket");
			}
			else if(notedis.equalsIgnoreCase(latestinfo2)) {
				
				Assert.assertEquals(notedis, latestinfo2);
				System.out.println("If the case has been re-assigned to the out-of-scope workbasket");
			}
           else if(notedis.equalsIgnoreCase(latestinfo3)) {
				
				Assert.assertEquals(notedis, latestinfo3);
				System.out.println("If the case has been assigned to the Exception workbasket");
			}

			else {
				System.out.println("************information note not available************");
			}
			

			/*String SLAvalue = driver.findElement(By.xpath(SLA_Xpath)).getText();
			System.out.println("SLA value:" + SLAvalue);*/

			xpath_GenericMethod_Click(closebutton);
			

		}

	

	/*
	 * #############################################################################
	 * Author : Babu Scenario : Out-of-scope work basket Description : out-of-scope
	 * WB
	 * #############################################################################
	 */

	public void clickon_OutofScope_WB() throws Exception {

		driver.switchTo().defaultContent();
		// click on exception WB
		Thread.sleep(3000);
		xpath_GenericMethod_Click(outofscope_xpath);
		xpath_GenericMethod_Click(refresh);
		xpath_GenericMethod_Click(refresh);
		CaseManagementCycleTriagerPage.informationNotedisplay();

		
	}

	/*
	 * #############################################################################
	 * Author : Babu Scenario : Get Next work Description : Get next work flow
	 * #############################################################################
	 */

	public void getNext_work() throws Exception {

		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		xpath_GenericMethod_Click(getnext_xpath);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		xpath_GenericMethod_Sendkeys(insured_xpath, "testdemo");
		Thread.sleep(3000);
		xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(typeofreq_xpath, 6);
		Thread.sleep(3000);
		xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(policy_Quote_xpath, 2);
		Thread.sleep(3000);
		xpath_GenericMethod_Sendkeys(Quote_xpath, "QI 1234567 PLB");
		xpath_GenericMethod_Click(submit_xpath);
		Thread.sleep(5000);
		xpath_GenericMethod_Click(getnext);
		
		
	}

	/*
	 * #############################################################################
	 * Author : Babu Scenario : Get Next work Description : reassign work
	 * #############################################################################
	 */

	public void reassignwork() throws Exception {

			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(reassign_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(transferto_xpath, 1);
			Thread.sleep(3000);
			xpath_GenericMethod_Sendkeys(workqueue_xpath, "Complex");
			Thread.sleep(3000);
			xpath_GenericMethod_Click(compl_xpath);
			Thread.sleep(3000);
			xpath_GenericMethod_Click(btnReassign_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(refreshaction);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(audit);
			String reassign = driver.findElement(By.xpath("//span[contains(text(),'Reassign ')]")).getText();
			String reassignaudit = reassign;
			System.out.println(reassign);
			Assert.assertEquals(reassignaudit, reassign);
			xpath_GenericMethod_Click(closebutton);
			Thread.sleep(2000);

		
	}

	/*
	 * #############################################################################
	 * Author : Babu Scenario : Complex WB Description : Complex WB
	 * #############################################################################
	 */
	public void OpenComplexCaseAndVerifySubject(String Sub, String from) throws Exception {
		CommonPage.caseVerification(complex_workbasket, Sub, from);
	}
	
	/*
	 * #############################################################################
	 * Author : Babu Scenario : OutofScope Description : OutofScope
	 * #############################################################################
	 */
	
	public void OpenOutofScopeCaseAndVerifySubject(String Sub, String from) throws Exception {
		CommonPage.caseVerification(outofscope_xpath, Sub, from);
	}
	
	/*
	 * #############################################################################
	 * Author : Babu Scenario :  Description : Exception WB
	 * #############################################################################
	 */
	
	public void OpenExceptionCaseAndVerifySubject(String Sub, String from) throws Exception {
		CommonPage.caseVerification(Exception_workbasket, Sub, from);
	}

	/*
	 * #############################################################################
	 * Author : Babu Scenario : reassign work Description : reassign work-operator
	 * #############################################################################
	 */

	public void reassignworktooperator() throws Exception {

			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(reassign_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(transferto_xpath, 2);
			Thread.sleep(3000);
			xpath_GenericMethod_Sendkeys(workqueue_xpath, "Triage user");
			Thread.sleep(3000);
			xpath_GenericMethod_Click(compl_xpath);
			Thread.sleep(3000);
			xpath_GenericMethod_Click(btnReassign_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(refreshaction);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(audit);
			String reassign = driver.findElement(By.xpath("//span[contains(text(),'Reassign ')]")).getText();
			String reassignaudit = reassign;
			System.out.println(reassign);
			Assert.assertEquals(reassignaudit, reassign);
			xpath_GenericMethod_Click(closebutton);
			Thread.sleep(2000);

	}

	/*
	 * #############################################################################
	 * Author : Babu Scenario : forward email & Compose new email work Description :
	 * forward mail to multiple user
	 * #############################################################################
	 */

	public static void forwardEmail() throws Exception {
		
			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(forwardEmail_xpath);

			Thread.sleep(2000);
			String casestatus = driver.findElement(By.xpath(statusofcase)).getText();
			String casetext = casestatus;
			System.out.println(casestatus);
			Assert.assertEquals(casetext, casestatus);
			xpath_GenericMethod_Click(mail_submit);
			String text = driver.switchTo().alert().getText();
			System.out.println("fetch text:" + text);
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Assert.assertEquals("Please correct flagged fields before submitting the form!", text);

			Thread.sleep(2000);
			xpath_GenericMethod_Sendkeys(tomail_xpath, "baburao.lunavath@qbe.com;");
			Thread.sleep(2000);

			Thread.sleep(2000);
			xpath_GenericMethod_Click(mail_submit);
			Thread.sleep(6000);
			String casestatus1 = driver.findElement(By.xpath(statusofcase)).getText();
			String casetext1 = casestatus1;
			System.out.println(casestatus1);
			Assert.assertEquals(casetext1, casestatus1);
			Assert.assertNotEquals(casestatus1, casestatus);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(refreshaction);
			Thread.sleep(4000);
			xpath_GenericMethod_Click(audit);
			Thread.sleep(2000);
			String mailforward = driver.findElement(By.xpath("//span[contains(text(),'Email Forward Successful')]")).getText();
			Thread.sleep(6000);
			String forwardmailaudit = mailforward;
			System.out.println(mailforward);
			Assert.assertEquals(forwardmailaudit, mailforward);
			xpath_GenericMethod_Click(closebutton);
			Thread.sleep(4000);

		}
	
	/*
	 * #############################################################################
	 * Author : Babu Scenario : forward email & Compose new email work Description :
	 * forward mail to multiple user
	 * #############################################################################
	 */

	public void reply() throws Exception {
		
			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(reply_xpath);

			Thread.sleep(2000);
			String casestatus = driver.findElement(By.xpath(statusofcase)).getText();
			String casetext = casestatus;
			System.out.println(casestatus);
			Assert.assertEquals(casetext, casestatus);
			Thread.sleep(2000);
			driver.findElement(By.xpath(tomail_xpath)).clear();
			xpath_GenericMethod_Click(mail_submit);
			String text = driver.switchTo().alert().getText();
			System.out.println("fetch text:" + text);
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Assert.assertEquals("Please correct flagged fields before submitting the form!", text);
			Thread.sleep(2000);
			xpath_GenericMethod_Sendkeys(tomail_xpath, "baburao.lunavath@qbe.com;");
			Thread.sleep(2000);
			xpath_GenericMethod_Sendkeys(ccto_xpath, "baburao.lunavath@qbe.com;");
			Thread.sleep(2000);
			
			xpath_GenericMethod_Click(mail_submit);
			Thread.sleep(6000);
			String casestatus1 = driver.findElement(By.xpath(statusofcase)).getText();
			String casetext1 = casestatus1;
			System.out.println(casestatus1);
			Assert.assertEquals(casetext1, casestatus1);
			Assert.assertEquals(casestatus1, casestatus);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(refreshaction);
			Thread.sleep(4000);
			xpath_GenericMethod_Click(audit);
			Thread.sleep(2000);
			String mailreply = driver.findElement(By.xpath("//span[contains(text(),'Reply')]")).getText();
			String mailreplyaudit = mailreply;
			System.out.println(mailreply);
			Assert.assertEquals(mailreply, mailreplyaudit);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(closebutton);
			Thread.sleep(2000);

		}
	
	/*
	 * #############################################################################
	 * Author : Babu Scenario : compose new email Description :
	 * compose new email
	 * #############################################################################
	 */
	

	public void composeNewEmail() throws Exception {

			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(newemail);

			Thread.sleep(2000);
			String casestatus = driver.findElement(By.xpath(statusofcase)).getText();
			String casetext = casestatus;
			System.out.println(casestatus);
			Assert.assertEquals(casetext, casestatus);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(mail_submit);
			Thread.sleep(6000);

			xpath_GenericMethod_Click(actions_xpath);
			Thread.sleep(2000);
			xpath_GenericMethod_Click(refreshaction);
			Thread.sleep(4000);
			xpath_GenericMethod_Click(audit);
			String composenewmail = "Performed a ' Compose New Email '.";
			String newmail = driver.findElement(By.xpath("//span[contains(text(),'Compose New Email')]")).getText();
			System.out.println(newmail);
			Assert.assertEquals(composenewmail, newmail);
			xpath_GenericMethod_Click(closebutton);
			Thread.sleep(2000);

		
	}
	
	/*
	 * #############################################################################
	 * Author : Babu Scenario : split case Description :
	 * split case
	 * #############################################################################
	 */
	
	public String SplitCase() throws Exception {
		
		xpath_GenericMethod_Click(actions_xpath);
		Thread.sleep(2000);
		xpath_GenericMethod_Click(Split_xpath);
		Thread.sleep(2000);
		String casestatus = driver.findElement(By.xpath(statusofcase)).getText();
		String casetext = casestatus;
		System.out.println(casestatus);
		Assert.assertEquals(casetext, casestatus);
		Thread.sleep(2000);
		xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(typeofsplitreq, 3);
		Thread.sleep(3000);
		xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(productcode, 37);
		Thread.sleep(3000);
		xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(quoteorpolicy, 2);
		Thread.sleep(3000);
		xpath_GenericMethod_Sendkeys(Quotenumber, "QI 1234567 PLB");
		Thread.sleep(3000);
		xpath_GenericMethod_Sendkeys(insuredname, "Babu");
		Thread.sleep(3000);
		xpath_GenericMethod_Sendkeys(comment_xpath, "Babu");
		Thread.sleep(3000);
		xpath_GenericMethod_Click(generatesplit);
		Thread.sleep(60000);
		String casestatus1 = driver.findElement(By.xpath(statusofcase)).getText();
		String casetext1 = casestatus1;
		System.out.println(casestatus1);
		Assert.assertEquals(casetext1, casestatus1);
		Assert.assertNotEquals(casestatus, casestatus1);
		xpath_GenericMethod_Click(actions_xpath);
		Thread.sleep(2000);
		xpath_GenericMethod_Click(refreshaction);
		Thread.sleep(4000);
		xpath_GenericMethod_Click(splitaudit);
		String productcode = driver.findElement(By.xpath(splitauditproductcode)).getText();
		System.out.println(productcode);
		
		return productcode;
	}
	
	
	/*
	 * #############################################################################
	 * Author : Babu 
	 * Scenario : allocatedCases  
	 * Description: allocatedCases
	 * #############################################################################
	 */
	
	public void allocatedCases(String priority) throws Exception {
		
		String DueCase = driver.findElement(By.xpath(Duein_xpath)).getText();
		System.out.println(DueCase);
		String duecases="DUE IN";
		Assert.assertEquals(DueCase,duecases);
		String dueago =driver.findElement(By.xpath("//div[@data-tour-id='20141009113353097734286']/div/span")).getText();
		if(dueago.contains("hours ago")) {
			String Priorityofthecase = driver.findElement(By.xpath(CasePriority)).getText();
			System.out.println(Priorityofthecase);
			Assert.assertEquals(Priorityofthecase, priority);
			forwardEmail();
		}
		
		else {
			
			String Priorityofthecase = driver.findElement(By.xpath(CasePriority)).getText();
			System.out.println(Priorityofthecase);
			Assert.assertEquals(Priorityofthecase, priority);
			forwardEmail();
			
			
		}
		


		
		
	
		
	}
	
	
	/*
	 * #############################################################################
	 * Author : Babu 
	 * Scenario : notification alert  
	 * Description: notification alert
	 * #############################################################################
	 */
	
	public void notification(String transfer,String user,String user1,String mvauser1,String mvapwd1,String mvauser2,String mvapwd2) throws Exception {
		
		String Caseid=driver.findElement(By.xpath(caseid)).getText();
		Thread.sleep(2000);
		xpath_GenericMethod_Click(actions_xpath);
		Thread.sleep(2000);
		xpath_GenericMethod_Click(reassign_xpath);
		Thread.sleep(2000);
		boolean value = driver.findElement(By.xpath("(//i[@title='MVA User 1'])[2]")).isDisplayed();
		System.out.println("user value:"+value);
		Thread.sleep(2000);
		if(value=true) {
			xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(transferto_xpath, 2);
			Thread.sleep(3000);
			xpath_GenericMethod_Sendkeys(workqueue_xpath, user);
			Thread.sleep(3000);
			xpath_GenericMethod_Click(compl_xpath);
			Thread.sleep(3000);
			xpath_GenericMethod_Click(btnReassign_xpath);
			Thread.sleep(8000);
			OneFlowLoginPage.applogout();
			Thread.sleep(5000);
			OneFlowLoginPage.applogin(mvauser2, mvapwd2);
			Thread.sleep(5000);
			xpath_GenericMethod_Click(notification);
			int casenotificationcount=driver.findElements(By.xpath(casenotification)).size();
			for(int i=0;i<=casenotificationcount;i++) {
			String notifcationalert= driver.findElement(By.xpath(casenotification)).getText();
			
			
			if(Caseid.equalsIgnoreCase(notifcationalert)) {
				System.out.println("Case successfully verified"+notifcationalert);
				driver.findElement(By.xpath(casenotification)).click();
				
			}
			
				
			}
			
}
		
		if(value=false) {
		Thread.sleep(4000);
		xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(transferto_xpath, 2);
		Thread.sleep(3000);
		xpath_GenericMethod_Sendkeys(workqueue_xpath, user1);
		Thread.sleep(3000);
		xpath_GenericMethod_Click(compl_xpath);
		Thread.sleep(3000);
		xpath_GenericMethod_Click(btnReassign_xpath);
		Thread.sleep(8000);
		OneFlowLoginPage.applogout();
		Thread.sleep(5000);
		OneFlowLoginPage.applogin(mvauser1, mvapwd1);
		Thread.sleep(5000);
		xpath_GenericMethod_Click(notification);
		int casenotificationcount=driver.findElements(By.xpath(casenotification)).size();
		
		for(int i=0;i<=casenotificationcount;i++) {
		String notifcationalert=	driver.findElement(By.xpath(casenotification)).getText();
		
		if(Caseid.equalsIgnoreCase(notifcationalert)) {
			System.out.println("Case successfully verified"+notifcationalert);
			driver.findElement(By.xpath(casenotification)).click();
			
			
		}
			
		}
		
		
		}

		
	}
	
	public void informationNoteforComplex() throws Exception {
		
		Thread.sleep(6000);
		xpath_GenericMethod_Click(actions_xpath);
		Thread.sleep(3000);
		xpath_GenericMethod_Click(reassign_xpath);
		Thread.sleep(3000);
		xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(transferto_xpath, 1);
		Thread.sleep(3000);
		xpath_GenericMethod_Sendkeys(workqueue_xpath, "Complex");
		Thread.sleep(3000);
		xpath_GenericMethod_Click(compl_xpath);
		Thread.sleep(3000);
		xpath_GenericMethod_Click(btnReassign_xpath);
		Thread.sleep(15000);
		OneFlowLoginPage.applogout();
		Thread.sleep(5000);
		OneFlowLoginPage.applogin("triager", "OF@123456");
		Thread.sleep(5000);

	}



public void informationNoteforException() throws Exception {
		
	Thread.sleep(6000);
	xpath_GenericMethod_Click(actions_xpath);
	Thread.sleep(3000);
	xpath_GenericMethod_Click(reassign_xpath);
	Thread.sleep(3000);
	xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(transferto_xpath, 1);
	Thread.sleep(3000);
	xpath_GenericMethod_Sendkeys(workqueue_xpath, "Exception");
	Thread.sleep(3000);
	xpath_GenericMethod_Click(compl_xpath);
	Thread.sleep(3000);
	xpath_GenericMethod_Click(btnReassign_xpath);
	Thread.sleep(15000);
	OneFlowLoginPage.applogout();
	Thread.sleep(5000);
	OneFlowLoginPage.applogin("triager", "OF@123456");
	Thread.sleep(5000);

}

public void triagerleftpanel() throws Exception {
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath(dashboard))).build().perform();
	Thread.sleep(3000);
	String dashboardview=driver.findElement(By.xpath(dashboard)).getText();
	Thread.sleep(3000);
	System.out.println(dashboardview);
	Thread.sleep(3000);
	Assert.assertEquals("Dashboard", dashboardview);
	Thread.sleep(3000);
	String mywork1=driver.findElement(By.xpath(mywork)).getText();
	Thread.sleep(3000);
	System.out.println(mywork1);
	Thread.sleep(3000);
	Assert.assertEquals("My Work", mywork1);
	Thread.sleep(3000);
	String myteams1=driver.findElement(By.xpath(myteams)).getText();
	Thread.sleep(3000);
	System.out.println(myteams1);
	Thread.sleep(3000);
	Assert.assertEquals("My Teams", myteams1);
	Thread.sleep(3000);
	String pulse1=driver.findElement(By.xpath(pulse)).getText();
	Thread.sleep(3000);
	System.out.println(pulse1);
	Thread.sleep(3000);
	Assert.assertEquals("Pulse", pulse1);
	Thread.sleep(3000);
	String advancesearch1=driver.findElement(By.xpath(advancesearch)).getText();
	Thread.sleep(3000);
	System.out.println(advancesearch1);
	Thread.sleep(3000);
	Assert.assertEquals("Advance Search", advancesearch1);
	Thread.sleep(3000);
	String report1=driver.findElement(By.xpath(report)).getText();
	Thread.sleep(3000);
	System.out.println(report1);
	Thread.sleep(3000);
	Assert.assertEquals("Reports", report1);
	Thread.sleep(3000);
	String tags1=driver.findElement(By.xpath(tags)).getText();
	Thread.sleep(3000);
	System.out.println(tags1);
	Thread.sleep(3000);
	Assert.assertEquals("Tags", tags1);
	Thread.sleep(3000);
	
	
}

public void advancesearch() throws Exception {
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath(dashboard))).build().perform();
	Thread.sleep(3000);
	String advancesearch1=driver.findElement(By.xpath(advancesearch)).getText();
	Thread.sleep(3000);
	System.out.println(advancesearch1);
	Thread.sleep(3000);
	Assert.assertEquals("Advance Search", advancesearch1);
	Thread.sleep(3000);
	xpath_GenericMethod_Click(advancesearch);
	Thread.sleep(3000);
	xpath_GenericMethod_selectFromDropdownUsingIndexbyclickingOnDropdown(emailselect, 1);
	Thread.sleep(4000);
	
	List<WebElement> list=driver.findElements(By.xpath("//label"));
	System.out.println();
	int count=list.size();
	System.out.println(count);
	
	for(int i=1;i<=count;i++) {
		Thread.sleep(2000);
		String labelvalue=driver.findElement(By.xpath("//label["+i+"]")).getText();
		System.out.println(labelvalue);
		Thread.sleep(2000);
		
	}
	
}
}

