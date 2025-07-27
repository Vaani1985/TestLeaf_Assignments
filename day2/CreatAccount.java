package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreatAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");

        // Launch the browser
        ChromeDriver driver = new ChromeDriver(options);
         //EdgeDriver driver=new EdgeDriver();

        // Load the url - get
        driver.get("http://leaftaps.com/opentaps/control/main");

        // Maximize the browser
        driver.manage().window().maximize();
        
        //driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("Vineeth");
        
        driver.findElement(By.id("username")).sendKeys("DemoCSR");

        // Enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click the Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Clcik on the CRMSFA link
        driver.findElement(By.partialLinkText("CRM")).click();
        //click on account tab
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Vaani Swarup");
        
        //dropdown industry type
        WebElement industryType = driver.findElement(By.name("industryEnumId"));
        Select dropdown1 = new Select(industryType);
        dropdown1.selectByIndex(3);
        
        //ownership dropdown 
        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
        Select dropdown2 = new Select(ownership);
        dropdown2.selectByVisibleText("S-Corporation");
        
        //source dropdown
        WebElement source = driver.findElement(By.id("dataSourceId"));
        Select dropdown3=new Select(source);
        dropdown3.selectByValue("LEAD_EMPLOYEE");
        
        //marketing dropdown
        WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
        Select dropdown4=new Select(marketing);
        dropdown4.selectByIndex(6);
        
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
        //state dropdown
        WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select dropdown5 = new Select(state);
        dropdown5.selectByValue("TX");
        
        driver.findElement(By.className("smallSubmit")).click();
        
      //close the chrome browser
      	driver.close();
        

	}

}
