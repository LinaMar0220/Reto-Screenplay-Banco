package co.inglina.stepdefinitions;


import co.inglina.questions.DepositoExitoso;
import co.inglina.tasks.CrearCliente;
import co.inglina.tasks.CrearCuenta;
import co.inglina.tasks.Depositar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static co.inglina.userinterfaces.HomePage.BUTTON_MANAGER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DepositoXYZBankStepDefinition {

    @When("ella ingresa a la opcion de cliente")
    public void ellaIngresaALaOpcionDeCliente() {
        theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_MANAGER));
    }

    @And("ingresa la informacion para la creacion del ciente {string} {string} y {string}")
    public void ingresaLaInformacionParaLaCreacionDelCienteY(String nombre, String apellido, String codigo) {
        theActorInTheSpotlight().attemptsTo(CrearCliente.nuevo(nombre, apellido, codigo));
    }

    @And("diligencie la informacion requerida para la creacion de cuenta asociada al cliente creado {string}")
    public void diligencieLaInformacionRequeridaParaLaCreacionDeCuentaAsociadaAlClienteCreado(String ingreso) {
        theActorInTheSpotlight().attemptsTo(CrearCuenta.nueva(ingreso));

    }

    @And("realiza el deposito {string}")
    public void realizaElDeposito(String monto) {
        theActorInTheSpotlight().attemptsTo(Depositar.dinero(monto));
    }

    @Then("el usuario deberia ingresar a la transaccion y verla de forma exitosa")
    public void elUsuarioDeberiaIngresarALaTransaccionYVerlaDeFormaExitosa() {
        theActorInTheSpotlight().should(seeThat(DepositoExitoso.encontrado()));
    }

}
