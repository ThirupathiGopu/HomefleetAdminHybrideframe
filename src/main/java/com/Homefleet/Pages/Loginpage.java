package com.Homefleet.Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Homefleets.Utilits.Browser;
import com.Homefleets.Utilits.DataConfigure;
import com.Homefleets.Utilits.PropertyReader;

public class Loginpage 
{

WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	private void EnterUserName(String email) throws Exception
	{
		String usernamel=PropertyReader.getLocater("Loginpage", "emailid");
		By usernametextl=By.xpath(usernamel);
		WebElement usernametextL=driver.findElement(usernametextl);
		usernametextL.clear();
		Browser.Waitmethod(usernametextL);
		usernametextL.click();
		usernametextL.sendKeys(email);
		Browser.Waitmethod(usernametextL);
	}
	private void Enterpassword(String pass) throws Exception
	{
		String Passwordl=PropertyReader.getLocater("Loginpage", "password");
		By Passwordtextl=By.xpath(Passwordl);
		WebElement PasswordtextL=driver.findElement(Passwordtextl);
		Browser.Waitmethod(PasswordtextL);
		PasswordtextL.clear();
		PasswordtextL.click();
		PasswordtextL.sendKeys(pass);
		Browser.Waitmethod(PasswordtextL);
		
	}
	public void ClickonLoginButton() throws Exception
	{
		String loginBtn=PropertyReader.getLocater("Loginpage", "Loginbtn");
		By loginbtnl=By.xpath(loginBtn);
		WebElement loginbtnL=driver.findElement(loginbtnl);
		
		if(loginbtnL.isDisplayed())
		{
		loginbtnL.click();
		
		Browser.Waitmethod(loginbtnL);
		}
		else
		{
			System.out.println(" not able to perform ");
			
		}
	}
		public void Loginsuccessmsgevalidation() throws Exception
		{
	
		
		String toastmsgl=PropertyReader.getLocater("Loginpage", "successToastmsgl");
			By toastmsgtextl=By.xpath(toastmsgl);
			WebElement toastmsgtextL=driver.findElement(toastmsgtextl);
			if(toastmsgtextL.isDisplayed())
			{
			String data =toastmsgtextL.getText();
			System.out.println(data);
			
			Assert.assertEquals(data,DataConfigure.validateofloginsuccessToastmessag,"test case is pass");
			}
			else
			{
				System.out.println("Not able to login");
			}
			
		}
		public void ErrormsgValidation() throws Exception
		{
			 String errormsg=PropertyReader.getLocater("Loginpage", "ErrorMsg");
			 By ErrorMsgl=By.xpath(errormsg); 
			 WebElement ErrorMsgtxtl=driver.findElement(ErrorMsgl); 
			 if(ErrorMsgtxtl.isDisplayed())
			 {
			 ErrorMsgtxtl.isDisplayed();
			  String errorm=ErrorMsgtxtl.getText(); System.out.println(errorm);
			  Assert.assertEquals(errorm,DataConfigure.validateofErrorMsg,"test case is fail");
		}
			 else
				{
					System.out.println("incorrect details also login ");
				}
		
		}
	
	public void EnterLoginCreditionals(String Username, String password) throws Exception
	{
		this.EnterUserName(Username);
		this.Enterpassword(password);
		System.out.println("enter successfully");
	}

}
