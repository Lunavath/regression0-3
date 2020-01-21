Feature: Case workflow management


#Author: baburao.lunavath@qbe.com
  #USer Stroy Discription: Ability to respond to Requestor through reply email
  #epic GWMS-80
  #Sprint 4
  #Test case coverage || Total TC's - 12 || Total automated TC's - 12
  @smoke
  Scenario Outline: Ability to respond to Requestor through reply email
    Given Open the browser and navigate to particular url
    Given User send a mail to QBE with subject "<keywordinsubject>" and "<policyorquotenoinsubject>"
    When I enter valid username  "<username>" and "<password>" click on Login button
    Then Login should be successfully completed
    Then Open the case and verify the case is routed to complex work basket with "<keywordinsubject>" and "<policyorquotenoinsubject>"
    When Ability to respond to Requestor through reply email
    Then click on logout link and close the browser

    Examples: 
      | keywordinsubject | policyorquotenoinsubject | username | password  |
      | QI 1234567 MVA   | QI 1234567 PAD           | triager  | OF@12345  |







  
   #Scenario Outline: Dashboard - Ability to provide user portal to Triager
    #Given Open the browser and navigate to particular url
    #When I enter valid username  "<username>" and "<password>" click on Login button
    #Then Login should be successfully completed
    #Then verify Menu on the left pane view should include
    #Then click on logout link and close the browser

 #   Examples: 
  #   | username | password  |
  #   | triager  | OF@123456 |
