package by.selenium.quzful;

import by.selenium.quzful.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditingUserProfileSettings extends Page {
	
	@FindBy(xpath = "//*[@id='profile-personal-form']/div[2]/b")
	private WebElement ePersonalData;
	
	@FindBy(name = "personalForm.name")
	private WebElement ePersonalName;
	
	@FindBy(name = "personalForm.surname")
	private WebElement ePersonalSurname;
	
	@FindBy(name = "personalForm.birthyear")
	private WebElement ePersonalBirthyear;
	
	@FindBy(name = "personalForm.site")
	private WebElement ePersonalSite;
	
	@FindBy(name = "personalForm.company")
	private WebElement ePersonalCompany;
	
	@FindBy(name = "personalForm.about")
	private WebElement ePersonalAbout;
	
	@FindBy(name = "personalForm.countryId")
	private WebElement ePersonalCountryId;
	
	@FindBy(name = "personalForm.cityId")
	private WebElement ePersonalCityId;
	
	@FindBy(name = "personalForm.zone")
	private WebElement ePersonalZone;
	
	@FindBy(xpath = "//*[@id='profile-notifications-form']/div[1]/b")
	private WebElement ePersonalNotifications;
	
	@FindBy(name = "notificationsForm.notificationsEnabled")
	private WebElement eNotificationsEnabled;
	
	@FindBy(name = "notificationsForm.deliveryEnabled")
	private WebElement eDeliveryEnabled;
	
	@FindBy(xpath = "//*[@id='profile-privacy-form']/div[1]/b")
	private WebElement ePrivacy;

	@FindBy(xpath = "//input[@name = 'privacyForm.profileVisibility'][@value = \"closed\"]")
	private WebElement eProfileVisibility;
	
	@FindBy(name = "personalForm.avatar")
	private WebElement Avatar;
	
	public EditingUserProfileSettings(WebDriver driver) {
		super(driver);
	}
	
	public void editPersonalData() {
		ePersonalData.click();
		sleep(500);
		ePersonalName.sendKeys("Lisa");
		ePersonalSurname.sendKeys("Kryshkovskaya");
		ePersonalBirthyear.sendKeys("30.01.1994");
		ePersonalSite.sendKeys("kryshe4ka");
		ePersonalCompany.sendKeys("ST");
		ePersonalAbout.sendKeys("Girl");
		Select dropdown = new Select(ePersonalCountryId);
		ePersonalCountryId.click();
		dropdown.selectByIndex(4);
		dropdown = new Select(ePersonalZone);
		ePersonalZone.click();
		dropdown.selectByIndex(5);
		
		ePersonalData.click();
		sleep(500);
		ePersonalNotifications.click();
		sleep(500);
		eNotificationsEnabled.click();
		eDeliveryEnabled.click();
		sleep(500);
		ePrivacy.click();
		sleep(500);
		eProfileVisibility.click();
		sleep(500);
		ePersonalData.click();
		sleep(500);
		
		try {
			Avatar.sendKeys("/Users/kryshe4ka/Downloads/IMG_15092017_213238_0.png");
		} catch (Exception e) {
			System.out.println("can't upload the file " + e);
		}
		
		sleep(4000);
	
		
	}
}
