package by.selenium.quzful;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import by.selenium.quzful.MainPage;
import junit.framework.TestCase;

@RunWith(JUnit4.class)
public class AuthorizationTest extends TestCase {
	private WebDriver driver;
	private final String CHROME = "webdriver.chrome.driver";
	private final String CHROMEDRIVERPATH = "/usr/local/bin/chromedriver";

	@Before
	public void initBrowserChrome() {
		System.setProperty(CHROME, CHROMEDRIVERPATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void quzfulTest() {
		// Open main page
		MainPage mainPage = new MainPage(driver);
		mainPage.open();
		UserAccountMainPage userAccountMainPage = mainPage.authorization();
		UserAccountProfile userAccountProfile = userAccountMainPage.openUserProfile();
		EditingUserProfileSettings editingUserProfileSettings = userAccountProfile.editProfile();
		editingUserProfileSettings.editPersonalData();
		
		
	}

	@After
	public void destroyBrowser() {
		driver.quit();
	}
}
