package course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with select tag static
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select s=new Select(staticDropdown);
		//Select by index
		s.selectByIndex(3); 
		String selectedText = s.getFirstSelectedOption().getText();
		System.out.println(selectedText);

		//Select by visible text
		s.selectByVisibleText("AED"); 
		String selectedText2 = s.getFirstSelectedOption().getText();
		System.out.println(selectedText2);
		
		//Selected by value
		s.selectByValue("INR");
		String selectedText3 = s.getFirstSelectedOption().getText();
		System.out.println(selectedText3);
		
		driver.close();
		
		
		
	}

}
