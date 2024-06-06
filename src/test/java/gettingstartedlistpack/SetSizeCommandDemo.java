package gettingstartedlistpack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		Dimension dimension = new Dimension(600,200); // width,height
		driver.manage().window().setSize(dimension);

	}

}
