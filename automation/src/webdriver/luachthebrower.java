package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class luachthebrower {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\dolip\Downloads\chromedriver-win64");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.myntra.com");

        // Maximize browser window
        driver1.manage().window().maximize();
	        driver1.navigate().to("https://google.com");
	        driver1.navigate().to("https://example.com");

	     //   driver.navigate().back();    // Goes back to Google
	     //   driver.navigate().forward(); // Moves forward to Example
	        
	}

}
