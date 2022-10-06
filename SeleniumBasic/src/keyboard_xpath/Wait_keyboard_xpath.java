package keyboard_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_keyboard_xpath {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver= new FirefoxDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	
	
	WebElement Fname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	Fname.sendKeys("Aakanksha");
	Fname.sendKeys(Keys.TAB);
	WebElement Lname=driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
	Lname.sendKeys("Marathe");
	Lname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	Lname.sendKeys(Keys.TAB);
	driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Ashok Nagar,Nashik");
    driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Am2000@gmail.com");
    Actions action=new Actions(driver);
    action.sendKeys(Keys.PAGE_DOWN).build().perform();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("section#section div:nth-of-type(4)>div.col-md-4>input")).sendKeys("1234567890");
	driver.findElement(By.cssSelector("div.col-xs-4>label:nth-of-type(2)")).click();
	//driver.findElement(By.cssSelector("div#msdd")).click();
	
	List<WebElement> language= driver.findElements(By.cssSelector("ul.ui-autocomplete"));
	try {
	for(int i=1;i<=language.size();i++) {
		System.out.println("language "+i+"is "+language.get(i).getText());
		
	}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Index OUt of BOunds Exception");
		
	}
		
		driver.findElement(By.cssSelector("ul.ui-autocomplete>li:nth-of-type(3) ")).click();
		driver.findElement(By.cssSelector("Body")).click();
		
		
		
	}

}
