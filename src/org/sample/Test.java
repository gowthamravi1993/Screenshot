package org.sample;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test {
	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowth\\eclipse-workspace\\Screenshot\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
		/*TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\gowth\\eclipse-workspace\\Screenshot\\Takescreenshot\\fbpage1.png");
//		FileUtils.copyFile(src, des);
		FileHandler.copy(src, des);
	*/
		
	//	robert
	//	driver.close();
		
		/*TakesScreenshot tk = (TakesScreenshot) driver;
		File source =tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\gowth\\eclipse-workspace\\Screenshot\\Takescreenshot\\fbpage2.png");
		FileUtils.copyFile(source, des);*/
		
		Robot robort=new Robot() ;
	    java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Rectangle rectangle =new Rectangle(screenSize);
	    BufferedImage src= robort.createScreenCapture(rectangle);
	    File destination=new File("C:\\Users\\gowth\\eclipse-workspace\\Screenshot\\Takescreenshot\\fbpage4.png");
	    ImageIO.write(src, "png", destination);
	}

}
