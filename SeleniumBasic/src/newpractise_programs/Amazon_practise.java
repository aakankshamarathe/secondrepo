package newpractise_programs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_practise {

	public static void main(String[] args) throws IOException, InterruptedException {
//		String FFExepath= System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
//		System.setProperty("webdriver.gecko.driver", FFExepath);
//		WebDriver driver=new FirefoxDriver();
//		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS );
		WebDriverWait wait=new WebDriverWait(driver,40);
		Actions act =new Actions(driver);

		driver.manage().window().setSize(new Dimension(500,600));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	//	driver.navigate().refresh();
		
		System.out.println("Title of Page : "+driver.getTitle());
		System.out.println("URL of page : "+driver.getCurrentUrl());
		System.out.println("PageSource length of page : "+driver.getPageSource().length());
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.cssSelector("a._1_3w1N")).click();
		WebElement loginbtn =driver.findElement(By.cssSelector("div._1D1L_j"));
		System.out.println("Loginbtn color : "+loginbtn.getCssValue("background"));
		System.out.println("Login name  color : "+loginbtn.getCssValue("color"));
		
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9284190601", Keys.TAB);
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("flipkart",Keys.ENTER);
		
		List<WebElement> listofmenu= driver.findElements(By.cssSelector("div._331-kn div._37M3Pb>div.eFQ30H"));
		System.out.println("No. of options on toprows : "+listofmenu.size());
		for(int i=0;i<listofmenu.size()-2;i++) {
			System.out.print(listofmenu.get(i).getText()+", ");
		}
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sshot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sshot, new File(".\\Screenshots\\flipkart2.png"));
				
//		WebElement beautyoption=driver.findElement(By.cssSelector("div._37M3Pb>div:nth-of-type(4)"));
//
//		//wait.until(ExpectedConditions.elementToBeClickable(beautyoption));
//		beautyoption.click();
//			List<WebElement> homeoptionlist=driver.findElements(By.cssSelector("._1kidPb>span._2I9KP_"));
//		System.out.println("No. of options in homefurniture : "+homeoptionlist.size());
//		for(int i=0;i<homeoptionlist.size();i++) {
//			WebElement option=homeoptionlist.get(i);
//			act.moveToElement(option).perform();
//			System.out.println("option name : "+option.getText());
//			
//		}
		

	}

}
