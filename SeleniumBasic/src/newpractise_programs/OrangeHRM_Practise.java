package newpractise_programs;
import java.io.File;
///read data from property file and basic validation
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM_Practise {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis=new FileInputStream(".\\Propertydata\\Orangehrm.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		
		
		String urlofapp=prop.getProperty("URL");
		System.out.println("url from propertyfie : "+urlofapp);                
	    String expurl=prop.getProperty("Expected_Url");
	    System.out.println("Expected url is : "+expurl);
		
		
		
		String Firefoxexe=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",Firefoxexe);
		WebDriver driver=new FirefoxDriver();
		driver.get(urlofapp);
		driver.manage().window().setSize(new Dimension(500,500));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		System.out.println(driver.findElement(By.cssSelector("p.orangehrm-login-forgot-header")).getText());
		System.out.println(driver.findElement(By.cssSelector("p.orangehrm-login-forgot-header")).getCssValue("color"));
	    driver.findElement(By.cssSelector("p.orangehrm-login-forgot-header")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(6000);
		
		WebElement username=driver.findElement(By.cssSelector("input[placeholder=\"Username\"]"));
		username.sendKeys(prop.getProperty("Username"));
		WebElement pwd=driver.findElement(By.cssSelector("input[type=\"password\"]"));
		pwd.sendKeys(prop.getProperty("Password"));
		WebElement loginbtn=driver.findElement(By.cssSelector("button[type='submit']"));
		loginbtn.click();
		
		
		String Pageurl =driver.getCurrentUrl();
		System.out.println("Actual page url : "+Pageurl);
		System.out.println("Expected url is : "+prop.getProperty("Expected_Url"));
		System.out.println("pageurl validation : "+Pageurl.equals(prop.getProperty("Expected_Url")));
        Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ss1=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss1,new File(".\\Screenshots\\orangehrm.png"));
		
		
		
		

	}

	
}
