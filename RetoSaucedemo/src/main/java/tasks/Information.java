package tasks;

import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterface.ProductStorePage.*;

public class Information implements Task {

    private String name;
    private String country;
    private String city;
    private String card;
    private String month;
    private final String year;

    public Information(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.oneMoment(2),
                WaitUntil.the(BUTTONCART, WebElementStateMatchers.isClickable()),
                Click.on(BUTTONCART),
                Click.on(BUTTONPLACEORDER),
                Enter.theValue(name).into(TXTNAME),
                Enter.theValue(country).into(TXTPAIS),
                Enter.theValue(city).into(TXTCITY),
                Enter.theValue(card).into(TXTCARD),
                Enter.theValue(month).into(TXTMONTH),
                Enter.theValue(year).into(TXTYEAR),
                Click.on(BUTTONPURCHASE)

        );

    }

    public static Information order(String nombre, String pais, String city, String card, String month, String year){
        return Tasks.instrumented(Information.class, nombre, pais, city, card, month, year);
    }

}
