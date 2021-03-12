package uni.pu.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.User;

public class loginService {

	public static String login(String username, String password) {
		
		if(username == null && password == null) 
		{
			return "Въведете потребителско име и парола";
		}	
		
		if(username == null) 
		{
			return "Въведете потребителско име";
		}
		
		if(password == null) 
		{
			return "Въведете парола";
		}
		
		List<User> users = getUsers();		
		
		boolean isUserExist = users.stream().anyMatch(user->
		(user.getUsername().equals(username) 
		&& user.getPassword().equals(password)));
		
		return isUserExist?"OK":"грешни потребителски данни";
	}
	
	public static List<User> getUsers(){
		User user = new User();
		user.setUsername("Иван");
		user.setPassword("Pass1234");
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		return users;
	}

}
