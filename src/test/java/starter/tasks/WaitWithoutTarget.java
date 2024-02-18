package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitWithoutTarget implements Task {

    private final long durationInMillis;

    public WaitWithoutTarget(long durationInMillis) {
        this.durationInMillis = durationInMillis;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(durationInMillis);
        } catch (InterruptedException e) {
            // Manejar la excepción si es necesario
        }
    }

    public static WaitWithoutTarget forDuration(long durationInMillis) {
        return instrumented(WaitWithoutTarget.class, durationInMillis);
    }
}