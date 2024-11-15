package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnIsMultiiple {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListbox = driver.findElement(By.id("cars"));
		Select priceselect = new Select(priceListbox);
		priceselect.selectByIndex(0);
		priceselect.selectByValue("99");
		priceselect.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		
		Thread.sleep(2000);
		//priceselect.deselectByValue("99");
		priceselect.deselectAll();
		System.out.println(priceselect.isMultiple());

	}

}
