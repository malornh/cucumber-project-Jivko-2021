package uni.pu.fmi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps {
	@Given("^Потребитеял отваря екрана за вход в системата$")
	public void openLoginScreen() throws Throwable {
	    throw new PendingException();
	}

	@When("^Потребителя въведе потребителско име \"([^\"]*)\"$")
	public void addUsername(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Въведе парола \"([^\"]*)\"$")
	public void addPassword(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Натисне върху бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkLoginMessage(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
