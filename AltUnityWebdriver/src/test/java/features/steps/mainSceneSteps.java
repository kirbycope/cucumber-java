package features.steps;

import features.TestData;
import features.scenes.MainScene;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ro.altom.altunitytester.AltUnityDriver;
import ro.altom.altunitytester.AltUnityObject;
import ro.altom.altunitytester.Commands.FindObject.AltFindObjectsParameters;
import ro.altom.altunitytester.Commands.FindObject.AltWaitForObjectsParameters;

public class mainSceneSteps {

    @When("I start running and pause")
    public void iStartRunningAndPause() throws InterruptedException {
        MainScene.StartRunThenPause();
    }

    @Then("I should see the Pause Menu")
    public void iShouldSeeThePauseMenu() {
        AltFindObjectsParameters altFindObjectsParameters = new AltFindObjectsParameters.Builder(AltUnityDriver.By.NAME, "Exit").build();
        AltWaitForObjectsParameters altWaitForObjectsParameters = new AltWaitForObjectsParameters.Builder(altFindObjectsParameters).build();
        AltUnityObject panelElement = TestData.altUnityDriver.waitForObject(altWaitForObjectsParameters);
        assert panelElement.isEnabled();
    }

}
