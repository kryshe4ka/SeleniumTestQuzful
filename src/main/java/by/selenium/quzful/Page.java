package by.selenium.quzful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {
	protected final WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void sleep(int msek) {
		try {
			Thread.sleep(msek);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
