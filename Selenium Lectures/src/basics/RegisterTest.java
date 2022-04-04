package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");// this method lunches application 
        WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
        System.out.println(myAccount.isDisplayed());
        myAccount.click();
        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement telephone = driver.findElement(By.id("input-telephone"));
        WebElement password = driver.findElement(By.id("input-password"));
        WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
        WebElement yesButton = driver.findElement(By.xpath("//input[@value='1' and @name='newsletter']"));
        WebElement noButton = driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']"));
        WebElement privacy = driver.findElement(By.xpath("//input[@name='agree']"));
        WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
        
        firstName.sendKeys("James");
        lastName.sendKeys("Bond");
        email.sendKeys("jamesbond1@tekschool.us");
        telephone.sendKeys("2021012233");
        password.sendKeys("james007");
        confirmPassword.sendKeys("james007");
        if(!yesButton.isSelected()) {
            yesButton.click();
        }
        if (privacy.isDisplayed()) {
            privacy.click();
        }
        
        Thread.sleep(5000); // this is for training purpose
        continueButton.click();
        WebElement confirmationMessage = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']"));
        String success =confirmationMessage.getText(); // getText method returns a string and can be used for verification points
        String expectedMessage = "Your Account Has Been Created!";
        if(success.equals(expectedMessage)) {
            System.out.println("Register test passed");
        }else {
            System.out.println("Register test failed");
        }
	}

}
