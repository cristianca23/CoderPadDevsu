package tasks;

import interactions.Articles;
import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static userinterface.ProductStorePage.BOTTONADDTOCART;
import static userinterface.ProductStorePage.BUTTONHOME;

public class Choose implements Task {
    private  int productos;

    public Choose(int productos) {
        this.productos = productos;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        int i= 1;
        while (i<= productos) {
            actor.attemptsTo(
                    Wait.oneMoment(2),
                    Click.on(Articles.addProduct(i)),
                    WaitUntil.the(BOTTONADDTOCART, WebElementStateMatchers.isClickable()),
                    Click.on(BOTTONADDTOCART.waitingForNoMoreThan(Duration.ofSeconds(5))),
                    Wait.oneMoment(3),
                    Switch.toAlert().andAccept(),
                    Click.on(BUTTONHOME)
            );
            i++;
        }
    }

    public static Choose articles(int products){
        return Tasks.instrumented(Choose.class, products);
    }
}
