package authentication;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_signup_screen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String testEmail="eabuajamieh@gmail.com";
		String testPass="123456789";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys(testEmail);
		driver.findElement(By.id("pass")).sendKeys(testPass);
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();

	
	}

}
