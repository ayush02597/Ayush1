package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathSearch {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		// xpath by attribute
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).click();
		
		
		Thread.sleep(5000);
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("7004196479");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading & Non-Users')]")).click();
		
		Thread.sleep(3000);
		
		// dependent & independent xpath
		driver.get("https://demowebshop.tricentis.com/desktops");
		
		driver.findElement(By.xpath("//a[text()='Simple Computer']/..//input[@value='Add to cart']")).click();
		
		Thread.sleep(3000);
		// for dunzo dependent & independent
		
		driver.get("https://www.dunzo.com/search");
		driver.findElement(By.xpath("(//p[text()='Apple - Shimla'])[1]/../..//p[contains(text(),'₹')]")).click();
		
	}

}
