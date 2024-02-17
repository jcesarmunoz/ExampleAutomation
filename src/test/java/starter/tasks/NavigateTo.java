package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable DemoBlazeHomePage() {
        return Task.where("{0} opens the DemoBlaze home page",
                Open.browserOn().the(DemoBlazeHomePage.class));
    }
}
