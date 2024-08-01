package co.inglina.stepdefinitions;


import co.inglina.interactions.Abrir;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.inglina.userinterfaces.HomePage.BUTTON_MANAGER;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DepositoXYZBankStepDefinition {

    @Given("que {word} se encuentra en la pagina principal")
    public void queElUsuarioSeEncuentraEnLaPaginaPrincipal(String nombre) {
        setTheStage(new OnlineCast());
        theActorCalled(nombre).wasAbleTo(
                Open.url("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login")
                //Abrir.elNavegador()//,
                // Maximizar.elNavegador()
        );
    }

    @When("ella ingresa a la opcion de cliente")
    public void ellaIngresaALaOpcionDeCliente() {
        theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_MANAGER));
    }
    @And("ingresa la informacion para la creacion del ciente")
    public void ingresaLaInformacionParaLaCreacionDelCiente() {

    }
    @And("diligencie la informacion requerida para la creacion de cuenta asociada al cliente creado")
    public void diligencieLaInformacionRequeridaParaLaCreacionDeCuentaAsociadaAlClienteCreado() {

    }
    @Then("el usuario deberia ingresar a la transaccion y verla de forma exitosa")
    public void elUsuarioDeberiaIngresarALaTransaccionYVerlaDeFormaExitosa() {

    }

}
