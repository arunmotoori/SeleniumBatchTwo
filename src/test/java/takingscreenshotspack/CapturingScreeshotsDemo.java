package takingscreenshotspack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreeshotsDemo {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String destFilePath = System.getProperty("user.dir")+"\\screenshots\\homepage.png";
//		File destFile = new File(destFilePath);
//		FileHandler.copy(srcFile,destFile);
		
		captureScreenshot(driver,"HomePage");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		captureScreenshot(driver,"SearchPage");
		
		driver.quit();

	}
	
	public static void captureScreenshot(ChromeDriver driver,String fileName) throws IOException {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File(System.getProperty("user.dir")+"\\screenshots\\"+fileName+".png"));
	
	}

}
