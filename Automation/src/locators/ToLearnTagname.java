package locators;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagname {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/login");
	List<WebElement> allLinks=	driver.findElements(By.tagName("a"));
      System.out.println(allLinks.size());
      //to find last link in web page
      allLinks.get(allLinks.size()-1).click();
      
      
   //  And to get text of each elements
       for( WebElement  w : allLinks)
        System.out.println(w.getText());
	}

}
