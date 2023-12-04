package DummyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DummyContactForm {

    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
    	String projectPath = System.getProperty("user.dir");
//    	System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver");
    	System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver");
//        driver = new ChromeDriver();
    	driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void testContactForm() {
        driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
        try {
            WebElement firstNameInput = driver.findElement(By.name("first_name"));
            firstNameInput.sendKeys("John");
            System.out.println("First name input found and filled.");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

//    public static void main(String[] args) throws InterruptedException {
//        DummyContactForm test = new DummyContactForm();
//        test.setUp();
//        test.testContactForm();
//        test.tearDown();
//    }
}

