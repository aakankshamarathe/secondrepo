package openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "F:\\acceleration\\eclipseworkspace\\SeleniumBasic\\Executables\\chromedriver.exe");
		
		//ChromeDriver cdriver=new ChromeDriver();
		
		//cdriver.get("https://www.google.com");
		
		 System.setProperty("webdriver.chrome.driver","F:\\\\acceleration\\\\eclipseworkspace\\\\SeleniumBasic\\\\Executables\\\\chromedriver.exe");
	       // ChromeOptions options = new ChromeOptions();
		 ChromeDriver options=new ChromeDriver();
//	         options.setBinary("/html/body/ntp-app//div"); // Provide absolute executable chrome browser path with name and extension here
//	        WebDriveons.setBinary("/html/body/ntp-app//div"); // Provide absolute executable chrome browser path with name and extension here
//	        WebDriver driver = new ChromeDriver(options);
//	        driver.get("http://google.com");
//		
//		
		
	}

}
