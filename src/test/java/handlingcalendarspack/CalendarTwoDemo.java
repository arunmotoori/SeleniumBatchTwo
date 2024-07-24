package handlingcalendarspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarTwoDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedDay = "13";
		String expectedMonth = "March";
		String expectedYear = "2026";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		
		Thread.sleep(5000);
		
		WebElement dateField = driver.findElement(By.id("form-field-travel_comp_date"));
		dateField.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement nextOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("flatpickr-next-month")));

		WebElement actualMonthElement = driver.findElement(By.className("cur-month"));
		String actualMonth = actualMonthElement.getText().trim();
		
		while(!actualMonth.equals(expectedMonth)) {
			
			nextOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("flatpickr-next-month")));
			nextOption.click();
			Thread.sleep(1000);
			actualMonthElement = driver.findElement(By.className("cur-month"));
			actualMonth = actualMonthElement.getText().trim();
			
		}
		
		WebElement actualYearElement = driver.findElement(By.xpath("//input[@class='numInput cur-year']"));
		actualYearElement.clear();
		actualYearElement.sendKeys(expectedYear);
		
		String dayXpathText = "//span[@class='flatpickr-day '][text()='"+expectedDay+"']";
		
		WebElement dayElement = driver.findElement(By.xpath(dayXpathText));
		dayElement.click();
		
	}

}
