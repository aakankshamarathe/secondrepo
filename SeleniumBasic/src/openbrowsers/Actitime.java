package openbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime {

	public static void main(String[] args) {
		String CurrentWorDir=System.getProperty("user.dir");
		String FFExePath=CurrentWorDir+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FFExePath);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		
		String PageTitle=driver.getTitle();
		String ExpectedTitle="actiTIME - Login";
		System.out.println("Actual PageTitle is = "+PageTitle);
		System.out.println("Expected PageTitle is = "+ExpectedTitle);
		System.out.println("Title Validation Status = "+PageTitle.equals(ExpectedTitle));
		System.out.println("******************************************************");
		String PageUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://demo.actitime.com/login.do";
		System.out.println("ActualUrl is = "+PageUrl);
		System.out.println("ExpectedUrl is = "+ExpectedUrl);
		System.out.println("Url Validation status = "+PageUrl.contains(ExpectedUrl));
		System.out.println("*****************************************************");
		String PageSource=driver.getPageSource();
		System.out.println("PageSource length is = "+PageSource.length());
		
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		WebElement submitbutton=driver.findElement(By.id("loginButton"));
		submitbutton.click();
	
		
		
		driver.close();
		
		
		
		
		
		
	}

}
