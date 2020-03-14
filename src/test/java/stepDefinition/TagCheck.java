package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagCheck {


    @Given("^user navigates to csdn$")
    public void userNavigatesToCsdn() {
        System.out.println("this is tag check's given");
    }

    @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void iEnterUsernameAsAndPasswordAs(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("username: "+arg0+" password: "+arg1);
    }

    @Then("^login should be unsuccessful$")
    public void loginShouldBeUnsuccessful() {
        System.out.println("login should be unsuccessful");
    }

    @Then("^the user should be redirected to login retry$")
    public void theUserShouldBeRedirectedToLoginRetry() {
        System.out.println("the user should be redirected to login retry");
    }
}

