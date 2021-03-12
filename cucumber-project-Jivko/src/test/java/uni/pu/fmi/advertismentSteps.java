package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import java.awt.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.AdvertismentScreenModel;
import uni.pu.fmi.services.advertismentService;

public class advertismentSteps {
	
	AdvertismentScreenModel advertismentScreen = new AdvertismentScreenModel();

	@Given("^Потребитеял отваря екрана за търсене на обяви$")
	public void openAdvertismentScreen() throws Throwable {
		advertismentScreen.navigateToMe();
	}

	@When("^Потребителя въведе име на обява \"([^\"]*)\"$")
	public void addName(final String name) throws Throwable {
	    advertismentScreen.setName(name);

	}
	
	@When("^Натисне върху бутона за търсене$")
	public void clickSearchButton() throws Throwable {
	    advertismentScreen.clickSearchButton();
	}

	@Then("^Вижда лист с обяви със съвпадащо име\\.$")
	public void assertAdvertismentList() throws Throwable {
		for (int i=0; i<advertismentService.getAdvertisment().size(); i++) {
			System.out.println("пералня");
			}
	}
	
	@Then("^Вижда съобщение за неуспех\\.$")
	public void assertErrorMessage() throws Throwable {
		assertEquals("няма налични обяви с това име", advertismentScreen.getAdvertismentMessage());
		
	}
	
	@When("^Потребителя въведе цена на обявата \"([^\"]*)\"$")
	public void addPrice(final String price) throws Throwable {
	    advertismentScreen.setPrice(price);

	}
	
	@Then("^Вижда лист на обяви със въведената цена\\.$")
	public void assertPriceList() throws Throwable {
		for (int i=0; i<advertismentService.getAdvertisment().size(); i++) {
			System.out.println("250");
			}
	}

	@Then("^Вижда лист на обяви по въведените име и цена\\.$")
	public void assertFullAdvertismentList() throws Throwable {
		for (int i=0; i<advertismentService.getAdvertisment().size(); i++) {
			System.out.println("пералня");
			System.out.println("250");
			}
	}

}

