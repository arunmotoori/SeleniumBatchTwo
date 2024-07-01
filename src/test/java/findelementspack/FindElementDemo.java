package findelementspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@value='LogIn']"));
		String buttonLabel = loginButton.getText();
		System.out.println(buttonLabel);
		
		driver.quit();

	}

}
