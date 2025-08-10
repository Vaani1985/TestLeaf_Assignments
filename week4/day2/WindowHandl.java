package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        
       driver.get("http://leaftaps.com/opentaps/control/main");

       // Maximize the browser
       driver.manage().window().maximize();
       
       //driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("Vineeth");
       
       driver.findElement(By.id("username")).sendKeys("DemoCSR");

       // Enter the password
       driver.findElement(By.id("password")).sendKeys("crmsfa");

       // Click the Login button
       driver.findElement(By.className("decorativeSubmit")).click();
	}

}
