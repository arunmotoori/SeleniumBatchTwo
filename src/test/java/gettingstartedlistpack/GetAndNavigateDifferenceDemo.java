package gettingstartedlistpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigateDifferenceDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.get("https://www.qafox.com/"); // This is not a good practice
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();

	}

}
