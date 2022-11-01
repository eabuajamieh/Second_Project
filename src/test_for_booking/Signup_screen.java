package test_for_booking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_screen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String testUsername = "eabuajamieh@gmail.com";
		String testPass = "Anoosmahdev83";
		String Country = "Amman";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://booking.com");

//		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a")).click();
		
//		driver.findElement(By.id("username")).sendKeys(testUsername);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("new_password")).sendKeys(testPass);
//		driver.findElement(By.id("confirmed_password")).sendKeys(testPass);
//
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]/div[1]/table/tbody/tr[5]/td[5]/span")).click();


//		driver.findElement(By.className("ce45093752")).sendKeys(Country);
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
