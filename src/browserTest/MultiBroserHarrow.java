package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class MultiBroserHarrow {
    static String browser = "ie";
    static String baseurl = "https://www.harrow.gov.uk/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("wrong browser inserted");
        }
        driver.get(baseurl);
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals("Home – Harrow Council");
        boolean verifyTitlecontain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitlecontain);
        System.out.println(title.length());
    }
}