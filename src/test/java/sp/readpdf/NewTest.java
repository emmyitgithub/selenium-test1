package sp.readpdf;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void test() {
	  System.out.println("this is a test case...");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("thios is a before method...");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is a after method...");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is a before class...");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is a after class...");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is a before test...");
  }

  @AfterTest
  public void afterTest() {
  System.out.println("this is a after test...");
 }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is a before suite...");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is a after suite...");
  }
  @BeforeTest
  public void beforetest() {
	  System.out.println("this is before test methos testcase.");
  }
  

}
