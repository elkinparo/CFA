package co.com.cfa.stepdefinitions;

import co.com.cfa.questions.Final;
import co.com.cfa.questions.FinalMessage;
import co.com.cfa.tasks.frequentQuestion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class FrequenQuestionStepDefinitions
{
    @When(": I see the button at your service")
    public void iSeeTheButtonAtYourService() {
        OnStage.theActorInTheSpotlight().attemptsTo(frequentQuestion.frequentQuestion());
    }
    @Then(": I see information bar {string}")
    public void iSeeInformationBar(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Final.is(), Matchers.equalTo(message)));
    }

}
