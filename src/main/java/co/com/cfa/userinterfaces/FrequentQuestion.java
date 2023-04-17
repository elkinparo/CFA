package co.com.cfa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FrequentQuestion
{
    public static final Target AT_YOUR_SERVICE = Target.the("AT_YOUR_SERVICE").located(By.id("nav-menu-item-25699"));
    public static final Target FREQUENT_QUESTION = Target.the("FREQUENT_QUESTION").located(By.id("nav-menu-item-25705"));
    public static final Target REQUIREMENTS = Target.the("REQUIREMENTS").located(By.xpath("//div[@id='requisitos-para-un-prstamo']"));
    public static final Target REQUIREMENTS_FOR_OPENING = Target.the("REQUIREMENTS_FOR_OPENING").
            located(By.xpath("//div[@id='requisitos-para-la-apertura-de-una-cuenta-de-ahorros']"));
    public static final Target HOW_CFA_WAS_BORN = Target.the("HOW_CFA_WAS_BORN").
            located(By.xpath("//div[@id='cmo-nace-cfa']"));
    public static final Target MESSAGE = Target.the("MESSAGE").
            located(By.xpath("//h3[@class='elementor-icon-box-title']//a[@href='https://www.cfa.com.co/preguntas-frecuentes/']"));
}
