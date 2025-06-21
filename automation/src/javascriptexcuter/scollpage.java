package javascriptexcuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class scollpage {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.myntra.com");

	        // Search for "Shoes"
	        WebElement searchBox = driver.findElement(By.className("desktop-searchBar"));
	        searchBox.sendKeys("Shoes");
	        searchBox.sendKeys(Keys.ENTER);

	        // Wait for page load
	        Thread.sleep(3000);

	        // Scroll down using JavaScript
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 1000);");
	        Thread.sleep(2000);

	        // Locate first product
	        WebElement product = driver.findElement(By.xpath("(//li[@class='product-base'])[2]"));

	        // Highlight the product using JS
	        js.executeScript("arguments[0].style.border='3px solid red';", product);

	        // Click on the product using JS
	        js.executeScript("arguments[0].click();", product);

	      

	       
	}

}
