package gettingstartedlistpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetClassCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String driverName = driver.getClass().getSimpleName();
		
		if(driverName.equals("ChromeDriver")) {
			System.out.println("Script is running on chrome browser");
		}else if(driverName.equals("FirefoxDriver")) {
			System.out.println("Script is running on firefox browser");
		}else if(driverName.equals("EdgeDriver")) {
			System.out.println("Script is running on Edge browser");
		}else if(driverName.equals("InternetExplorerDriver")) {
			System.out.println("Script is running on Edge browser in IE mode");
		}else if(driverName.equals("SafariDriver")) {
			System.out.println("Script is runnong on Safari browser");
		}
	
		driver.quit();

	}

}
