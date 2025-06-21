package DropDwonHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class simple_exaple {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();

	        // Open demo site
	        driver.get("https://demoqa.com/select-menu");

	        // Maximize window
	        driver.manage().window().maximize();

	        // Wait for page to load
	        Thread.sleep(2000);

	        // Locate the multi-select dropdown element
	        WebElement multiSelectDropdown = driver.findElement(By.id("oldSelectMenu"));

	        // Create Select object
	        Select select = new Select(multiSelectDropdown);

	        // Check if it's a multi-select dropdown
	        if (select.isMultiple()) {
	            // Select multiple options
	            select.selectByIndex(1); // Blue
	            select.selectByValue("red"); // Red
	            select.selectByVisibleText("Green"); // Green

	            Thread.sleep(2000); // Pause for observation

	            // Deselect one option
	            select.deselectByVisibleText("Green");

	            Thread.sleep(1000);

	            // Deselect all selected options
	            select.deselectAll();
	        } else {
	            System.out.println("Dropdown does not support multiple selection.");
	        }

	        // Close browser
	        Thread.sleep(2000);
	        driver.quit();
	    }
	}


