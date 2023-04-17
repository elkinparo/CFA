package co.com.cfa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/credits_of_company.feature",
        glue = {"co.com.cfa.stepdefinitions", "co.com.cfa.setup"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "")
public class CreditsOfCompanyRunner {
}
