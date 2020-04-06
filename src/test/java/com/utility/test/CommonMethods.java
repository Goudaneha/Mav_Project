package com.utility.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mainmethod.test.BusinessMethod;
import com.stepdefinition.test.StepDefinition;

public class CommonMethods extends StepDefinition{

	public static void clickmethod(By click) {
		WebElement clk = BusinessMethod.getobject().findElement(click);
		clk.click();
		
	}
	public static void sendmethod(By send,String args) {
		WebElement element = BusinessMethod.getobject().findElement(send);
	}

	public static void check() {
		List<WebElement> list = BusinessMethod.getobject().findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		  System.out.println("The list of elements are =="+ list.size());
		  for(int i=0;i<list.size();i++)
		  {
			  System.out.println(list.get(i).getText());
			  
		  if(list.get(i).getText().contains("maveric systems"))
		  {
			  list.get(i).click();
		  }	
		  else {
			  System.out.println("Enter the valid company name");
		  }
		  break;
	}
}
}
//public static void validate() throws AWTException, InterruptedException {
//Robot robot = new Robot();
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
//Thread.sleep(2000);
//String Title=BusinessMethod.getobject().getTitle();
//System.out.println("Title of page ==" + Title);
//if(Title.contains("maveric systems")) {
//	System.out.println("It's valid company name ");
//}
//else {
//	System.out.println("It's invalid company name");
//}