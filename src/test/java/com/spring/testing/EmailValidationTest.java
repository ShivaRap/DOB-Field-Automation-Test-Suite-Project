package com.spring.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmailValidationTest extends ContactFormTest {

    @DataProvider(name = "emailTestData")
    public Object[][] emailTestData() {
        return new Object[][] {
            {"sai.teja@example.com", true}, // Valid email
            {"chistopher.nolan@domain", false},   // Invalid email (no Top Level Domain)
            {"@example.com", false},        // Invalid email (no username)
            {"plainaddress", false},        // Invalid email (no @ or domain)
            {".agasthya@domain.com", false},    // Invalid email (leading dot)
            {"shri@domain..com", false},    // Invalid email (double dot)
            {"user@123.com", true},          // Valid email with numerical domain
            {"user@123", false}              // Invalid email with missing Top Level Domain in numerical domain
        };
    }

    @Test(dataProvider = "emailTestData")
    public void testEmailValidation(String email, boolean isValid) throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement firstNameInput = driver.findElement(By.name("first_name"));
        WebElement lastNameInput = driver.findElement(By.name("last_name"));
        WebElement commentsInput = driver.findElement(By.name("message"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

       
        firstNameInput.sendKeys("Test");
        lastNameInput.sendKeys("User");
        emailInput.sendKeys(email);
        commentsInput.sendKeys("Testing email validation.");
        submitButton.click();

        
        Thread.sleep(2000);

        
        boolean isSubmissionSuccessful = isElementPresent(By.cssSelector("div[id='contact_reply']"));
        Assert.assertEquals(isSubmissionSuccessful, isValid, "Email validation test failed for: " + email);
    }

    
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
