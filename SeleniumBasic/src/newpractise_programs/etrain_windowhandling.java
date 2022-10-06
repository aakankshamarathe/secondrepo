package newpractise_programs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class etrain_windowhandling  {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://etrain.info/in");
    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    
    String homepageID=driver.getWindowHandle();
    System.out.println("Homepage ID is : "+homepageID);
    
    driver.findElement(By.cssSelector("i.icon-twitter")).click();
    
    Set<String> Allid=driver.getWindowHandles();
    System.out.println("All Id by browser are : "+Allid);
    Allid.remove(homepageID);
    System.out.println("Childwind Id is : "+Allid);
    driver.switchTo().window(Allid.iterator().next());
    Thread.sleep(4000);
    System.out.println("Title of child window : "+driver.getCurrentUrl());
    
    driver.close();
    driver.quit();
		
		
		
	}

}
