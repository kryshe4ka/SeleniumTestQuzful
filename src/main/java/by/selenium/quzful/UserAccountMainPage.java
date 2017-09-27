package by.selenium.quzful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import by.selenium.quzful.Page;

public class UserAccountMainPage extends Page {

	@FindBy(xpath = "//*[@id=\"user-panel\"]/li//b/a")
	private WebElement eUserProfileLink;

	public UserAccountMainPage(WebDriver driver) {
		super(driver);
	}

	public UserAccountProfile openUserProfile() {
		eUserProfileLink.click();
		sleep(2000);
		return new UserAccountProfile(driver);

	}

}
