package course;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//List<WebElement> allLinks = driver.findElements(By.tagName("a")).size();
		System.out.println( driver.findElements(By.tagName("a")).size());
//		for(int i=0; i<allLinks.size(); i++) {
//			System.out.println(i);
//		}
		//limiting the driver scope
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		driver.close();
		}

}
