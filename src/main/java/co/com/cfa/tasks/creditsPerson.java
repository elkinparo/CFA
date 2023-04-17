package co.com.cfa.tasks;

import co.com.cfa.userinterfaces.CreditsPerson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class creditsPerson implements Task {
    String option;


    public creditsPerson(String option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CreditsPerson.PRODUCTO),
                Click.on(CreditsPerson.PERSONS),
                Click.on(CreditsPerson.CREDITS_OF_CONSUMPTION));
        if(option.equals("free investmnet")){
            actor.attemptsTo(Click.on(CreditsPerson.CREDITS_FREE_INVESTMENT));
        }
        else
        {
            if (option.equals("consumer credit cards"))
            {
                actor.attemptsTo(Click.on(CreditsPerson.CONSUMER_CREDIT_CARDS));
            }
            else
            {
                actor.attemptsTo(Click.on(CreditsPerson.MORE_QUOTA));
            }
        }
        actor.attemptsTo(Click.on(CreditsPerson.REQUEST_PRODUCT),
                Scroll.to(CreditsPerson.FREQUENT_QUESTIONS));
}
    public static creditsPerson format(String option) {
        return Tasks.instrumented(creditsPerson.class, option);
    }
}
