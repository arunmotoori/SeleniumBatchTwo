package handlingframespack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSiblingFramesDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-left");
		
		WebElement leftBody = driver.findElement(By.xpath("//body"));
		String text1 = leftBody.getText();
		System.out.println(text1);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		
		WebElement middleTextElement = driver.findElement(By.id("content"));
		String text2 = middleTextElement.getText();
		System.out.println(text2);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		
		WebElement rigthBody = driver.findElement(By.xpath("//body"));
		String text3 = rigthBody.getText();
		System.out.println(text3);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
		
		WebElement bottomTextElement = driver.findElement(By.xpath("//body"));
		String text4 = bottomTextElement.getText();
		System.out.println(text4);
		
		driver.quit();

	}

}
