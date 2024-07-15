package handlingmultiselectionboxpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectCommandsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement listBoxField = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(listBoxField);
		
		select.selectByVisibleText("Volvo");
		select.selectByIndex(1);
		select.selectByValue("Hyundaix");
		select.selectByIndex(3);
		
		Thread.sleep(3000);
		
		select.deselectByVisibleText("Volvo");
		select.deselectByIndex(1);
		select.deselectByValue("Hyundaix");

	}

}
