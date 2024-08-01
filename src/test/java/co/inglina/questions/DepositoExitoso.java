package co.inglina.questions;

import co.inglina.utils.Utilidades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.LocalDate;

import static co.inglina.userinterfaces.DepositarPage.TABLA_DEPOSITOS;

public class DepositoExitoso implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        LocalDate fechaActual = LocalDate.now();
        int mes = fechaActual.getMonth().getValue();
        String nombreMes = Utilidades.months[mes];
        String mesDia = nombreMes + " " + fechaActual.getDayOfMonth();
        return TABLA_DEPOSITOS.of(mesDia).resolveFor(actor).isVisible();
    }

    public static DepositoExitoso encontrado() {
        return new DepositoExitoso();
    }

}
