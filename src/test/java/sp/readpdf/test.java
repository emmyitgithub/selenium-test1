package sp.readpdf;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v108.browser.Browser;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test {

		public static void createDriver (final Browser browser) {
	           setupChromeInLambdaTest ();
	           setupBrowserTimeouts ();
	       }

	       public static <D extends WebDriver> D getDriver () {
	           Object io;
			return (D) io.github.mfaisalkhatri.drivers.DriverManager.DRIVER.get ();
	       }

	       public static void quitDriver () {
	           Object DRIVER;
			if (null != DRIVER.get ()) {
	               Log.info ("Closing the driver...");
	               getDriver ().quit ();
	               ((Object) DRIVER).remove ();
	           }
	       }

	       private static void setDriver (final WebDriver driver) {
	           Object io;
			io.github.mfaisalkhatri.drivers.DriverManager.DRIVER.set (driver);
	       }

	       private static void setupBrowserTimeouts () {
	           Logger LOG = null;
			LOG.info ("Setting Browser Timeouts....");
	           getDriver ().manage ()
	               .timeouts ()
	               .implicitlyWait (Duration.ofSeconds (30));
	           getDriver ().manage ()
	               .timeouts ()
	               .pageLoadTimeout (Duration.ofSeconds (30));
	           getDriver ().manage ()
	               .timeouts ()
	               .scriptTimeout (Duration.ofSeconds (30));
	       }
	      
	       private static void setupChromeInLambdaTest () {
	           final ChromeOptions browserOptions = new ChromeOptions ();
	           browserOptions.setPlatformName ("Windows 10");
	           browserOptions.setBrowserVersion ("104.0");
	           final HashMap<String, Object> ltOptions = new HashMap<> ();
	           Object LT_USERNAME;
			ltOptions.put ("username", LT_USERNAME);
	           Object LT_ACCESS_TOKEN;
			ltOptions.put ("accessKey", LT_ACCESS_TOKEN);
	           ltOptions.put ("resolution", "2560x1440");
	           ltOptions.put ("selenium_version", "4.0.0");
	           ltOptions.put ("build", "LambdaTest ECommerce Playground Build");
	           ltOptions.put ("name", "End to End LambdaTest ECommerce Playground Tests");
	           ltOptions.put ("w3c", true);
	           ltOptions.put ("plugin", "java-testNG");
	           browserOptions.setCapability ("LT:Options", ltOptions);
	           try {
	               setDriver (
	                   new RemoteWebDriver (browserOptions));
	           } catch (final MalformedURLException e) {
	               Logger.error ("Error setting up cloud browser in LambdaTest", e);
	           }

	       }
	      
	   }
	


