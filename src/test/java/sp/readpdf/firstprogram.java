package sp.readpdf;

import org.testng.annotations.Test;

import junit.framework.Assert;


public class firstprogram {
	@Test(enabled=false)
		void loginByEmail()
		{
		System.out.println("login by email");
		Assert.assertEquals("amol","amol");//true
		}
	@Test
		void loginByInsta()
		{
			System.out.println("login by insta");
			Assert.assertEquals("pawan","pawan");//false
	    }

}
