package javascriptececutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowScroolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,200)");
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // scroll till the bottom of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");// scroll up till upside of the webpage
		Thread.sleep(3000);
		
		js.executeScript("history.go()"); // refresh

	}

}
