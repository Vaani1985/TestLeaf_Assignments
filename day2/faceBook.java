package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class faceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		//load the URL
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vaani");
		driver.findElement(By.name("lastname")).sendKeys("Swarup");
		
		//day dropdown
		WebElement day = driver.findElement(By.id("day"));
		Select dropdown1 = new Select(day);
		dropdown1.selectByValue("20");
		
		//month dropdown
				WebElement month = driver.findElement(By.id("month"));
				Select dropdown2 = new Select(month);
				dropdown2.selectByVisibleText("Sep");
		
		//month dropdown
				WebElement year = driver.findElement(By.id("year"));
				Select dropdown3 = new Select(year);
				dropdown3.selectByVisibleText("1985");		
		
		//driver.findElement(By.id("sex")).click();
		driver.findElement(By.xpath("//input[@id='sex' and @value='1']")).click();		
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("amlu@FAEBOOK2025");
		
	}

}
