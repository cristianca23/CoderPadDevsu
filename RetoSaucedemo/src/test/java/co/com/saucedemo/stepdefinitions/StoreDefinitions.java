package co.com.saucedemo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Buy;
import tasks.Choose;
import tasks.Enter;
import tasks.Information;
import tasks.NavigateTo;

public class StoreDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    public String actor;

    @Given("^(.*) wants to join Store")
    public void WantsToJoinStore(String actor) {
        OnStage.theActor(actor).wasAbleTo(NavigateTo.store());
        this.actor = actor;

    }
    @Given("the user enters the login section and enters {string} and {string}.")
    public void theUserEntersTheLoginSectionAndEntersAnd(String email, String pass) {
        OnStage.theActorCalled(actor).attemptsTo(Enter.data(email, pass));
    }
    @When("the user selects {int} products")
    public void theUserSelectsProducts(Integer products) {
        OnStage.theActor(actor).attemptsTo(Choose.articles(products));
    }
    @When("go to the shopping cart and enter the data {string} {string} {string} {string} {string} {string}")
    public void goToTheShoppingCartAndEnterTheData(String name, String country, String city, String card, String month, String year) {
        OnStage.theActorInTheSpotlight().attemptsTo(Information.order(name,country,city,card,month,year));

    }
    @Then("You should see a dialog stating {string}.")
    public void youShouldSeeADialogStating(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Buy.succesful(message)));

    }

}
