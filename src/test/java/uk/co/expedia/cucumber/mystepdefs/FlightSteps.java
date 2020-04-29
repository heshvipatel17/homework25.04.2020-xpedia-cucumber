package uk.co.expedia.cucumber.mystepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.expedia.pages.FlightsPage;
import uk.co.expedia.pages.HomePage;

public class FlightSteps {

    @When("^I click on Flights link$")
    public void iClickOnFlightsLink() {
        new HomePage().clickOnFlightsTab();

    }

    @Then("^I should be on Flights page$")
    public void iShouldBeOnFlightsPage() {

    }

    @And("^I enter origin \"([^\"]*)\"$")
    public void iEnterOrigin(String cityFrom) {
        new FlightsPage().enterFlightFromCity(cityFrom);
    }

    @And("^I enter destination \"([^\"]*)\"$")
    public void iEnterDestination(String cityTo) {
        new FlightsPage().enterFlightToCity(cityTo);

    }

    @And("^I enter departing date \"([^\"]*)\"$")
    public void iEnterDepartingDate(String depDate) {
        new FlightsPage().enterDepartingDate(depDate);

    }

    @And("^I enter returning date \"([^\"]*)\"$")
    public void iEnterReturningDate(String retDate) {
        new FlightsPage().enterReturningDate(retDate);

    }

    @And("^I click on Search button$")
    public void iClickOnSearchButton() {
        new FlightsPage().clickOnSearchButton();
    }

    @Then("^I should see \"([^\"]*)\" for my chosen destination$")
    public void iShouldSeeForMyChosenDestination(String arg0) {

    }
}
