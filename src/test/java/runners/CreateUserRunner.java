package runners;

//import cucumber.api.CucumberOptions;   DEPRECATED
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.SnippetType;       DEPRECATED

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/create_user.feature"},
        glue = {"stepdefinitions", "utils"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CreateUserRunner {
}
