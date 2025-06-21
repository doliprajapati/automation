package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptAlert {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
        // Maximize browser window
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.close();
        }

}
