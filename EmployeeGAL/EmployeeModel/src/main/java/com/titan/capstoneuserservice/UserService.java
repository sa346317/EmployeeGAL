package com.titan.capstoneuserservice;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.titan.capstoneuser.*;
import com.titan.capstoneuserdb.*;
public class UserService {
	UserDB usrdb;
		public UserService() {
			usrdb = new UserDB();
	}
	public boolean isAuthorized(User signup) {
		boolean isValidUser=false;		
		Set entrySet = UserDB.userProfile.entrySet();
		Iterator It = entrySet.iterator();
		while(It.hasNext()) {
			Map.Entry u = (Map.Entry)It.next();			
			if(u.getKey().equals(signup.getUserid())) {
				isValidUser = true;				
			}			
		}			
		return isValidUser;		
	}
	
	public User getUserdetails(String userid){
		User usr = new User();
		if(userid!=null){
			 Set entrySet = UserDB.userProfile.entrySet();
			 Iterator It = entrySet.iterator();		 
			 while(It.hasNext()){
				Map.Entry u = (Map.Entry)It.next();
				if(u.getKey().equals(userid)) {
					usr = (User) u.getValue();
				}		
			}			 
			
		}
		return usr;
	}	
}
