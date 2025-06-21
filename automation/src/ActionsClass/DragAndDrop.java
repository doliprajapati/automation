package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 // 1. Open demo drag-drop site
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        // 2. Locate source and target elements
        WebElement source = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
        WebElement target = driver.findElement(By.id("bank"));

        // 3. Create Actions object
        Actions actions = new Actions(driver);

        // 4. Perform drag and drop
        actions.dragAndDrop(source, target).perform();

	}

}
