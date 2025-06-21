package Alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleAlert___ok {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
        // Maximize browser window
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
  // //find alert button and perform click action
        driver.findElement(By.xpath("//a[@href=\"#OKTab\"]")).click() ;
         Thread.sleep(3000);
      //  driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
      
Thread.sleep(3000);
        // Accept the alert
        driver.switchTo().alert().accept();

        // Close browser
      //  driver.quit();

        		
	}
}
