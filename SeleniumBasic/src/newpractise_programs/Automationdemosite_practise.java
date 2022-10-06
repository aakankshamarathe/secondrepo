package newpractise_programs;
import java.io.File;
import java.io.IOException;
//////////dropdown handling(standard dropdown)    mouse keyboard wait
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationdemosite_practise {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement skilllist = driver.findElement(By.cssSelector("select#Skills"));
		Select selectopt = new Select(skilllist);
		System.out.println("default selected option : " + selectopt.getFirstSelectedOption().getText());
		System.out.println("total size in list : " + selectopt.getOptions().size());

		List<String> actuallist = new ArrayList<String>();
		for (int i = 0; i < selectopt.getOptions().size(); i++) {
			actuallist.add(selectopt.getOptions().get(i).getText());
		}
		System.out.println("Actual list : " + actuallist);
		List<String> duplist = new ArrayList<String>();
		duplist.addAll(actuallist);

		Collections.sort(duplist);

		System.out.println("duplicate list after sorting : " + duplist + ", ");

		System.out.println("checking order of list : " + actuallist.equals(duplist));
		System.out.println("is it multiselect : " + selectopt.isMultiple());
		selectopt.selectByIndex(4);
		
		/////keyboard,mouse,wait
		WebDriverWait wait1=new WebDriverWait(driver,30);
		
		Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver);
	
        
		//		
//        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Aakanksha",Keys.chord(Keys.CONTROL,"a"));
//        driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.CONTROL,"c"));
//        driver.switchTo().activeElement().sendKeys(Keys.TAB);
//        driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.CONTROL,"v"));
//        
		Actions act =new Actions(driver);
        WebElement username=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        wait1.until(ExpectedConditions.elementToBeClickable(username));
        username.sendKeys("Marathe");
        act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        wait2.until(ExpectedConditions.elementToBeClickable(lastname));
       
        act.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("nashik",Keys.TAB);
                
       // act.dragAndDrop(source, target);
		//act.moveToElement(element).perform();     mousehoveroverelement
        
        TakesScreenshot ts=(TakesScreenshot)driver;
       File Screenshot= ts.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(Screenshot,new File(".\\Screenshots\\automationdemo.png"));
        
        
		
		

	}

	

}
