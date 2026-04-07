package course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebdriverScope {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limiting the driver scope
		WebElement footer = driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));
		int footerlinks = footer.findElements(By.tagName("a")).size();
		System.out.println(footerlinks);
		
		//footerlinks first column links
		WebElement footercolumn = footer.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));
		int footerColumnLinks = footercolumn.findElements(By.tagName("a")).size();
		System.out.println(footerColumnLinks);
		
		//Open links in seperate windows
		
		for(int i=1; i<footerColumnLinks; i++) {
			
			String shortcut = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footercolumn.findElements(By.tagName("a")).get(i).sendKeys(shortcut);
		}
		
		
		driver.quit();
		
	}

}
