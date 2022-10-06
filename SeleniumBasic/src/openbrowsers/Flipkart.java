package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) {
		String FFExePath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FFExePath);
		WebDriver driver=new FirefoxDriver();
		driver.get("https:www.flipkart.com");
	}

}
