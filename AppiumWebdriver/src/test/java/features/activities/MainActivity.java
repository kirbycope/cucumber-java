package features.activities;

import features.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainActivity {

    /**
     * The `input` for "Username".
     */
    public static WebElement editTextEnterAMessage()
    {
        return TestData.webDriver.findElement(By.id("editTextTextPersonName"));
    }

    /**
     * The 'SEND' `button`.
     */
    public static WebElement buttonSend()
    {
        return TestData.webDriver.findElement(By.id("button"));
    }

    /**
     * Opens `this` page.
     */
    public static void open() {
        System.out.print(""); // being the default activity there is nothing to do here
    }

    /**
     * Enters the given message and then clicks the 'SEND' button.
     */
    public static void sendMessage(String message) throws InterruptedException {
        editTextEnterAMessage().sendKeys(message);
        buttonSend().click();
        Thread.sleep(250);
    }

}
