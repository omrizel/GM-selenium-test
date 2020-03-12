import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Test extends AbstractTest{

    @org.testng.annotations.Test
    public void findRome() throws InterruptedException, IOException {
        driver.get("https://www.google.com/maps");
        WebElement searchBox = driver.findElement(By.id("searchboxinput"));
        searchBox.sendKeys("Rome");
        WebElement searchButton = driver.findElement(By.id("searchbox-searchbutton"));
        searchButton.click();
        WebElement zoomIn = driver.findElement(By.id("widget-zoom-in")); //As implicit wait so when we find the zoom-in button it means the search is over
        Thread.sleep(3000); //Wait for map animation to load
        for (int i =0; i < 3; i++){
            ScreenShot.getScreenShot(driver);
            zoomIn.click();
            Thread.sleep(1000); //Wait for zoom animation to end
        }
    }
}
