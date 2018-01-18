package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.User;
import pl.coderslab.UserRepository;
//TDD
public class UserRepositoryTest {

	@Test
	public void testCreateUSer() throws Exception {
		UserRepository usr = new UserRepository("Krzysiek", "aadsd123456", "krzycho@pozapawem.pl");
		assertEquals("Krzysiek", usr.getUserName());
		assertEquals("krzycho@pozapawem.pl", usr.getEmail());
	}
	
	@Test(expected = Exception.class)
	public void testCreateUserError() throws Exception {
		UserRepository usr = new UserRepository("Krzysiek", "12345", "");
	}
	
	@Test(expected = Exception.class)
	public void testPasswordVerifyLenght() throws Exception {
		//Given - new User without data
		UserRepository usr = new UserRepository();
		//Then - set new password, wchich is too short
		usr.setPassword("12d");
		
	}
	
	@Test
	public void TestEditUser() throws Exception {
		UserRepository usr = new UserRepository("Krzysiek", "123456", "krzycho@pozaprawem.pl");
		usr.setUserName("Marek");
		assertEquals( "Marek", usr.getUserName()  );
	}
	@Test
	public void TestDeleteUser() throws Exception{
		UserRepository usr = new UserRepository("Krzysiek", "1234563", "krzycho@pozaprawem.pl");
		
	}

}
