package newpractise_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger_practise {

	public static void main(String[] args) {
//		String FfExePath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
//		System.setProperty("webdriver.gecko.driver", FfExePath);
//		WebDriver driver=new FirefoxDriver();
//		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String Pagetitle=driver.getTitle();
		System.out.println("Pagetitle of login page : "+Pagetitle);
        System.out.println("login page validation by title : "+Pagetitle.contains("vtiger"));	
        
        String PageUrl=driver.getCurrentUrl();
        System.out.println("Pageurl of login page : "+PageUrl);
        System.out.println("login page validation by url : "+PageUrl.equalsIgnoreCase("https://demo.vtiger.com/vtigercrm/index.php"));
//		 
//		WebElement Usernamefield =driver.findElement(By.cssSelector("input#username"));
//		Usernamefield.clear();
//		Usernamefield.sendKeys("wrongpusername");
//		
//		WebElement Pwdfield=driver.findElement(By.cssSelector("input#password"));
//		Pwdfield.clear();
//		Pwdfield.sendKeys("wrongpassword");
//		
//		WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Sign in']"));
//		System.out.println("Login btn display? "+loginbtn.isDisplayed()+"\n"+"Login btn enabled? "+loginbtn.isEnabled()+"\n"+"Login btn color : "+loginbtn.getCssValue("background-image")+"\n"+"Login btn text color : "+loginbtn.getCssValue("color"));
//		loginbtn.click();
//		
//		WebElement invalidmsg=driver.findElement(By.cssSelector("span#validationMessage"));
//		System.out.println("invalidmsg : "+invalidmsg.getText()+"\n"+"invalidmsg display? "+invalidmsg.isDisplayed()+"\n"+"invalidmsg color code : ");
//		
//		Usernamefield.clear();
//		Usernamefield.sendKeys("admin");
//		Pwdfield.clear();
//		Pwdfield.sendKeys("Test@123");
//		loginbtn.click();
	    driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Test@123",Keys.ENTER);
		

	}

}
