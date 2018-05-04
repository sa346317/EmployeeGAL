package com.titan.capstoneuserdb;
import java.util.HashMap;
import java.util.Map;

import com.titan.capstoneuser.User;

public class UserDB {
	public static Map<String, User> userProfile = new HashMap<String, User>();
	public UserDB() {
		User U1= new User("sa346317","Sandeep","Kumar","1234","sandeep.vadakkayil@wipro.com","9986143515");
		User U2= new User("ay123456","Amitabh","Yadav","1234","amitabh.yadav@wipro.com","9986123456");
		userProfile.put(U1.getUserid(), U1);
		userProfile.put(U2.getUserid(), U2);		
	}
}
