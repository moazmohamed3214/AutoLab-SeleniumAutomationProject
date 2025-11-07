package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.Home;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Base {
    protected WebDriver driver;
    protected String downloadPath;
    protected Home home;

    @BeforeMethod
    public void setUp()
    {
        downloadPath = System.getProperty("user.dir") + File.separator + "downloads";
        File file = new File(downloadPath);
        if (!file.exists()) {
            file.mkdir();
        }

        // Set Chrome preferences for automatic download
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("safebrowsing.enabled", true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://testing.qaautomationlabs.com/");
         home = new Home(driver);


    }
    @AfterMethod
    public void close()
    {
        driver.quit();
    }
}
