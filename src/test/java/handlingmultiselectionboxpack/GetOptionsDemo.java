package handlingmultiselectionboxpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement listBoxField = driver.findElement(By.id("superheros"));
		
		Select select = new Select(listBoxField);
		
		List<WebElement> options = select.getOptions();
		
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		driver.quit();

	}

}
