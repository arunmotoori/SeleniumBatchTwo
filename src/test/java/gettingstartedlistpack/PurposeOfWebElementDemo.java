package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PurposeOfWebElementDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement preLoadedTextBoxField = driver.findElement(By.id("textbox1"));
		
		preLoadedTextBoxField.clear();
		preLoadedTextBoxField.sendKeys("Arun Motoori");
		preLoadedTextBoxField.clear();
		preLoadedTextBoxField.sendKeys("QAFox");
		preLoadedTextBoxField.clear();
		preLoadedTextBoxField.sendKeys("WebElement");

	}

}
