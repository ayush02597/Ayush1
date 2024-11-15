package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentfb {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/reg/");
		WebElement monthdrop = driver.findElement(By.id("month"));
		Select monthselect = new Select(monthdrop);
		monthselect.selectByIndex(0);
		Thread.sleep(2000);
		
		List<WebElement> alloption = monthselect.getOptions();
		int count = alloption.size();
		System.out.println(count);
		/*
		 for(int i =0; i<count;i++) {
			monthselect.selectByIndex(i);
			//System.out.println(count);
			System.out.println(alloption.get(i).getText());
		}
		*/
		for(WebElement ele : alloption) {
		monthselect.selectByVisibleText(ele.getText());
		
		if(ele.isSelected()) {
		System.out.println(ele.getText()+"-----is selected");

}}
		WebElement yeardrop = driver.findElement(By.id("year"));
		Select yearselect = new Select(yeardrop);
		yearselect.selectByIndex(0);
		Thread.sleep(2000);
		
       List<WebElement> alloptionyear = yearselect.getOptions();
       int countyr = alloptionyear.size();
       
       for(int j=0;j<countyr;j++) {
    	   yearselect.selectByIndex(j);
    	   System.out.println(alloptionyear.get(j).getText());
       }

	}
}

