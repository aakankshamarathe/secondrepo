package newpractise_programs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartpractise {

	public static void main(String[] args) throws IOException {
		String FFExepath = System.getProperty("user.dir") + "\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FFExepath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		try {
			driver.findElement(By.cssSelector("._2QfC02>._2KpZ6l")).click();
		} catch (NoSuchElementException e) {

		}
		//driver.findElement(By.cssSelector("._1psGvi>div>a[class=\"_1_3w1N\"]")).click();
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File(".\\Screenshots\\fpss1.png"));
		
		
		
		
		
//	    List<WebElement> toprows=driver.findElements(By.cssSelector("div._37M3Pb div.eFQ30H"));
//	    System.out.println("toprows option count: "+toprows.size());
//	    for(int i=1;i<toprows.size();i++) {
//	    	System.out.println(toprows.get(i).getText());
//	    }
//		driver.findElement(By.cssSelector("div._37M3Pb>div:nth-of-type(4)")).click();
//		/////scroll not know
		
	}

	private static TakesScreenshot TakeScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
}
