package ImplicitandExplicitwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class implicit_explicit {

	public static void main(String[] args) {
		
		
		 
		        WebDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();
		        
		        // Implicit wait applied globally
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		        driver.get("https://www.google.com");

		        // If the element takes time to appear, driver waits up to 10 second

		        WebElement searchBox = driver.findElement(By.name("q"));
		        searchBox.sendKeys("Selenium");
		        
		        driver.quit();
		    }
		}

	


