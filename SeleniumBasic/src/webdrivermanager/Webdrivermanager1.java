package webdrivermanager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://etrain.info/in");
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("#tbsfi1")).sendKeys("pune");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div#suggest_row1>a")).click();
		Thread.sleep(3000);
		WebElement Tostation = driver.findElement(By.cssSelector("#tbsfi3"));
		Tostation.sendKeys("mumb");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("div#suggest_row3 i.icon-train-tunneled")).click();
		driver.findElement(By.cssSelector("#tbsfi5>option[value='TQ']")).click();
		driver.findElement(By.cssSelector("input.datepicker")).click();
		driver.findElement(By.cssSelector("td:nth-of-type(3)>input.nav")).click();
		driver.findElement(By.cssSelector("tbody>tr:nth-of-type(4)>td:nth-of-type(2)>input.calBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button#tbssbmtbtn")).click();

		List<WebElement> list = driver.findElements(By.cssSelector("a.exp"));
		try {

			System.out.println("list of trains");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getText());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index of Bound");
		}
	}
}
