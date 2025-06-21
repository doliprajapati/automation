package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class varify_the_title_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");

        // Maximize browser window
        driver.manage().window().maximize();

        // Get the actual title of the page
     //   String actualTitle = driver.getTitle();
       // String expectedTitle = "Online Shopping for Women, Men, Kids – Clothing, Footwear | Myntra";
       // if (actualTitle.equals(expectedTitle)) {
         //   System.out.println("✅ Page Title Verified Successfully: " + actualTitle);
        //} else {
          //  System.out.println("❌ Page Title Mismatch!");
           // System.out.println("Expected: " + expectedTitle);
            //System.out.println("Actual: " + actualTitle);
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        }

        // Close the browser
     //   driver.quit();
     //driver.close();   
	}


