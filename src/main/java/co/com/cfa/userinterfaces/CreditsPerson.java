package co.com.cfa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreditsPerson {
    public static final Target PRODUCTO = Target.the("PRODUCT").located(By.id("nav-menu-item-25690"));
    public static final Target PERSONS = Target.the("PERSONS").located(By.id("nav-menu-item-25692"));
    public static final Target CREDITS_OF_CONSUMPTION = Target.the("CREDITS_OF_CONSUMPTION").
            located(By.xpath("//div[@class='elementor-button-wrapper']//" +
                    "a[@href='https://www.cfa.com.co/personas/productos-de-credito/creditos-de-consumo/']"));
    public static final Target CREDITS_FREE_INVESTMENT = Target.the("CREDITS_FREE_INVESTMENT").
            located(By.xpath("//h2[contains(text(),'Libre Inversión')]//following::a"));
    public static final Target CONSUMER_CREDIT_CARDS = Target.the("CONSUMER_CREDIT_CARDS").
            located(By.xpath("//h2[contains(text(),'Crediaportes Consumo')]//following::a"));
 public static final Target MORE_QUOTA = Target.the("MORE_QUOTA").
            located(By.xpath("//h2[contains(text(),'Más Cupo')]//following::a"));

    public static final Target REQUEST_PRODUCT = Target.the("REQUEST_PRODUCT").
            located(By.xpath("//span[contains(text(),'SOLICITAR PRODUCTO')]"));
    public static final Target FREQUENT_QUESTIONS = Target.the("FREQUENT_QUESTIONS").
            located(By.xpath("//a[contains(text(),'Preguntas frecuentes')]"));

    public static final Target MESSAGE = Target.the("FREQUENT_QUESTIONS").
            located(By.xpath("//p[contains(text(),'Línea Antioquia')]"));


}
