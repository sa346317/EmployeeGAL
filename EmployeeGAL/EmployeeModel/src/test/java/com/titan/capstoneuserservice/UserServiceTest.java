package com.titan.capstoneuserservice;
import com.titan.capstoneuserservice.*;
import com.titan.capstoneuser.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserServiceTest {
	@Test
	public void testIsAuthorized() {
		User usr = new User("sa346317","Sandeep","Kumar","1234","sandeep.vadakkayil@wipro.com","9986143515");
		assertEquals(true,new UserService().isAuthorized(usr));
	}
	
	@Test
	public void testgetUserdetails() {				
		assertEquals("Sandeep",new UserService().getUserdetails("sa346317").getFirstName());
	}
	
	
	
	
}
