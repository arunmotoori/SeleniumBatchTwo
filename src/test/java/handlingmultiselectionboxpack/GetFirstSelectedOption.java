package handlingmultiselectionboxpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement listBoxField = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(listBoxField);
		
		select.selectByIndex(3);
		select.selectByIndex(0);
		select.selectByIndex(1);
		
		WebElement option = select.getFirstSelectedOption();
		
		System.out.println(option.getText());
		
		driver.quit();

	}

}
