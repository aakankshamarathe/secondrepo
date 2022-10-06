package newpractise_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus_practise {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com");
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.cssSelector("button.sc-jTzLTM")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("input[type='text'][id='src']")).sendKeys("Mumbai",Keys.ENTER);
		//driver.findElement(By.cssSelector("div.selected-hover>li:nth-of-type(2)")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div.destination")).sendKeys("Nashik",Keys.ENTER);
		//driver.findElement(By.cssSelector("input#onward_cal")).click();
		driver.findElement(By.cssSelector("div.rdc-onward-calendar>div>div>div:nth-of-type(2)>span>span:nth-of-type(3)>div:nth-of-type(3)")).click();
		driver.findElement(By.cssSelector("div.returndate")).click();
		driver.findElement(By.cssSelector("div.bkhtIz>div>div:nth-of-type(1)>span>span:nth-of-type(4)>div:nth-of-type(6)>span")).click();
		driver.findElement(By.cssSelector("button#search_butn")).click();

	}
}