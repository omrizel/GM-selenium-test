import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.logging.Level;

public class Driver {

    public WebDriver createDriver() {

        if (System.getProperty("os").equals("LINUX")){
            System.setProperty("webdriver.gecko.driver", "./src/drivers/geckodriver");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("disable-infobars");
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            chromeOptions.addArguments("--no-sandbox");
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setBrowserName("chrome");
            cap.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            cap.setPlatform(Platform.LINUX);
            LoggingPreferences logPrefsChromeRemote = new LoggingPreferences();
            logPrefsChromeRemote.enable(LogType.BROWSER, Level.SEVERE);
            cap.setCapability(CapabilityType.LOGGING_PREFS, logPrefsChromeRemote);
            return new ChromeDriver(cap);
        } else {
            System.setProperty("webdriver.chrome.driver", ".\\src\\drivers\\chromedriver.exe");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            return new ChromeDriver(capabilities);
        }

    }
}
