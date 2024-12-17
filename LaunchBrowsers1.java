package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowsers1 {

	public static void main(String[] args) {
		// to launch chrome browser
		ChromeDriver driver  = new ChromeDriver();
		
		// to load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/S")).click();
		driver.findElement(By.linkText("Leads")).click();
		//perform actions
		String title1 = driver.getTitle();
        System.out.println(title1);
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Annie");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kiruba");
		
		//locate the dropdown element
        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select obj = new Select(source);
        obj.selectByIndex(4);
		obj.selectByVisibleText("Employee");
		
        WebElement Industry= driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select obj1 = new Select(Industry);
        obj1.selectByValue("IND_SOFTWARE");
        
        WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select obj2= new Select(Ownership);
        obj2.selectByIndex(5);
        
        WebElement PreferredCurrency  = driver.findElement(By.id("createLeadForm_currencyUomId"));
        Select obj4= new Select(PreferredCurrency);
        obj4.selectByValue("INR");
        
        WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
        Select obj3 = new Select(Country);
        obj3.selectByVisibleText("India");
        
        driver.findElement(By.name("submitButton")).click();
        String title2 = driver.getTitle();
        System.out.println(title2);
        
        
        
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
