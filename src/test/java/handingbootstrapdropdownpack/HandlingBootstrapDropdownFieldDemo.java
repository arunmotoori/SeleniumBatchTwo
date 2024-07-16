package handingbootstrapdropdownpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingBootstrapDropdownFieldDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		WebElement dropDownField1 = driver.findElement(By.className("drp1"));
		dropDownField1.click();
		
		WebElement accountsOption = driver.findElement(By.xpath("//li[text()='Accounts']"));
		accountsOption.click();
		
		

	}

}
