package com.devskiller.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumExecutor {

  private final WebDriver driver;

  public SeleniumExecutor(WebDriver driver) {
    this.driver = driver;
  }

  public String extractHeader() {
	  
	 WebElement e = driver.findElement(By.xpath("/html/body/div/h1"));
	 String text = e.getText();
	 System.out.println(text);
    return text;
  }

   
  public String clickTheButtonAndExtractLink() {
	  
	  driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		 String url = driver.getCurrentUrl();
    return url ;
  }


}
