package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
// WebDriver driver=new EdgeDriver();
//driver.get("https://www.facebook.com/");
}
}