package sp.readpdf;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class capturescreenshot {
	
	@Test

	public static void main(String[] args) throws Exception {
	
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/");
		driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("junit repository");
		
		//screenshot taken 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
	    FileUtils.copyFile(source,new File("./screenshot/maven.png"));
	    
	    System.out.println("captured screenshot ready");
	    
	    driver.quit();
	    //capture the screenshot and displaying 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
