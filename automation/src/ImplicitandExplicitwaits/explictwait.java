package ImplicitandExplicitwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
public class explictwait {

	public static void main(String[] args) {
	
		       
		        WebDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();
		        driver.get("https://demoqa.com/dynamic-properties");

		        // Create WebDriverWait instance
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        // Wait until the button becomes visible
		        WebElement visibleButton = wait.until(
		            ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter"))
		        );
		        visibleButton.click();

		        driver.quit();
		    }
		

}
