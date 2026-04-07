package course;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleTableGrids {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector(\"div.tableFixHead\").scrollTop=500");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i=0; i<values.size(); i++) {
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);
		
		String[] sumtext = driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText().split(":");
		
		int total = Integer.parseInt(sumtext[1].trim());
		System.out.println(total);
		Assert.assertEquals(sum, total);

	}

}
