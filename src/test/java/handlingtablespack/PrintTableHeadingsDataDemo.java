package handlingtablespack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTableHeadingsDataDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> datas = driver.findElements(By.xpath("//table[@id='table1']//th | //table[@id='table1']//td"));
		
		for(WebElement data : datas) {
			System.out.println(data.getText());
		}
		
		driver.quit();
		
	}

}
