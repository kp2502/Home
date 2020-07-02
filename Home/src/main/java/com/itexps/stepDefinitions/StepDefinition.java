/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.stepDefinitions;

import com.itexps.pages.HomePage;
import com.itexps.util.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 *
 * @author Krimali
 */
public class StepDefinition extends BaseClass {
     // declaring variable
    //LoginPage loginpage;
    //LocationPage locationpage;
    //NewsLetterPage newsletterpage;
   
  HomePage homepage;
    
    @Given("^user is already in login Test Page$")
 public void user_is_already_in_login_Test_Page() throws Throwable {
       // initialization
    BaseClass.initialization();
   homepage = new HomePage();
    //calls bulletin method
   homepage .home();
  }

@Then("^user gives email address on newsletter section$")
public void user_gives_email_address_on_newsletter_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^user selects Schamburg location$")
public void user_selects_Schamburg_location() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^user clicks Order Online link to test login feature$")
public void user_clicks_Order_Online_link_to_test_login_feature() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
}

@Then("^user selects Location and Main Options$")
public void user_selects_Location_and_Main_Options() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^user clicks submit$")
public void user_clicks_submit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^user closes brower for login test session$")
public void user_closes_brower_for_login_test_session() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}


    
}
