package handlingautosuggestivedropdrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAutoSuggestiveDropDownDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement dropDownField = driver.findElement(By.id("twotabsearchtextbox"));
		dropDownField.sendKeys("lap");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("two-pane-results-container")));
		
		dropDownField.sendKeys(Keys.ARROW_DOWN);
		dropDownField.sendKeys(Keys.ARROW_DOWN);
		dropDownField.sendKeys(Keys.ARROW_DOWN);
		dropDownField.sendKeys(Keys.ARROW_DOWN);
		dropDownField.sendKeys(Keys.ARROW_DOWN);
		dropDownField.sendKeys(Keys.ENTER);

	}

}
