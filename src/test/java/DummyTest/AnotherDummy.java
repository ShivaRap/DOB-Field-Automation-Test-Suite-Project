package DummyTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnotherDummy {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testContactForm() {
        driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("first_name")));
        WebElement firstNameInput = driver.findElement(By.name("first_name"));
        firstNameInput.sendKeys("Shiva");

        WebElement lastNameInput = driver.findElement(By.name("last_name"));
        lastNameInput.sendKeys("Rapol");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("shiva.rapol@example.com");

        WebElement commentsInput = driver.findElement(By.name("message"));
        commentsInput.sendKeys("This is a test message.");

        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();

        WebElement responseMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='contact_reply'] h1")));
        String responseMessage = responseMessageElement.getText();

        System.out.println("Response Message: " + responseMessage);

        Assert.assertTrue(responseMessage.contains("Thank You for your Message!"), "Unexpected response message");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
