package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
	try {	
		 WebElement genderTF = driver.findElement(By.id("custom_gender"));
		 System.out.println(genderTF.isDisplayed());
	}
		 catch (Exception e) {
		 System.out.println("Element is not displayed");

	}

	}
}
