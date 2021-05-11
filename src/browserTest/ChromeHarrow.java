package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeHarrow {
    public static void main(String[] args) {
        String baseurl="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String title = driver.getTitle();
        System.out.println(title);

        boolean verifyTitle = title.equals("Home – Harrow Council");
        boolean verifyTitleContains = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContains);
        System.out.println(title.length());
    }
}
