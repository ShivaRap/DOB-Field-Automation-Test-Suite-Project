package com.spring.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactFormTest {

    protected WebDriver driver;
    private WebDriverWait wait;
    private final String BROWSER = "chrome"; // Change to "firefox" to run in firefox browser

    @BeforeClass
    public void setUp() {
        String projectPath = System.getProperty("user.dir");
        if (BROWSER.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver");
            driver = new ChromeDriver();
        } else if (BROWSER.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testContactForm() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("first_name")));
        WebElement lastNameInput = driver.findElement(By.name("last_name"));
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement commentsInput = driver.findElement(By.name("message"));

        firstNameInput.sendKeys("shiva");
        lastNameInput.sendKeys("rapol");
        emailInput.sendKeys("shiva.rapol@example.com");
        commentsInput.sendKeys("This is a test message.");

        Thread.sleep(2000); // 2 seconds to observe filled form

        WebElement resetButton = driver.findElement(By.cssSelector("input[type='reset']"));
        resetButton.click();

        Thread.sleep(2000); // 2 seconds after reset

        Assert.assertEquals(firstNameInput.getAttribute("value"), "");
        Assert.assertEquals(lastNameInput.getAttribute("value"), "");
        Assert.assertEquals(emailInput.getAttribute("value"), "");
        Assert.assertEquals(commentsInput.getAttribute("value"), "");

        firstNameInput.sendKeys("krishna");
        lastNameInput.sendKeys("rapol");
        emailInput.sendKeys("krishna.rapol@example.com");
        commentsInput.sendKeys("Another test message.");

        Thread.sleep(2000); // 2 seconds after filling form again

        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();

        WebElement responseMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='contact_reply'] h1")));
        String responseMessage = responseMessageElement.getText();
        
//        System.out.println(responseMessage);

        Assert.assertTrue(responseMessage.contains("Thank You for your Message!"), "Unexpected response message");
        
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

