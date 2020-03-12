import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class AbstractTest {
    public WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(ITestContext context) {
        driver = new Driver().createDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() throws MalformedURLException {

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method method, ITestContext context, Object[] testData) {

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result, ITestContext context) {

    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {

    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {

    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(ITestContext testContext) {
        driver.quit();
    }
}
