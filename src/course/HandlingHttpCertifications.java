package course;

import java.lang.reflect.Proxy;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHttpCertifications {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		// for adding plugins/extenstions to the browsers 
		//options.addExtensions("path of dounloaded plugin")
		
		//for setting proxy
		//org.openqa.selenium.Proxy p=new org.openqa.selenium.Proxy();
		//p.setHttpProxy("ip address");
		//options.setCapability("proxy",p.setHttpProxy(\"ip address\"));
		
		
		//for changing default directory location
		
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("download.default_directory", "/directory/path");
//		options.setExperimentalOption("prefs", prefs);
//		
		// for disabling popups like location and all
		//options.setExperimentalOption("excludeSwitches",
			   //  Arrays.asList("disable-popup-blocking"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());


	}

}
