package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		//first registration , It will show already registered, so I've logged in to show it works
		
		//driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("bivasha@yopmail.com");
		//driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		//driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Biva");
		//driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("sha");
		//driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("B12345");
		
		//driver.findElement(By.id("days")).sendKeys("3");
		//driver.findElement(By.id("months")).sendKeys("Sep");
		//driver.findElement(By.id("years")).sendKeys("1997");
		
		//driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("BRAC University");
		//driver.findElement(By.cssSelector("#address1")).sendKeys("920 Maple Lane");
		//driver.findElement(By.cssSelector("#address2")).sendKeys("921 MAple Lane");
		//driver.findElement(By.cssSelector("#city")).sendKeys("Huntsville");
		//driver.findElement(By.id("id_state")).sendKeys("Alabama");
		//driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("35816");
		//driver.findElement(By.cssSelector("#other")).sendKeys("none");
		//driver.findElement(By.cssSelector("#phone")).sendKeys("2025550098");
		//driver.findElement(By.cssSelector("#phone_mobile")).sendKeys("2025550148");
		//driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("bivasha@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("B12345");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
		
		//2nd registration, I haven't click register button to show how it works 
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("bivasha1@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Biva");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("sha1");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("B12345");
		driver.findElement(By.id("days")).sendKeys("4");
		driver.findElement(By.id("months")).sendKeys("Sep");
		driver.findElement(By.id("years")).sendKeys("1998");
		
		driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Viqarunnisa Noon School & College");
		driver.findElement(By.cssSelector("#address1")).sendKeys("922 Maple Lane");
		driver.findElement(By.cssSelector("#address2")).sendKeys("923 Maple Lane");
		driver.findElement(By.cssSelector("#city")).sendKeys("Huntsville1");
		driver.findElement(By.id("id_state")).sendKeys("Alabama");
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("35816");
		driver.findElement(By.cssSelector("#other")).sendKeys("none");
		driver.findElement(By.cssSelector("#phone")).sendKeys("2025550098");
		driver.findElement(By.cssSelector("#phone_mobile")).sendKeys("2025550148");
		//driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		
		

	}
	

}
