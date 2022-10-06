package openbrowsers;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime2 {

	public static void main(String[] args) throws InterruptedException {

		String FirefoxExepath= System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",FirefoxExepath);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(550,550));
		System.out.println("*********Validation of PageTitle*********");
		String PageTitle = driver.getTitle();
		String ExpPageTitle = "actiTIME - login";
		System.out.println("Actual pagetitle is : "+PageTitle);
		System.out.println("Expected Pagetitle is : "+ExpPageTitle);
		System.out.println("PageTitle Validation is : "+PageTitle.contains(ExpPageTitle));
		
		System.out.println("\n**********Validation of PageURL*************");
		String PageURL = driver.getCurrentUrl();		
		String ExpPageURL = "https://demo.actitime.com/login.do";
		System.out.println("Actual Pageurl is : "+PageURL);
		System.out.println("Expected pageurl is : "+ExpPageURL);
		System.out.println("Pageurl validation is : "+PageURL.contains(ExpPageURL));
		driver.manage().window().maximize();
		System.out.println("\n************Login Process **********");
		WebElement Username = driver.findElement(By.cssSelector("input#username"));
		Username.isDisplayed();
		Username.isEnabled();
		Username.click();
		Username.sendKeys("admin");
		
		WebElement Password = driver.findElement(By.cssSelector("input[name='pwd']"));
		Password.getAttribute("placeholder");
		Password.isDisplayed();
		Password.isEnabled();
		Password.click();
		Password.clear();
		Password.sendKeys("manager");
		
		driver.findElement(By.cssSelector("label#keepLoggedInLabel")).click();
		Thread.sleep(3000);
		WebElement Loginbtn = driver.findElement(By.cssSelector("td#loginButtonContainer>a>div"));
		System.out.println("loginbtn status "+Loginbtn.isDisplayed());
        Loginbtn.isEnabled();
        Loginbtn.click();
//        
//        
//        driver.getTitle();
//		driver.getCurrentUrl();
		Thread.sleep(3000);
	
		WebElement taskbtn = driver.findElement(By.cssSelector("a.tasks"));
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.elementToBeClickable(taskbtn));
//		taskbtn.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", taskbtn);
	
		
	    
		WebElement newbtn= driver.findElement(By.cssSelector("div.addNewButton"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(newbtn));
		newbtn.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.addNewMenu div.createNewTasks")).click();
		driver.findElement(By.cssSelector("div.customerSelector div.comboboxButton>div.selectedItem")).click();
		
//		List<WebElement> Element= driver.findElements(By.cssSelector("tr.selectCustomerRow>td div.searchItemList"));
//		Element.size();
//		for(WebElement Option:Element) {
//			System.out.println(Option.getText());
//		}
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(" div.customerSelector div.contentWrapper div:nth-of-type(4)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.projectSelector div.comboboxButton>div.selectedItem")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.projectSelector div.searchItemList>div:nth-of-type(5)")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("tr.selectProjectRow>td>input.newCustomerProjectField")).sendKeys("Aakanksha");
     	Thread.sleep(3000);
    	driver.findElement(By.cssSelector("td.nameCell>input.inputFieldWithPlaceholder")).sendKeys("Task2");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.commitButtonPlaceHolder div.components_button_label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("tr.noLastTrackingDate>td.selection>div.inactive>div.img")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.delete")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a#logoutLink")).click();
		
		
		
		
		
	}

}
