package listbox;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFresherworld {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		
		 WebElement RegisterButton = driver.findElement(By.xpath("//*[@id='reg_new_btn']"));
		 System.out.println("Display status: "+RegisterButton.isDisplayed());
        RegisterButton.click();
        WebElement currentcity= driver.findElement(By.id("currentCity"));
        Select citySelect=new Select(currentcity);
        citySelect.selectByVisibleText("Bangalore");
       // citySelect.selectByIndex(0);
        WebElement currentcourse= driver.findElement(By.id("course"));
        Select courseSelect=new Select(currentcourse);
        
        courseSelect.selectByVisibleText("BE/B.Tech");
        driver.findElement(By.id("firstname")).sendKeys("Vaibhabh");
        driver.findElement(By.id("lastname")).sendKeys("singh");
        driver.findElement(By.id("email")).sendKeys("vaibhabh123@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("don");
        driver.findElement(By.id("mobile")).sendKeys("9876543210");
        Thread.sleep(3000);
        
        WebElement submitbutton = driver.findElement(By.id("wait"));
        submitbutton.submit();
        
	}

}
