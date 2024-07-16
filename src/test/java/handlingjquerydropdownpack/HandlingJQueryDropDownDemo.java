package handlingjquerydropdownpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJQueryDropDownDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		WebElement dropDownField2 = driver.findElement(By.id("justAnotherInputBox"));
		dropDownField2.click();
		
		WebElement choice22 = driver.findElement(By.xpath("(//span[text()='choice 2 2'])[3]"));
		choice22.click();

	}

}
