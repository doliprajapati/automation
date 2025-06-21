package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp"); // Example site

 // Find the file input element
 WebElement uploadElement = driver.findElement(By.id("myFile"));

 // Enter the file path (absolute path required)
 uploadElement.sendKeys("C:\\Users\\dolip\\Downloads");

	}

}
