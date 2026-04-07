package course;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderTest {

	public static void main(String[] args) {

        // Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Apply implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navigate to the application
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        // Items that need to be added to the cart
        String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

        int j = 0; // To count how many items have been added

        // Fetch all product name elements
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        // Loop through all products
        for (int i = 0; i < products.size(); i++) {

            // Product text example on website:
            // "Brocolli - 1 Kg"
            //
            // We only want the vegetable name, not the weight.
            // So we split on "-"
            String[] name = products.get(i).getText().split("-");

            // name[0] = "Brocolli "
            // Hence we trim to remove extra spaces.
            String formattedName = name[0].trim();

            // Convert itemsNeeded array into List
            // This allows easy checking using contains()
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            // Check if the current product is one of the required items
            if (itemsNeededList.contains(formattedName)) {

                j++; // Increase matched item count

                // Click the "Add to Cart" button for this specific item
                driver.findElements(By.xpath("//div[@class='product-action']/button"))
                      .get(i).click();

                // Once all required items are added, stop the loop
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
        //click on cart icon       
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        //click on proceed to checkout button
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        
        WebElement dropbox = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
        Select s=new Select(dropbox);
        s.selectByVisibleText("India");
        
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        
    }
	
}


