package handlingtablespack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingNumberOfTableRowsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		
		System.out.println(tableRows.size());
		
		driver.quit();

	}

}
