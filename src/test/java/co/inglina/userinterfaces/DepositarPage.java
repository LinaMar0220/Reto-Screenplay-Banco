package co.inglina.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DepositarPage {
    public static final Target BUTTON_DEPOSITAR = the("Boton para realizar un deposito de dinero")
            .located(By.xpath("//button[@ng-click='deposit()']"));
    public static final Target LABEL_VALOR_DEPOSITAR = the("Label en el que se indica el valor a depositar en la cuenta")
            .located(By.xpath("//input[@type='number']"));
    public static final Target BUTTON_INGRESAR_DINERO = the("Boton para hacer el ingreso del dinero")
            .located(By.xpath("//button[text()='Deposit']"));
    public static final Target BUTTON_TRANSACCION = the("Boton par ver transacciones")
            .located(By.xpath("//button[@ng-click='transactions()']"));
    public static final Target MENSAJE_DEPOSITO_EXITOSO = the("Mensaje de confirmacion del deposito exitoso")
            .located(By.xpath("//span[text()='Deposit Successful']"));

    public static final Target TABLA_DEPOSITOS = the("Tabla de depositos realizados")
            .locatedBy("//table//td[contains(., '{0}')]");


}
