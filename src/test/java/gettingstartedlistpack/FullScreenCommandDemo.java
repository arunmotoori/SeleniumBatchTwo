package gettingstartedlistpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().fullscreen();
		
	}

}
