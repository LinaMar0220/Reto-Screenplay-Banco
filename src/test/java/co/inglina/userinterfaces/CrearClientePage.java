package co.inglina.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CrearClientePage {

    public static final Target BUTTON_AGREGAR_CLIENTE = the("Boton para adicionar cliente")
            .located(By.xpath("//button[@ng-click='addCust()']"));
    public static final Target LABEL_FIRST_NAME = the("Label para el primer nombre")
            .located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target LABEL_LAST_NAME = the("Label para el apellido")
            .located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target LABEL_CODE = the("Label para el codigo postal")
            .located(By.xpath("//input[@placeholder='Post Code']"));
    public static final Target BUTTON_ADD_CUSTOMER = the("Boton para crear el cliente")
            .located(By.xpath("//button[text()='Add Customer']"));

}
