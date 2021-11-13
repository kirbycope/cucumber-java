package features.pages;

import features.SeleniumTestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class LoginPage {

    /**
     * The `input` for "Username".
     */
    public static WebElement inputUserName() {
        return SeleniumTestData.webDriver.findElement(By.id("username"));
    }

    /**
     * The `input` for "Password".
     */
    public static WebElement inputPassword() {
        return SeleniumTestData.webDriver.findElement(By.id("password"));
    }

    /**
     * The `button` to submit a form.
     */
    public static WebElement btnSubmit() {
        return SeleniumTestData.webDriver.findElement(By.cssSelector("button[type='submit']"));
    }

    /**
     * Opens `this` page.
     */
    public static void open() {
        SeleniumTestData.webDriver.navigate().to(SeleniumTestData.baseUrl + "/login");
    }

    /**
     * Log in using the given username and password.
     */
    public static void login(String username, String password) {
        if (Objects.equals(username, "valid"))
        {
            username = SeleniumTestData.testUser;
        }
        if (Objects.equals(password, "valid"))
        {
            password = SeleniumTestData.testPass;
        }
        inputUserName().sendKeys(username);
        inputPassword().sendKeys(password);
        btnSubmit().click();
    }

}
