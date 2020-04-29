package uk.co.expedia.cucumber.mystepdefs;/* By Jitendra Patel */

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;

public class MyStepdefs {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Account link$")
    public void iClickOnAccountLink() {
        new HomePage().clickOnAccountLink();
    }

    @Then("^I should the see text \"([^\"]*)\"$")
    public void iShouldTheSeeText(String signInTxt) {
        Assert.assertEquals(new AccountPage().getSiginPricingText(), signInTxt);

    }

    @And("^I click on Sign In button$")
    public void iClickOnSignInButton() {
        new AccountPage().clickOnSignInLink();
    }

    @And("^I enter \"([^\"]*)\" in the email address field$")
    public void iEnterInTheEmailAddressField(String email) {
        new SignInPage().enterEmailField(email);

    }

    @And("^I enter \"([^\"]*)\" in the password field$")
    public void iEnterInThePasswordField(String password) {
        new SignInPage().enterPasswordField(password);
    }

    @And("^I click on the Sign In button$")
    public void iClickOnTheSignInButton() {
        new SignInPage().clickOnSignInTab();
    }

    @Then("^I should see a error message \"([^\"]*)\"$")
    public void iShouldSeeAErrorMessage(String errMessage) {
        Assert.assertEquals(new SignInPage().assertErrorMessage(), errMessage);

    }
}