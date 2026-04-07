package course;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AllBrokenValues {

	public static void main(String[] args) throws MalformedURLException, IOException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	        for(WebElement link:links) {
	        	
				String url = link.getAttribute("href");
		        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		        conn.setRequestMethod("HEAD");
		        conn.connect();

		        int respCode = conn.getResponseCode();
		        System.out.println(respCode);
		        
		        if(respCode>400) {
		        	System.out.println("The link with text "+link.getText()+ "is broken with code " +respCode);
		        	Assert.assertTrue(false);
		        }
	        }
	}
//here it will stop the execusion when it finds first broken link so for we use soft assert in next program
}
