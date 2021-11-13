package features.steps;

import features.TestData;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.remote.DesiredCapabilities;
import ro.altom.altunitytester.AltUnityDriver;
import ro.altom.altunitytester.AltUnityPortForwarding;
import ro.altom.altunitytester.Commands.UnityCommand.AltLoadSceneParameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class commonAltUnitySteps {

    @BeforeAll
    public static void beforeAll() {
        //AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        //TestData.appiumServer = AppiumDriverLocalService.buildService(serviceBuilder);
        //TestData.appiumServer.start();
    }

    @AfterAll
    public static void afterAll() {
        //TestData.appiumServer.stop();
    }

    @Before
    public void beforeScenario() throws MalformedURLException {
        startSession();
    }

    @After
    public void afterScenario(){
        TestData.webDriver.quit();
        TestData.altUnityDriver.stop();
        AltUnityPortForwarding.removeForwardAndroid();
    }

    public void startSession() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:app", "C:\\Users\\kirby\\OneDrive\\Documents\\GitHub\\cucumber-java\\AltUnityWebdriver\\src\\test\\resources\\trashcat.apk");
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("PlatformName", "Android");
        URL url = new URL("http://localhost:4723/wd/hub");
        TestData.webDriver = new AndroidDriver<MobileElement>(url, capabilities);
        TestData.webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        AltUnityPortForwarding.forwardAndroid();
        TestData.altUnityDriver = new AltUnityDriver();
    }

    // Given I open the '<name>' scene
    @Given("I open the {string} scene")
    public void iOpenTheNameScene(String name) {
        AltLoadSceneParameters params = new AltLoadSceneParameters
                .Builder(name)
                .build();
        TestData.altUnityDriver.loadScene(params);
    }

}
