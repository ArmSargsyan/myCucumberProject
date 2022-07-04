package stepDefinitions.step;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojo.User;

import java.util.List;

public class LoginStep {

    private User user;

    public LoginStep(User user) {
        this.user = user;
    }

//        @Given("Go to home page")
//    public void goToHomePage() {
//        System.out.println("go home page");
//    }

    @When("I write username")
    public void iWriteUsername() {
        System.out.println("write username");
    }

    @And("I write password")
    public void iWritePassword() {
        System.out.println("write password");
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        System.out.println("click login button");
    }

    @Then("I should see my profile")
    public void iShouldSeeMyProfile() {
        System.out.println(user.getUsername());
        System.out.println("i see my profile");
    }
    @Given("Go home page2")
    public void goHomePage() {
        System.out.println("Go home page2");
    }
    @When("I write username {}")
    public void iWriteUsername(String username) {
        System.out.println("username is : " + username);
    }

    @And("I write password {}")
    public void iWritePassword(String password) {
        System.out.println("password is: " + password);
    }

    @And("I click on login")
    public void iClickOnLogin() {
        System.out.println("click login");
    }

    @Then("I logged in")
    public void iLoggedIn() {
        System.out.println("i am at home");
    }


    @When("I write {string} and {string}")
    public void iWriteAnd(String username, String password) {
        System.out.println(username + " " + password );
    }


    @When("I write username plus password")
    public void iWriteUsernamePlusPassword(DataTable table) {
        System.out.println("Datatableeeee");
        List<String> row = table.row(1);
        System.out.println(row);

    }

    @Given("Go to home page3")
    public void goToHomePage() {
        System.out.println("Go to home page3");
    }

    @Given("Go home")
    public void goHome() {
        System.out.println("go home 4");
    }
}
