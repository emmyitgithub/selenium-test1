package sp.readpdf;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_priorityexicution {
  //   @BeforeMethod
   //  public void userinfo() {
   // 	 System.out.println("user gatting info to register bank acc.");
  //   }
	@Test(priority=1)
	public void userlogin() {
		System.out.println("user gatting login");
	}
	@Test(priority=2)
	public void userregistration() {
		System.out.println("user gatting registration");
	}
	@Test(priority=3,enabled=false)
	public void enterdetails() {
		System.out.println("user fill details");
	}
	@Test(priority=4)
	public void usersubbmitform() {
		System.out.println("user submitt details");
	}
	@Test(priority=5)
	
	public void usersucssesreg(){
		System.out.println("user success reg.");
	}
	@Test(priority=6)
	public void userinterface() {
		System.out.println("the user interface is....");
		
	}
	@Test(priority=7,enabled=false)
	public void userenabled(){
	System.out.println("the user are enabled to reg");
	}
	@Test(priority=8,enabled=true)
	public void userDissbled() {
		System.out.println("the user is dissabled");
		System.out.println("the user sre enabled");
	}
	@Test(priority=9)
	public void eitherEnableDissabled () {
		System.out.println("the user has either enabled or disabled");
		
	}
	@Test(enabled=true)
	public void userGetreg() {
		System.out.println("user get reg");
	}
	@Test(enabled=false)
	public void  userputreg() {
		System.out.println("user put reg");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("user post before method");
	}
}
	
	


	
	
	
	
	
	

