package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.LoginScreenModel;

public class loginSteps {
	
	LoginScreenModel loginScreen = new LoginScreenModel();
	
	@Given("^Потребитеял отваря екрана за вход в системата$")
	public void openLoginScreen() throws Throwable {
	    loginScreen.navigateToMe();
	}

	@When("^Потребителя въведе потребителско име \"([^\"]*)\"$")
	public void addUsername(final String username) throws Throwable {
	    loginScreen.setUsername(username);
	}

	@When("^Въведе парола \"([^\"]*)\"$")
	public void addPassword(final String password) throws Throwable {
	    loginScreen.setPassword(password);
	}

	@When("^Натисне върху бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		 loginScreen.clickLoginButton();
	}

	@Then("^Вижда съобщение за успех\\.$")
	public void assertOkMessage() throws Throwable {
		assertEquals("грешни потребителски данни", loginScreen.getLoginMessage());
	}
	
	@Then("^Вижда съобщение за грешни потребителски данни\\.$")
	public void assertWrongUserDataMessage() throws Throwable {
		assertEquals("грешни потребителски данни", loginScreen.getLoginMessage());
	}
	
	@Then("^Вижда съобщение въведете потребителски данни\\.$")
	public void assertUserDataMessage() throws Throwable {
		assertEquals("Въведете потребителско име и парола", loginScreen.getLoginMessage());
	}
	
	@Then("^Вижда съобщение въведете парола\\.$")
	public void assertPasswordMessage() throws Throwable {
		assertEquals("Въведете парола", loginScreen.getLoginMessage());
	}
	
	@Then("^Вижда съобщение въведете потребителско име\\.$")
	public void assertUsernameMessage() throws Throwable {
		assertEquals("Въведете потребителско име", loginScreen.getLoginMessage());
	}
	
	

}
