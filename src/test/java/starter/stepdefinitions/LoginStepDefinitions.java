package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import starter.UI.LoginPage;
import starter.tasks.MakesLogin;
import starter.tasks.MakesSignUpTask;
import starter.tasks.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    @Given("John quiere ingresar a Demo Blaze")
    public void johnQuiereIngresarADemoBlaze() {
        theActorCalled("John").attemptsTo(
                NavigateTo.DemoBlazeHomePage()
        );
    }

    @When("John realiza el registro con el correo {} y la contrasena {}")
    public void johnRealizaElRegistroConElCorreoYLaContrasena(String user, String pass) {
        theActorInTheSpotlight().attemptsTo(
                MakesSignUpTask.inDemoBlaze(user, pass)
        );
    }

    @Then("John puede iniciar sesion con el correo {} y la contrasena {}")
    public void johnPuedeIniciarSesionConElCorreoYLaContrasena(String user, String pass) {
        theActorInTheSpotlight().attemptsTo(
                MakesLogin.inDemoBlaze(user, pass)
        );
    }

    @And("puede ver su {} en el inicio y realizar el logout")
    public void puedeVerSuEnElInicioYRealizarElLogout(String correo) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LoginPage.TEXT_EMAIL.of(correo)).isEnabled(),
                MakesLogin.makesLogout()
        );
    }
}
