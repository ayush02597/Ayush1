package webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TolearnFullScreen {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
      driver.get("https://www.agoda.com/en-in/");
	}


}
