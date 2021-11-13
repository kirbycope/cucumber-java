package features.steps;

import features.AppiumTestData;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class commonAppiumSteps {

    @Before
    public void beforeScenario() {
        AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        AppiumTestData.appiumServer = AppiumDriverLocalService.buildService(serviceBuilder);
        AppiumTestData.appiumServer.start();
    }

    @After
    public void afterScenario(){
        AppiumTestData.webDriver.quit();
    }

    @Then("I should see a message saying {string}")
    public void iShouldSeeAMessageSayingMessage(String message) {
        //
    }

}
