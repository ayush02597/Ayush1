package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/login");
		 
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 
		 String errorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		 
		 if(errorMsg.contains("Login was unsuccessful")) {
			 System.out.println("error msg is displayed");
		 }
		 else {System.out.println("error msg not displayed or incorrect");

		 }
	}
}