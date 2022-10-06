package openbrowsers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gsmarena {

	public static void main(String[] args) {
		String Firefoxexepath = System.getProperty("user.dir") + "\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Firefoxexepath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gsmarena.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("icon-login")).click();
		driver.findElement(By.id("email")).sendKeys("aakankshamarathe2001@gmail.com");
		driver.findElement(By.name("sPassword")).sendKeys("gsmarena");
		driver.findElement(By.cssSelector("input#nick-submit")).click();
		List<WebElement> devicename = driver.findElements(By.cssSelector("aside.sidebar>div.brandmenu-v2>ul>li"));

		System.out.println("Total count " + devicename.size());
//
//		for (int i = 0; i <= devicename.size(); i++) {
//			System.out.println(devicename.get(i).getText());
//		}
      driver.findElement(By.cssSelector("button.lines-button")).click();
		List<WebElement> menuoption =driver.findElements(By.cssSelector("ul.main-menu-list>li"));
		
		System.out.println("Menu Option "+menuoption.size());
		for(int j=0;j<=menuoption.size();j++) {
			System.out.println(menuoption.get(j).getText());
		}
	
	}

}
