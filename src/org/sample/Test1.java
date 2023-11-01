package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowth\\eclipse-workspace\\Screenshot\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scrolldown = driver.findElement(By.xpath("(//a[text()='greenstechnologyomrleads@gmail.com'])[7]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		Thread.sleep(3000);
		WebElement  txt= driver.findElement(By.xpath("(//p[@class='mail-info'])[13]"));
		String txt1 = txt.getText();
		
		System.out.println(txt1);
		
		
		
//		WebElement scrollup=driver.findElement(By.xpath("//h2[text()='PRE-SELENIUM']"));
		
//		js.executeScript("arguments[0].scrollIntoView(false)", scrollup);
		
		
	}

}
