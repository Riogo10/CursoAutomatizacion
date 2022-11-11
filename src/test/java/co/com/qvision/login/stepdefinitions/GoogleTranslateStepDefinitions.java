package co.com.qvision.login.stepdefinitions;

import co.com.qvision.login.steps.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleTranslateStepDefinitions {

        @Steps
        GoogleHomePage traductor;

        @Given("that Susan wants to translate a word")
        public void thatSusanWantsToTranslateAWord(){
                traductor.textBoxEmailLogin();
        }

        @When("she translates the word {string} from English to Spanish")
        public void sheTranslatesTheWordFromEnglishToSpanish(String word){
                traductor.textBoxEmailLogin();
        }

        @Then("she should see the word {string} in the screen")
        public void sheShouldSeeTheWordInTheScreen(String result){
                traductor.textBoxEmailLogin();
        }

}
