package course;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTitlesOfDifferentTabs {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement footer = driver.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));
        int footerLinks = footer.findElements(By.tagName("a")).size();

        // STEP 1: Open all links in new tabs
        for (int i = 1; i < footerLinks; i++) {
            String shortcut = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footer.findElements(By.tagName("a")).get(i).sendKeys(shortcut);
        }

        // STEP 2: Get all window handles and print titles
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        driver.quit();
    }
}
