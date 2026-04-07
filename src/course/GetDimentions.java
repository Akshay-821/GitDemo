package course;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimentions {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		// used for open in new window
		//driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/practice");
		String courseName = driver.findElements(By.cssSelector("p[class='text-sm text-primary/80 font-medium mt-1']")).get(2).getText();
		//switch to parent 
		driver.switchTo().window(parent);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		
		//getting height and width
		int height = name.getRect().getDimension().getHeight();
		System.out.println(height);
		
		int width = name.getRect().getDimension().getWidth();
		System.out.println(width);
		//driver.close();
	}

}
