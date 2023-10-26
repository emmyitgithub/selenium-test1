package sp.readpdf;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PDFReaderTest {

	WebDriver driver;
	String url="https://careiomain.blob.core.windows.net/2c4c2bbd-0a5d-42ac-ab15-09b8fb0e2387/93503981-4d7e-4d57-acc5-f86e17d86744/01a66973-d2d2-4a13-ae24-70980b61bf10.pdf?sv=2021-10-04&se=2023-03-30T12%3A45%3A08Z&sr=b&sp=rw&sig=gA44zODdBeTHFxx6xmt7Dj32WewL%2FlKdLBRfipIhj2I%3D";
     @BeforeTest
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get(url);
			
	}
	@Test
	public void PDFReaderTest() throws IOException {
		
		URL pdfurl=new URL(url);
		InputStream ip=pdfurl.openStream();
		BufferedInputStream bf=new BufferedInputStream(ip);
		PDDocument pdDocument=PDDocument.load(bf);
		//page count operation
		int pageCount=pdDocument.getNumberOfPages();
		System.out.println("pdfpages:"+pageCount);
       Assert.assertEquals(pageCount, 20);
        System.out.println("===============pdf text=============");
      //page text
       PDFTextStripper pdfstiper=new PDFTextStripper();
	   String pdfText=pdfstiper.getText(pdDocument);
	   System.out.println(pdfText);
			
	}
	
	@AfterTest
	public void tearDown() {
	driver.quit();//quit browser.......

	}
	
	
	
	
	
	
	
}
