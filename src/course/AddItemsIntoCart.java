package course;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemsIntoCart {

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

        // Close the browser
       // driver.quit();
    }
}
