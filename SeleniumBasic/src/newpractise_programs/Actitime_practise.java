package newpractise_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime_practise {

	public static void main(String[] args) throws InterruptedException {
//        String FFExepath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",FFExepath);
		WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://demo.actitime.com/login.do");
         driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(500,600));
       WebElement username=  driver.findElement(By.cssSelector("input#username"));
       username.sendKeys("admin");
       WebElement pwd=driver.findElement(By.cssSelector("input.pwdfield"));
       pwd.sendKeys("manager1");
       driver.findElement(By.cssSelector("#loginButton")).click();
       Thread.sleep(5000);
      WebElement errormsg=  driver.findElement(By.cssSelector("span.errormsg"));
		
		System.out.println(errormsg.isDisplayed());
		System.out.println("errormsg : "+errormsg.getText()); 
		Thread.sleep(3000);
		 WebElement username1=  driver.findElement(By.cssSelector("input#username"));
	       username1.sendKeys("admin");
	       Thread.sleep(3000);
	       WebElement pwd1=driver.findElement(By.cssSelector("input.pwdfield"));
	       pwd1.sendKeys("manager");
	       driver.manage().window().maximize();
	       driver.findElement(By.cssSelector("#loginButton")).click();
	       
	       
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("a.tasks div#container_tasks")).click();
		 Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.addNewButton")).click();
		driver.findElement(By.cssSelector("div.createNewTasks")).click();
		 Thread.sleep(8000);
		 driver.findElement(By.cssSelector("div.customerSelector div.dropdownButton")).click();
		driver.findElement(By.cssSelector("//div[text()='Big Bang Company' and @class='selectedItem")).click();
		driver.findElement(By.cssSelector("div.customerSelector div.searchItemList>div:nth-of-type(4)")).click();
		driver.findElement(By.cssSelector("div.emptySelection")).click();
        driver.findElement(By.cssSelector("tr.selectProjectRow div.customerOrProjectSelector div.searchItemList>div:nth-of-type(6)")).click();
        driver.findElement(By.cssSelector("td.nameCell.first")).sendKeys("Task1");
        driver.findElement(By.cssSelector("div.commitButtonPlaceHolder div.components_button_label")).click();
        ///exception-elementclickinterceptedexception 42
	}

}
