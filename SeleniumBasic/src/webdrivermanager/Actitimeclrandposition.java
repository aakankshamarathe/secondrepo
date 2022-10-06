package webdrivermanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitimeclrandposition {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("Manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(4000);
		WebElement errormsg = driver.findElement(By.cssSelector("td>span.errormsg"));
		System.out.println("Is errormsg displayed : "+errormsg.isDisplayed());
		System.out.println("Errormsg : "+errormsg.getText());
		System.out.println("color of errormsg : "+errormsg.getCssValue("color"));
		System.out.println("errormsg fontsize is : "+errormsg.getCssValue("font-size"));
		Point errormsgloc =errormsg.getLocation();
		int locX= errormsgloc.getX();
		int locY= errormsgloc.getY();
		System.out.println("Location of errormsg : "+"("+locX +" ,"+locY+")");
		  
		
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		
		
	}

}
