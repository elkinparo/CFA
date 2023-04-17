package co.com.cfa.questions;

import co.com.cfa.userinterfaces.CreditsPerson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FinalMessage implements Question<String>
{
    @Override
    public String answeredBy(Actor actor) {
        return CreditsPerson.MESSAGE.resolveFor(actor).getText();
    }
    public static FinalMessage is() {
        return new FinalMessage();
    }
}
