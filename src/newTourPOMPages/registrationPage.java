package newTourPOMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationPage {
	WebDriver driver ;
	By RegLink= By.linkText("REGISTER");
	By FristName= By.name("firstName");
	By LastName= By.name("lastName");
	By phone= By.name("phone");
	
	
	public registrationPage (WebDriver d){
		driver=d;
		
	}
	public void clickRegLink() {
		driver.findElement(RegLink).click();
	}
}
