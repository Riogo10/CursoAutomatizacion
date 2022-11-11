package co.com.qvision.login.stepdefinitions;

import co.com.qvision.login.steps.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleTranslateStepDefinitions {

    @Steps
    GoogleHomePage guru;

    @Given("since diego wants to enter his credentials")
    public void sinceDiegoWantsToEnterHisCredentials() {
        guru.openPage();

    }

    @When("when he enters his email {string}")
    public void whenHeEntersHisEmail(String email) {
        guru.textBoxEmailLogin(email);
    }

    @When("your password {string}")
    public void yourPassword(String password) {
        guru.textBoxPasswordLogin(password);
    }

    @Then("it will validate the message {string}")
    public void itWillValidateTheMessage(String finalMessage) {
        guru.validationFinalMessage(finalMessage);
    }
}