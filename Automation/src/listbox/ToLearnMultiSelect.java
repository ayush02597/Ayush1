package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelect {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement priceListbox = driver.findElement(By.id("cars"));
		Select priceSelect= new Select(priceListbox);
		priceSelect.selectByIndex(0);
		priceSelect.selectByValue("199");
		priceSelect.selectByVisibleText("More Than INR 500 (55)");
	}

}
