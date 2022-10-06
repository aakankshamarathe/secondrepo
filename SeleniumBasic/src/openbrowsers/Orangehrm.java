package openbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
    String FFExepath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
    System.setProperty("webdriver.gecko.driver", FFExepath);
    WebDriver driver= new FirefoxDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    String Pagetitle=driver.getTitle();
    String ExpectedTitle="OrangeHRM";
    System.out.println("PageTitle is = "+Pagetitle);
    System.out.println("Expected Title is = "+ExpectedTitle);
    System.out.println("Title validation status is "+Pagetitle.equals(ExpectedTitle));
    String PageURL=driver.getCurrentUrl();
    String ExpectedUrl="opensource-demo.orangehrmlive.com";
    System.out.println("PageURL is = "+PageURL);
    System.out.println("ExpectedUrl is "+ExpectedUrl);
    System.out.println("Url validation status is "+PageURL.contains(ExpectedUrl));
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
   Thread.sleep(2000);
  
    String homepagetitle=driver.getTitle();
    System.out.println("Homepagetitle is "+homepagetitle);
    String homepageurl=driver.getCurrentUrl();
    System.out.println("homepage url is "+homepageurl);
    driver.findElement(By.id("welcome")).click();
    driver.findElement(By.linkText("Logout")).click();
   // driver.findElement(By.id("MP_link")).click();
    
    
    
		
		
		
		
		
	}

}
