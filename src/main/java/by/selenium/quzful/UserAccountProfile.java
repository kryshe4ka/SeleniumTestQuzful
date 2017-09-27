package by.selenium.quzful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import by.selenium.quzful.Page;

public class UserAccountProfile extends Page {
	
	@FindBy(xpath = "//*[@id='middle']/div[2]/div[1]/div[2]/div/a")
	private WebElement eButtonEditSettings;

	public UserAccountProfile(WebDriver driver) {
		super(driver);
	}
	
	public EditingUserProfileSettings editProfile() {
		eButtonEditSettings.click();
		sleep(3000);
		return new EditingUserProfileSettings(driver);
	}
}
