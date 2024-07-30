package handlingcalendarspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarFiveDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String day = "13";
		String month = "Mar";
		String year = "2026";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		WebElement dateField = driver.findElement(By.id("third_date_picker"));
		dateField.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		WebElement monthDropDownField = driver.findElement(By.className("ui-datepicker-month"));
		
		Select select = new Select(monthDropDownField);
		select.selectByVisibleText(month);
		
		WebElement yearDropDownField = driver.findElement(By.className("ui-datepicker-year"));
		select = new Select(yearDropDownField);
		select.selectByVisibleText(year);
		
		String xpathText = "//td[@data-year='"+year+"']/a[text()='"+day+"']";
		WebElement dayField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathText)));
		dayField.click();
		
		
		
	}

}
