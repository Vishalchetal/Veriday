package com.devskiller.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumExecutor {

	private static final Logger logger = LoggerFactory.getLogger(SeleniumExecutor.class); 

  private final WebDriver driver;

  public SeleniumExecutor(WebDriver driver) {
    this.driver = driver;
  }

  public String extractHeader() {
	  
	 WebElement e = driver.findElement(By.xpath("/html/body/div/h1")); // x path for the Hello World!
	 String text = e.getText();
	 System.out.println(text);
    return text;
  }

   
  public String clickTheButtonAndExtractLink() {
	  
	  driver.findElement(By.xpath("//button[text()='Click me!']")).click(); // will click on  click butoon
		 String url = driver.getCurrentUrl(); // give current url
    return url ;
  }


}
