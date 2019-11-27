package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverFactory {
    private static WebDriver driver;
    public synchronized WebDriver createDriver() {
        if (driver == null)
            driver = new ChromeDriver();
        return driver;
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}