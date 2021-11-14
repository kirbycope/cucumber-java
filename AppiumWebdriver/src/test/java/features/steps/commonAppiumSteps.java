package features.steps;

import features.TestData;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Then;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class commonAppiumSteps {

    @BeforeAll
    public static void beforeAll() {
        AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        serviceBuilder.withAppiumJS(new File("C:\\Users\\kirby\\OneDrive\\Documents\\GitHub\\cucumber-java\\node_modules\\appium"));
        TestData.appiumServer = AppiumDriverLocalService.buildService(serviceBuilder);
        TestData.appiumServer.start();
    }

    @AfterAll
    public static void afterAll() {
        TestData.appiumServer.stop();
    }

    @Before
    public void beforeScenario() throws MalformedURLException {
        startSession();
    }

    @After
    public void afterScenario(){
        TestData.webDriver.quit();
    }

    public void startSession() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:app", "C:\\Users\\kirby\\OneDrive\\Documents\\GitHub\\cucumber-java\\AppiumWebdriver\\src\\test\\resources\\app-debug.apk");
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("PlatformName", "Android");
        URL url = new URL("http://localhost:4723/wd/hub");
        TestData.webDriver = new AndroidDriver<MobileElement>(url, capabilities);
        TestData.webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("I should see a message saying {string}")
    public void iShouldSeeAMessageSayingMessage(String message) {
        //
    }

}
