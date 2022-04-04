package basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step 1 we need to open chrome browser
		//step 2 we need to pass https://tekschoool.us/
		//step 3 tek school website should be open
		//-----------------------------------------------------
		
		//1. We need to setup System.setProperty("key", "value")
		//key ("webdriver.chrome.driver")
		//value(path to chromedriver.exe)
		//for mac we will use//for path defining
		//for mac System.set.Property("webdriver.chrome.driver", "./drtiver/chromedriver");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saule\\eclipse-workspace\\Selenium Lectures\\drivers\\chromedriver.exe");
		
		//we need to create reference to Webdriver Interface and then create obj of ChromeDriver
		WebDriver driver = new ChromeDriver();
		//in selenium we have a method called.get() and it accepts url as string
		driver.get("https://tekschool.us/");
		
		

		
		
	}

}
