package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if (webDriver.get() == null) {
            webDriver.set(createDriver());
        }
        return webDriver.get();
    }

    private static WebDriver createDriver() {
        WebDriver driver = null;

        switch (getBrowserType()) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/driver/drivers/chromedriver.exe");
                ChromeOptions chrome1 = new ChromeOptions();
                chrome1.addArguments("--remote-allow-origins=*");
                chrome1.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new ChromeDriver(chrome1);
                break;
            }

            case "edge" -> {
                System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/driver/drivers/msedgedriver.exe");
                EdgeOptions edge1 = new EdgeOptions();
                edge1.addArguments("--remote--allow-origins=*");
                edge1.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new EdgeDriver(edge1);
                break;
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

    private static String getBrowserType() {
        String browserType = null;
        String browserTypeRemoteValue = System.getProperty("browserType");

        try {
            if (browserTypeRemoteValue == null || browserTypeRemoteValue.isEmpty()) {
                Properties properties = new Properties();
                FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
                properties.load(file);
                browserType = properties.getProperty("browser").toLowerCase().trim();
            } else {
                browserType = browserTypeRemoteValue;
            }
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        return browserType;
    }

    public static void cleanupDriver(){
        webDriver.get().quit();
        webDriver.remove();
    }
}
