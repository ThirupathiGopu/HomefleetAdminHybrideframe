package TestScripts;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Homefleet.Pages.Loginpage;
import com.Homefleets.Utilits.Browser;
import com.Homefleets.Utilits.ExtentReportsManager;
import com.Homefleets.Utilits.PropertyReader;


public class LoginpageTest 
{
	WebDriver driver;
	Loginpage login;
	
	@BeforeMethod
	public void SetUp() throws Exception
	{
		List<String> info=PropertyReader.getData("browser", 1);
		String browsername=info.get(0),drivername=info.get(1),url=info.get(2);
    	driver=Browser.LanchBrowser(browsername, drivername);
    	driver=Browser.openUrl(url);
    	System.out.println();
    }
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		ExtentReportsManager.stopReport();
	}
	
	@Test(enabled=false)
	public void Verify_functionalityOf_Loging_with_InvalidCredetionals() throws Exception
	{
		login= new Loginpage(driver);
	List<String>info=	PropertyReader.getdataa("loginpage", 2);
	String email=info.get(0),pass=info.get(1);
		login.EnterLoginCreditionals(email, pass);
		login.ClickonLoginButton();
		login.ErrormsgValidation();
		
	}
	
	@Test(enabled=false)
	public void Verify_functionalityOf_Loging_with_validCredetionals() throws Exception
	{

		ExtentReportsManager.startTest("VerifuFunctionalityHomefleetLoginwithValidData", "test case description", "test case pass");   	
		
		ExtentReportsManager.startReport();
		login= new Loginpage(driver);
		List<String>info=	PropertyReader.getdataa("loginpage", 1);
		String email=info.get(0),pass=info.get(1);
			login.EnterLoginCreditionals(email, pass);
			login.ClickonLoginButton();
			Thread.sleep(100);
			login.Loginsuccessmsgevalidation();	
			ExtentReportsManager.logInfo("lanch to Chrome Browser");
			ExtentReportsManager.logInfo("Navigate to URl");
			ExtentReportsManager.logInfo("Enter to user name "+email);
			ExtentReportsManager.logInfo("Enter to password "+pass);

			ExtentReportsManager.logInfo("click to login button ");
			ExtentReportsManager.logInfo("Display to Error message please to to email");
	}
	
	@Test(enabled=false)
	public void Verify_functionalityOf_Loging_withOutData() throws Exception
	{

		ExtentReportsManager.startTest("VerifuFunctionalityHomefleetLoginwithoutData", "test case description", "test case pass");   	
		
		ExtentReportsManager.startReport();
		login= new Loginpage(driver);
		
			login.ClickonLoginButton();
			Thread.sleep(100);	
			ExtentReportsManager.logInfo("lanch to Chrome Browser");
			ExtentReportsManager.logInfo("Navigate to URl");
			ExtentReportsManager.logInfo("click to login button ");
			ExtentReportsManager.logInfo("Display to Error message please to to email");
	}
	
	@Test(enabled=false)
	public void Verify_functionalityOf_Loging_withusernameWithoutpass() throws Exception
	{

		ExtentReportsManager.startTest("VerifuFunctionalityHomefleetLoginwithInValidaData", "test case description", "test case pass");   	
		
		ExtentReportsManager.startReport();
		login= new Loginpage(driver);
		List<String>info=	PropertyReader.getdataa("loginpage", 3);
		String email=info.get(0),pass=info.get(1);
		login.EnterLoginCreditionals(email, "");
			login.ClickonLoginButton();
			Thread.sleep(100);
			ExtentReportsManager.logInfo("lanch to Chrome Browser");
			ExtentReportsManager.logInfo("Navigate to URl");
			ExtentReportsManager.logInfo("without user name ="+email+"");
			
			ExtentReportsManager.logInfo("click to login button ");
			ExtentReportsManager.logInfo("Display to Error message please to to email");
	}
	@Test(enabled=false)
	public void Verify_functionalityOf_Loging_withoutusernameWithpassword() throws Exception
	{
		ExtentReportsManager.startTest("VerifuFunctionalityHomefleetLoginwithInValidaData", "test case description", "test case pass");   	
		
		ExtentReportsManager.startReport();
		
		login= new Loginpage(driver);
		List<String>info=	PropertyReader.getdataa("loginpage", 4);
		String email=info.get(0),pass=info.get(1);
		login.EnterLoginCreditionals("", pass);
			login.ClickonLoginButton();
			Thread.sleep(100);	
			
			ExtentReportsManager.logInfo("lanch to Chrome Browser");
			ExtentReportsManager.logInfo("Navigate to URl");
			ExtentReportsManager.logInfo("without user name ="+email+"");
			ExtentReportsManager.logInfo("enter to user password"+pass);
			ExtentReportsManager.logInfo("click to login button ");
			ExtentReportsManager.logInfo("Display to Error message please to to email");
	}
//	
//	@Test(dataProvider="logininfo",dataProviderClass =LoginpageTest.class)
//	public void LoginMutlipledata(String user,String pass) throws Exception
//	{
//		login= new Loginpage(driver);
//		login.EnterLoginCreditionals(user, pass);
//		login.ClickonLoginButton();
//	}
//	@DataProvider(name="logininfo")
//	public String[][] Getmultipledata() throws Exception
//	{
//		String data[][]=PropertyReader.getdata("loginpage");
//		return data;
//	}
}


































