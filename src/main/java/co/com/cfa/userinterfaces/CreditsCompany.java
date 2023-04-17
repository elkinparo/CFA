package co.com.cfa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreditsCompany
{
    public static final Target COMPANY = Target.the("COMPANY").located(By.id("nav-menu-item-25693"));
    public static final Target PRODUCTIVE_CREDITS = Target.the("PRODUCTIVE_CREDITS").
            located(By.xpath("//div[@class='elementor-button-wrapper']//a[@href='https://www.cfa.com.co/" +
                    "empresas/productos-de-credito-para-empresas/creditos-productivos-empresariales/']"));
    public static final Target PRODUCTIVE_CREDIT = Target.the("PRODUCTIVE_CREDIT").
            located(By.xpath("//h2[contains(text(),'Crédito Productivo')]//following::a"));
    public static final Target PRODUCTIVE_CREDIT_FOR_AGRICULTURE_AND_RURAL = Target.the("PRODUCTIVE_CREDIT_FOR_AGRICULTURE_AND_RURAL").
            located(By.xpath("//h2[contains(text(),'Crédito Productivo para el Agro y Rural')]//following::a"));

}
