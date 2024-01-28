package co.com.saucedemo.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/store.feature",
        glue = {"co.com.saucedemo.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
)


public class RunnerStore {
}
