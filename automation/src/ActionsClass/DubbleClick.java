package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DubbleClick {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Open demo site
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        // 2. Locate the double-click button
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        // 3. Create Actions object
        Actions actions = new Actions(driver);

        // 4. Perform double-click
        actions.doubleClick(doubleClickBtn).perform();
	}

}
