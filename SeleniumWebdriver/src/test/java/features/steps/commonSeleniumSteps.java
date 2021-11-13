package features.steps;

import features.SeleniumTestData;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class commonSeleniumSteps {

    @Before
    public void beforeScenario() {
        startSession();
    }

    @After
    public void afterScenario() {
        SeleniumTestData.webDriver.quit();
    }

    public void startSession() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        SeleniumTestData.webDriver = new ChromeDriver(chromeOptions);
        SeleniumTestData.webDriver.manage().window().maximize();
        SeleniumTestData.webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("I should see a text saying {string}")
    public void iShouldSeeATextSayingText(String text) {
        WebElement element = SeleniumTestData.webDriver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
        assert element.isDisplayed();
    }

}
