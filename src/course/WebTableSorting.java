package course;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("(//th[@scope=\"col\"])[1]")).click();
		//capture all webelement into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of of the webelements into list -> original list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort that list -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		

	}

}
