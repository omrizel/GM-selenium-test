import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class Driver {

    public WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", ".\\src\\drivers\\chromedriver.exe");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        return new ChromeDriver(capabilities);
    }
}
