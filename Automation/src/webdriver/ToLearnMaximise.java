package webdriver;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ToLearnMaximise {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	      driver.get("https://www.agoda.com/en-in/");
		}

	}

