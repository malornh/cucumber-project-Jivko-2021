package uni.pu.fmi.models;

import uni.pu.fmi.services.loginService;

public class LoginScreenModel {

	
	private String password;
	private String username;
	private String message;
	
	public void navigateToMe() {
		System.out.println("Екрана за вход в системата е отворен.");
		
	}

	public void setUsername(final String username) {
		this.username = username;
		
	}

	public void setPassword(String password) {
		this.password = password;
		
	}

	public void clickLoginButton() {
		message = loginService.login(username, password);
		
	}

	public String getLoginMessage() {
		return message;
	}

}
