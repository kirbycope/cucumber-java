package features.steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSceneSteps {

    @Before
    public static void beforeScenario() {
        //AltUnityPortForwarding.forwardAndroid();
        //altUnityDriver = new AltUnityDriver();
    }

    @After
    public static void afterScenario() {
        //altUnityDriver.stop();
        //AltUnityPortForwarding.removeForwardAndroid();
    }

    @When("I start running and pause")
    public void iStartRunningAndPause() {

    }

    @Then("I should see the Pause Menu")
    public void iShouldSeeThePauseMenu() {

    }

}
