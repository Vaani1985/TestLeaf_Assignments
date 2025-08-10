package week4.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowestMobilePrice {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List <WebElement> allPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int nmbrOfPrice = allPrice.size();
		System.out.println(nmbrOfPrice);
		
		//List <String> priceList = new ArrayList <String>();
		List <Integer> priceList = new ArrayList <Integer>();
		for (int i = 0; i < nmbrOfPrice; i++) {
			String mobilePrice = allPrice.get(i).getText(); 
			mobilePrice = mobilePrice.replace(",", "");
			if(!mobilePrice.isEmpty()) {
				try {
					int intPrice = Integer.parseInt(mobilePrice);
					priceList.add(intPrice);
				}catch (NumberFormatException e) {
					System.out.println("catched exception");
				}
			}
		}	
		System.out.println("the mobile price list : " +priceList);
		Collections.sort(priceList);
		System.out.println("the sorted mobile price list : " +priceList);
		System.out.println("the lowest price is : " +priceList.get(0));
	}
}
