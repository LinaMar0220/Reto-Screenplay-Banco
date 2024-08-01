package co.inglina.tasks;


import co.inglina.interactions.Guardar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;

import static co.inglina.userinterfaces.CrearCuentaPage.*;
import static co.inglina.utils.Utilidades.ID_CLIENTE;
import static co.inglina.utils.Utilidades.ID_CUENTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearCuenta implements Task {
    private String ingreso;

    public CrearCuenta(String ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String id_Cliente = actor.recall(ID_CLIENTE);

        actor.attemptsTo(
                Click.on(BUTTON_AGREGAR_CUENTA),
                SelectFromOptions.byValue(id_Cliente).from(SELECT_CUSTOMER),
                SelectFromOptions.byValue(ingreso).from(SELECT_CURRENCY),
                Click.on(BUTTON_PROCESS),
                Guardar.informacion(ID_CUENTA),
                Switch.toAlert().andAccept());
    }

    public static Performable nueva(String ingreso) {
        return instrumented(CrearCuenta.class, ingreso);
    }
}
