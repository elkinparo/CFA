package co.com.cfa.stepdefinitions;

import co.com.cfa.questions.FinalMessage;
import co.com.cfa.tasks.creditsPerson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class CreditsOfPersonStepDefintions {

    @When(": I see the option {string}")
    public void iSeeTheOption(String option) {

        OnStage.theActorInTheSpotlight().attemptsTo(creditsPerson.format(option));
    }
    @Then(": I see the all information {string}")
    public void iSeeTheAllInformation(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FinalMessage.is(), Matchers.equalTo(message)));
    }
}
