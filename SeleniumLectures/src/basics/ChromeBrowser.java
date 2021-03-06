package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		//step 1 we need to open chrome browser
		//step 2 we need to pass https://tekschool.us/
		//step 3 tek school website should be open
		//-----------------------------------------------------------
		
		//1. We need to set up System.setProperty("key", "value")
		//key ("webdriver.chrome.driver")
		//value(path to chromedriver.exe)
		//for windows we will use //for path defining
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe" ); 
		
		//we need to create reference to Webdriver Interface and then create obj of Chromedriver
		WebDriver driver = new ChromeDriver();
		//in selenium we have a method called .get() and it accepts url as string
		driver.get("https://google.com/");
		
		
		
		
	}

}
