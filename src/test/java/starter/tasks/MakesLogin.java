package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.UI.HomePage;
import starter.UI.LoginPage;

public class MakesLogin {

    public static Performable inDemoBlaze(String user, String pass){
        return Task.where("user can make login",
                Click.on(HomePage.BTN_LOGIN),
                Enter.theValue(user).into(LoginPage.INPUT_EMAIL),
                Enter.theValue(pass).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }
}
