package course;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandleUsingLoginPage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parentWindow = it.next(); //switch to parent window
		String childWindow = it.next();  //switch to child window
		
		//switch to child window
		driver.switchTo().window(childWindow); 
		
		//retreive the text
		String emailId = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split(".com")[0].split("@")[1].trim();
		System.out.println(emailId);
		
		//again switch to parent window
		driver.switchTo().window(parentWindow);
		
		//put username and password
		driver.findElement(By.id("username")).sendKeys(emailId);
		//retrive password from text
		String password = driver.findElement(By.xpath("//p[@class='text-center text-white']")).getText().split("Password is")[1].replace(")", "").trim();
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		//radio button 

	//	driver.findElement(By.xpath("(//span[@class='checkmark'])[1]")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Teacher");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
	}	
}
