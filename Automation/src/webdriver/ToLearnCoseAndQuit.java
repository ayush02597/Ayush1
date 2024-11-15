package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCoseAndQuit {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
      //driver.get("http://www.instagram.com/");
		//driver.quit();
	}

}
