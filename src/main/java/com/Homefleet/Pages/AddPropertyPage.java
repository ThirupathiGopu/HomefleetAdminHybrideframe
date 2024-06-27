package com.Homefleet.Pages;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Homefleets.Utilits.Browser;
import com.Homefleets.Utilits.DataConfigure;
import com.Homefleets.Utilits.PropertyReader;

public class AddPropertyPage
{
	WebDriver driver;
	Select select;
	public AddPropertyPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickonaddproperty() throws Exception
	{
		String addpropertbtn=PropertyReader.getLocater("Addproperty", "addpropertybtn");
		By addpropertbtnl=By.xpath(addpropertbtn);
		WebElement addpropertbtnlL=driver.findElement(addpropertbtnl);
		addpropertbtnlL.click();
	}
	
	public void Enterpropertyname(String propertyname) throws Exception
	{
		String propertynamel=PropertyReader.getLocater("Addproperty", "propertynametextbox");
		By propertynametextboxl=By.xpath(propertynamel);
		WebElement propertytextboxl=driver.findElement(propertynametextboxl);
		propertytextboxl.clear();
		propertytextboxl.click();
		//Browser.Waitmethod(propertytextboxl);
		Thread.sleep(3000);
		propertytextboxl.sendKeys(propertyname);
		//Browser.Waitmethod(propertytextboxl);
		Thread.sleep(2000);
		
	}
	public void Selectpropertytype() throws Exception
	{
		String propertytype=PropertyReader.getLocater("Addproperty", "propertytypedropdown");
		By propertytypel=By.xpath(propertytype);
		WebElement propertytypeL=driver.findElement(propertytypel);
		select=new Select(propertytypeL);
		
		select.selectByVisibleText("flat");
		Thread.sleep(2000);
		 
	}
	public void EnterAddress(String address) throws Exception
	{
		String addressl=PropertyReader.getLocater("Addproperty", "addrestextbox");
		By addrestextboxl=By.xpath(addressl);
		WebElement addresstextboxL=driver.findElement(addrestextboxl);
		addresstextboxL.clear();
		Browser.Waitmethod(addresstextboxL);
		addresstextboxL.sendKeys(address);
		
	}
	public void EnterLocationDetails(String location) throws Exception
	{
		String locationdetails=PropertyReader.getLocater("Addproperty", "locationtextbox");
		By locationdetailsl=By.xpath(locationdetails);
		WebElement locationdetailsL=driver.findElement(locationdetailsl);
		locationdetailsL.clear();
		//Browser.Waitmethod(locationdetailsL);
		Thread.sleep(2000);
		locationdetailsL.sendKeys(location);
		//Browser.Waitmethod(locationdetailsL);
		Thread.sleep(6000);
		for(int i=1;i<=3;i++)
		{
			locationdetailsL.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
		}
		locationdetailsL.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//Robot rb=new Robot();
		// press Contol+V for pasting
		//rb.keyPress(KeyEvent.VK_DOWN);
		//rb.keyPress(KeyEvent.VK_DOWN);

//Select objSelect = new Select(driver.findElement(By.id("Search-box")));
//		List <WebElement> elementCount = oSelect.getOptions();
//		System.out.println(elementCount.size());

// for pressing and releasing Enter
		
		//rb.keyRelease(KeyEvent.VK_ENTER);
		//rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public void EnterpropertypriceandSelectdropdownfortype(String enterprice, String propertytype) throws Exception
	{
		String propertyprice=PropertyReader.getLocater("Addproperty", "propertypricetextbox");
		By propertypricel=By.xpath(propertyprice);
		WebElement propertypriceL=driver.findElement(propertypricel);
		propertypriceL.clear();
		propertypriceL.sendKeys(enterprice);
		Thread.sleep(2000);
		//Browser.Waitmethod(propertypriceL);
		String properttype=PropertyReader.getLocater("Addproperty", "propertypricedropdown");
		By propertytypel=By.xpath(properttype);
		WebElement propertytypeL=driver.findElement(propertytypel);
		select=new Select(propertytypeL);
		Thread.sleep(2000);
		select.selectByVisibleText("sq.ft.");
		
		
	}
	public void EnterShortDescription(String tagname) throws Exception
	{
		String shortdescription=PropertyReader.getLocater("Addproperty", "shortdescripitontextbox");
		By shortdescriptionl=By.xpath(shortdescription);
		WebElement shortdescriptionL=driver.findElement(shortdescriptionl);
		shortdescriptionL.sendKeys(tagname);
		
	}
	public void EnterhighlightsSectionContent(String description) throws Exception
	{
		String frame=PropertyReader.getLocater("Addproperty", "Iframe");
		By framel=By.xpath(frame);
		WebElement frameL=driver.findElement(framel);	
		Browser.changeToframe(frameL);
		Thread.sleep(2000);
		String descriptionl=PropertyReader.getLocater("Addproperty", "HighlightsSectiontextbox");
		By descriptionL=By.xpath(descriptionl);
		WebElement descriptionLtext=driver.findElement(descriptionL);
		descriptionLtext.sendKeys(description);
		driver. switchTo(). defaultContent();
		
	}
	public void ClickOndropdownAndUploadPropertyBrochure() throws Exception
	{
		//driver. switchTo(). defaultContent();
		String scrolltoviewelement=PropertyReader.getLocater("Addproperty", "scrolltoview");
		By scrollviewl=By.xpath(scrolltoviewelement);
		WebElement scrollviewL=driver.findElement(scrollviewl);
		Browser.scrolldown(scrollviewL);
		String Brochureupload=PropertyReader.getLocater("Addproperty", "propertybrochureupload");
		By Brochureuploadl=By.xpath(Brochureupload);
		WebElement BrochureuploadlL=driver.findElement(Brochureuploadl);
		//BrochureuploadlL.sendKeys();
		BrochureuploadlL.sendKeys("/home/tvisha/Downloads/Sunnyside_E_Brochure_compressed_compressed_compressed.pdf");
//				Robot rb = new Robot();
//
//		// copying File path to Clipboard
//				StringSelection str = new StringSelection("/home/tvisha/Downloads.pdf");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//
//				// press Contol+V for pasting
//				rb.keyPress(KeyEvent.VK_CONTROL);
//				rb.keyPress(KeyEvent.VK_V);
//
//		// release Contol+V for pasting
//				rb.keyRelease(KeyEvent.VK_CONTROL);
//				rb.keyRelease(KeyEvent.VK_V);
//
//		// for pressing and releasing Enter
//				rb.keyPress(KeyEvent.VK_ENTER);
//				rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public void SelectLaunchdate() throws Exception
	{
	String launchdate=	PropertyReader.getLocater("Addproperty", "lanchdatetextvox");
	By launchdatel=By.xpath(launchdate);
	WebElement launchdateL=driver.findElement(launchdatel);
	launchdateL.clear();
	launchdateL.click();
	Browser.Waitmethod(launchdateL);
	String backbutton=PropertyReader.getLocater("Addproperty", "lanchdateclickbackbutn");
	By backbuttonl=By.xpath(backbutton);
	WebElement backbuttonL=driver.findElement(backbuttonl);
	backbuttonL.click();
	Browser.Waitmethod(backbuttonL);
	String selectmonth= PropertyReader.getLocater("Addproperty", "lanchdatselectmonth");
	By selectmonthl=By.xpath(selectmonth);
	WebElement selectmonthL=driver.findElement(selectmonthl);
	selectmonthL.click();
		
	}
	public void SelectPosisseondate() throws Exception
	{
		String posissoeandatextbox=PropertyReader.getLocater("Addproperty", "posisseoandatetextbox");
		By posissoeandatextboxl=By.xpath(posissoeandatextbox);
		WebElement posissoeandatextboxL=driver.findElement(posissoeandatextboxl);
		posissoeandatextboxL.clear();
		posissoeandatextboxL.click();
		
		String Nextbtn=PropertyReader.getLocater("Addproperty", "positiondataclickbackbtn");
		By Nextbtnl=By.xpath(Nextbtn);
		WebElement NextbtnlL=driver.findElement(Nextbtnl);
		NextbtnlL.click();
		Browser.Waitmethod(NextbtnlL);
		String selectmonth= PropertyReader.getLocater("Addproperty", "seletpositondatemonth");
		By selectmonthl=By.xpath(selectmonth);
		WebElement selectmonthL=driver.findElement(selectmonthl);
		selectmonthL.click();
		
	}
	public void EnterStartingPrice(String price) throws Exception
	{
		String Enterprice= PropertyReader.getLocater("Addproperty", "pricestartingrangetextbox");
		By Enterpricel=By.xpath(Enterprice);
		WebElement EnterpricelL=driver.findElement(Enterpricel);
		EnterpricelL.click();
		EnterpricelL.sendKeys(price);
	}
	public void EnterEndingprice(String endprice) throws Exception
	{
		String Enterendprice= PropertyReader.getLocater("Addproperty", "priceendingrangetextbox");
		By Enterendpricel=By.xpath(Enterendprice);
		WebElement EnterendpricelL=driver.findElement(Enterendpricel);
		EnterendpricelL.click();
		EnterendpricelL.sendKeys(endprice);
		
		
	}
	public void EnterDeveloperName(String DevName) throws Exception
	{
		
		String Developername= PropertyReader.getLocater("Addproperty", "developername");
		By Developernamel=By.xpath(Developername);
		WebElement DevelopernamelL=driver.findElement(Developernamel);
		DevelopernamelL.click();
		DevelopernamelL.sendKeys(DevName);
	}
	public void ReeraID(String Reeraid) throws Exception
	{
		String ReeraID= PropertyReader.getLocater("Addproperty", "ReeraId");
		By ReeraIDl=By.xpath(ReeraID);
		WebElement ReeraIDL=driver.findElement(ReeraIDl);
		ReeraIDL.click();
		ReeraIDL.sendKeys(Reeraid);

	}
	public void EnterLandSizeAndSelectLandType(String landsize) throws Exception
	{
		String landSizel= PropertyReader.getLocater("Addproperty", "landsize");
		By landSizeL=By.xpath(landSizel);
		WebElement landSize=driver.findElement(landSizeL);
		landSize.click();
		landSize.sendKeys(landsize);
		//Browser.Waitmethod(landSize);
		Thread.sleep(2000);
		String selectlandtype=PropertyReader.getLocater("Addproperty", "landtypedropdown");
		By selectlandtypel=By.xpath(selectlandtype);
		WebElement selectlandtypeL=driver.findElement(selectlandtypel);
	    select=new Select(selectlandtypeL);
		select.selectByVisibleText("acre");

	}
	public void EnterTotalBuiltUpAreaAndSelectLandType(String totalland) throws Exception
	{
		String EntertotlalandAre= PropertyReader.getLocater("Addproperty", "totallandbuiltuparetextbox");
		By EntertotlalandArel=By.xpath(EntertotlalandAre);
		WebElement EntertotlalandAreL=driver.findElement(EntertotlalandArel);
		EntertotlalandAreL.click();
		EntertotlalandAreL.sendKeys(totalland);
		//Browser.Waitmethod(EntertotlalandAreL);
		Thread.sleep(2000);
		String selectlandtype=PropertyReader.getLocater("Addproperty", "totallandbuiltuparetypedropdown");
		By selectlandtypel=By.xpath(selectlandtype);
		WebElement selectlandtypeL=driver.findElement(selectlandtypel);
	    select=new Select(selectlandtypeL);
		select.selectByVisibleText("sq.ft.");
		
		
	}
	public void EnterTowers(String towers) throws Exception
	{
		String EnterTowers= PropertyReader.getLocater("Addproperty", "towerstextbox");
		By EnterTowersl=By.xpath(EnterTowers);
		WebElement EnterTowerslL=driver.findElement(EnterTowersl);
		EnterTowerslL.click();
		EnterTowerslL.sendKeys(towers);
		
	}
	public void EnterUnits(String units) throws Exception
	{
		String EnterUnits= PropertyReader.getLocater("Addproperty", "Unittextbox");
		By EnterUnitsl=By.xpath(EnterUnits);
		WebElement EnterUnitslL=driver.findElement(EnterUnitsl);
		EnterUnitslL.click();
		EnterUnitslL.sendKeys(units);
		Thread.sleep(2000);
	}
	public void SelectClubhouseSection() throws Exception
	{
		String clubsection=PropertyReader.getLocater("Addproperty", "clubhousedropdown");
		By clubsectionl=By.xpath(clubsection);
		WebElement clubsectionL=driver.findElement(clubsectionl);
		Thread.sleep(2000);
	    select=new Select(clubsectionL);
		select.selectByVisibleText("2");
		
	}
	public void  selectPropertyStatus() throws Exception
	{
		String propertystatus=PropertyReader.getLocater("Addproperty", "propertystatusdropdown");
		By propertystatusl=By.xpath(propertystatus);
		WebElement propertystatuslL=driver.findElement(propertystatusl);
	    select=new Select(propertystatuslL);
	    
		select.selectByVisibleText("Ready to Move");
		
	}
	public void SpeceficationSelectTOSecurity()
	{
		
		
	}
	public void SaveAndNxebutton() throws Exception
	{
		
		String Saveandnextbtn= PropertyReader.getLocater("Addproperty", "saveandnextbtn");
		By Saveandnextbtnl=By.xpath(Saveandnextbtn);
		WebElement SaveandnextbtnL=driver.findElement(Saveandnextbtnl);
		SaveandnextbtnL.click();
		//Browser.Waitmethod(SaveandnextbtnL);
		Thread.sleep(10000);
		
	}
	public void isdisplaySuccessmessage() throws Exception
	{
		
		String sucessmesg= PropertyReader.getLocater("Addproperty", "successmsg");
		By sucessmesgl=By.xpath(sucessmesg);
		WebElement sucessmesgL=driver.findElement(sucessmesgl);
		sucessmesgL.isDisplayed();
		String succesmsgtext=sucessmesgL.getText();
		System.out.println(succesmsgtext);
		Assert.assertEquals(succesmsgtext, DataConfigure.validateofsuccessmsg,"test case is pass");
		Browser.Waitmethod(sucessmesgL);
		Thread.sleep(8000);
		
	}
	
	//images &videos page
	public void isdisplayText() throws Exception
	{
		String textmsg=PropertyReader.getLocater("Addproperty", "isdisplaytitletext");
		By textmsgl=By.xpath(textmsg);
		WebElement textmsgL=driver.findElement(textmsgl);
		textmsgL.isDisplayed();
		String data=textmsgL.getText();
		System.out.println(data);
		Assert.assertEquals(data, DataConfigure.validateofimagebannertitletext,"test case pass");
	}
	public void uploadtobannerimage() throws Exception
	{
		String uploaddimage=PropertyReader.getLocater("Addproperty", "uploadbannerl");
		By uploaddimagel=By.xpath(uploaddimage);
		WebElement uploaddimagelL=driver.findElement(uploaddimagel);
		uploaddimagelL.sendKeys("/home/tvisha/Music/Prestige_Raibnbow_Waters_Property.png");
	}
	public void uploadtopropertyimage() throws Exception
	{
		String uploadpropimage=PropertyReader.getLocater("Addproperty", "uploadpropertyimagel");
		By uploadpropimagel=By.xpath(uploadpropimage);
		WebElement uploadpropimagelL=driver.findElement(uploadpropimagel);
		uploadpropimagelL.sendKeys("/home/tvisha/Music/Prestige_Rainbow_Waters_Property_Image.png");
		
	}
	public void EnterPropertyURl() throws Exception
	{
		String propurl=PropertyReader.getLocater("Addproperty", "propertyurl");
		By propurll=By.xpath(propurl);
		WebElement propurlL=driver.findElement(propurll);
		propurlL.clear();
		propurlL.clear();
		Thread.sleep(3000);
		propurlL.sendKeys("https://admin.homefleet.in/admin/property/443");
		Thread.sleep(2000);
	}
	
	public void clickonsaveandnext() throws Exception
	{
		String savebtnl=PropertyReader.getLocater("Addproperty", "SaveandNextbtn");
		By savebtnL=By.xpath(savebtnl);
		WebElement savebtn=driver.findElement(savebtnL);
		savebtn.click();
		//Browser.Waitmethod(savebtn);
		Thread.sleep(10000);
		
	}
	
	//floor plan
	
	public void clickondropdownandSelectfloorsection() throws Exception
	{
		String floortext=PropertyReader.getLocater("Addproperty", "floortitle");
		By floortexttitle=By.xpath(floortext);
		WebElement floortexttitlel=driver.findElement(floortexttitle);
		if(floortexttitlel.isDisplayed())
		{
		String flortext=floortexttitlel.getText();
		System.out.println(flortext);
		
		String dropdownl=PropertyReader.getLocater("Addproperty", "dropdown");
		By dropdownbtnl=By.xpath(dropdownl);
		WebElement dropdownBtnL=driver.findElement(dropdownbtnl);
			select=new Select(dropdownBtnL);
			select.selectByVisibleText("2 BHK");
			Thread.sleep(2000);
		}
	}
	public void EnterAreaDetails() throws Exception
	{
		String AreaDetials=PropertyReader.getLocater("Addproperty", "AreaDetails");
		By AreaDetialsl=By.xpath(AreaDetials);
		WebElement AreaDetialslL=driver.findElement(AreaDetialsl);
		AreaDetialslL.sendKeys("1280");
		Thread.sleep(2000);	
	}
	public void Selectfacing() throws Exception
	{
		String facingl=PropertyReader.getLocater("Addproperty", "facingdropdown");
		By facingll=By.xpath(facingl);
		WebElement facinglL=driver.findElement(facingll);
		Select select;
		
			select=new Select(facinglL);
			select.selectByVisibleText("East");
			Thread.sleep(2000);
		
	}
	public void uploadfloorplanimage() throws Exception
	{
		String floorplanimage=PropertyReader.getLocater("Addproperty", "uploadfloorplanimage");
		By  floorplanimagel=By.xpath(floorplanimage);
		WebElement floorplanimageL=driver.findElement(floorplanimagel);
		floorplanimageL.sendKeys("/home/tvisha/Pictures/Floor_plan_1450_W.png");
		Thread.sleep(2000);
	}
	public void Entercomments() throws Exception
	{
		String comments=PropertyReader.getLocater("Addproperty", "comments");
		By commentsl=By.xpath(comments);
		WebElement commentslL=driver.findElement(commentsl);
		commentslL.sendKeys("Available");
		Thread.sleep(2000);
	}
	public void clickonsaveandnextbtn() throws Exception
	{
		String savebtnl=PropertyReader.getLocater("Addproperty", "saveandnextbutton");
		By savebtnL=By.xpath(savebtnl);
		WebElement savebtn=driver.findElement(savebtnL);
		savebtn.click();
		Thread.sleep(10000);
	}
	  //route map section 
	public void uploadtoroutemapimage() throws Exception
	{
		String routemap=PropertyReader.getLocater("Addproperty", "routemapl");
		By routemapl=By.xpath(routemap);
		WebElement routemapL=driver.findElement(routemapl);
		routemapL.sendKeys("/home/tvisha/Pictures/rot.png");	
		Thread.sleep(2000);
	}
	public void clickonsavebtn() throws Exception
	{
		String savebutton=PropertyReader.getLocater("Addproperty", "saveandnextbtnl");
		By savebttonl=By.xpath(savebutton);
		WebElement savebtnl=driver.findElement(savebttonl);
		savebtnl.click();
		Thread.sleep(10000);
		
		
	}
	//amenites section
	
	public void SelecttoBuildingAmenitescheckbox() throws Exception
	{
		String Buildingamenties=PropertyReader.getLocater("Addproperty", "Buildingamenitessection");
		By Buildingamentiesl=By.xpath(Buildingamenties);
		WebElement BuildingamentiesL=driver.findElement(Buildingamentiesl);
		BuildingamentiesL.isEnabled();
		BuildingamentiesL.click();
	}
	
	public void SelecttoClubhouseAmenitescheckbox() throws Exception
	{
		String clubhouseamenties=PropertyReader.getLocater("Addproperty", "clubhouseamenitesscetion");
		By clubhouseamentiesl=By.xpath(clubhouseamenties);
		WebElement clubhouseamentiesL=driver.findElement(clubhouseamentiesl);
		clubhouseamentiesL.isEnabled();
		clubhouseamentiesL.click();
	}
	public void SelecttoOutdoorAmenitescheckbox() throws Exception
	{
		String outdooramenties=PropertyReader.getLocater("Addproperty", "outdooramenitesscetion");
		By outdooramentiesl=By.xpath(outdooramenties);
		WebElement outdooramentiesL=driver.findElement(outdooramentiesl);
		outdooramentiesL.isEnabled();
		outdooramentiesL.click();
	}
	public void SelecttoOthersAmenitescheckbox() throws Exception
	{
		String othersamenties=PropertyReader.getLocater("Addproperty", "othersamenitesscetion");
		By othersamentiesl=By.xpath(othersamenties);
		WebElement othersamentiesL=driver.findElement(othersamentiesl);
		othersamentiesL.isEnabled();
		othersamentiesL.click();
	}
	public void clicktosavebutton() throws Exception
	{
		String savebutttonl=PropertyReader.getLocater("Addproperty", "Savebtnl");
		By savebuttonL=By.xpath(savebutttonl);
		WebElement savebutton=driver.findElement(savebuttonL);
		savebutton.click();
		//Browser.Waitmethod(savebutton);
		Thread.sleep(4000);
		
	}
	
//clubhouse section
	public void Enterinfodetails() throws Exception
	{
		String infodetails=PropertyReader.getLocater("Addproperty", "clubhoueinfo");
		By infodetailsl=By.xpath(infodetails);
		WebElement infodetailsL=driver.findElement(infodetailsl);
		infodetailsL.clear();
		infodetailsL.click();
		infodetailsL.sendKeys("Social media");
		
	}
	public void EntercapacityAredetails() throws Exception
	{
		String Capacitydetails=PropertyReader.getLocater("Addproperty", "CapacityArea");
		By Capacitydetailsl=By.xpath(Capacitydetails);
		WebElement CapacitydetailslL=driver.findElement(Capacitydetailsl);
		CapacitydetailslL.clear();
		CapacitydetailslL.click();
		CapacitydetailslL.sendKeys("350 members");
	}
	public void ClickondropdownAndSelectclubhousetotalclubhouse() throws Exception
	{
		String dropdown=PropertyReader.getLocater("Addproperty", "clubhousedropdown");
		By dropdownl=By.xpath(dropdown);
		WebElement dropdownL=driver.findElement(dropdownl);
		select=new Select(dropdownL);
		select.selectByVisibleText("3");
		
	}
	public void selecttoclubhouseamenities() throws Exception
	{

		String clubhouseamenites=PropertyReader.getLocater("Addproperty", "clubhouseamenities");
		By clubhouseamenitesl=By.xpath(clubhouseamenites);
		WebElement clubhouseamenitesL=driver.findElement(clubhouseamenitesl);
		clubhouseamenitesL.isEnabled();
		clubhouseamenitesL.click();
		
	}
	public void clunhousebannerimage() throws Exception
	{
		
		String clubhousebanner=PropertyReader.getLocater("Addproperty", "clunhousebannerimage");
		By clubhousebannerl=By.xpath(clubhousebanner);
		WebElement clubhousebannerL=driver.findElement(clubhousebannerl);
		clubhousebannerL.sendKeys("/home/tvisha/Pictures/aprtimga12.png");
	}
	public void clubhousepropertyimage() throws Exception
	{
		String clubhouseimage=PropertyReader.getLocater("Addproperty", "clubhousepropertyimage");
		By clubhouseimagel=By.xpath(clubhouseimage);
		WebElement clubhouseimageL=driver.findElement(clubhouseimagel);
		clubhouseimageL.sendKeys("/home/tvisha/Pictures/Appartmentimage.png");
	}
	public void nearbylocalitycategeorydropdown() throws Exception
	{
		String nearbydropdown=PropertyReader.getLocater("Addproperty", "nearbylocalitycategeorydropdown");
		By nearbydropdownl=By.xpath(nearbydropdown);
		WebElement nearbydropdownL=driver.findElement(nearbydropdownl);
		select=new Select(nearbydropdownL);
		select.selectByVisibleText("Schools/Colleges");
	}
	public void enterlocalityname() throws Exception
	{
		String localitydetails=PropertyReader.getLocater("Addproperty", "localityname");
		By localitydetailsl=By.xpath(localitydetails);
		WebElement localitydetailL=driver.findElement(localitydetailsl);
		localitydetailL.clear();
		localitydetailL.click();
		localitydetailL.sendKeys("sri sai ram high school");
		
	}
	public void selecttodistancecheckbox() throws Exception
	{
		String distancemincheckbox=PropertyReader.getLocater("Addproperty", "distancecheckboxmin");
		By distancemincheckboxl=By.xpath(distancemincheckbox);
		WebElement distancemincheckboxL=driver.findElement(distancemincheckboxl);
		if(distancemincheckboxL.isEnabled())
		{
		distancemincheckboxL.click();
		}
		else
		{
			String distanceKmscheckbox=PropertyReader.getLocater("Addproperty", "distancecheckboxkms");
			By distanceKmscheckboxl=By.xpath(distanceKmscheckbox);
			WebElement distanceKmscheckboxL=driver.findElement(distanceKmscheckboxl);
			distanceKmscheckboxL.click();
			
		}
	}
	public void distancetextbox() throws Exception
	{
		String distancedetail=PropertyReader.getLocater("Addproperty", "distancetextbox");
		By distancedetaiL=By.xpath(distancedetail);
		WebElement distancedetaiLs=driver.findElement(distancedetaiL);
		distancedetaiLs.clear();
		distancedetaiLs.click();
		distancedetaiLs.sendKeys("5");
		
		
	}
	public void savebutton() throws Exception
	{
		String clicksavebtn=PropertyReader.getLocater("Addproperty", "savebutton");
		By clicksavebtnl=By.xpath(clicksavebtn);
		WebElement clicksavebtnL=driver.findElement(clicksavebtnl);
		
		clicksavebtnL.click();
		//Browser.Waitmethod(clicksavebtnL);
		Thread.sleep(8000);
		
	}
	//display url section
	public void clickongenerateurl() throws Exception
	{
		
		String textl=PropertyReader.getLocater("Addproperty", "addpropetytext");
		By textL=By.xpath(textl);
		WebElement textLl=driver.findElement(textL);
		Browser.Waitmethod(textLl);
		String clickGenaratebtn=PropertyReader.getLocater("Addproperty", "genarateurl");
		By clickGenaratebtnl=By.xpath(clickGenaratebtn);
		WebElement clickGenaratebtnL=driver.findElement(clickGenaratebtnl);
		
		clickGenaratebtnL.click();
	}
	public void clickonSaveandpublishbutton() throws Exception
	{
		
		
		String clickpublishbtn=PropertyReader.getLocater("Addproperty", "Savebtnl");
		By clickpublishbtnl=By.xpath(clickpublishbtn);
		WebElement clickpublishbtnL=driver.findElement(clickpublishbtnl);
		
		clickpublishbtnL.click();
		Thread.sleep(2000);
		
	}
	

}
