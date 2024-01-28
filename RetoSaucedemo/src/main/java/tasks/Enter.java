package tasks;

import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static userinterface.ProductStorePage.*;


public class Enter implements Task {
    private final String correo;
    private final String clave;

    public Enter(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BUTTONLOGIN.waitingForNoMoreThan(Duration.ofSeconds(5))));
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Enter.theValue(correo).into(INPUTUSERNAME));
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Enter.theValue(clave).into(INPUTPASSWORD));
        actor.attemptsTo(Click.on(BUTTONLOGIN2.waitingForNoMoreThan(Duration.ofSeconds(5))),
        Wait.oneMoment(1)
        );


    }

    public static Enter data(String correo, String clave){
        return Tasks.instrumented(Enter.class, correo, clave);
    }
}
