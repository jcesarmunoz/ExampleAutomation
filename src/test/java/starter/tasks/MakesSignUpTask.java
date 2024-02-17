package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import starter.UI.HomePage;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class MakesSignUpTask implements Task {

    public static String user;
    public static String pass;

    public MakesSignUpTask(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static MakesSignUpTask inDemoBlaze(String user, String pass) {
        return instrumented(MakesSignUpTask.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.BTN_CONFIRM_SIGNUP, isEnabled()).forNoMoreThan(60).seconds(),
                Click.on(HomePage.BTN_SIGNUP),
                Enter.theValue(user).into(HomePage.INPUT_EMAIL),
                WaitUntil.the(HomePage.INPUT_PASSWORD, isEnabled()).forNoMoreThan(3).seconds(),
                Enter.theValue(pass).into(HomePage.INPUT_PASSWORD),
                Click.on(HomePage.BTN_CONFIRM_SIGNUP)
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
        actor.attemptsTo(
                WaitUntil.the(HomePage.BTN_CLOSE, isEnabled()).forNoMoreThan(3).seconds(),
                Click.on(HomePage.BTN_CLOSE)
        );
    }
}
