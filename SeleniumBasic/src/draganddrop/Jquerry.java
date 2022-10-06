package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerry {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.findElement(By.xpath("//a[@href=\"http://jqueryui.com/sortable/\"]")).click();
		WebElement frameshift= driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frameshift);
		
		
		
	}

}
