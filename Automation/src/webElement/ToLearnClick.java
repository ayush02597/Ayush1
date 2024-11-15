package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnClick {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.get("https://demowebshop.tricentis.com/desktops");
     driver.findElement(By.linkText("login")).click();
	}

}
