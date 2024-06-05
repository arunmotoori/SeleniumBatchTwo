import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qafox.com/");
		
		String expectedPageTitle = "Home - QAFox";
		System.out.println(expectedPageTitle);
		
		String actualPageTitle = driver.getTitle();
		System.out.println(actualPageTitle);
		
		if(actualPageTitle.equals(expectedPageTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
	}

}
