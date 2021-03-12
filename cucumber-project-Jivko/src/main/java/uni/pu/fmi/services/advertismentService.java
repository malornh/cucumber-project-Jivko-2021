package uni.pu.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.Advertisment;

public class advertismentService {

	public static String advertisment(String name) {
		
		List<Advertisment> advertisments = getAdvertisment();		
		
		boolean isUserExist = advertisments.stream().anyMatch(user->
		(user.getName().equals(name)));
		
		return isUserExist?"показва всички обяви с даденото име":"няма налични обяви с това име";
	}

	public static List<Advertisment> getAdvertisment() {
		Advertisment advertisment = new Advertisment();
		advertisment.setName("пералня");
		advertisment.setPrice("10-1500");
		ArrayList<Advertisment> advertisments = new ArrayList<Advertisment>();
		advertisments.add(advertisment);
		return advertisments;
	}

}
