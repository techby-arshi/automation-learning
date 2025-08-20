import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static void main(String[] args) {
        // Tell Java where ChromeDriver is
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chrome-win64\\chromedriver-win64\\chromedriver.exe");

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Go to Facebook
        driver.get("https://www.facebook.com");

        // Print page title
        System.out.println("Page title is: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
