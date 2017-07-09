package crisil.test;

import crisil.main.Patient;
import crisil.main.RegistrationBAL;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class CucumberSteps extends TestCase{
	Patient patient = new Patient();
	String button;
	@Given("^\"([^\"]*)\" register using phone \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void Inputdata(String name, String phone, String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		patient.setName(name);
		patient.setPhone(phone);
		patient.setEmail(email);
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		button = arg1;
	}

	@Then("^New OPT has to be sent on phone number$")
	public void new_OPT_has_to_be_sent_on_phone_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^System should display \"([^\"]*)\"$")
	public void system_should_display(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		RegistrationBAL obj = new RegistrationBAL();
		assertEquals(arg1, obj.Register(patient));
	}

	@Then("^System provide option for \"([^\"]*)\"$")
	public void system_provide_option_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^user register using phone and email$")
	public void user_register_using_phone_and_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Email already exist$")
	public void email_already_exist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on Register$")
	public void click_on_Register() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^System provide option for Forget Password$")
	public void system_provide_option_for_Forget_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^System should display failed message$")
	public void system_should_display_failed_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^user\"([^\"]*)\" enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
}
