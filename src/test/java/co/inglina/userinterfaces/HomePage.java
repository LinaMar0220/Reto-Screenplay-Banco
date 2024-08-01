package co.inglina.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage extends PageObject {

    public static final Target BUTTON_MANAGER = the("Boton Manager para seleccion de tipo de user")
            .located(By.xpath("//button[text()='Bank Manager Login']"));

    public static final Target BUTTON_HOME = the("Boton Home")
            .located(By.xpath("//button[text()='Home']"));

    public static final Target BUTTON_CUSTOMER = the("Boton login cliente")
            .located(By.xpath("//button[text()='Customer Login']"));
}
