package co.com.cfa.stepdefinitions;

import co.com.cfa.questions.FinalMessage;
import co.com.cfa.tasks.creditsCompany;
import co.com.cfa.tasks.creditsPerson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class CreditsOfCompanyStepDefinitions {
    @When(": I see the business option {string}")
    public void iSeeTheBusinessOption(String option) {
        OnStage.theActorInTheSpotlight().attemptsTo(creditsCompany.format(option));
    }
    @Then(": I see the all business information {string}")
    public void iSeeTheAllBusinessInformation(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FinalMessage.is(), Matchers.equalTo(message)));
    }
}
