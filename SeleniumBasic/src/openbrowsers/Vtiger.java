package openbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vtiger {

	public static void main(String[] args) throws InterruptedException {
		String FFExePath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FFExePath);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("PageTitle is "+driver.getTitle());
		System.out.println("PageUrl is "+driver.getCurrentUrl());
		WebElement Username=driver.findElement(By.id("username"));
		System.out.println("Username display status" +Username.isDisplayed());
		System.out.println("Username enable status " +Username.isEnabled());
		Username.clear();
		Username.sendKeys("admin");
		WebElement Password=driver.findElement(By.id("password"));
		System.out.println("Password display status"+Password.isDisplayed());
		System.out.println("Password enable status "+Password.isEnabled());
		Password.clear();
		Password.sendKeys("Test@123");
		driver.findElement(By.className("button")).click();
		Thread.sleep(4000);
		System.out.println("HomepageTitle is "+driver.getTitle());
		System.out.println("HomepageUrl is "+driver.getCurrentUrl());
		driver.findElement(By.cssSelector(".addButton")).click();
		//driver.findElement(By.className(".fa-remove")).click();
		//driver.findElement(By.name("GroupBysalesStage")).click();
		Thread.sleep(3000);
	driver.findElement(By.cssSelector("ul.widgetsList>li:nth-of-type(7)")).click();
//driver.findElement(By.linkText("Total Revenue")).click();
//driver.findElement(By.className(".fa-remove")).click();

//		driver.findElement(By.className("userName")).click();
//		driver.findElement(By.linkText("Sign Out")).click();
//		driver.close();
//		
		
		WebElement crossbtn = driver.findElement(By.cssSelector("i.fa-remove"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(crossbtn));
		crossbtn.click();
		driver.findElement(By.cssSelector("button.btn-primary")).click();
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("ul.widgetsList>li:nth-of-type(5)")).click();
		driver.findElement(By.cssSelector("i.fa-remove")).click();
		driver.findElement(By.cssSelector("button.btn-primary")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.userName>span.fa-user")).click();
		driver.findElement(By.cssSelector("a#menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		
	
		

	}

}
