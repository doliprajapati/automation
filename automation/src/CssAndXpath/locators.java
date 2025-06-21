package CssAndXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com");

 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[placeholder='Search for products, brands and more']")
        ));

        searchBox.sendKeys("Tops For Girls");

      

        driver.close();
        
	}

}
