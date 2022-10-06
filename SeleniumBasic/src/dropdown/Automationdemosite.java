package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationdemosite {

	public static void main(String[] args) {
		String FFExepath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FFExepath);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(559,550));
		driver.manage().window().maximize();
		
		WebElement skillbox = driver.findElement(By.cssSelector("select[id='Skills']"));
		Select skill= new Select(skillbox);
		System.out.println("Options are multiple :"+skill.isMultiple());
		System.out.println("default option is : "+skill.getFirstSelectedOption());
		
		List<WebElement> options=skill.getOptions();
		System.out.println("No. of option available in skills : "+options.size());
		for(int i=0;i<=options.size();i++) {
			System.out.println("option "+i +" is" +options.get(i).getText());
		}
		
		List templist= new ArrayList();
		templist=options;
		Collections.sort(templist);
		//System.out.println("After sorting  "+Collections.sort(templist);
		
		}
		

}


