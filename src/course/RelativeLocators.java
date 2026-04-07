package course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Reference element
        WebElement nameEditBox = driver.findElement(By.name("name"));

        // Relative Locator: label ABOVE name textbox
        WebElement nameLabel = driver.findElement(with(By.tagName("label")).above(nameEditBox));

        System.out.println(nameLabel.getText());
        Thread.sleep(5000);
        
        // Relative Locator: label toLeftof 
        WebElement label = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(label)).click();
        
        // Relative Locator: label toRightof
        WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
        String radioText = driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText();
        System.out.println(radioText
        		);
        driver.quit();
    }
}
