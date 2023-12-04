import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchContactUs {

    public WebDriver driver;

    public WebDriver launchBrowser(String browserName) throws InterruptedException {
        String projectPath = System.getProperty("user.dir"); 

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Browser not supported!");
            return null;
        }

        driver.manage().window().maximize();
        driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");

        Thread.sleep(3000);
        driver.quit(); 
        return driver;
    }

     
    public static void main(String[] args) throws InterruptedException {
        LaunchContactUs launchContactUs = new LaunchContactUs();
        launchContactUs.launchBrowser("chrome");
        launchContactUs.launchBrowser("firefox"); 
    }
}
