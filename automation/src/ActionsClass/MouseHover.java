
package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        // 1. Open Myntra
		        driver.get("https://www.myntra.com");

		        // 2. Create Actions object
		        Actions actions = new Actions(driver);

		        // 3. Locate the "Men" menu item
		        WebElement menMenu = driver.findElement(By.xpath("//a[text()='Men']"));

		        // 4. Hover on "Men"
		        actions.moveToElement(menMenu).perform();
		        Thread.sleep(2000); // wait for dropdown to appear

		        // 5. Click on "T-Shirts" under Men
		        WebElement tshirts = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
		        tshirts.click();

		        // 6. Print page title to confirm
		        System.out.println("Page Title: " + driver.getTitle());

		        // driver.quit();
		        
		        
	}
}
