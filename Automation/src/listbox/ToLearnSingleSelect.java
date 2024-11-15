package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		
		Select monthSelect=new Select(monthDropdown);
		// monthSelect.selectByIndex(11);
		// monthSelect.selectByValue("5");
		
		monthSelect.selectByVisibleText("Oct");
		Thread.sleep(3000);
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select yearSelect= new Select(yearDropdown);
		yearSelect.selectByVisibleText("1997");
		
		Thread.sleep(2000);
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select daySelect= new Select(dayDropdown);
		
		daySelect.selectByVisibleText("26");
		

	}

}
