package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\judet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("Jude Tacwel");
		driver.findElement(By.name("email")).sendKeys("judetacwel1996@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Jude@123");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("1996/05/07");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		

	}

}
