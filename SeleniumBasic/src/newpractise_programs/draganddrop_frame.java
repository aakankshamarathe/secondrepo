package newpractise_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Seleniumutility;

public class draganddrop_frame extends Seleniumutility{

	public static void main(String[] args) {
		
		draganddrop_frame ddf1=new draganddrop_frame();
		ddf1.setUp("Chrome", "https://jqueryui.com");
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		WebElement frameelement=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frameelement);
		
		WebElement source=driver.findElement(By.cssSelector("div#draggable"));
		WebElement target=driver.findElement(By.cssSelector("div#droppable"));
        Seleniumutility.action.dragAndDrop(source, target).build().perform();	
        
        driver.switchTo().defaultContent();
        
		

	}

}
