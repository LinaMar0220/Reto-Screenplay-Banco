package co.inglina.stepdefinitions;

import co.inglina.interactions.Abrir;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hooks {

   /* @Before
    public void preparacionEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }*/

   /* @Given("que {word} se encuentra en la pagina principal")
    public void queElUsuarioSeEncuentraEnLaPaginaPrincipal(String nombre) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nombre).wasAbleTo(
                Abrir.elNavegador()//,
               // Maximizar.elNavegador()
        );
    }*/

    @After
    public void finEscenario(){
        System.out.println("Fin del Escenario");
    }
}
