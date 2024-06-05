package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String expectedText = "PracticeAutomationHere";
		System.out.println(expectedText);
		WebElement pahElement = driver.findElement(By.id("pah"));
		String actualText = pahElement.getText();
		System.out.println(actualText);
		
		if(actualText.equals(expectedText)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}

	}

}
