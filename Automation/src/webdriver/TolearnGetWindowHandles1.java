package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnGetWindowHandles1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		 driver.get("https://demowebshop.tricentis.com/login");
		 driver.findElement(By.linkText("Facebook")).click();
		 Set<String> allWindowIds= driver.getWindowHandles();
		 System.out.println(allWindowIds);
		 
		 for(String id: allWindowIds);

	}

}



