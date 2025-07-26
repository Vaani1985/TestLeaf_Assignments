package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumWeb {

	public static void main(String[] args) 
	{
		//launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//mmaximze the chrome browser
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button 
		driver.findElement(By.className("decorativeSubmit")).click();
		//close the chrome browser
		driver.close();
	}
}