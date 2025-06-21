package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class RightClickMe {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
        // Maximize browser window
        driver.manage().window().maximize();
	        // Open site
	        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

	        // Locate the element to right-click
	        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

	        // Create Actions class object
	        Actions actions = new Actions(driver);

	        // Perform right click
	        actions.contextClick(rightClickButton).perform();
	}

}
