package basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",".//drivers//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tekschool.us/");
		
		
	
	}

}
