package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import newTourPOMPages.registrationPage;

public class registrationPageTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		registrationPage RGpage = new registrationPage(driver);
		driver.get("https://demo.guru99.com/test/newtours/");
		RGpage.clickRegLink();

	}
	

}
