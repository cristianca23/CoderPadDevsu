package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable store() {
        return Task.where("{0} opens the page",
                Open.browserOn().thePageNamed("home.page")
        );
    }
}


