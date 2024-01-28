package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

public class Wait implements Interaction {

    private int time;

    public Wait(int time) {
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Awaitility.await().forever().pollInterval(time, TimeUnit.SECONDS).until(() -> true);

    }

    public static Wait oneMoment(int time) {
        return Tasks.instrumented(Wait.class, time);
    }
}
