package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//to open a browser we need to use get.() method
		driver.get("https://tekschool.us/");
		//driver.navigate().to() will open or launch url as driver.get()
		//main diffrence: driver.get() will wait for page to load and move to next step
		//               drive.navigate(). to will not wait for the page to load and will move on.
		driver.navigate().to("https://tekschool.us/");
		
		
	}

}
