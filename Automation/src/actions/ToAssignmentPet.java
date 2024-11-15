package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToAssignmentPet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement mapFrame = driver.findElement(By.xpath("//iframe[@ id='map-instance-1502']"));
		
		driver.switchTo().frame(mapFrame);
		driver.findElement(By.name("Montana")).click();
		
		driver.switchTo().defaultContent();
				
				
		driver.findElement(By.xpath("//*[@id='outerSite']/header/div[1]/div/div[2]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='user']")).sendKeys("abcghvhgvvjbb123@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abc12345");
		driver.findElement(By.xpath("//*[@id='cpass']")).sendKeys("abc12345");
		driver.findElement(By.id("firstName")).sendKeys("shin");
		driver.findElement(By.id("lastName")).sendKeys("chan");
		driver.findElement(By.id("phone")).sendKeys("9878565210");
		
		WebElement usertype = driver.findElement(By.id("user-type"));
		Select userSelect = new Select(usertype);
		userSelect.selectByIndex(3);
		driver.findElement(By.id("accept-tou")).click();
		
		Thread.sleep(2000);
		WebElement signup = driver.findElement(By.xpath("//*[@id='alert-sub-app']/div[2]/div/form/button"));
		signup.click();
		driver.findElement(By.xpath("//*[@id='alert-sub-app-container']/div[1]/p/b")).getText();
	}

}
