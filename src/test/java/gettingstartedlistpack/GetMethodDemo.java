package gettingstartedlistpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("tutorialsninja.com/demo"); - InvalidArgumentException
		driver.get("https://tutorialsninja.com/demo/");

	}

}
