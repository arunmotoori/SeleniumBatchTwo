package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement bikeRadioOption = driver.findElement(By.xpath("//input[@value='Bike']"));
		WebElement bicycleRadioOption = driver.findElement(By.xpath("//input[@value='Bicycle']"));
		
		WebElement penCheckboxField = driver.findElement(By.cssSelector("input[value='Pen'][name='accessories']"));
		WebElement bookCheckBoxField = driver.findElement(By.cssSelector("input[value='Book']"));
		
		System.out.println(bikeRadioOption.isSelected()); // false
		System.out.println(bicycleRadioOption.isSelected());  // true
		System.out.println(penCheckboxField.isSelected()); // false
		System.out.println(bookCheckBoxField.isSelected()); // true
		
		driver.quit();

	}

}
