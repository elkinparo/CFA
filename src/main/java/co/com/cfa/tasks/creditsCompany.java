package co.com.cfa.tasks;

import co.com.cfa.userinterfaces.CreditsCompany;
import co.com.cfa.userinterfaces.CreditsPerson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class creditsCompany implements Task
{
    String option;

    public creditsCompany(String option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CreditsPerson.PRODUCTO),
                Click.on(CreditsCompany.COMPANY),
                Click.on(CreditsCompany.PRODUCTIVE_CREDITS));
        if(option.equals("productive credit")){
            actor.attemptsTo(Click.on(CreditsCompany.PRODUCTIVE_CREDIT));
        }
        else
        {
            actor.attemptsTo(Click.on(CreditsCompany.PRODUCTIVE_CREDIT_FOR_AGRICULTURE_AND_RURAL));
        }
        actor.attemptsTo(Click.on(CreditsPerson.REQUEST_PRODUCT),
                Scroll.to(CreditsPerson.FREQUENT_QUESTIONS));
    }

    public static creditsCompany format(String option) {
        return Tasks.instrumented(creditsCompany.class, option);
    }
}
