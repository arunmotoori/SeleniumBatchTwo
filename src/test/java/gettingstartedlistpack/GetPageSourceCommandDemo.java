package gettingstartedlistpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/status_codes/200");
		
		String htmlPageCode = driver.getPageSource();
		System.out.println(htmlPageCode);
		
		driver.quit();
	}

}
