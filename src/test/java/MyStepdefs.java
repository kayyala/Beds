import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Sudhakar on 26/06/2016.
 */
public class MyStepdefs {
    Homepage home = new Homepage();
    Registration registration = new Registration();
    submit submeet = new submit();
    verifyAC verify = new verifyAC();
    Logout logout = new Logout();

    @Given("^i am  navigative to Dream web page$")
    public void navigativedreampage() throws Throwable {
        home.isOnHomePage();
    }

    @And("^i go to my acount and click on registration page$")
    public void iGoToMyAcountAndClickOnRegistrationPage() throws Throwable {
        home.Myacount();
    }

    @When("^i enter all field in registration$")
    public void iEnterAllFieldInRegistration() throws Throwable {
        registration.Enterfields();

    }

    @And("^i click on submit button$")
    public void iClickOnSubmitButton() throws Throwable {
        submeet.sub();
    }

    @Then("^i should able to see my acount succefully$")
    public void iShouldAbleToSeeMyAcountSuccefully() throws Throwable {
        verify.checkpoint();

    }

    @And("^i click on logout$")
    public void iClickOnLogout() throws Throwable {
        logout.logoutsuccessfull();
    }
}
