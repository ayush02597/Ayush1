package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 * open app
 * logo presence
 * login
 * Close
 */

public class TestNg2 {
	WebDriver driver;
  @Test(priority=1)
  public void open() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
	  
	  
	  
  }
  @Test(priority=2)
  void testlogo()  {
	  boolean logo =driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println(logo+" logo is displayed");
	  
  }
  @Test(priority=3)
  void login() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  Thread.sleep(5000);
	  
  }
  
  @Test(priority=4)
  void close() {
	  driver.close();
	  
  }
}
