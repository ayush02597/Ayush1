package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValuee {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://demowebshop.tricentis.com/");
		 
	
		 
		 WebElement register= driver.findElement(By.xpath("//a[@class='ico-register']"));
		 
		 String color = register.getCssValue("color");
		 String fontSize = register.getCssValue("font-size");
		 String fontFamily = register.getCssValue("font-family");
		 
		 System.out.println(color);
		 System.out.println(fontSize);
		 System.out.println(fontFamily);
		 


}
}
