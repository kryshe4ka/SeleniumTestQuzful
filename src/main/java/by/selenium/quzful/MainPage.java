package by.selenium.quzful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import by.selenium.quzful.Page;

public class MainPage extends Page {
	
	@FindBy(id = "login")
	private WebElement eLoginField;

	@FindBy(name = "loginForm.password")
	private WebElement ePasswordField;
	
	@FindBy(name = "ok")
	private WebElement eButtonEnter;
	
	private final String URL = "http://www.quizful.net/LoginAction.loginForm";
	private final String LOGIN = "login";
	private final String PASSWORD = "password";
	
	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	public UserAccountMainPage authorization(){
		eLoginField.sendKeys(LOGIN);
		ePasswordField.sendKeys(PASSWORD);
		eButtonEnter.click();
		return new UserAccountMainPage(driver);
		
	}

	public void open() {
		getDriver().get(URL);
	}
}
