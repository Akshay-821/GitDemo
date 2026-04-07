package course;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterWebtableUsingStreams {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		//list of search results
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		//list of fiter results of rice
		List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
		collect(Collectors.toList());
		//checking size of original and filtered list
		Assert.assertEquals(veggies.size(), filteredList.size());
		
	}

}
