package co.inglina.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {
    public static final Target SELECT_NAME = the("Seleccionar el nombre del cliente")
            .located(By.id("userSelect"));
    public static final Target BUTTON_LOGIN= the("Boton login")
            .located(By.xpath("//button[text()='Login']"));

}
