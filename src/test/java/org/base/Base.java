package org.base;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	public static WebDriver driver;
	 public static Actions a;
	 public static Robot r;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	public static void url(String url) {
		driver.get(url);

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void currentUrl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}
    public static void sendKeys(WebElement element,String usertxt) {
		
    element.sendKeys(usertxt);
	}
	

public static void Quit() {
	driver.quit();
	
}
 public static void Click(WebElement element) {
		element.click();
 }
public static void performMovetoElement(WebElement element) {
	Actions a = new Actions(driver);
	a.moveToElement(element).perform();
}
public static void performDragAndDrop(WebElement src,WebElement dest) {
	a.dragAndDrop(src, dest);
  	

}
}
