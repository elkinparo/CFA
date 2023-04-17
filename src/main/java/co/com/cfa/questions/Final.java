package co.com.cfa.questions;

import co.com.cfa.userinterfaces.CreditsPerson;
import co.com.cfa.userinterfaces.FrequentQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Final implements Question<String>
{
    @Override
    public String answeredBy(Actor actor) {
        return FrequentQuestion.MESSAGE.resolveFor(actor).getText();
    }
    public static Final is() {
        return new Final();
    }
}
