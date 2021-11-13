package features.steps;

import features.activities.MainActivity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class mainActivitySteps {

    @Given("I am on the main activity")
    public void iAmOnTheMainActivity() {
        MainActivity.open();
    }

    @When("I send a message saying {string}")
    public void iSendAMessageSayingMessage(String message) throws InterruptedException {
        MainActivity.sendMessage(message);
    }

}
