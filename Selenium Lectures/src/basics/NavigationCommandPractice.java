package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandPractice {

	public static void main(String[] args) {

		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saule\\eclipse-workspace\\Selenium Lectures\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.amazon.com");
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        driver.navigate().to("https\\:www.facebook.com");
}


}
