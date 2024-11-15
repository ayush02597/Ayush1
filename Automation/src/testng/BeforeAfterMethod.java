package testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * login - @BeforeTest
 * search- @Test
 * logout- @AfterTest
 * login
 * adv search-@Test
 * logout
 * */
public class BeforeAfterMethod{

	@BeforeMethod
	
	void login() {
		System.out.println("this is login");
		
	}
	@Test(priority=1)
	void search() {
		System.out.println("this is search");
	}
	@Test (priority=2)
	void advsearch() {
		System.out.println("this is advance search");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("this is logout");
	}
}