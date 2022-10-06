package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumutility {

	public static WebDriver driver=null;
	public static Actions action=null;
	public static WebDriverWait wait;
	
		public  WebDriver setUp(String browsername, String Appurl){
			if(browsername.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}else if(browsername.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}else if (browsername.equalsIgnoreCase("InternetExplorer")) {
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
			}
			driver.get(Appurl);
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver,30);
			action=new Actions(driver);
			return driver;
		
		}
		
		public void performClickOnElement(WebElement element) {
			element.click();
		}
		
		public void performDoubleClickOnElement(WebElement element) {
			action.moveToElement(element).doubleClick().build().perform();
		}
		
		public void performRightClickOnElement(WebElement element) {
			action.contextClick(element).build().perform();
		}
		
		public void copyTextFromField(WebElement element) {
			action.doubleClick(element).build().perform();
			element.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		}
		
		public void pasteTextToField(WebElement element) {
			action.click().sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		}
		
		public void DragFromField(WebElement source,WebElement target) {
			action.dragAndDrop(source, target);
		}
				
		public void mouseHoverOverElement(WebElement element) {
			action.moveToElement(element).build().perform();
		}
		
		public void getTitleOfPage() {
			System.out.println("Title of page is : "+driver.getTitle());
			
		}
		
		public void getCurrentUrlOfPage() {
			System.out.println("Url of page is : "+driver.getCurrentUrl());
		}
		public void getPageSourceSize() {
			System.out.println("PageSource content is of size : "+driver.getPageSource().length());
		}
		public void switchToActiveElement(String data) {
			driver.switchTo().activeElement().sendKeys(data);
			action.sendKeys(Keys.TAB);
		}
	}


