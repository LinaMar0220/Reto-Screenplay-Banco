package co.inglina.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CrearCuentaPage {
    public static final Target BUTTON_AGREGAR_CUENTA = the("Boton para adicionar la cuenta")
            .located(By.xpath("//button[@ng-click='openAccount()']"));
    public static final Target SELECT_CUSTOMER = the("Seleccionar el cliente creado anteriormente")
            .located(By.id("userSelect"));

    public static final Target SELECT_CURRENCY = the("Seleccionar el tipo de moneda")
            .located(By.id("currency"));

    public static final Target BUTTON_PROCESS = the("Boton para asignar cuenta al cliente")
            .located(By.xpath("//button[text()='Process']"));

}

