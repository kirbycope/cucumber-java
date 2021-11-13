package features.steps;

import features.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginSteps {

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        LoginPage.open();
    }

    @When("I login with {string} and {string}")
    public void iLoginWithUsernameAndPassword(String username, String password) {
        LoginPage.login(username, password);
    }

}
