package sp.readpdf;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_run_before_after_method {
	@BeforeMethod
	public void userregistration() {
	System.out.println("user is gatting register");
	}
	@Test
	public void userloging() {
		System.out.println("user gatting login");
	}
	@Test
	public void fundtransfer() {
		System.out.println("user transfer fund");
	}
	@Test
	public void transfersuccess() {
		System.out.println("fund is transfer sucssessfuly");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("user gatting logout");
	}
  
}
