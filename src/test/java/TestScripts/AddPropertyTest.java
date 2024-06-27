package TestScripts;
import java.util.List;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.Homefleet.Pages.AddPropertyPage;
import com.Homefleet.Pages.Loginpage;
import com.Homefleets.Utilits.Browser;
import com.Homefleets.Utilits.DataConfigure;
import com.Homefleets.Utilits.ExtentReportsManager;
import com.Homefleets.Utilits.PropertyReader;
import com.aventstack.extentreports.ExtentReports;




public class AddPropertyTest 
{
	WebDriver driver;
	Loginpage login;
	AddPropertyPage addpage;
	//ExtentReports extent;
	
	@BeforeMethod
	public void SetUp() throws Exception
	{
		List<String> info=PropertyReader.getData("browser", 1);
		String browsername=info.get(0),drivername=info.get(1),url=info.get(2);
    	driver=Browser.LanchBrowser(browsername, drivername);
    	driver=Browser.openUrl(url);
    	//ExtentReportsManager.startTest("Homefleet property adding ", "ExtentReportsManager case description", "ExtentReportsManager case pass");   	
    }
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		ExtentReportsManager.stopReport();
	}
@Test

	public void VerifyLoginFunctionalitywithValidCreditionalAndAddproperty() throws Exception
	{
	   ExtentReportsManager.startTest("VerifuFunctionalityHomefleetwithValidaDataANDpropertyadding", "test case description", "test case pass");   	

	   ExtentReportsManager.startReport();

		login= new Loginpage(driver);
		List<String>info=	PropertyReader.getdataa("loginpage", 1);
		String email=info.get(0),pass=info.get(1);
			login.EnterLoginCreditionals(email, pass);
			login.ClickonLoginButton();
			Thread.sleep(100);
			login.Loginsuccessmsgevalidation();	
			addpage =new AddPropertyPage(driver);
			addpage.clickonaddproperty();
			List<String>inf=PropertyReader.getdataa("PropertDetails", 2);
			String propname=inf.get(0),addres=inf.get(1),location=inf.get(2),proptyPrice=inf.get(3),shortdescription=inf.get(4),highlight=inf.get(5),startprice=inf.get(6);
			String endprice=inf.get(7),developername=inf.get(8),Reeraid=inf.get(9),LandSize=inf.get(10),BuiltupArea=inf.get(11),Towers=inf.get(12),units=inf.get(13),porptypdrp=inf.get(17);
			addpage.Enterpropertyname(propname);
			addpage.Selectpropertytype();
			addpage.EnterAddress(addres);
			addpage.EnterLocationDetails(location);
			addpage.EnterpropertypriceandSelectdropdownfortype(proptyPrice, porptypdrp);
			addpage.EnterShortDescription(shortdescription);
			addpage.EnterhighlightsSectionContent(highlight);
			addpage.ClickOndropdownAndUploadPropertyBrochure();
			addpage.EnterStartingPrice(startprice);
			addpage.EnterEndingprice(endprice);
			addpage.EnterDeveloperName(developername);
			addpage.ReeraID(Reeraid);
			addpage.EnterLandSizeAndSelectLandType(LandSize);
			addpage.EnterTotalBuiltUpAreaAndSelectLandType(BuiltupArea);
			addpage.EnterTowers(Towers);
			addpage.EnterUnits(units);
		//	addpage.SpeceficationSelectTOSecurity();
			//addpage.SelectClubhouseSection();
			addpage.selectPropertyStatus();
			addpage.SaveAndNxebutton();
			Browser.TakeSelfi("image002");
			Thread.sleep(10000);
			addpage.isdisplaySuccessmessage();
			Thread.sleep(5000);
			//Thread.sleep(2000);
			addpage.isdisplayText();
			addpage.uploadtobannerimage();
			//System.out.println("added successfully ");
			Thread.sleep(2000);
			addpage.uploadtopropertyimage();
			//addpage.EnterPropertyURl();
			addpage.clickonsaveandnext();
			Thread.sleep(15000);
			addpage.clickondropdownandSelectfloorsection();
			addpage.EnterAreaDetails();
			addpage.Selectfacing();
			addpage.uploadfloorplanimage();
			addpage.Entercomments();
			addpage.clickonsaveandnextbtn();
			Thread.sleep(10000);
			addpage.uploadtoroutemapimage();
			addpage.clickonsavebtn();
			Thread.sleep(5000);
			addpage.SelecttoBuildingAmenitescheckbox();
			addpage.SelecttoClubhouseAmenitescheckbox();
			addpage.SelecttoOutdoorAmenitescheckbox();
			addpage.SelecttoOthersAmenitescheckbox();
			addpage.clicktosavebutton();
			Thread.sleep(15000);
			addpage.Enterinfodetails();
			addpage.EntercapacityAredetails();
			addpage.ClickondropdownAndSelectclubhousetotalclubhouse();
			addpage.selecttoclubhouseamenities();
			addpage.clunhousebannerimage();
			addpage.clubhousepropertyimage();
			addpage.nearbylocalitycategeorydropdown();
			addpage.enterlocalityname();
			addpage.selecttodistancecheckbox();
			addpage.distancetextbox();
			addpage.savebutton();
			Thread.sleep(15000);
			addpage.clickongenerateurl();
			Thread.sleep(2000);
			addpage.clickonSaveandpublishbutton();
			System.out.println(" property added successfully ");
			Thread.sleep(2000);

			ExtentReportsManager.logInfo("lanch to chrome browser");
			ExtentReportsManager.logInfo("Navigate to Application login page");
			ExtentReportsManager.logInfo("enter to user name");
			ExtentReportsManager.logInfo("enter to password");
			ExtentReportsManager.logInfo("clicked to loginbutton");
			ExtentReportsManager.logInfo("Login successfully");
			ExtentReportsManager.logPass("Login Successfull", DataConfigure.validateofloginsuccessToastmessag);
			ExtentReportsManager.logInfo("Navigate Propertylist page");
			ExtentReportsManager.logInfo("clicked addproperty button");
			ExtentReportsManager.logInfo("enter property name");
			ExtentReportsManager.logInfo("click on property type dropdown");
			ExtentReportsManager.logInfo("Selecting property type from list	");
			ExtentReportsManager.logInfo("Entered address details");
			ExtentReportsManager.logInfo("Enter location details and selecing particular location details");
			ExtentReportsManager.logInfo("Enter to proprty price");
			ExtentReportsManager.logInfo("clicked to drop down for property land type ");
			ExtentReportsManager.logInfo("selectiing property land type");
			ExtentReportsManager.logInfo("Enter to short Description text");
			ExtentReportsManager.logInfo("Enter to Highlights decription text");
			ExtentReportsManager.logInfo("click on property brochure button");
			ExtentReportsManager.logInfo("Upload to property brochure pdf file");
			ExtentReportsManager.logInfo("Selecting to Launch date section with month and year");
			ExtentReportsManager.logInfo("Selecting to posession  date section with month and year");
			ExtentReportsManager.logInfo("Enter to property Starting price");
			ExtentReportsManager.logInfo("Enter to property End price");
			ExtentReportsManager.logInfo("Enter to property developer name");
			ExtentReportsManager.logInfo("Enter to property developer Reera ID");
			ExtentReportsManager.logInfo("Enter to property developer name");
			ExtentReportsManager.logInfo("Enter to property Land Size and selecting to land type in drop down");
			ExtentReportsManager.logInfo("Enter to property total built up area and selecting built up area land type ");
			ExtentReportsManager.logInfo("Enter to property total towers ");
			ExtentReportsManager.logInfo("Enter to property total uints ");
			ExtentReportsManager.logInfo("clicked to drop down and selecting to total club house for property ");
			ExtentReportsManager.logInfo("clicked drop down and selecting property status  ");
			ExtentReportsManager.logInfo("clicked to save and next button  ");
			ExtentReportsManager.logInfo("clicked to upload banner image button and select to banner images");
			ExtentReportsManager.logInfo("clicked to upload property image button and select to property images");
			ExtentReportsManager.logInfo("clicked to save next button");
			ExtentReportsManager.logInfo("clicked to route map button and upload to banner images");
			ExtentReportsManager.logInfo("clicked to save and next button");
			ExtentReportsManager.logInfo("clicked to drop down button and selecting floor");
			ExtentReportsManager.logInfo("Enter area sq.fit or sq.yard details");
			ExtentReportsManager.logInfo("clicked to drop down and selecting property facing");
			ExtentReportsManager.logInfo("uploading property floor plan image");
			ExtentReportsManager.logInfo("Enter to comments");
			ExtentReportsManager.logInfo("clicked to save and next button");
			ExtentReportsManager.logInfo("uploading to route map image");
			ExtentReportsManager.logInfo("clicked to save and next button");
			ExtentReportsManager.logInfo("clicked check box for amenities section");
			ExtentReportsManager.logInfo("clicked to save and next button");
			ExtentReportsManager.logInfo("Enter to club house info");
			ExtentReportsManager.logInfo("Enter capacity area ");
			ExtentReportsManager.logInfo("selecting total club houses in drop down");
			ExtentReportsManager.logInfo("clicked to Club House Amenities");
			ExtentReportsManager.logInfo("clicked to drop down and selecting to near by locality form list");
			ExtentReportsManager.logInfo("Enter Locality name ");
			ExtentReportsManager.logInfo("clicked to distance check box");
			ExtentReportsManager.logInfo("Enter to distance details");
			ExtentReportsManager.logInfo("clicked to save and next buttons");
			ExtentReportsManager.logInfo("clicked genarate Url");
			//ExtentReportsManager.logPass(DataConfigure.validateofsuccessmsg,"=");
			ExtentReportsManager.logInfo("clicked to save and publish button ");

         

			//ExtentReportsManager.stopReport();
				
		
	}

}
