package handlingmultiselectionboxpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleTextDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelectionBoxField);
		
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Audi");
		
		

	}

}
