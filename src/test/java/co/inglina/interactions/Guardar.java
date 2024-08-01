package co.inglina.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public abstract class Guardar implements Interaction {

    private String idSesion;

    public Guardar(String idSesion) {
        this.idSesion = idSesion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String alert = Switch.toAlert().getText().answeredBy(actor);
        String[] mensajeSeparado = alert.split("id :");
        if (mensajeSeparado.length > 1) {
            String idValue = mensajeSeparado[1].trim();
            actor.remember(idSesion, idValue);
        }
    }

    public static Performable informacion(String nombreSesion) {
        return instrumented(Guardar.class, nombreSesion);
    }
}
