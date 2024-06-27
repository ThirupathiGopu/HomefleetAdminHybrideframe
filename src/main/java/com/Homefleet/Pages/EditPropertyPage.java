package com.Homefleet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Homefleets.Utilits.PropertyReader;
import com.google.j2objc.annotations.Property;

public class EditPropertyPage
{
	WebDriver driver;
	public EditPropertyPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickonsrkeditproperty() throws Exception
	{
		String editoption=PropertyReader.getLocater("Editproperty", "editoptionbtn");
		By editoptionl=By.xpath(editoption);
		WebElement editoptionL=driver.findElement(editoptionl);
		editoptionL.click();
		
	}

	public void clickonDisplayurlbtn() throws Exception
	{
		String clickonDisplayurlbtnl=PropertyReader.getLocater("Editproperty", "displayurlsectiontb");
		By clickonDisplayurlbtnll=By.xpath(clickonDisplayurlbtnl);
		WebElement clickonDisplayurlbtnlL=driver.findElement(clickonDisplayurlbtnll);
		clickonDisplayurlbtnlL.click();
		
	}
	public void clickongenarateurl() throws Exception
	{
		String url=PropertyReader.getLocater("Editproperty", "Genarate");
		By urll=By.xpath(url);
		WebElement urlL=driver.findElement(urll);
		urlL.click();
	}
	public void clickonSaveANdpublishbtn() throws Exception
	{
		String saveandpublishbtn=PropertyReader.getLocater("Editproperty", "saveandpublishbtn");
		By saveandpublishbtnl=By.xpath(saveandpublishbtn);
		WebElement saveandpublishbtnL=driver.findElement(saveandpublishbtnl);
		saveandpublishbtnL.click();
	}
}
