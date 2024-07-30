package handlingtablespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingEntireTalbeDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		int rows = driver.findElements(By.xpath("//table[@id='table1']//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@id='table1']//th")).size();
		
		for(int r=1;r<=rows;r++) {
			
			for(int c=1;c<=cols;c++) {
				
				if(r==1) {
					
					String xpathText = "//table[@id='table1']//th["+c+"]";
					String tableHeading = driver.findElement(By.xpath(xpathText)).getText();
					System.out.print(tableHeading+" ");
				
				}else {
					
					String xpathText = "//table[@id='table1']//tr["+(r-1)+"]/td["+c+"]";
					String tableData = driver.findElement(By.xpath(xpathText)).getText();
					System.out.print(tableData+" ");
				}
				
			}
			
			System.out.println();
		
		}
		
		driver.quit();

	}

}
