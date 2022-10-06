package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericFF {

	public static void main(String[] args) {
	 String currentWorkingdDir=System.getProperty("user.dir");
	 String FirefoxExePath=currentWorkingdDir+"\\Executables\\geckodriver.exe";
	 System.setProperty("webdriver.gecko.driver", FirefoxExePath);
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.google.com");
		
	 
	 
		
		
		
		
		
		
		
	}

}
