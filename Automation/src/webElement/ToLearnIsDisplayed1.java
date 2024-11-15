package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayed1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
	WebElement	Subscribebutton =driver.findElement(By.xpath("//input[@class='button-1 newsletter-subscribe-button']"));
	
	System.out.println(Subscribebutton.isDisplayed());
	System.out.println(Subscribebutton.isEnabled());
	
	Rectangle rect= driver.findElement(By.id("newsletter-subscribe-button")).getRect();
	System.out.println("height "+ rect.getHeight());
	System.out.println("width "+ rect.getWidth());
	System.out.println("x "+ rect.x);
	System.out.println("Y "+rect.y);

	}

}
