package gettingstartedlistpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeBrowserDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize();

	}

}
