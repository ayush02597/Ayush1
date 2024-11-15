package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnFirstSelectedOption {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListbox = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(priceListbox);
		priceSelect.selectByIndex(2);
		priceSelect.selectByIndex(0);
		priceSelect.selectByIndex(1);
		
		WebElement SelectedOption = priceSelect.getFirstSelectedOption();
		System.out.println(SelectedOption.getText());
		
		List<WebElement> allSelectedOption = priceSelect.getAllSelectedOptions();
		System.out.println(allSelectedOption.size());
		
		for (WebElement ele : allSelectedOption) {
			System.out.println(ele.getText());
		}

	}

}
