import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class ScreenShot {

    public static String getScreenShot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dateTime = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(Calendar.getInstance().getTime());
        String path = System.getProperty("user.dir") + "\\src\\screenshots\\Screenshot"+dateTime+".png";
        File destination = new File(path);
        FileHandler.copy(source,destination);
        return path;
    }
}

