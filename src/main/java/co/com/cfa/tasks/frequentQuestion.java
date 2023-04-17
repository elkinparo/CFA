package co.com.cfa.tasks;

import co.com.cfa.userinterfaces.CreditsPerson;
import co.com.cfa.userinterfaces.FrequentQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class frequentQuestion implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FrequentQuestion.AT_YOUR_SERVICE),
                Click.on(FrequentQuestion.FREQUENT_QUESTION),
                Click.on(FrequentQuestion.REQUIREMENTS),
                Click.on(FrequentQuestion.REQUIREMENTS_FOR_OPENING),
                Click.on(FrequentQuestion.HOW_CFA_WAS_BORN));  }
    public static frequentQuestion frequentQuestion() {
        return Tasks.instrumented(frequentQuestion.class);
    }
}
