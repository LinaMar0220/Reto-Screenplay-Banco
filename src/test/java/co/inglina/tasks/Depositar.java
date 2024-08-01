package co.inglina.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.interactions.Pause;

import java.time.Duration;

import static co.inglina.userinterfaces.DepositarPage.*;
import static co.inglina.userinterfaces.HomePage.BUTTON_CUSTOMER;
import static co.inglina.userinterfaces.HomePage.BUTTON_HOME;
import static co.inglina.userinterfaces.LoginPage.BUTTON_LOGIN;
import static co.inglina.userinterfaces.LoginPage.SELECT_NAME;
import static co.inglina.utils.Utilidades.ID_CLIENTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Depositar implements Task {

    private String monto;

    public Depositar(String monto) {
        this.monto = monto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String idCliente = actor.recall(ID_CLIENTE);

        actor.attemptsTo(Click.on(BUTTON_HOME),
                Click.on(BUTTON_CUSTOMER),
                SelectFromOptions.byValue(idCliente).from(SELECT_NAME),
                Click.on(BUTTON_LOGIN),
                Click.on(BUTTON_DEPOSITAR),
                Type.theValue(monto).into(LABEL_VALOR_DEPOSITAR),
                Click.on(BUTTON_INGRESAR_DINERO),
                WaitUntil.the(MENSAJE_DEPOSITO_EXITOSO, isVisible()).forNoMoreThan(Duration.ofSeconds(20)),
                Click.on(BUTTON_TRANSACCION));
    }

    public static Performable dinero(String monto) {
        return instrumented(Depositar.class, monto);
    }

}
