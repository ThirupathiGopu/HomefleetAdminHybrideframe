package TestScripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Homefleet.Pages.EditPropertyPage;
import com.Homefleet.Pages.Loginpage;
import com.Homefleets.Utilits.Browser;
import com.Homefleets.Utilits.PropertyReader;

public class Edipropertytest {
	WebDriver driver;
	Loginpage page;
	EditPropertyPage epage;

	@BeforeMethod
	public void SetUp() throws Exception 
	{
		List<String> info = PropertyReader.getData("browser", 1);
		String browsername = info.get(0), drivername = info.get(1), url = info.get(2);
		driver = Browser.LanchBrowser(browsername, drivername);
		driver = Browser.openUrl(url);
		
	}

	@AfterMethod
	public void closeBrowser() 
	{
		// driver.close();
	}

	@Test
	public void clickonSRKEdiption() throws Exception 
	{
		page = new Loginpage(driver);
		epage = new EditPropertyPage(driver);
		List<String> info = PropertyReader.getdataa("loginpage", 1);
		String email = info.get(0), pass = info.get(1);
		page.EnterLoginCreditionals(email, pass);
		page.ClickonLoginButton();
		Thread.sleep(100);
		page.Loginsuccessmsgevalidation();
		Thread.sleep(2000);
		epage.clickonsrkeditproperty();
		Thread.sleep(2000);
		epage.clickonDisplayurlbtn();
		Thread.sleep(2000);
		epage.clickongenarateurl();
		Thread.sleep(2000);
		epage.clickonSaveANdpublishbtn();

	}

}
