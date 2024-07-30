package handlingtablespack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingNumberOfTableColumnsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> tableHeadings = driver.findElements(By.xpath("//table[@id='table1']//th"));
		
		System.out.println(tableHeadings.size());
		
		driver.quit();

	}

}
