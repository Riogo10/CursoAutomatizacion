package co.com.qvision.login.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/googletranslate.feature",
        glue = "co.com.qvision.login.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@test"
)

public class GoogleTranslateRunner {

}