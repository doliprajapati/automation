package DropDwonHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DwopDwonExample {

	public static void main(String[] args) throws InterruptedException {
		 // Step 1: Set up browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Step 2: Open the test site
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        // Step 3: Locate the dropdown element (Country dropdown)
        WebElement countryDropdown = driver.findElement(By.name("country"));

        // Step 4: Create Select object
        Select select = new Select(countryDropdown);

        // Step 5: Select options in 3 ways
        select.selectByVisibleText("INDIA"); // ✅ select by visible text
        Thread.sleep(1000);

        select.selectByValue("ALGERIA"); // ✅ select by option value
        Thread.sleep(1000);

        select.selectByIndex(5); // ✅ select by index (starts from 0)
        Thread.sleep(2000);

        // Step 6: Close browser
        driver.quit();
    }
	}


