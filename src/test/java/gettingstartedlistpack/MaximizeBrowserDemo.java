package gettingstartedlistpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowserDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
//		Options options = driver.manage();
//		Window window = options.window();
//		window.maximize();
		
		//Optimized using method chaining mechanism in Java
		driver.manage().window().maximize();

	}

}
