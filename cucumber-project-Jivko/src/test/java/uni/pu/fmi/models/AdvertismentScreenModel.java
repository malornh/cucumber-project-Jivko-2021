package uni.pu.fmi.models;

import uni.pu.fmi.services.advertismentService;

public class AdvertismentScreenModel {
	
	private String name;
	private String price;
	private String message;

	public void navigateToMe() {
		System.out.println("Екрана за търсене на обяви е отворен.");

		
	}
	
	public void setName(final String name) {
		this.name = name;
		
	}
	
	public void setPrice(final String price) {
		this.price = price;
	}

	public void clickSearchButton() {
		message = advertismentService.advertisment(name);
		
	}

	public String getAdvertismentMessage() {
		return message;
	}

}
