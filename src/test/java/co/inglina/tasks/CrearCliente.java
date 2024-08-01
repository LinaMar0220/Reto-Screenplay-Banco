package co.inglina.tasks;

import co.inglina.interactions.Guardar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.inglina.userinterfaces.CrearClientePage.*;
import static co.inglina.utils.Utilidades.ID_CLIENTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearCliente implements Task {
    private String nombre;
    private String apellido;
    private String codigo;

    public CrearCliente(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_AGREGAR_CLIENTE),
                Type.theValue(nombre).into(LABEL_FIRST_NAME),
                Type.theValue(apellido).into(LABEL_LAST_NAME),
                Type.theValue(codigo).into(LABEL_CODE),
                Click.on(BUTTON_ADD_CUSTOMER),
                Guardar.informacion(ID_CLIENTE),
                Switch.toAlert().andAccept());
    }

    public static Performable nuevo(String nombre, String apellido, String codigo) {
        return instrumented(CrearCliente.class, nombre, apellido, codigo);
    }
}
